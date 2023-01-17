package chapter05

/**
 * 函数定义
 */
object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {

    // 无参 无返回值
    def f1(): Unit = {
      println("无参 无返回值")
    }
    f1()
    println(f1())
    println("=========================")

    // 无参 有返回值
    def f2(): String = {
      println("无参 有返回值")
      return "无参 有返回值"
    }
    f2()
    println(f2())
    println("=========================")

    // 有参 无返回值
    def f3(name: String): Unit = {
      println("有参 无返回值 -- "+ name)
    }
    f3("zhangsan")
    println(f3("zhangsan"))
    println("=========================")

    // 有参 有返回值
    def f4(name: String): String = {
      println("有参 有返回值 -- "+ name)
      return name
    }
    f4("zhangsan")
    println(f4("zhangsan"))
    println("=========================")

    // 多参 无返回值
    def f5(name: String, age: Int): Unit = {
      println("有参 有返回值 -- "+ name + age)
    }
    f5("zhangsan", 13)
    println(f5("zhangsan", 13))
    println("=========================")

    // 多参 有返回值
    def f6(name: String, age: Int): String = {
      println("有参 有返回值 -- "+ name + age)
      return name + age
    }
    f6("zhangsan", 13)
    println(f6("zhangsan", 13))
    println("=========================")
  }
}
