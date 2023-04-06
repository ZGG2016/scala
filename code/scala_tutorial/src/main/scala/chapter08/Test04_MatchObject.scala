package chapter08

/**
 * 匹配对象
 */
object Test04_MatchObject {
  def main(args: Array[String]): Unit = {

    val zhangsan = new Student4("zhangsan", 11)
    val res: String = zhangsan match {
      case Student4("zhangsan", 11) => "ok"
      case _ => "not ok"
    }
    println(res)

  }
}

class Student4(val name: String, val age: Int)

object Student4{
  def apply(name: String, age: Int): Unit = new Student4(name, age)

  def unapply(student: Student4): Option[(String, Int)] = {
    if (student == null){
      None
    } else {
      Some((student.name, student.age))
    }
  }
}