/*
包对象:
  在 Scala 中可以为每个包定义一个同名的包对象，定义在包对象中的成员，
  作为【其对应包下所有 class 和 object 的共享变量，可以被直接访问】
 */
package object chapter06 {

  // 定义当前包共享的属性和方法
  val commonValue = "尚硅谷"
  def commonMethod(): Unit = {
    println(s"我们在${commonValue}学习")
  }

}
