package chapter06

/**
 * 伴生对象:
 *        若单例对象名与类名一致，则称该单例对象这个类的伴生对象，
 *        这个类的所有“静态”内容都可以放置在它的伴生对象中声明
 *        （解决scala没有java中的static关键字的问题）
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
//    val student = new Student11("zhangsan", 18)
//    student.printInfo()

    val student1 = Student11.newStudent("zhangsan", 18)
    student1.printInfo()

    val student2 = Student11.apply("zhangsan", 19)
    student2.printInfo()

    // 省略apply
    val student3 = Student11("zhangsan", 19)
    student3.printInfo()
  }
}

// 单例对象对应的类称之为伴生类
// 添加private关键字，将构造器私有，然后在其伴生对象中对外开放一个创建对象实例的方法
class Student11 private(val name: String, val age: Int){
  def printInfo(): Unit = {
    // 单例对象中的属性和方法都可以通过伴生对象名（类名）直接调用访问
    println(s"student: name = ${name}, age = $age, school = ${Student11.school}")
  }
}

// 伴生类对应的对象就是单例对象，伴生对象的名称应该和伴生类名一致
object Student11{
  val school: String = "atguigu"

  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  // 可以将上述方法名修改为apply，此时在创建对象实例时，可以省略此方法名称
  // 所以，当使用 new 关键字构建对象时，调用的其实是类的构造方法，
  //      当直接使用类名构 建对象时，调用的其实时伴生对象的 apply 方法
  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}