package chapter04

import scala.util.control.Breaks
import scala.util.control.Breaks._

/**
 * 退出循环
 */
object Test04_Break {
  def main(args: Array[String]): Unit = {
    // （1）使用抛出异常的方式，退出循环
    try {
      for (i <- 1 to 5){
        if (i == 3)
          throw new RuntimeException
        println(i)
      }
    }catch {
      case e: Exception =>  // 什么都不做，只是退出循环
    }

    println("====================")

    // （2）使用scala中的Breaks类的break方法，实现异常的抛出和捕捉
    Breaks.breakable(
      for (i <- 1 to 5){
        if (i == 3)
          Breaks.break()
        println(i)
      }
    )
    // 也可以
    breakable(
      for (i <- 1 to 5){
        if (i == 3)
          break()
        println(i)
      }
    )
    println("循环外...")
  }
}
