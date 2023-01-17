package chapter06

/**
 * 继承冲突问题：
 *    由于一个类可以混入（mixin）多个 trait，且 trait 中可以有具体的属性和方法，
 *    若混入的特质中具有相同的方法（方法名，参数列表，返回值均相同），必然会出现继承冲突问题
 *
 *    解决冲突方法1：一个类（Sub）混入的两个 trait（TraitA，TraitB）中具有相同的具体方法，且两个 trait 之间没有任何关系，
 *       解决：在子类中重写冲突方法或冲突属性
 *    解决冲突方法2：一个类（Sub）混入的两个 trait（TraitA，TraitB）中具有相同的具体方法，且两个 trait 继承自相同的 trait（TraitC）
 *       解决：特质叠加，就是将混入的多个 trait 中的冲突方法叠加起来
 */
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val student = new Student15
    student.increase()

    val ball = new MyFootBall
    println(ball.describe())  // my ball is a red-foot-ball
  }
}

trait Knowledge15{
  var amount: Int = 0
  def increase(): Unit = println("knowledge increased")
}

trait Talent15{
  def singing(): Unit
  def dancing(): Unit
  def increase(): Unit = println("talent increased")
}

class Student15 extends Person13 with Talent15 with Knowledge15{
  override def singing(): Unit = println("dancing")

  override def dancing(): Unit = println("singing")

  // 解决冲突方法1：在子类中重写冲突方法或冲突属性
  // 调用这个方法，会输出特质Knowledge15中的increase方法的打印语句
//  override def increase(): Unit = super.increase()
  // 可以指定继承哪个特质
  override def increase(): Unit = super[Talent15].increase()
}

trait Ball{
  def describe(): String = "ball"
}

trait Color extends Ball{
  val color: String = "red"
  override def describe(): String = color + "-" +super.describe()
}

trait Category extends Ball{
  val category: String = "foot"
  override def describe(): String = category + "-" +super.describe()
}

class MyFootBall extends Category with Color {
  // 解决冲突方法2：特质叠加
  // 叠加顺序: MyFootBall -> Color -> Category -> Ball
//  override def describe(): String = "my ball is a " + super.describe()
  override def describe(): String = "my ball is a " + super[Category].describe()
}