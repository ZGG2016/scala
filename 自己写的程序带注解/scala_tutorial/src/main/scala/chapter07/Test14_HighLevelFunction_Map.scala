package chapter07

/**
 * 集合计算高级函数
 *    map flatten flatMap groupBy
 */
object Test14_HighLevelFunction_Map {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9)
    // 过滤
    // 选取偶数
    val evenList: List[Int] = list.filter((i: Int) => { i % 2 == 0 })
    // 选取奇数
    val oddList: List[Int] = list.filter( _ % 2 == 1 )
    println(evenList)
    println(oddList)
    println("=======================")

    // 映射map
    // 把集合中每个数乘2
    val map: List[Int] = list.map(_ * 2)
    val map2: List[Int] = list.map( x => x * x)
    println(map)
    println(map2)
    println("=======================")

    // 扁平化
    val nestedList: List[List[Int]] = List(List(1,2,3),List(4,5),List(6,7,8,9))
    val flatList: List[Int] = nestedList.flatten
    println(flatList)
    println("=======================")

    // 扁平映射
    // 将一组字符串进行分词，并保存成单词的列表
    val strings: List[String] = List("hello world", "hello scala", "hello java", "we study")
    val splitList: List[Array[String]] = strings.map(_.split(" "))
    val flattenList: List[String] = splitList.flatten
    println(flattenList)

    val flatMapList: List[String] = strings.flatMap(_.split(" "))
    println(flatMapList)
    println("=======================")
    // 分组groupBy
    // 分成奇偶两组
    val groupMap: Map[Int, List[Int]] = list.groupBy( _ % 2 )
    val groupMap2: Map[String, List[Int]] = list.groupBy( data => if (data % 2 == 0) "偶数" else "奇数")
    println(groupMap)
    println(groupMap2)

    // 给定一组词汇，按照单词的首字母进行分组
    val wordList = List("china", "america", "alice", "canada", "cary", "bob", "japan")
    println( wordList.groupBy( _.charAt(0) ) )
  }
}
