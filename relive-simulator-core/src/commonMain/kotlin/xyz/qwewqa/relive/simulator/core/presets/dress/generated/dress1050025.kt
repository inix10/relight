package xyz.qwewqa.relive.simulator.core.presets.dress.generated

import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.Attribute
import xyz.qwewqa.relive.simulator.core.stage.actor.StatData
import xyz.qwewqa.relive.simulator.core.stage.dress.ActParameters
import xyz.qwewqa.relive.simulator.core.stage.dress.ActBlueprint
import xyz.qwewqa.relive.simulator.core.stage.dress.PartialDressBlueprint
import xyz.qwewqa.relive.simulator.core.stage.dress.StatBoost
import xyz.qwewqa.relive.simulator.core.stage.dress.StatBoostType
import xyz.qwewqa.relive.simulator.stage.character.Character
import xyz.qwewqa.relive.simulator.stage.character.DamageType
import xyz.qwewqa.relive.simulator.stage.character.Position

/*
import xyz.qwewqa.relive.simulator.core.presets.condition.*
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress1050025
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.CountableBuff
import xyz.qwewqa.relive.simulator.core.stage.dress.DressCategory
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.buff.*
import xyz.qwewqa.relive.simulator.core.stage.passive.*
import xyz.qwewqa.relive.simulator.core.stage.stageeffect.*

val dress = dress1050025(
    name = "魂のレヴュー",
    acts = listOf(
        ActType.Act1.blueprint("キラめきの斬撃") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: ACTパワーが1番高い敵役
                  hit_rate1: 100
                  values1: [93, 98, 102, 107, 112]
                  times1: 1
                キラめき回復(%value%)
                  target: 自身
                  hit_rate2: 100
                  values2: [20, 20, 20, 20, 20]
                  times2: [0, 0, 0, 0, 0]
                */
            }
        },
        ActType.Act2.blueprint("轟雷の斬撃") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: ACTパワーが1番高い敵役
                  hit_rate1: 100
                  values1: [165, 173, 181, 189, 198]
                  times1: 1

                field_effects:
                  雷鳴 (value: 1, time: 2, target: enemies)
                */
            }
        },
        ActType.Act3.blueprint("天才の振る舞い") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: ACTパワーが1番高い敵役
                  hit_rate1: 100
                  values1: [165, 173, 181, 189, 198]
                  times1: 1
                キラめき回復(%value%)
                  target: 後ろから2体の味方
                  hit_rate2: 100
                  values2: [60, 65, 70, 75, 80]
                  times2: [0, 0, 0, 0, 0]
                */
            }
        },
        ActType.ClimaxAct.blueprint("奈落で見上げろ 私がスタァだ") {
            Act {
                /*
                必中
                  target: 自身
                  hit_rate1: 100
                  values1: [0, 0, 0, 0, 0]
                  times1: [3, 3, 3, 3, 3]
                不屈
                  target: 自身
                  hit_rate2: 100
                  values2: [0, 0, 0, 0, 0]
                  times2: [2, 2, 2, 2, 2]
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate3: 100
                  values3: [200, 210, 220, 230, 240]
                  times3: 2

                field_effects:
                  英雄には試練を、聖者には誘惑を (value: 1, time: 3, target: allies)
                */
            }
        }
    ),
    autoSkills = listOf(
        listOf(
        /*
        auto skill 1:
          起死回生(%value%) (回復量は対象の最大HPに依存する)
            target: 自身
            hit_rate: 100
            value: 50
            time: 2
        */
        ),
        listOf(
        /*
        auto skill 2:
          錯乱
            target: 立ち位置中の敵役
            hit_rate: 100
            value: 0
            time: 2
        */
        ),
        listOf(
        /*
        auto skill 3:
          キラめき減少(%value%)
            target: 立ち位置中の敵役
            hit_rate: 100
            value: 50
            time: 0
        */
        ),
        listOf(
        /*
        auto skill 4:
          キラめき獲得アップ(%value%)
            target: 味方全体
            hit_rate: 100
            value: 50
            time: 3
        */
        ),
    ),
    unitSkill = null /* 月・星属性の舞台少女のACTパワーアップ %opt1_value%%(MAX50%) クリティカル威力アップ %opt2_value%%(MAX50%) */,
    multipleCA = true,
    categories = setOf(),
)
*/

