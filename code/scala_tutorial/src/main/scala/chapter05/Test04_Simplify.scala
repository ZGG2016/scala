package chapter05

/**
 * 函数简化原则
 */
object Test04_Simplify {
  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }

    println(f0("zhangsan"))
    println("===================================")

    // 1. return关键字可以省略，可以根据函数体最后一行代码作为返回值
    def f1(name: String): String = {
      name
    }

    println(f1("zhangsan"))
    println("===================================")

    // 2. 函数体只有一行代码，可以省略花括号
    def f2(name: String): String = name

    println(f2("zhangsan"))
    println("===================================")

    // 3. 返回值类型如果能推断出来，那么可以省略
    def f3(name: String) = name   // 函数f(x) = x

    println(f3("zhangsan"))
    println("===================================")

    // 4. 如果有return，则不能省略返回值类型  Method f4 has return statement; needs result type
//    def f4(name: String) = {
//      return name
//    }
//
//    println(f4("zhangsan"))
//    println("===================================")

    // 5. 如果函数明确声明Unit，那么即使函数体中使用return关键字也不起作用
    // Returning Unit from a method with Unit result type
    def f5(name: String): Unit = {
      return name
    }

    println(f5("zhangsan")) // ()
    println("===================================")

    // 6. scala如果期望是无返回值类型，可以省略等号
    def f6(name: String) {
      println(name)
    }

    println(f6("zhangsan"))
    println("===================================")

    // 7. 如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7(): Unit = {
      println("f7")
    }

    f7()
    f7
    println("===================================")

    // 8. 如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8: Unit = {
      println("f8")
    }

    f8
//    f8()   // f8 does not take parameters
    println("===================================")

    // 9. 如果不关系名称，只关心逻辑处理，那么函数名可以省略
    (name: String) => { println(name) }
  }
}
