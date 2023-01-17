package chapter05

/**
 * 匿名函数
 */
object Test05_Lambda {
  def main(args: Array[String]): Unit = {

    val fun: String => Unit = (name: String) => { println(name) }
    fun("zhangsan")
    println("======================")

    // 将函数作为另一个函数的参数  （对同一数据执行不同的操作）
    def f(func: String => Unit): Unit = {
      func("zhangsan")
    }
    f(fun)
    f( (name: String) => { println(name) } )
    println("======================")

    // 传递匿名函数的简化原则
    // 1. 参数的类型可以省略，会根据形参进行自动的推导
    f( (name) => { println(name) } )
    println("======================")

    // 2. 类型省略之后，发现只有一个参数，则圆括号可以省略；其他情况：没有参数和参数超过1的永远不能省略圆括号
    f( name => { println(name) } )
    println("======================")

    // 3. 匿名函数如果只有一行，则大括号也可以省略
    f( name => println(name) )
    println("======================")

    // 4. 如果参数只出现一次，则参数省略，且后面参数可以用 _ 代替
    f( println(_) )
    println("======================")
    // 5. 如果可以推断出，当前传入的 println 是一个函数体，而不是调用语句，可以直接省略下划线
    f( println )
    println("======================")
    // 实例， 定义一个“二元运算”函数，只操作1和2两个数，具体运算通过参数传入
    def optOneAndTwo(func: (Int, Int) => Int): Int = {
      func(2, 1)
    }

    println(optOneAndTwo((a: Int, b: Int) => a + b) )
    println(optOneAndTwo((a: Int, b: Int) => a - b))
    // 简化
    println(optOneAndTwo((a, b) => a + b ))
    println(optOneAndTwo((a, b) => a - b ))
    // 简化
    println(optOneAndTwo( _ + _ ))
    println(optOneAndTwo( _ - _ ))

    println(optOneAndTwo((a: Int, b: Int) => -a + b))
    println(optOneAndTwo( -_ + _ ))
  }
}
