package chapter07

/**
 * 单词计数：将集合中出现的相同的单词，进行计数，取计数排名前三的结果
 */
object Test17_CommonWordCount {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala"
    )

    val strings: List[String] = stringList.flatMap(_.split(" "))
//    println(strings)
    val map1: Map[String, List[String]] = strings.groupBy(word => word)
//    println(map1)

    // 直接计算输出
//    map1.foreach( (kv: (String, List[String]))=> println(kv._1, kv._2.length))

    // 取top
    val map2: Map[String, Int] = map1.map((kv: (String, List[String])) => (kv._1, kv._2.length))
//    val res: List[(String, Int)] = map2.toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
    val res: List[(String, Int)] = map2.toList.sortWith(_._2 > _._2).take(3)
    println(res)
  }
}
