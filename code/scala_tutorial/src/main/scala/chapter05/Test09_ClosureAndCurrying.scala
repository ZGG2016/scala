package chapter05

/**
 * 闭包 柯里化
 */
object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    /*
       闭包：如果一个函数，访问到了它的外部（局部）变量的值，
            那么这个函数和他所处的环境，称为闭包
     */
    // 将固定加数作为另一个参数传入，但是是作为”第一层参数“传入
    def addByFour1(): Int=>Int = {
      val a = 4;
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    def addByA(a: Int): Int=>Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }
    // 直接调用
    println(addByA(1)(2))

    // 固定第一个参数，将返回值函数赋给一个变量，然后再调用返回值函数（体会这种用法）
    val addByFour = addByA(4)
    val addByFive = addByA(5)
    println(addByFour(2))
    println(addByFive(2))

    // 使用lambda表达式简写
    def addByA1(a: Int): Int=>Int = {
      (b: Int) => {
        a + b
      }
    }

    def addByA2(a: Int): Int=>Int = {
      b => a + b
    }

    def addByA3(a: Int): Int=>Int = a + _

    val addByFour2 = addByA3(4)
    val addByFive2 = addByA3(5)
    println(addByFour2(2))
    println(addByFive2(2))

    /*
        函数柯里化：把一个参数列表的多个参数，变成多个参数列表
                  函数柯里化一定存在闭包
     */
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }
    println(addCurrying(1)(2))

  }
}
