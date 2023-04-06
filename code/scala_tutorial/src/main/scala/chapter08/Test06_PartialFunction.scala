package chapter08

/**
 * 偏函数：只处理一种情况
 */
object Test06_PartialFunction {
  def main(args: Array[String]): Unit = {

    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))

    // 1. map转换，实现key不变，value2倍
    val list1 = list.map(t => (t._1, t._2 * 2))
    println(list1)

    println("--------------------------")

    // 2. 用模式匹配对元组元素赋值，实现功能
    val list2 = list.map(
      t => t match {
        case (word, count) => (word, count * 2)
      })
    println(list2)

    println("--------------------------")

    // 3. 省略lambda表达式的写法，进行简化 （样例类）
    val list3 = list.map {
      case (word, count) => (word, count * 2)
    }
    println(list3)

    println("--------------------------")

    // 4. 偏函数的应用，求绝对值
    // 对输入数据分为不同的情形：正、负、0
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs)(x)
    println(abs(1))
    println(abs(-1))
    println(abs(0))
  }
}
