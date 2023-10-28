package chapter08

object Test02_MatchTypes {
  def main(args: Array[String]): Unit = {
    // 1. 匹配常量
    def describeConst(x: Any): String = x match {
      case 1 => "Int one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => ""
    }

    println(describeConst("hello"))
    println(describeConst('+'))
    println(describeConst(0.3))

    println("==================================")

    // 2. 匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int: " + i
      case s: String => "String: " + s
      case list: List[String] => "list: " + list
      case array: Array[Int] => "array: " + array.mkString("-")
      case a => "Something else: " + a
    }

    println(describeType(35))
    println(describeType("hello"))
    println(describeType(List("hi", "hello"))) // list: List(hi, hello)
    println(describeType(List(2, 23))) // list: List(2, 23)
    println(describeType(Array("hi", "hello"))) // Something else: [Ljava.lang.String;@1134affc
    println(describeType(Array(2, 23))) // array: 2-23

    // 3. 匹配数组
    for ( arr <- List(Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 15),
      Array("hello", 1, 30),
    )) {
      val res: String = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1,0)"
        case Array(x, y) => "Array: " + x + " " + y // 匹配含两个元素的数组
        case Array(0, _*) => "匹配以0开头的数组"
        case Array(x, y, z) => "匹配含三个元素的数组"
        case Array(x, 1, z) => "匹配中间元素是1的数组"
        case _ => "something else"
      }
      println(res)
    }
    println("==================")

    // 4. 匹配列表
    // 方式一
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88),
      List("hello")
    )) {
      val result = list match {
        case List(0) => "0"
        case List(x, y) => "List(x, y): " + x + ", " + y
        case List(0, _*) => "List(0, ...)"
        case List(a) => "List(a): " + a
        case _ => "something else"
      }
      println(result)
    }
    println("==================")

    // 方式二
    val list1 = List(1, 2, 5, 7, 24)
    val list2 = List(24)

    list1 match {
      case first :: second :: rest => println(s"$first $second $rest") // 输出：1 2 List(5, 7, 24)
      case _ => println("something else")
    }

    // 5. 匹配元组
    for (tuple <- List(
      (0, 1),
      (0, 0),
      (0, 1, 0),
      (0, 1, 1),
      (1, 23, 56),
      ("hello", true, 0.5)
    )){
      val result = tuple match {
        case (a, b) => "" + a + ", " + b
        case (0, _) => "(0, _)"
        case (a, 1, _) => "(a, 1, _) " + a
        case (x, y, z) => "(x, y, z) " + x + " " + y + " " + z
        case _ => "something else"
      }
      println(result)
    }
  }
}
