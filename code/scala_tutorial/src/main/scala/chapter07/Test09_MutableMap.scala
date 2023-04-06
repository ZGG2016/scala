package chapter07

import scala.collection.mutable

/**
 * 可变map
 */
object Test09_MutableMap {
  def main(args: Array[String]): Unit = {
    // 创建map
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map1)
    println(map1.getClass)
    println("================")

    // 添加元素
    map1.put("d", 4)
    println(map1)
    map1.put("a", 11)  // 会修改a对应的值
    println(map1)

    map1 += (("e", 5)) // 外面的括号表示是一个方法调用，里面的括号表示参数是一个元组
    println(map1)
    println("================")

    // 删除元素
    map1.remove("e")
    println(map1)
    println(map1.getOrElse("e", 0))

    map1 -= "d"
    println(map1)
    println("================")

    // 修改元素
    map1.update("b",22)
    map1.update("e",0) // e不存在，就会添加
    println(map1)
    println("================")

    // 合并两个Map
    val map2: mutable.Map[String, Int] = mutable.Map("aa" -> 1, "bb" -> 2, "cc" -> 3)
    map1 ++= map2
    println(map1)
    println(map2)

    val map3: mutable.Map[String, Int] = map2 ++ map1
    println(map1)
    println(map2)
    println(map3)
  }
}
