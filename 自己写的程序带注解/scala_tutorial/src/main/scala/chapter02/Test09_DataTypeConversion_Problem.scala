package chapter02

/**
 * 强转可能造成精度降低或溢出 ,格外要注意
 */
object Test09_DataTypeConversion_Problem {
  def main(args: Array[String]): Unit = {
    val n: Int = 130
    val b: Byte = n.toByte
    println(b) // -126  原码直接截取了

  }
}
