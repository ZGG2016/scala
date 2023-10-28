package chapter05

/**
 * 控制抽象
 */
object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 1.传值参数 （把计算后的值传递过去）
    def f0(a: Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
    f0(23)

    def f1(): Int = {
      println("f1被调用")
      12
    }
    f0(f1())
    println("========================")

    // 2.传名参数  （传递的不再是具体的值，而是把代码块传递过去，没有参数类型，返回值类型是Int） 注意参数列表的形式
    def f2(a: =>Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
    f2({23})
    f2(23)
    f2(f1()) // “f1被调用” 输出两次   在执行中，a就替换成了 f1()

    f2({
      println("这是一段代码块")
      33
    })  // “这是一段代码块” 输出两次  在执行中，a就替换成了这段代码块

  }
}
