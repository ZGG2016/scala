package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * 可变数组
 */
object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 创建不可变数组方式1
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    // 创建不可变数组方式2
//    val arr2 = ArrayBuffer.apply(1, 2, 3)
    val arr2 = ArrayBuffer(1, 2, 3)
    println(arr1)  // ArrayBuffer()  注意不是地址
    println(arr2)  // ArrayBuffer(1, 2, 3)  注意不是地址
    println(arr2.mkString(", ")) // 1, 2, 3
    println(arr2.toString())  // ArrayBuffer(1, 2, 3)

    // 访问数组元素
    println(arr2(0))
    arr2(1) = 4
    println(arr2)

    println("======================")

    // 添加元素
    val newArr1 = arr1 :+ 15  // 对不可变数组，就使用 :+ +:
    println(arr1)
    println(newArr1) // ArrayBuffer(15)
    println(arr1 == newArr1) // false

    val newArr2 = arr1 += 19  // 对可变数组，往后加
    println(newArr2)  // ArrayBuffer(19)
    println(arr1 == newArr2) // true

    77 +=: arr1 // 对可变数组，往前加
    println(arr1) // ArrayBuffer(77, 19)

    arr1.append(36)  // 对不可变数组，就使用 append 这些
    arr1.prepend(11)
    arr1.insert(1, 13, 59) // 指定位置插元素
    println(arr1)  // ArrayBuffer(11, 13, 59, 77, 19, 36)

    val tmp = ArrayBuffer(1, 1, 1)
    arr1.insertAll(2, tmp) // 指定位置插数组
    arr1.prependAll(tmp)  // 往前插数组

    println(arr1)

    // 删除元素
    arr1.remove(3) // 删除索引为3的元素
    println(arr1)

    arr1.remove(0,3)  // 删除从索引0开始，共3个元素
    println(arr1)

    arr1 -= 13 // 删除指定的元素
    println(arr1)

    arr1 -= 100 // 如果删除不存在的元素，那么数组元素保持不变
    println(arr1)

    println("================")

    // 可变数组转换为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(23, 56, 98)
    val newArr: Array[Int] = arr.toArray
    println(arr)
    println(newArr.mkString(", "))

    // 不可变数组转换为可变数组
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(newArr)
    println(buffer)
  }
}


