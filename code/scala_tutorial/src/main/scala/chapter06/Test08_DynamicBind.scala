package chapter06

/**
 * 多态
 * 动态绑定：在运行时确定；
 *         Scala 中属性和方法都是动态绑定，而 Java 中只有方法为动态绑定
 */
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student: Person8 = new Student8
    println(student.name)  // student
    student.hello()  // hello student
  }
}

class Person8 {
  val name: String = "person"
  def hello(): Unit = {
    println("hello person")
  }
}

class Student8 extends Person8 {
  override val name: String = "student" // 这里
  override def hello(): Unit = {
    println("hello student")
  }
}