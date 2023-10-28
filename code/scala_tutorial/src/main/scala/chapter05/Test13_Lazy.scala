package chapter05

/**
 * 惰性加载:
 * 当函数返回值被声明为 lazy 时，函数的执行将被推迟，
 * 直到我们首次对此取值，该函数才会执行。
 *
 * lazy 不能修饰 var 类型的变量
 */
object Test13_Lazy {
  def main(args: Array[String]): Unit = {
//    val res: Int = sum(1, 2)
    lazy val res: Int = sum(1, 2)
    println("1. 函数调用")
    println("2. result = " + res)
    println("4. result = " + res)
  }

  def sum(a: Int, b: Int): Int = {
    println("3. sum调用") // 只会被输出一次
    a + b
  }
}
