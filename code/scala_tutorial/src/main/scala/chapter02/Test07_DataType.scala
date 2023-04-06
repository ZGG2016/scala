package chapter02

import chapter01.Student

/**
 * 数据类型
 */
object Test07_DataType {
  def main(args: Array[String]): Unit = {
    // （1）整型
    val a1: Byte = 127
    val a2: Byte = -128
    //    val a3: Byte = 128

    val a4: Short = 128

    val a5 = 12 // 默认Int

    val a6: Long = 12212123114124124L

    val b1: Byte = 10
    val b2: Byte = 10 + 20 // 在编译时能直接推断出来结果在Byte表示的范围内
    println(b2)

//    val b3: Byte = b1 + 20 // 在运行时才能知道b3的类型  type mismatch; found : Int  required: Byte
    val b3: Byte = (b1 + 20).toByte
    println(b3)

    println("==========================")
    // （2）浮点型
    val f1: Float = 1.234f
    val f2 = 1.234 // 默认Double
    val f3 = 5.12e2
    val f4 = 5.12E-2
    println(f3, f4)

    println("==========================")
    // （3）字符型
    val c1: Char = 'a'
    println(c1)

    val c2: Char = '9'
    println(c2)

    val c3: Char = '\t'
    val c4: Char = '\n'
    println("abd" + c3 + "efg") // abd\efg
    println("abd" + c4 + "efg") // abd"efg

    val c5: Char = '\\'
    val c6: Char = '\"'
    println("abd" + c5 + "efg")
    println("abd" + c6 + "efg")

    // 字符变量底层保存ASCII码
    val i1: Int = c1
    val i2: Int = c2
    println("i1: " + i1)
    println("i2: " + i2)

    val c7: Char = (i1 + 1).toChar
    println(c7)

    println("==========================")
    // （4）布尔型
    val isTrue: Boolean = true
    println(isTrue)

    println("==========================")
    // （5）空类型
    // Unit 用在方法没有任何返回值
    def m1(): Unit = {
      println("m1.... ")
    }
    val a = m1()
    println("a: " + a) // a: ()

    // null 空引用
//    var n: Int = null
//    println(n) // an expression of type Null is ineligible for implicit conversion
    var student = new Student("zhangsan", 14)
    student = null
    println(student) // null

    // Nothing: 没有正常的返回值时（比如抛异常时），用它
//    def m2(n:Int): Nothing = {
//      throw new NullPointerException
//    }
//    val b = m2(2)
//    println("b: " + b)

    // Int 是 Nothing 的父类
    def m3(n: Int): Int = {
      if (n == 0){
        throw new NullPointerException
      } else {
        return n
      }
    }
    val c = m3(2)
    println("c: " + c)

  }
}
