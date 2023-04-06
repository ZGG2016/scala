package chapter07

/**
 * 不可变List: 数据有顺序，可重复
 */
object Test04_List {
  def main(args: Array[String]): Unit = {
    // 创建一个List
    val list1 = List(1, 2, 3)

    // 访问和遍历元素
    println(list1(1))
//    list1(1) = 1  // error
    list1.foreach(println)
    println("=================")

    // 添加元素
    val list2 = 0 +: list1
    val list3 = list1 :+ 4
    println(list1)
    println(list2)
    println(list3)

    println("=================")

    val list4 = list1.::(0)  // 在开头加
    println(list4)

    val list5 = 1 :: 2 :: 3 :: Nil // ::的用途：结合Nil创建list
    println(list5)

    // 合并列表
    val list6 = list4 :: list5
    println(list6)  // List(List(0, 1, 2, 3), 1, 2, 3)

    val list7 = list4 ::: list5
    println(list7)  // List(0, 1, 2, 3, 1, 2, 3)

    val list8 = list4 ++ list5
    println(list8)  // List(0, 1, 2, 3, 1, 2, 3)
  }
}
