package chapter07

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 * Scala 为了充分使用多核 CPU，提供了并行集合（有别于前面的串行集合），用于多核环境的并行计算
 */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {

    val res1: immutable.IndexedSeq[String] = (1 to 100).map(
      x => Thread.currentThread().getName
    )
    println(res1)

    val res2: ParSeq[String] = (1 to 100).par.map(
      x => Thread.currentThread().getName
    )
    println(res2)
  }
}
