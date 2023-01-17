package chapter06

/**
 * 访问权限
 */
object Test04_Access {
  def main(args: Array[String]): Unit = {
    val worker: Worker = new Worker()
    worker.printInfo()
//    worker.name  // Symbol idCard is inaccessible from this place
    worker.age
    worker.sex

    // val 修饰对象，不能改变对象的引用（即：内存地址），可以改变对象属性的值
    //    worker = new Worker()  // 错误
    worker.age = 111

    // var 修饰对象，可以修改对象的引用和修改对象的属性值
    var worker2: Worker = new Worker()
    worker2 = new Worker()
    worker2.age = 22

    val person: Person = new Person()
    person.printInfo()
//    person.idCard  // Symbol idCard is inaccessible from this place
//    person.name    // Symbol idCard is inaccessible from this place
    person.age
    person.sex
  }
}

// 定义一个Person的子类
class Worker extends Person{
  override def printInfo(): Unit = {
//    println(idCard)  // Symbol idCard is inaccessible from this place
    name = "lisi"  // protected
    age = 22      // private[包名]
    sex = "female"  // public
    println(s"Worker: $name $sex $age")
  }
}
