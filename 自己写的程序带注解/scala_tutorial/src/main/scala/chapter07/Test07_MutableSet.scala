package chapter07

import scala.collection.mutable

/**
 * 可变 mutable.Set
 */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    // 创建set
    val set1 = mutable.Set(1, 2, 3, 3)
    println(set1)
    println("======================")

    // 添加元素
    val set2 = set1 + 4
    println(set1)
    println(set2)

    set1 += 5
    println(set1)

    val b1 = set1.add(6)
    println(b1)
    println(set1)

    val b2 = set1.add(6)
    println(b2)
    println(set1)

    println("======================")

    // 删除元素
    set1 -= 1
    println(set1)

    val b3 = set1.remove(5)
    println(b3)
    val b4 = set1.remove(5)
    println(b4)
    println("======================")

    // 合并两个Set
    val set3 = set1 ++ set2
    println(set3)

    set1 ++= set2
    println(set1)
  }
}
