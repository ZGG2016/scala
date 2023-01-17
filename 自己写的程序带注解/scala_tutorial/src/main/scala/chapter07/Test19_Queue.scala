package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * 队列
 */
object Test19_Queue {
  def main(args: Array[String]): Unit = {
    // 可变队列
    val queue1: mutable.Queue[String] = new mutable.Queue[String]()
    queue1.enqueue("a", "b", "c")
    println(queue1)

    queue1.dequeue()
    println(queue1)

    println("======================")
    // 不可变队列
    val queue2: Queue[String] = Queue[String]("a", "b", "c")
    val queue3: Queue[String] = queue2.enqueue("d")
    println(queue2)
    println(queue3)

    val dequeue = queue2.dequeue
    println(queue2)
    println(dequeue) // (a,Queue(b, c))
  }
}
