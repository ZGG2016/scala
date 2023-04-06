package chapter01
// 注意理解这里的类和对应伴生对象的关系，参考编译文件

// Student伴生对象的伴生类   （编译生成的Student.class对应这个类）
// 定义属性（name: String, age:Int）
class Student(name: String, var age:Int) {
  def printInfo(): Unit ={
    println(name + " " + age + " " + Student.school)
  }
}

// 类Student的伴生对象 （伴生对象就是解决了 去掉java中的static关键字 的问题）
// （编译生成的Student$.class对应这个伴生对象 ）
object Student{
  val school: String = "atguigu"

  // 需要在伴生对象中定义main方法 （ 参考java中的main方法[它含有static] ）
  def main(args: Array[String]): Unit = {
    val zhangsan = new Student("zhangsan", 14)
    val lisi = new Student("lisi", 14)

    zhangsan.printInfo()
    lisi.printInfo()
  }
}