package chapter08

/**
 * 匹配对象
 */
object Test04_MatchObject {
  def main(args: Array[String]): Unit = {

    val zhangsan = new Student4("zhangsan", 11)
    val res: String = zhangsan match {
      // 调用 unapply 方法(对象提取器)，zhangsan 作为 unapply 方法的参数，unapply 方法
      //将 zhangsan 对象的 name 和 age 属性提取出来，进行匹配
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