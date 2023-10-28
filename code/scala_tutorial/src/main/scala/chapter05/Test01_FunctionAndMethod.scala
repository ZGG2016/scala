package chapter05

/**
 * 函数：为完成某一功能的程序语句的集合
 * 方法：类中的函数
 * 【结合前面的反编译内容理解】
 */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {

    // 定义函数
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }

    // 函数没有重载和重写的概念   sayHi is already defined in the scope
//    def sayHi(name: String, age: Int): Unit = {
//      println("hi, " + name)
//    }

    // 调用函数
    sayHi("zhangsan")

    // 调用对象的方法
    Test01_FunctionAndMethod.sayHi("lisi")
  }

  // 定义对象的方法
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }

  // 方法有重载和重写的概念
  def sayHi(name: String, age: Int): Unit = {
    println("hi, " + name)
  }
}
