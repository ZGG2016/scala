package chapter07

/**
 * 多维数组
 */
object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 3)

    array(0)(2) = 19
    array(1)(0) = 25

    println(array.mkString(", ")) // [I@7a79be86, [I@880ec60

    for (i <- array.indices; j <- array(i).indices){
      print(array(i)(j) + "\t")
      if (j == array(i).length - 1) println()
    }
    println("================")
    array.foreach( line => line.foreach(println))
    array.foreach(_.foreach(println))
  }
}
