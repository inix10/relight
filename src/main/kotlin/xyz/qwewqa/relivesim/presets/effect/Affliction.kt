package xyz.qwewqa.relivesim.presets.effect

import xyz.qwewqa.relivesim.stage.context.ActionContext
import xyz.qwewqa.relivesim.stage.effect.EffectClass
import xyz.qwewqa.relivesim.stage.effect.EffectType
import xyz.qwewqa.relivesim.stage.effect.TimedEffect


data class ConfusionTimedEffect(
    override var turns: Int,
    override val locked: Boolean = false,
) : TimedEffect {
    override val effectClass = EffectClass.Negative
    override val effectType = EffectType.Confuse

    override fun start(context: ActionContext) = context.run {}

    override fun stop(context: ActionContext) = context.run {}
}
