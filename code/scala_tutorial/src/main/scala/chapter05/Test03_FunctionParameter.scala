package chapter05

/**
 * 函数参数
 */
object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {

    // 可变参数
    def f1(name: String*): Unit = {
      println(name)
    }
    f1("zhangsan")
    f1("zhangsan", "lisi")
    println("==============================")

    // 如果参数列表有多个参数，可变参数放在最后
    def f2(age: Int, name: String*): Unit = {
      println(age, name)
    }
    f2(13,"zhangsan")
    f2(13,"zhangsan", "lisi")
    println("==============================")

    // 参数默认值，一版将有默认值的参数放最后
    def f3(age: Int, name: String = "wangwu"): Unit = {
      println(age, name)
    }
    f3(13,"zhangsan")
    f3(13)
    println("==============================")

    // 带名参数
    def f4(age: Int, name: String): Unit = {
      println(age, name)
    }
    f4(age = 13, name = "zhangsan")
    f4(name = "zhangsan", age = 13)
//    f4("zhangsan")
//    f4("zhangsan", 13)
  }
}
