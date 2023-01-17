package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

/**
 * 文件读写数据
 */
object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // 从文件读数据
    val source = Source.fromFile("src/main/scala/chapter02/Test05_StdIn.scala")
    source.foreach(print)

    // 往文件写数据
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("aaaaaaaaaaa")
    writer.close()
  }
}
