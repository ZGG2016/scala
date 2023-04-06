package chapter01

/*
   1. object 声明一个单例对象（伴生对象）
   2. def 方法名称(参数名称：参数类型)：返回值类型 = { 方法体 }
 */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("hello world")

    System.out.print("hello world from java")
  }
}
