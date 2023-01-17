package chapter07

/**
 * 集合计算高级函数
 * reduce fold
 */
object Test15_HighLevelFunction_Reduce {
  def main(args: Array[String]): Unit = {

    // reduce
    val list = List(1, 2, 3, 4)
    println(list.reduce(_ + _))
    println(list.reduceLeft(_ + _))
    println(list.reduceRight(_ + _))

    println("===========================")

    val list2 = List(3, 4, 5, 8, 10)
    println(list2.reduce(_ - _))
    println(list2.reduceLeft(_ - _))
    println(list2.reduceRight(_ - _)) // 3 - (4 - (5 - (8 - 10))) = 6

    println("===========================")

    // fold
    println(list.fold(10)(_ + _)) // 10 + 1 + 2 + 3 + 4 = 20
    println(list.foldLeft(10)(_ + _)) // 10 + 1 + 2 + 3 + 4
    println(list2.foldLeft(11)(_ - _)) // ((((11 - 3) - 4) - 5) - 8) - 10 = -19
    println(list2.foldRight(11)(_ - _)) // 3 - (4 - (5 - (8 - (10 - 11)))) = -5

  }
}
