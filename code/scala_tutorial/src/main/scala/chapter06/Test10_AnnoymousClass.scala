package chapter06

/**
 * 匿名之类
 */
object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    val person1: Person10 = new Person10 {
      override var name: String = "person"

      override def eat(): Unit = println("person eat")
    }
    println(person1.name)
    person1.eat()
  }
}

abstract class Person10{
  var name: String
  def eat(): Unit
}