val dress1050025 = PartialDressBlueprint(
  id = 1050025,
  name = "魂のレヴュー",
  baseRarity = 4,
  cost = 20,
  character = Character.Maya,
  attribute = Attribute.Moon,
  damageType = DamageType.Special,
  position = Position.Middle,
  positionValue = 24050,
  stats = StatData(
    hp = 11641,
    actPower = 721,
    normalDefense = 359,
    specialDefense = 941,
    agility = 431,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 70401,
    actPower = 4541,
    normalDefense = 2059,
    specialDefense = 3041,
    agility = 4001,
  ),
  actParameters = mapOf(
    ActType.Act1 to ActBlueprint(
      name = "キラめきの斬撃",
      type = ActType.Act1,
      apCost = 1,
      icon = 89,
      parameters = listOf(
        ActParameters(
          values = listOf(93, 98, 102, 107, 112),
          times = listOf(1, 1, 1, 1, 1),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(20, 20, 20, 20, 20),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
      ),
    ),
    ActType.Act2 to ActBlueprint(
      name = "轟雷の斬撃",
      type = ActType.Act2,
      apCost = 2,
      icon = 1012,
      parameters = listOf(
        ActParameters(
          values = listOf(165, 173, 181, 189, 198),
          times = listOf(1, 1, 1, 1, 1),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
      ),
    ),
    ActType.Act3 to ActBlueprint(
      name = "天才の振る舞い",
      type = ActType.Act3,
      apCost = 3,
      icon = 89,
      parameters = listOf(
        ActParameters(
          values = listOf(165, 173, 181, 189, 198),
          times = listOf(1, 1, 1, 1, 1),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(60, 65, 70, 75, 80),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
      ),
    ),
    ActType.ClimaxAct to ActBlueprint(
      name = "奈落で見上げろ 私がスタァだ",
      type = ActType.ClimaxAct,
      apCost = 2,
      icon = 1029,
      parameters = listOf(
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(3, 3, 3, 3, 3),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(2, 2, 2, 2, 2),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(200, 210, 220, 230, 240),
          times = listOf(2, 2, 2, 2, 2),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 0,
        ),
      ),
    ),
  ),
  autoSkillRanks = listOf(1, 4, 9, 9),
  autoSkillPanels = listOf(0, 0, 5, 5),
  rankPanels = listOf(
    listOf(
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.SpecialDefense, 1),
    ),
    listOf(
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.Agility, 7),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 3),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 3),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.Hp, 3),
      StatBoost(StatBoostType.ActPower, 3),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Hp, 4),
    ),
    listOf(
      StatBoost(StatBoostType.SpecialDefense, 3),
      StatBoost(StatBoostType.NormalDefense, 7),
      StatBoost(StatBoostType.NormalDefense, 3),
      StatBoost(StatBoostType.Agility, 8),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 4),
      StatBoost(StatBoostType.Hp, 4),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 4),
      StatBoost(StatBoostType.Act1Level, 0),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.SpecialDefense, 8),
      StatBoost(StatBoostType.ActPower, 5),
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Hp, 5),
    ),
    listOf(
      StatBoost(StatBoostType.Hp, 5),
      StatBoost(StatBoostType.NormalDefense, 8),
      StatBoost(StatBoostType.SpecialDefense, 5),
      StatBoost(StatBoostType.Agility, 9),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 5),
      StatBoost(StatBoostType.NormalDefense, 8),
      StatBoost(StatBoostType.NormalDefense, 4),
    ),
    listOf(
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.Act2Level, 0),
      StatBoost(StatBoostType.Agility, 11),
      StatBoost(StatBoostType.ClimaxActLevel, 0),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.Act3Level, 0),
      StatBoost(StatBoostType.Act1Level, 0),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
    ),
    listOf(
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.Hp, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.SpecialDefense, 6),
      StatBoost(StatBoostType.ActPower, 6),
      StatBoost(StatBoostType.NormalDefense, 6),
    ),
  ),
  friendshipPanels = listOf(
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.SpecialDefense, 1),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 1),
      StatBoost(StatBoostType.Hp, 1),
      StatBoost(StatBoostType.NormalDefense, 1),
      StatBoost(StatBoostType.SpecialDefense, 1),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 1),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.None, 0),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
      StatBoost(StatBoostType.ActPower, 2),
      StatBoost(StatBoostType.Hp, 2),
      StatBoost(StatBoostType.NormalDefense, 2),
      StatBoost(StatBoostType.SpecialDefense, 2),
      StatBoost(StatBoostType.Agility, 2),
  ),
  remakeParameters = listOf(
    StatData(
      hp = 7500,
      actPower = 330,
      normalDefense = 450,
      specialDefense = 450,
      agility = 60,
    ),
    StatData(
      hp = 12500,
      actPower = 550,
      normalDefense = 750,
      specialDefense = 750,
      agility = 100,
    ),
    StatData(
      hp = 20000,
      actPower = 880,
      normalDefense = 1200,
      specialDefense = 1200,
      agility = 160,
    ),
    StatData(
      hp = 25000,
      actPower = 1100,
      normalDefense = 1500,
      specialDefense = 1500,
      agility = 200,
    ),
  ),
)
