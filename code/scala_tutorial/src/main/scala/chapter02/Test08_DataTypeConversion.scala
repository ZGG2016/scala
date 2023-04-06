package chapter02

/**
 * 数据类型转换
 */
object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    // 有多种类型的数据混合运算时，系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
    val a1: Byte = 10
    val b1: Long = 2333
    val res1: Long = a1 + b1
    val res2: Byte = (a1 + b1).toByte // 强转
    println(res1, res2)

    // 当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时，就会报错，反之 就会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
//    val c2: Byte = b2
    val c21: Byte = b2.toByte // 强转

    // (byte, short) 和 char之间不会相互自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
//    val c3: Byte = b3
//    println(c3) // type mismatch;
    val d3: Byte = b3.toByte
    println(d3)

    // byte，short，char 他们三者可以计算，在计算时首先转换为int类型
    val a4: Byte = 12
    val b4: Short = 23
    val c4: Char = 'c'
    val res4: Int = a4 + b4 + c4
    println(res4)

    // 强制类型转换: 自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型
    val n1: Int = 2.6.toInt
    println("n1: " + n1) // 2

    // 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val n2: Int = 2.6.toInt + 3.7.toInt
    val n3: Int = (2.6 + 3.7).toInt
    println(n2, n3) // (5,6)

    // 值类型和String类型的转换
    val n: Int = 27
    val s: String = n + ""
    println(s)

    val m: Int = "12".toInt
    val f: Float = "12.3".toFloat
    val f2: Int = "12.3".toFloat.toInt
    println(m, f, f2)

    // 强转可能造成精度降低或溢出 ,格外要注意

  }
}
