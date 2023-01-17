package chapter06

object Test04_ClassForAccess {

}

// 定义一个父类
class Person{
  // 私有权限，只在类的内部和伴生对象中可用
  private var idCard: String = "241242"
  // 同类、子类可以访问，同包无法访
  protected var name: String = "zhangsan"
  var sex: String = "male"
  // private[包名]增加包访问权限，包名下的其他类也可以使用
  private[chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"Person: $idCard $name $sex $age")
  }
}
