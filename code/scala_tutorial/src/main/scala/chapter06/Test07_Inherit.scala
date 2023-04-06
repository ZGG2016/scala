package chapter06

/**
 * 继承：
 *    继承的调用顺序：父类构造器->子类构造器
 */
object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val zhangsan: Student7 = new Student7("zhangsan", 18)
    val lisi: Student7 = new Student7("lisi", 20, "std001")

    zhangsan.printInfo()
    lisi.printInfo()

    val teacher = new Teacher
    teacher.printInfo()

    def personInfo(person: Person7): Unit = {
      person.printInfo()
    }

    println("=========================")

    val person = new Person7
    personInfo(zhangsan)
    personInfo(teacher)
    personInfo(person)
  }
}

class Person7(){
  var name: String = _
  var age: Int = _

  println("1. 父类的主构造器调用")

  def this(name: String, age: Int){
    this()
    println("2. 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }
  def printInfo(): Unit = {
    println(s"Person: $name $age")
  }
}

//class Student7(name: String, age: Int) extends Person7(){
// 调父类的主构造器
//class Student7(name: String, age: Int) extends Person7{
// 调父类的辅助构造器，再调父类的主构造器
class Student7(name: String, age: Int) extends Person7(name, age){
  var stdNo: String = _

  println("3. 子类的主构造器调用")

  def this(name: String, age: Int, stdNo: String){
    this(name, age)
    println("4. 子类的辅助构造器调用")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stdNo")
  }
}

class Teacher extends Person7 {
  override def printInfo(): Unit = {
    println(s"Teacher")
  }
}