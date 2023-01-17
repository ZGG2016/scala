package chapter05

/**
 * 递归：计算阶乘
 */
object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
  }

  /*
    递归实现
    f(5)       300
    f(5-1) * 5  f(4) * 5  |  24 * 5 = 120 ^
    f(4-1) * 4  f(3) * 4  |  6 * 4 = 24   |
    f(3-1) * 3  f(2) * 3  |  2 * 3 = 6    |
    f(2-1) * 2  f(1) * 2  |  1 * 2 = 2    |
    f(1-1) * 1  f(0) * 1  v  1 * 1 = 1    |
   */

  def fact(n: Int): Int = {
    if (n == 0) return 1
    fact(n - 1) * n
  }

  /*
     优化：尾递归实现（思考好处）
     loop(n, res)   每一步都覆盖了上一步的res
     loop(5, 1)
     loop(4, 1*5)           loop(4, 5)
     loop(3, 1*5*4)         loop(3, 5*4)
     loop(2, 1*5*4*3)       loop(2, 20*3)
     loop(1, 1*5*4*3*2)     loop(1, 60*2)
     loop(0, 1*5*4*3*2*1)   loop(0, 120)      res = 120

 */
  def tailFact(n: Int): Int = {
    def loop(n: Int, res: Int): Int = {
      if (n == 0) return res
      loop(n - 1, res * n)
    }
    loop(n, 1)
  }

}
