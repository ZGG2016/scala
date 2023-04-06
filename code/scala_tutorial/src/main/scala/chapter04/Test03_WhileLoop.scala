package chapter04

/**
 * while循环
 */
object Test03_WhileLoop {
  def main(args: Array[String]): Unit = {
    var a: Int = 10
    while(a >= 1){
      println("a --> " + a)
      a -= 1
    }
    println("=======================")
    var b: Int = 10
    do {
      println("b --> " + b)
      b -= 1
    } while (b > 0)
  }
}
