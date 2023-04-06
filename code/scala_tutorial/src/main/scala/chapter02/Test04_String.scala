package chapter02

/**
 * 字符串
 */
object Test04_String {
  def main(args: Array[String]): Unit = {
    // （1）字符串连接： +
    val name: String = "zhangsan"
    val age: Int = 14
    println(name + " 的年龄是 " + age + " 岁")
    // （2）字符串复制拼接： *
    println(name*3)
    // （3）printf
    printf("%s 的年龄是 %d 岁", name, age);println()
    // （4）字符串模板 $
    println(s"${name} 的年龄是 ${age} 岁")
    // （5）格式化模板字符串
    val a: Double = 123.4567
    println(f"the num is ${a}%3.2f")  // the num is 123.46
    println(raw"the num is ${a}%3.2f") // the num is 123.4567%3.2f
    // （6）三引号字符串
    val sql = s"""
        |select name, age
        |from
        |student
        |""".stripMargin
    println(sql)
  }
}
