package chapter07

/**
 * 不可变 Map
 */
object Test08_ImmutableMap {
  def main(args: Array[String]): Unit = {
    // 创建map
    val map1: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map1)
    println(map1.getClass)

    val map2: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5)
    println(map2.getClass)

    println("======================")

    // 遍历元素
    map1.foreach(println)
    map1.foreach( (kv: (String, Int))=> println(kv))
    println("======================")

    // 取map中所有的 key 或者 value
    for(key <- map1.keys){
      println(s"$key ---> ${map1.get(key)}")
    }
    println("======================")

    // 访问某一个key的value
    println("a: " + map1.get("a").get)
    println("c: " + map1.get("c"))
    println("d: " + map1.get("d"))
    println("d: " + map1.getOrElse("d", 0))

    println(map1("a"))
  }
}
