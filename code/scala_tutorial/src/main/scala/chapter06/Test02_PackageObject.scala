/*
若使用 Java 的包管理风格，
则包对象一般定义在其对应包下的 package.scala 文件中，包对象名与包名保持一致。
 */
//package chapter06
//
//class Test02_PackageObject {
//  def main(args: Array[String]): Unit = {
//    // 访问包对象
//    commonMethod()
//    println(commonValue)
//  }
//}

// 同一层级下就可以
package chapter06{
  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }
  }
}

/*
如采用嵌套方式管理包，则包对象可与包定义在同一文件中，
但是要保证包对象与包声明在同一作用域中
 */
package ccc{
  package ddd{
    object Test02_PackageObject{
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }
  }
}

// 定义一个包对象
//package object ddd{  // 访问不到
package object ccc{
  val school: String = "atguigu"
}