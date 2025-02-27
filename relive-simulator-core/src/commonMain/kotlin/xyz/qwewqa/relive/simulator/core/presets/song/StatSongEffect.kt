package xyz.qwewqa.relive.simulator.core.presets.song

import xyz.qwewqa.relive.simulator.core.stage.ActionContext
import xyz.qwewqa.relive.simulator.core.stage.actor.Attribute
import xyz.qwewqa.relive.simulator.core.stage.condition.Condition
import xyz.qwewqa.relive.simulator.core.stage.condition.applyIfTrue
import xyz.qwewqa.relive.simulator.core.stage.song.SongEffect

object ActPowerUpSongEffect : SongEffect {
    override val displayName = "Act Power Up"

    override fun start(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.songActPower += value
        }
    }

    override fun end(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.songActPower -= value
        }
    }
}

object DexterityUpSongEffect : SongEffect {
    override val displayName = "Dexterity Up"

    override fun start(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.valueDexterity += value
        }
    }

    override fun end(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.valueDexterity -= value
        }
    }
}

object CriticalUpSongEffect : SongEffect {
    override val displayName = "Critical Up"

    override fun start(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.valueCritical += value
        }
    }

    override fun end(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.valueCritical -= value
        }
    }
}

object DamageDealtUpSongEffect : SongEffect {
    override val displayName = "Damage Dealt Up"

    override fun start(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.valueDamageDealtUp += value
        }
    }

    override fun end(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.valueDamageDealtUp -= value
        }
    }
}

private data class DamageAgainstAttributeUpSongEffect(val attribute: Attribute) : SongEffect {
    override val name = "DamageAgainst${attribute.name}UpSongEffect"
    override val displayName = "Damage Against ${attribute.name} Up"

    override fun start(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.againstAttributeDamageDealtUp[attribute] = self.againstAttributeDamageDealtUp[attribute] + value
        }
    }

    override fun end(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.againstAttributeDamageDealtUp[attribute] = self.againstAttributeDamageDealtUp[attribute] - value
        }
    }
}

data class againstAttributeDamageDealtUpSongEffect(val attribute: Attribute) : SongEffect {
    override val name = "Against ${attribute.name}DamageDealtUpSongEffect"
    override val displayName = "Against ${attribute.name} Damage Dealt Up"

    override fun start(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.againstAttributeDamageDealtUp[attribute] = self.againstAttributeDamageDealtUp[attribute] + value
        }
    }

    override fun end(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.againstAttributeDamageDealtUp[attribute] = self.againstAttributeDamageDealtUp[attribute] - value
        }
    }
}

data class AttributeDamageDealtUpSongEffect(val attribute: Attribute) : SongEffect {
    override val name = "${attribute.name}DamageDealtUpSongEffect"
    override val displayName = "${attribute.name} Damage Dealt Up"

    override fun start(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.attributeDamageDealtUp[attribute] = self.attributeDamageDealtUp[attribute] + value
        }
    }

    override fun end(context: ActionContext, value: Int, condition: Condition) = context.run {
        condition.applyIfTrue(self) {
            self.attributeDamageDealtUp[attribute] = self.attributeDamageDealtUp[attribute] - value
        }
    }
}
