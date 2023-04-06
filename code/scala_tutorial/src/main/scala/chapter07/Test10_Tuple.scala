package chapter07

/**
 * 元组：存放各种相同或不同类型的数据
 */
object Test10_Tuple {
  def main(args: Array[String]): Unit = {
    // 创建元组
    val t: (String, Int, Char, Boolean) = ("hello", 11, 'a', true)
    println(t)

    // 访问数据
    println(t._1)  // hello
    println(t._2)  // 11
    println(t.productElement(1)) // 11
    println(t.productElement(2))  // a

    println("============")

    // 遍历元组数据
    for (i <- t.productIterator)
      println(i)
    println("============")

    // 嵌套元组
    val mulTuple = (1, "a", (true, 'c'))
    println(mulTuple._3._1)
  }
}
