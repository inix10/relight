package xyz.qwewqa.relive.simulator.core.presets.memoir.generated

import xyz.qwewqa.relive.simulator.core.stage.actor.StatData
import xyz.qwewqa.relive.simulator.core.stage.autoskill.EffectTag
import xyz.qwewqa.relive.simulator.core.stage.dress.ActParameters
import xyz.qwewqa.relive.simulator.core.stage.memoir.CutinBlueprint
import xyz.qwewqa.relive.simulator.core.stage.memoir.PartialMemoirBlueprint

val equip2000034 = PartialMemoirBlueprint(
  id = 2000034,
  name = "レヴュー・デュエット",
  rarity = 2,
  cost = 4,
  baseStats = StatData(
    hp = 105,
    actPower = 0,
    normalDefense = 0,
    specialDefense = 9,
  ),
  growthStats = StatData(
    hp = 16016,
    actPower = 0,
    normalDefense = 0,
    specialDefense = 1372,
  ),
  additionalTags = listOf(EffectTag.Claudine, EffectTag.Maya)
)
