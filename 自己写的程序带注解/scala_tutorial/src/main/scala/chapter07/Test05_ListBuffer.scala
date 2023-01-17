package chapter07

import scala.collection.mutable.ListBuffer

/**
 * 可变List
 */
object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 创建可变列表
    val listBuffer1 = new ListBuffer[Int]()
    val listBuffer2 = ListBuffer(1, 2, 3)

    // 添加元素
    listBuffer2.append(4, 5)
    listBuffer2.prepend(0)
    println(listBuffer2)

    listBuffer2.insert(1, 8, 9)
    println(listBuffer2)

    println("==============")

    1 +=: 2 +=: listBuffer1 += 3 += 4
    println(listBuffer1)
    println("==============")

    // 合并list
    val listBuffer3 = listBuffer1 ++ listBuffer2
    println(listBuffer1)
    println(listBuffer2)
    println(listBuffer3)
    println("==============")

    listBuffer1 ++=: listBuffer2
    println(listBuffer1)
    println(listBuffer2)
    println("==============")

    // 修改元素
    listBuffer1(1) = 1
    listBuffer1.update(2, 2)
    println(listBuffer1)
    println("==============")

    // 删除元素
    listBuffer1.remove(2)
    listBuffer1 -= 1
    println(listBuffer1)
  }
}
