package chapter02

import scala.io.StdIn

/**
 * 从控制台读取数据
 */
object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    println("请输入你的名字：")
    val name: String = StdIn.readLine()
    println("请输入你的年龄：")
    val age: Int = StdIn.readInt()
    println(s"${name} ${age}")

    val list = StdIn.readf(s"名字：{0}; 年龄：{1}")
    println(list)


  }
}
