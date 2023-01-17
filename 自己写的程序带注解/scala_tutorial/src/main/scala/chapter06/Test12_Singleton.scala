package chapter06

/**
 * 实现单例模式
 */
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val student1 = Student12.getInstance()
    student1.printInfo()

    val student2 = Student12.getInstance()
    student2.printInfo()

    println(student1)
    println(student2)
  }
}

class Student12 private(val name: String, val age: Int){
  def printInfo(): Unit = {
    println(s"student: name = ${name}, age = $age")
  }
}

// 饿汉式
//object Student12{
//  private val student: Student12 = new Student12("zhangsan", 14)
//  def getInstance(): Student12 = student
//}

// 懒汉式
object Student12{
  private var student: Student12 = _
  def getInstance(): Student12 = {
    if (student == null){
      student = new Student12("zhangsan", 14)
    }
    student
  }
}