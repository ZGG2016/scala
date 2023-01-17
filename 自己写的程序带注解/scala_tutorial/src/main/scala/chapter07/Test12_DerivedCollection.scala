package chapter07

/**
 * 衍生集合
 */
object Test12_DerivedCollection {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,3,5,7,2,89)
    val list2 = List(3,7,2,45,4,8,19)

    // 获取集合的头
    println(list1.head)

    // 获取集合的尾（除了头的其他元素）
    println(list1.tail) // List(3, 5, 7, 2, 89)

    // 集合最后一个数据
    println(list1.last)

    // 集合初始数据（除了最后一个元素的其他元素）
    println(list2.init) // List(3, 7, 2, 45, 4, 8)

    // 反转
    println(list1.reverse)

    // 取前（后）n个元素
    println(list1.take(3))
    println(list1.takeRight(3))

    // 去掉前（后）n个元素
    println(list1.drop(3))
    println(list1.dropRight(3))

    println("==========================")

    // 并集
    val union = list1.union(list2)
    println("union: " + union)
    println(list1 ::: list2)
    println("--------------------")

    val set1 = Set(1,3,5,7,2,89)
    val set2 = Set(3,7,2,45,4,8,19)
    val union2 = set1.union(set2) // 会去重
    println("union2: " + union2)
    println("--------------------")

    // 交集
    val intersection = list1.intersect(list2)
    println("intersection: " + intersection)
    println("--------------------")

    // 差集  谁是主的问题
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println("diff1:" + diff1)
    println("diff2:" + diff2)
    println("--------------------")

    // 拉链  对不齐的丢弃
    val zip1 = list1.zip(list2)
    val zip2 = list2.zip(list1)
    println("zip1:" + zip1)
    println("zip2:" + zip2)
    println("--------------------")

    // 滑窗
    for (i <- list1.sliding(3)) println(i)
    println("--------------------")

    for (i <- list1.sliding(3, 2)) println(i)
    println("--------------------")

    for (i <- list1.sliding(3, 3)) println(i)
    println("--------------------")
  }
}
