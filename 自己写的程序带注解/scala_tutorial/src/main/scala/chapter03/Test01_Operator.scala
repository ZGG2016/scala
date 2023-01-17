package chapter03

import chapter01.Student

/**
 * 运算符
 */
object Test01_Operator {
  def main(args: Array[String]): Unit = {
    // （1）算术运算符
    // 整数除
    val res1: Int = 10 /3
    println(res1)
    val res2: Double = 10 /3
    println(res2)
    // 小数除
    val res3: Double = 10.0 /3
    println(res3)
    println(res3.formatted("%5.2f"))

    // （2）关系运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    println(s1 == s2) // 比较内容
    println(s1.equals(s2)) // 比较内容
    println(s1.eq(s2)) // 比较地址

    val zhangsan1 = new Student("zhangsan", 14)
    val zhangsan2 = new Student("zhangsan", 14)
    println(zhangsan1 == zhangsan2)

    // （3）逻辑运算符
    def m(n: Int): Int = {
      println("m被调用")
      return n
    }
    val n = 1
    println( (4>5) && m(n)>0 ) // 短路与

    // 判断一个字符串是否为空
    def isNotEmpty(str: String): Boolean = {
      return (str != null) && !("".equals(str.trim))
    }
    isNotEmpty("aa")

    // （4）赋值运算符
//    var b: Byte = 10
//    b += 1 // type mismatch
//    println(b)
    var i: Int = 12
    i += 1
    println(i)

    // （5）位运算符
    val a:Byte = 60
    println(a << 3)
    println(a >> 3)

    val b: Short = -13
    println(b << 2)
    println(b >> 2)
    println(b >>> 2)

    // 位运算符本质: 对象调方法
    val n1: Int = 12
    val n2: Int = 37
    println( n1.+(n2) )
    println( n1 + n2 )

    println(1.23.*(100))

//    println(1.23 toInt toString) // Int does not take parameters
    println(1.23 toInt)
    println(1.23.toInt.toString)
  }
}
