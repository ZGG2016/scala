package chapter07

import scala.collection.mutable

/**
 * 使用fold合并map
 */
object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)

    val map3 = map1.foldLeft(map2)({
      (mergedMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergedMap(key) = map2.getOrElse(key, 0) + value
        mergedMap
      }
    })
    println(map3)
  }
}
