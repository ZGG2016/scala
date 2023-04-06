package chapter07

/**
 * 集合基本属性和常用操作
 */
object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    val set = Set(5, 6, 7, 8, 9)

    // 获取集合长度
    println(list.length)
//    println(set.length)
    println("---------------")

    // 获取集合大小
    println(list.size)
    println(set.size)
    println("---------------")

    // 循环遍历
    for (i <- list) println(i)
    for (i <- set) println(i)
    println("---------------")
    list.foreach(println)
    set.foreach(println)
    println("---------------")

    // 迭代器
    for (i <- list.iterator) println(i)
    for (i <- set.iterator) println(i)
    println("---------------")

    // 生成字符串
    println(list.mkString("--"))
    println(set.mkString("--"))
    println("---------------")

    // 是否包含
    println(list.contains(5))
    println(set.contains(5))
  }
}
