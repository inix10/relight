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
import xyz.qwewqa.relive.simulator.core.presets.dress.generated.dress1080014
import xyz.qwewqa.relive.simulator.core.stage.Act
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.actor.CountableBuff
import xyz.qwewqa.relive.simulator.core.stage.dress.DressCategory
import xyz.qwewqa.relive.simulator.core.stage.autoskill.new
import xyz.qwewqa.relive.simulator.core.stage.dress.blueprint
import xyz.qwewqa.relive.simulator.core.stage.buff.*
import xyz.qwewqa.relive.simulator.core.stage.passive.*
import xyz.qwewqa.relive.simulator.core.stage.stageeffect.*

val dress = dress1080014(
    name = "清少納言",
    acts = listOf(
        ActType.Act1.blueprint("勇気の浄化") {
            Act {
                /*
                継続プラス効果解除
                  target: 前から3体の敵役
                  hit_rate1: 100
                  values1: [0, 0, 0, 0, 0]
                  times1: [0, 0, 0, 0, 0]
                %attr%属性攻撃(威力%value%)
                  target: 前から3体の敵役
                  hit_rate2: 100
                  values2: [84, 88, 92, 97, 101]
                  times2: 1
                */
            }
        },
        ActType.Act2.blueprint("歌人の夢心地") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate1: 100
                  values1: [84, 88, 92, 97, 101]
                  times1: 2
                睡眠
                  target: 敵役全体
                  hit_rate2: 75
                  values2: [0, 0, 0, 0, 0]
                  times2: [2, 2, 2, 2, 2]
                */
            }
        },
        ActType.Act3.blueprint("歓喜の歌") {
            Act {
                /*
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate1: 100
                  values1: [97, 101, 106, 112, 116]
                  times1: 2
                すばやさアップ(%value%)
                  target: 味方全体
                  hit_rate2: 100
                  values2: [20, 22, 24, 27, 30]
                  times2: [3, 3, 3, 3, 3]
                毎ターンHP回復(%value%)
                  target: 味方全体
                  hit_rate3: 100
                  values3: [5000, 5500, 6000, 6500, 7000]
                  times3: [3, 3, 3, 3, 3]
                */
            }
        },
        ActType.ClimaxAct.blueprint("をかしの美学") {
            Act {
                /*
                継続プラス効果解除
                  target: 敵役全体
                  hit_rate1: 100
                  values1: [0, 0, 0, 0, 0]
                  times1: [0, 0, 0, 0, 0]
                %attr%属性攻撃(威力%value%)
                  target: 敵役全体
                  hit_rate2: 100
                  values2: [200, 210, 220, 230, 240]
                  times2: 3
                慢心(%value%)
                  target: 後ろから3体の敵役
                  hit_rate3: 100
                  values3: [3000, 3500, 4000, 4500, 5000]
                  times3: [1, 1, 1, 1, 1]
                */
            }
        }
    ),
    autoSkills = listOf(
        listOf(
        /*
        auto skill 1:
          クライマックスACT封印 (解除不可)
            target: 前から3体の敵役
            hit_rate: 100
            value: 0
            time: 2
        */
        ),
        listOf(
        /*
        auto skill 2:
          キラめき回復(%value%)
            target: 味方全体
            hit_rate: 100
            value: 10
            time: 0
        */
        ),
        listOf(
        /*
        auto skill 3:
          最大HPアップ(%value%)
            target: 味方の花柳香子
            values: [100, 100, 100, 100, 100]
        */
        ),
    ),
    unitSkill = null /* ACTタイプ[通常]の舞台少女の最大HPアップ %opt1_value%%(MAX50%) 通常防御力アップ %opt2_value%%(MAX30%) 特殊防御力アップ %opt3_value%%(MAX30%) */,
    multipleCA = false,
    categories = setOf(),
)
*/

val dress1080014 = PartialDressBlueprint(
  id = 1080014,
  name = "清少納言",
  baseRarity = 4,
  cost = 15,
  character = Character.Futaba,
  attribute = Attribute.Cloud,
  damageType = DamageType.Normal,
  position = Position.Middle,
  positionValue = 24050,
  stats = StatData(
    hp = 2425,
    actPower = 253,
    normalDefense = 176,
    specialDefense = 117,
    agility = 220,
    dexterity = 5,
    critical = 50,
    accuracy = 0,
    evasion = 0,
  ),
  growthStats = StatData(
    hp = 79880,
    actPower = 4180,
    normalDefense = 2910,
    specialDefense = 1940,
    agility = 3630,
  ),
  actParameters = mapOf(
    ActType.Act1 to ActBlueprint(
      name = "勇気の浄化",
      type = ActType.Act1,
      apCost = 2,
      icon = 10006,
      parameters = listOf(
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(84, 88, 92, 97, 101),
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
      ),
    ),
    ActType.Act2 to ActBlueprint(
      name = "歌人の夢心地",
      type = ActType.Act2,
      apCost = 2,
      icon = 58,
      parameters = listOf(
        ActParameters(
          values = listOf(84, 88, 92, 97, 101),
          times = listOf(2, 2, 2, 2, 2),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(2, 2, 2, 2, 2),
          hitRate = 75,
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
      name = "歓喜の歌",
      type = ActType.Act3,
      apCost = 2,
      icon = 28,
      parameters = listOf(
        ActParameters(
          values = listOf(97, 101, 106, 112, 116),
          times = listOf(2, 2, 2, 2, 2),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(20, 22, 24, 27, 30),
          times = listOf(3, 3, 3, 3, 3),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(5000, 5500, 6000, 6500, 7000),
          times = listOf(3, 3, 3, 3, 3),
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
    ActType.ClimaxAct to ActBlueprint(
      name = "をかしの美学",
      type = ActType.ClimaxAct,
      apCost = 2,
      icon = 237,
      parameters = listOf(
        ActParameters(
          values = listOf(0, 0, 0, 0, 0),
          times = listOf(0, 0, 0, 0, 0),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(200, 210, 220, 230, 240),
          times = listOf(3, 3, 3, 3, 3),
          hitRate = 100,
        ),
        ActParameters(
          values = listOf(3000, 3500, 4000, 4500, 5000),
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
      ),
    ),
  ),
  autoSkillRanks = listOf(1, 4, 9, null),
  autoSkillPanels = listOf(0, 0, 5, 0),
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
      hp = 9000,
      actPower = 360,
      normalDefense = 930,
      specialDefense = 150,
      agility = 210,
    ),
    StatData(
      hp = 15000,
      actPower = 600,
      normalDefense = 1550,
      specialDefense = 250,
      agility = 350,
    ),
    StatData(
      hp = 24000,
      actPower = 960,
      normalDefense = 2480,
      specialDefense = 400,
      agility = 560,
    ),
    StatData(
      hp = 30000,
      actPower = 1200,
      normalDefense = 3100,
      specialDefense = 500,
      agility = 700,
    ),
  ),
)
