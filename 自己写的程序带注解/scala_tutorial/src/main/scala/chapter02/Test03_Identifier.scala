package chapter02

/**
 * 标识符
 */
object Test03_Identifier {
  def main(args: Array[String]): Unit = {

    // （1） 以字母活下划线开头，后接字母、数字、下划线
    // （2） 以操作符开头，且只包含操作符 （+ - * / # !）
    val + = "a"
    println(+)
    val +-* = "b"
    println(+-*)
//    val +a = "c"

    // （3） 用反引号包括的任意字符串，即使是scala关键字也可以
    val `def` = "def"
    println(`def`)
  }
}
