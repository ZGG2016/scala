package chapter06

/**
 * 类型检查和转换
 */
object Test17_Extend {
  def main(args: Array[String]): Unit = {
    // 1. 类型的检测和转换
    val student: Student17 = new Student17("zhangsan", 18)
    student.study()
    student.sayHi()
    val person: Person17 = new Student17("lisi", 20)
    person.sayHi()
    val person2: Person17 = new Person17("wangwu", 35)
    person2.sayHi()

    println("student.isInstanceOf[Student17] --> " + student.isInstanceOf[Student17])
    println("student.isInstanceOf[Person17] --> " + student.isInstanceOf[Person17])
    println("person.isInstanceOf[Student17] --> " + person.isInstanceOf[Student17])
    println("person.isInstanceOf[Person17] --> " + person.isInstanceOf[Person17])
    println("person2.isInstanceOf[Student17] --> " + person2.isInstanceOf[Student17])

    // 2. 类型转换
    if (person.isInstanceOf[Student17]){
      person.asInstanceOf[Student17]
    }

    // 3. classOf 获取对象的类名
    println("classOf[Student17] --> " + classOf[Student17])

    println(Workday.MONDAY)
  }
}

class Person17(val name: String, val age: Int){
  def sayHi(): Unit = {
    println("hi from person " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age){
  override def sayHi(): Unit = {
    println("hi from student " + name)
  }
  def study(): Unit = {
    println("student study")
  }
}

// 枚举类
object Workday extends Enumeration{
  val MONDAY = Value("monday")
  val TUESDAY = Value(2, "TuesDay")
}

// 应用类  包含了main方法
object TestApp extends App{
  println("app start")

  // 使用 type 关键字可以定义新的数据数据类型名称，本质上就是类型的一个别名
  type myString = String
  val s: myString = "zhangsan"
  println(s)
}