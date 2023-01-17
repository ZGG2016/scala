package chapter07

/**
 * 集合计算简单函数
 */
object Test13_SimpleFunction {
  def main(args: Array[String]): Unit = {
    val list = List(5,1,8,2,-3,4)
    val list2 = List(("a", 5), ("b", 1), ("c", 8), ("d", 2), ("e", -3), ("f", 4))

    // 求和
    println(list.sum)

    // 求乘积
    println(list.product)
    println("---------------")

    // 最大值
    println(list.max)
    println(list2.maxBy( (t: (String, Int)) => t._2))  // 指定比较规则
    println(list2.maxBy( _._2))
    println("---------------")

    // 最小值
    println(list.min)
    println(list2.minBy( (t: (String, Int)) => t._2))  // 指定比较规则
    println(list2.minBy( _._2))
    println("---------------")

    // 排序
    // sorted: 对一个集合进行自然排序，通过传递隐式的 Ordering
    val sortedList = list.sorted
    println(sortedList)

    val sortedList2 = list.sorted(Ordering[Int].reverse) // 指定倒序还是正序
    println(sortedList2)
    println("---------------")

    // sortBy: 对一个属性或多个属性进行排序，通过它的类型
    println(list2.sortBy(_._2))  // 指定比较规则
    println(list2.sortBy(_._2)(Ordering[Int].reverse))
    println("---------------")

    // sortWith: 基于函数的排序，通过一个 comparator 函数，实现自定义排序的逻辑
    println(list.sortWith( (a: Int, b: Int) => a < b) )  // 指定比较规则
    println(list.sortWith( _ < _) )
    println(list.sortWith( _ > _) )
  }
}
