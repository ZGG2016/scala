package com{

  // 父包访问子包的内容，需要导包
  import com.atguigu.scala.Inner

  object Outer{
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }

  package atguigu{

    package scala{
      object Inner{
        var in: String = "in"

        def main(args: Array[String]): Unit = {
          // 访问、修改父包的内容
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }
  }
}

// 在同一文件中定义不同的包
package aaa{
  package bbb{

    object Test01_Package{
      def main(args: Array[String]): Unit = {
        import com.atguigu.scala.Inner
        println(Inner.in)
      }
    }
  }
}