package chapter08

/**
 * 模式匹配
 */
object Test01_PatternMatchBase {
  def main(args: Array[String]): Unit = {
    // 基本定义语法
    val x: Int = 5
    val str: String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(str)

    // 示例：用模式匹配实现简单二元运算
    val a: Int = 5
    val b: Int = 2
    def matchDualOp(op: Char): Any = {
      op match {
        case '+' => a+b
        case '-' => a-b
        case '*' => a*b
        case '/' => a/b
        case _ => "非法运算符"
      }
    }

    println(matchDualOp('+'))
    println(matchDualOp('-'))

    // 模式守卫
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(2))
    println(abs(-2))
  }
}
