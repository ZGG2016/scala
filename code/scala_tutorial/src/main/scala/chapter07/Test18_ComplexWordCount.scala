package chapter07

/**
 * 单词计数：数据含有预计算的结果
 */
object Test18_ComplexWordCount {
  def main(args: Array[String]): Unit = {
    val tupleList: List[(String, Int)] = List(
      ("hello", 1),
      ("hello world", 2), // hello 和 world 各有两个
      ("hello scala", 3),
      ("hello spark from scala", 1),
      ("hello flink from scala", 2)
    )

    // 思路一：直接展开为普通版本
    val newStringList: List[String] = tupleList.map(
      kv => {
        (kv._1.trim + " ") * kv._2
      }
    )
//    println(newStringList)

    // 接下来操作与普通版本完全一致
    val wordCountList: List[(String, Int)] = newStringList
      .flatMap(_.split(" "))    // 空格分词
      .groupBy( word => word )     // 按照单词分组
      .map( kv => (kv._1, kv._2.size) )     // 统计出每个单词的个数
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)

    println(wordCountList)

    println("================================")

    // 思路二：直接基于预统计的结果进行转换
    val tuples: List[(String, Int)] = tupleList.flatMap(t => {
      val words: Array[String] = t._1.split(" ")
      val tuple: Array[(String, Int)] = words.map(word => (word, t._2))
      tuple
    })
//    println(tuples)
    val map = tuples.groupBy(_._1)
    val res: List[(String, Int)] = map.mapValues( _.map(_._2).sum).toList.sortBy(_._2)(Ordering[Int].reverse).take(3)
    println(res)
  }
}
