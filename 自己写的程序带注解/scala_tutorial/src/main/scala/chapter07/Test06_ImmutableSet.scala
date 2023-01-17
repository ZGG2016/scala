package chapter07

/**
 * 不可变Set：默认是不可变集合  数据无序  数据不可重复
 */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 创建set
    val set1 = Set(1, 2, 3, 3)
    println(set1)
    println("======================")

    // 添加元素
    val set2 = set1 + 4
    println(set1)
    println(set2)
    println("======================")

    // 合并set
    val set3 = set1 ++ set2
    println(set3)
    println("======================")

    // 删除元素
    val set4 = set1 - 1
    println(set4)
    println("======================")
  }
}
