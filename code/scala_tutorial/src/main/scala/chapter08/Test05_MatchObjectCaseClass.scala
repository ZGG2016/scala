package chapter08

/**
 * 匹配对象：样例类
 */
object Test05_MatchObjectCaseClass {
  def main(args: Array[String]): Unit = {

    val zhangsan = Student5("zhangsan", 11)
    val res: String = zhangsan match {
      case Student5("zhangsan", 11) => "ok"
      case _ => "not ok"
    }
    println(res)

  }
}

case class Student5(name: String, age: Int)