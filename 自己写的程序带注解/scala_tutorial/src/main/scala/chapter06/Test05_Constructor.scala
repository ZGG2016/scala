package chapter06

/**
 * 构造器
 */
object Test05_Constructor {
  def main(args: Array[String]): Unit = {
//    val student1 = new Student1()
    val student1 = new Student1
    student1.printInfo()
    println("==========================")

    val zhangsan = new Student1("zhangsan")
    zhangsan.printInfo()
    println("==========================")

    val lisi = new Student1("lisi", 22)
    lisi.printInfo()
    println("==========================")
  }
}

// 如果主构造器无参数，小括号可省略，构建对象时调用的构造方法的小括号也可以省略
class Student1{
//class Student1(){
  var name: String = _
  var age: Int = _

  println("1. 主构造方法被调用")

  // 声明辅助构造方法
  // 辅助构造方法不能直接构建对象，必须直接或者间接调用主构造方法
  def this(name: String){
    this()  // 直接调用主构造器
    println("2. 辅助构造方法一被调用")

    this.name = name
    println(s"name: $name age: $age")
  }

  def this(name: String, age: Int){
    // 构造器调用其他另外的构造器，要求被调用构造器必须提前声明
    this(name)
    println("3. 辅助构造方法二被调用")
    this.age = age
    println(s"name: $name age: $age")
  }

  def printInfo(): Unit ={
    println("一般方法被调用")
  }
}
