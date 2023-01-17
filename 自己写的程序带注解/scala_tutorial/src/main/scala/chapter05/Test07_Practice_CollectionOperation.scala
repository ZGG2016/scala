package chapter05

/**
 * 练习
 */
object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(1, 2, 3, 4)

    // 处理数组，并返回一个新数组
    def arrayOp(array: Array[Int], op: Int=>Int): Array[Int] = {
      for (i <- array) yield op(i)
    }

    def addOne(i: Int): Int = {
      i + 1
    }

    val resArr1: Array[Int] = arrayOp(arr, addOne)
    println(resArr1.mkString(","))

    val resArr2: Array[Int] = arrayOp(arr, _ * 2)
    println(resArr2.mkString(","))
  }
}
