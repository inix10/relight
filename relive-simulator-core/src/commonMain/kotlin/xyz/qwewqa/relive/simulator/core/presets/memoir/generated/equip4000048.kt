package xyz.qwewqa.relive.simulator.core.presets.memoir.generated

import xyz.qwewqa.relive.simulator.core.stage.actor.StatData
import xyz.qwewqa.relive.simulator.core.stage.autoskill.EffectTag
import xyz.qwewqa.relive.simulator.core.stage.dress.ActParameters
import xyz.qwewqa.relive.simulator.core.stage.memoir.CutinBlueprint
import xyz.qwewqa.relive.simulator.core.stage.memoir.PartialMemoirBlueprint

val equip4000048 = PartialMemoirBlueprint(
  id = 4000048,
  name = "みんなが来るまで",
  rarity = 4,
  cost = 9,
  baseStats = StatData(
    hp = 0,
    actPower = 0,
    normalDefense = 30,
    specialDefense = 30,
  ),
  growthStats = StatData(
    hp = 0,
    actPower = 0,
    normalDefense = 3417,
    specialDefense = 3417,
  ),
  additionalTags = listOf(EffectTag.Karen, EffectTag.Mahiru)
)
