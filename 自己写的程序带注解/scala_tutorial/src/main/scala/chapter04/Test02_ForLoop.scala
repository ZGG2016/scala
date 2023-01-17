package chapter04

import scala.collection.immutable

/**
 * for循环
 */
object Test02_ForLoop {
  def main(args: Array[String]): Unit = {
    // （1）范围遍历
    for (i <- 1 to 4){
      println(i) // 1 2 3 4
    }
    // 本质 --->
    for (i <- 1.to(4)){
      println(i) // 1 2 3 4
    }
    println("==================")

    // 不含最后边界
    for (i <- new Range(1, 4, 1)){
//    for (i <- Range(1, 4, 1)){
      println(i) // 1 2 3
    }

    for (i <- 1 until 4){
      println(i) // 1 2 3
    }
    println("==================")

    // （2）集合遍历
    for (i <- Array(12, 34 , 11)){
      println(i)
    }

    for (i <- List(12, 34 , 11)){
      println(i)
    }

    for (i <- Set(12, 34 , 11)){
      println(i)
    }
    println("==================")

    // （3）循环守卫
    for (i <- 1 to 4 if i != 2){
      println(i) // 1 3 4
    }

    println("==================")

    // （4）循环步长
    for (i <- 1 to 10 by 2){
      println(i) // 1 3 5 7 9
    }
    for (i <- 10 to 1 by -2){
      println(i) // 10 8 6 4 2
    }
    for (i <- 1 to 4 reverse){
      println(i) // 4 3 2 1
    }
//    for (i <- 1 to 4 by 0){
//      println(i)  // step cannot be 0.
//    }
    for (i <- 1.0 to 4.0 by 0.5){ // 步长为浮点数
      println(i) // 1 1.0 1.5....
    }

    println("==================")

    // （6）循环嵌套
    for (i <- 1 to 4){
      for (j <- 1 to 4){
        println("i: " + i + ", j: " + j)
      }
    }
    for (i <- 1 to 4; j <- 1 to 4){
      println("i: " + i + ", j: " + j)
    }

    println("==================")

    // （7）引入变量
    for (i <- 1 to 4){
      val j = i - 1
      println("i: " + i + ", j: " + j)
    }
    for (i <- 1 to 4; j = i - 1){
      println("i: " + i + ", j: " + j)
    }
    for {
      i <- 1 to 4;
      j = i - 1
    }
    {
      println("i: " + i + ", j: " + j)
    }

    println("==================")

    // （8）循环返回值
    val res1: Unit = for (i <- 1 to 4) {
//      println(i)
      i
    }
    println(res1) // ()

    //    val res2 = for (i <- 1 to 4) yield i * 2
    val res2: immutable.IndexedSeq[Int] = for (i <- 1 to 4) yield i * 2
    println(res2) // Vector(2, 4, 6, 8)
  }
}
