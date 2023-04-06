package chapter08

/**
 * 元组扩展
 */
object Test03_MatchTupleExtend {
  def main(args: Array[String]): Unit = {
    // 1. 在变量声明时匹配
    val (x, y) = (11, "aa")
    println(s"$x $y")

    val List(first, second, _*) = List(1, 2, 3, 4, 5, 6)
    println(s"$first $second")

    val fir :: sec :: rest = List(1, 2, 3, 4, 5, 6)
    println(s"$fir $sec $rest") // 1 2 List(3, 4, 5, 6)

    println("=====================")

    // 2. for推导式中进行模式匹配
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))

    // 将List的元素直接定义为元组，对变量赋值
    for ((word, count) <- list){
      println(word + " + " + count)
    }
    println("-----------------")
    // 可以不考虑某个位置的变量，只遍历key或者value
    for ((word, _) <- list){
      println(word)
    }
    println("-----------------")
    // 可以指定某个位置的值必须是多少
    for (("a", count) <- list){
      println(count)
    }
  }
}
