package chapter07

/**
 * 不可变数组（尽量用不可变）
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {

    // 创建不可变数组方式1
    val arr1: Array[Int] = new Array[Int](5)  // 如果希望存放任意数据类型，则指定 Any

    // 创建不可变数组方式2
//    val arr2 = Array.apply(2, 1, 3)
    val arr2 = Array(1, 2, 3, 4, 5)

    println(arr2)

    // 访问数组元素
    println(arr2(0))  // xs(i) is a shorthand for xs.apply(i)
    println(arr2(1))
    println(arr2(4))
    //    println(arr2(5))


    // 修改数组元素的值
//    arr2(0) = 12  // xs(i) = x is a shorthand for xs.update(i, x)
//    arr2(4) = 57

    println(arr2(0))
    println(arr2(1))
    println(arr2(4))

    println("========================")

    // 遍历访问数组元素
    // 1) 普通for循环
    for(i <- 0 until arr2.length) println(arr2(i))
    for(i <- arr2.indices) println(arr2(i))
    println("------------")

    // 2) 直接遍历所有元素，增强for循环
    for(i <- arr2) println(i)
    println("------------")

    // 3) 迭代器
    val iter = arr2.iterator
    while (iter.hasNext) println(iter.next())
    println("------------")

    // 4) 调用foreach方法
    arr2.foreach( (i: Int) => println(i) )
    arr2.foreach( println )

    // 5) 调用mkString方法
    println(arr2.mkString("-"))

    println("========================")

    // 添加数组元素
    val arr3 = arr2.:+(6)  // 在数组后面添加 （返回一个新数组）
    println(arr2)  // [I@66d33a
    println(arr3)  // [I@60f82f98
    println(arr3.mkString(", "))

    val arr4 = arr3.+:(0)  // 在数组前面添加（返回一个新数组）
    println(arr4.mkString(", "))

    val arr5 = -2 +: -1 +: arr4 :+ 7 :+ 8
    println(arr5.mkString(", "))
  }
}
