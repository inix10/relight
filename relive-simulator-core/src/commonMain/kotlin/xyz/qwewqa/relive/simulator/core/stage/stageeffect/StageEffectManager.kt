package xyz.qwewqa.relive.simulator.core.stage.stageeffect

import xyz.qwewqa.relive.simulator.common.DisplayStageEffectData
import xyz.qwewqa.relive.simulator.common.LogCategory
import xyz.qwewqa.relive.simulator.core.stage.actor.ActiveBuff
import xyz.qwewqa.relive.simulator.core.stage.actor.Actor
import xyz.qwewqa.relive.simulator.core.stage.log
import xyz.qwewqa.relive.simulator.core.stage.team.Team

class StageEffectManager(val team: Team) {
    private val levels = mutableMapOf<StageEffect, Int>()
    private var activeStacks = mutableListOf<ActiveStageEffect>()

    private val statuses = mutableMapOf<StageEffect, StageEffectStatus>()

    fun values() = levels.mapNotNull { (k, v) -> (k to v).takeIf { v > 9 } }

    fun add(effect: StageEffect, turns: Int, level: Int = 1) {
        if (turns <= 0) return
        activeStacks += ActiveStageEffect(effect, turns, level)
        levels[effect] = (levels[effect] ?: 0) + level
    }

    fun tick() {
        activeStacks.forEach { stack ->
            stack.turns--
            if (stack.turns == 0) {
                levels[stack.effect] = levels[stack.effect]!! - stack.level
                statuses.remove(stack.effect)?.deactivate()
            }
        }
        activeStacks.removeAll { it.turns <= 0 }
    }

    fun refresh() {
        levels.forEach { (effect, level) ->
            if (level > 0) {
                val targets = getTargets(effect)
                val previousStatus = statuses[effect]
                if (previousStatus == null) {
                    statuses[effect] = StageEffectStatus(effect, effect.activate(targets, level), level)
                } else if (previousStatus.level != level) {
                    previousStatus.deactivate()
                    statuses[effect] = StageEffectStatus(effect, effect.activate(targets, level), level)
                } else {
                    previousStatus.effectBuffs.filter { (actor, _)  -> actor !in targets }.forEach { (actor, buffs) ->
                        buffs.forEach { buff ->
                            actor.buffs.remove(buff)
                        }
                    }

                    val effectBuffs = mutableMapOf<Actor, List<ActiveBuff>>()
                    targets.forEach { actor ->
                        val existingBuffs = previousStatus.effectBuffs[actor]
                        if (existingBuffs != null) {
                            effectBuffs[actor] = existingBuffs
                        } else {
                            effectBuffs[actor] = effect.buffs.flatMap { buffGroup ->
                                if (buffGroup.condition?.evaluate(actor) != false) {
                                    buffGroup[level].map { stageBuff ->
                                        stageBuff.activate(actor)
                                    }
                                } else {
                                    emptyList()
                                }
                            }
                        }
                    }
                    statuses[effect] = StageEffectStatus(effect, effectBuffs, level)
                }
            }
        }
    }

    fun getDisplayData(): List<DisplayStageEffectData> {
        val maxTurns = mutableMapOf<StageEffect, Int>()
        activeStacks.forEach { stack ->
            maxTurns[stack.effect] = maxOf(maxTurns[stack.effect] ?: 0, stack.turns)
        }
        return maxTurns.mapNotNull { (effect, turns) ->
            DisplayStageEffectData(
                effect.iconId,
                levels[effect]!!.coerceAtMost(5),
                turns,
            )
        }
    }

    private fun StageEffect.activate(targets: List<Actor>, level: Int) = targets.associateWith { target ->
        target.context.log("Stage Effect", category = LogCategory.BUFF) {
            "Stage effect $name (lv. $level) activate."
        }
        buffs.flatMap { buffGroup ->
            if (buffGroup.condition?.evaluate(target) != false) {
                buffGroup[level].map { stageBuff ->
                    stageBuff.activate(target)
                }
            } else {
                emptyList()
            }
        }
    }

    private fun StageEffectStatus.deactivate() {
        effectBuffs.forEach { (actor, buffs) ->
            actor.context.log("Stage Effect", category = LogCategory.BUFF) {
                "Stage effect ${effect.name} (lv. $level) deactivate."
            }
            buffs.forEach { buff ->
                actor.buffs.remove(buff)
            }
        }
    }

    private fun getTargets(effect: StageEffect) = when (effect.target) {
        StageEffectTarget.All -> team.active
        is StageEffectTarget.Front -> team.active.take(effect.target.count)
        is StageEffectTarget.Back -> team.active.takeLast(effect.target.count)
    }
}

class ActiveStageEffect(val effect: StageEffect, var turns: Int, val level: Int)
data class StageEffectStatus(val effect: StageEffect, val effectBuffs: Map<Actor, List<ActiveBuff>>, val level: Int)
