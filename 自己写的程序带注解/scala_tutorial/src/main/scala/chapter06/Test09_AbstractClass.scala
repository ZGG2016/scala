package chapter06

/**
 * 抽象类
 */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val student = new Student9
    student.eat()
    student.sleep()
  }
}

abstract class Person9{
  // 非抽象属性
//  val name: String = "person"
  var name: String = "person"

  // 抽象属性：一个属性没有初始化
  var age: Int

  // 非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

  // 抽象方法：只声明而没有实现的方法
  def sleep(): Unit
}

class Student9 extends Person9{
  // 子类对抽象属性进行实现，父类抽象属性可以用 var 修饰
  var age: Int = 18

  // 子类对非抽象属性重写，父类非抽象属性只支持 val 类型，而不支持 var
//  override val name: String = "student"
  name = "student"

  // 重写非抽象方法需要用 override 修饰，重写抽象方法则可以不加 override
  def sleep(): Unit = {
    println("student sleep")
  }

  override def eat(): Unit = {
    // 子类中调用父类的方法使用 super 关键字
    super.eat()
    println("student eat")
  }
}
