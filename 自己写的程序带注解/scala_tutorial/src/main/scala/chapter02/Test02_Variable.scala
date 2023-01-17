package chapter02

import chapter01.Student

/**
 * 变量 常量
 */
object Test02_Variable {
  def main(args: Array[String]): Unit = {

    // 声明变量
    var a: Int = 1

    // （1）声明变量，类型可以省略（编译器自动推导）
    var a1 = 1
    val b1 = 2

    // （2）类型确定后，就不能修改（scala是强数据类型语言）
    var a2 = 1
//    a2 = "hello"

    // （3）变量声明时，必须要有初始值
//    var a3: Int

    // （4）在声明活定义一个变量时，使用var修饰的变量可以改变，val修饰的变量不可以改变
    a1 = 3
//    b1 = 4

    // 对于引用类型
    var zhangsan = new Student("zhangsan", 13)
    zhangsan = new Student("zhangsan", 10)

    val lisi = new Student("lisi", 14)
//    lisi = new Student("lisi", 10)
    // student对象不能修改，但其属性可以修改，
    // 可以在定义类的时候，给属性添加var修饰，来修改属性，如果使用val修饰，只能访问属性，不能修改属性:
    // class Student(name: String, var age:Int) {}
    lisi.age = 10
    lisi.printInfo()
  }
}
