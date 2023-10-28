package chapter05

/**
 * 函数高阶用法
 */
object Test06_HighLevelFunction {
  def main(args: Array[String]): Unit = {

    def f(n: Int): Int = {
      println("f被调用")
      n + 1
    }

    def fun(): Int = {
      println("fun被调用")
      1
    }

    val res1 = f(10)
    println(res1)
    println("======================")

    val res2 = fun()
    println(res2)
    println("======================")

    // 1. 将函数作为值传递
    val f1: Int => Int = f
    val f2 = f _
    println(f1)
    println(f2)
    println(f1(10))
    println(f2(10))
    println("======================")

    val f3: () => Int = fun
    val f4 = fun _
    println(f3)
    println(f4)
    println(f3())
    println(f4())
    println("======================")

    // 2. 函数作为参数传递
    // op 表示函数名称;  (Int,Int) 表示输入两个 Int 参数；Int 表示函数返回值
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 1, 2)) // 普通函数
    println(dualEval( (a, b) => a + b, 1, 2)) // 匿名函数
    println(dualEval( _+_, 1, 2))
    println("======================")

    // 3. 函数作为函数的返回值
    def f5() = {
      def f6(n: Int): Unit = {
        println(n)
      }
      f6 _
    }
//    def f5(): Int => Unit = {
//      def f6(n: Int): Unit = {
//        println(n)
//      }
//      f6
//    }


    println(f5())
    val f6 = f5()
    f6(1)
    println(f6(1))
  }
}
