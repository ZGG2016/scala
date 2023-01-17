package chapter09

/**
 * 隐式转换：
 *   1. 当编译器第一次编译失败的时候，会在当前的环境中查找能让代码编译通过的方法，用于将类型进行转换，实现二次编译
 *   2. 隐式类:
 *            其所带的构造参数有且只能有一个
 *            隐式类必须被定义在“类”或“伴生对象”或“包对象”里，即隐式类不能是顶级的
 *   3. 隐式参数:
 *              同一个作用域中，相同类型的隐式值只能有一个
 *              编译器按照隐式参数的类型去寻找对应类型的隐式值，与隐式值的名称无关
 *              隐式参数优先于默认参数
 *   4. 隐式解析机制
 *   （1）首先会在当前代码作用域下查找隐式实体（隐式方法、隐式类、隐式对象）。（一般是这种情况）
 *   （2）如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找。
 *       类型的作用域是指与该类型相关联的全部伴生对象以及该类型所在包的包对象
 */
object Test02_Implicit {
  def main(args: Array[String]): Unit = {

//    println(12.myMax(15))
    val new12: MyRichInt = new MyRichInt(12)
    println(new12.myMax(15))

    println("-------------------------")

    // 1. 隐式函数
    implicit def convert(n: Int): MyRichInt = new MyRichInt(n)
    // 当想调用对象功能时，如果编译错误，那么编译器会尝试在当前作用域范
    // 围内查找能调用对应功能的转换规则，这个调用过程是由编译器完成的，
    // 所以称之为隐式转换。也称之为自动转换（12会在作用域内找能够转成MyRichInt的函数进行转换）
    println(12.myMax(15))

    println("-------------------------")
    // 2. 隐式类
    implicit class MyRichInt2(val self: Int){
      def myMax2(n: Int): Int = if (self > n) self else n
      def myMin2(n: Int): Int = if (self < n) self else n
    }
    println(12.myMax2(15))

    println("-------------------------")

    // 3. 隐式参数
    // 先定义一个隐式值
    implicit val str: String = "zhangsan"
//    implicit val str2: String = "wangwu"
    implicit val age: Int = 12
    def sayHello(implicit name: String = "lisi"): Unit = {
      println(name)
    }
    sayHello

    // 简写
    def sayAge(): Unit = {
      println(implicitly[Int])
    }
    sayAge()
  }
}

class MyRichInt(val self: Int){

  def myMax(n: Int): Int = if (self > n) self else n
  def myMin(n: Int): Int = if (self < n) self else n

}