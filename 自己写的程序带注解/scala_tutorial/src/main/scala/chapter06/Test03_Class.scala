package chapter06

import scala.beans.BeanProperty

/**
 * 类定义
 */
object Test03_Class {
  def main(args: Array[String]): Unit = {
    val student = new Student()
//    student.name  // Symbol name is inaccessible from this place
    println(student.age)
    println(student.sex)

    student.age = 18
    println(student.age)
    println(student.getAge)
    println(student.getAge)
  }
}

// 类默认就是 public，但是不能显示的写出来
//public class Student{
class Student{
  // 定义一个私有属性
  private var name: String = "zhangsan"
  @BeanProperty  // 设置属性的 getter setter 方法
  var age: Int = _   // 赋初始值 Int->0  String->""
  var sex: String = _
}
