package chapter04

import scala.io.StdIn

/**
 * if else
 */
object Test01_IfElse {
  def main(args: Array[String]): Unit = {
    println("请输入年龄：")
    val age: Int = StdIn.readInt()

    // （1）单分支
    if (age < 18){
      println("未成年")
    }

    println("=================")

    // （2）单分支
    if (age < 18){
      println("未成年")
    } else{
      println("成年")
    }

    println("=================")

    // （3）多分支
    if (age < 18){
      println("未成年")
    } else if (age < 60){
      println("成年")
    } else {
      println("老年")
    }

    println("=================")

    // （4）if else 返回值
    val res1: Unit = if (age < 18){
      println("未成年")
    } else if (age < 60){
      println("成年")
    } else {
      println("老年")
    }
    println(res1) // ()

    val res2: String = if (age < 18){
      println("未成年")
      "未成年"
    } else if (age < 60){
      println("成年")
      "成年"
    } else {
      println("老年")
      "老年"
    }
    println(res2)

    val res3: Any = if (age < 18){  // 返回值类型是 String Int 的父类
      println("未成年")
      "未成年"
    } else if (age < 60){
      println("成年")
      age
    } else {
      println("老年")
      "老年"
    }
    println(res3)

    println("===================")

    // （5）三元运算符
    val res4: String = if (age < 18) "未成年" else "成年"
    println(res4)

    println("===================")

    // （6）嵌套分支
    if (age < 18){
      println("未成年")
    } else {
      if (age < 60){
        println("成年")
      } else {
        println("老年")
      }
    }
  }
}
