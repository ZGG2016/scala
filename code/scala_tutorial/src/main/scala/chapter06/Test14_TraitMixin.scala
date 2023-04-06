package chapter06

/**
 * 特质：混入mixin
 */
object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val student1 = new Student14
    student1.study()
    student1.increase()

    // 动态混入
    val student2 = new Student14 with Talent {
      override def singing(): Unit = println("student is good at dancing")

      override def dancing(): Unit = println("student is good at singing")
    }

    student2.singing()
    student2.increase()

    student2.dancing()
    student2.increase()
  }
}

trait Knowledge{
  var amount: Int = 0
  def increase(): Unit
}

trait Talent{
  def singing(): Unit
  def dancing(): Unit
}

class Student14 extends Person13 with Young with Knowledge {   // 混入mixin

  // 重写冲突的属性
  override val name: String = "student"

  // 实现抽象方法
  def dating(): Unit = {
    println(s"student $name is dating")
  }

  // 定义自己的方法
  def study(): Unit = {
    println(s"student $name is studying")
  }

  // 重写父类方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name")
  }

  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge increased: $amount")
  }
}
