package xyz.qwewqa.relive.simulator.core.presets.accessory.generated

import xyz.qwewqa.relive.simulator.core.stage.accessory.PartialAccessoryBlueprint
import xyz.qwewqa.relive.simulator.core.stage.actor.ActType
import xyz.qwewqa.relive.simulator.core.stage.dress.ActParameters
import xyz.qwewqa.relive.simulator.core.stage.dress.ActBlueprint

val accessory23 = PartialAccessoryBlueprint(
  id = 23,
  iconId = 202000401,
  name = "烏天狗の扇",
  baseHp = 400,
  baseActPower = 90,
  baseNormalDefense = 80,
  baseSpecialDefense = 40,
  baseDexterity = 0,
  baseCritical = 0,
  baseAgility = 40,
  maxHp = 4000,
  maxActPower = 900,
  maxNormalDefense = 800,
  maxSpecialDefense = 400,
  maxDexterity = 0,
  maxCritical = 0,
  maxAgility = 400,
  growValues = listOf(0, 4, 9, 15, 21, 28, 35, 42, 50, 57, 65, 73, 81, 89, 97, 106, 114, 123, 132, 141, 150, 159, 168, 177, 186, 196, 205, 215, 224, 234, 244, 254, 264, 274, 283, 294, 304, 314, 324, 334, 345, 355, 365, 376, 386, 397, 408, 418, 429, 440, 451, 461, 472, 483, 494, 505, 516, 527, 539, 550, 561, 572, 583, 595, 606, 618, 629, 640, 652, 663, 675, 687, 698, 710, 722, 733, 745, 757, 769, 781, 792, 804, 816, 828, 840, 852, 864, 876, 889, 901, 913, 925, 937, 949, 962, 974, 986, 999, 1011, 1024),
  dressIds = setOf(2020004),
  actData = ActBlueprint(
    name = "天狗の仕業",
    type = ActType.ClimaxAct,
    apCost = 1,
    icon = 9,
    parameters = listOf(
      ActParameters(
        values = listOf(394, 400, 410, 420, 430),
        times = listOf(5, 5, 5, 5, 5),
        hitRate = 100,
      ),
      ActParameters(
        values = listOf(20, 22, 24, 27, 30),
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
      ActParameters(
        values = listOf(0, 0, 0, 0, 0),
        times = listOf(0, 0, 0, 0, 0),
        hitRate = 0,
      ),
    ),
  ),
)
