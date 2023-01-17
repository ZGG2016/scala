package chapter09

/**
 * 异常处理:
 *   1. Scala 没有编译异常这个概念，异常都是在运行的时候捕获处理
 *   2. 在 catch 子句中，越具体的异常越要靠前，越普遍的异常越靠后
 *   3. finally 子句用于执行不管是正常处理还是有异常发生时都需要执行的步骤，一般用于对象的清理工作
 *   4. 用 throw 关键字，抛出一个异常对象。所有异常都是 Throwable 的子类型。
 *      throw 表达式是有类型的，就是 Nothing，因为 Nothing 是所有类型的子类型，所以 throw 表达式可以用在需要类型的地方
 *   5. 在 Scala 中，可以使用 throws 注解来声明异常
 */
object Test01_Exception {
  def main(args: Array[String]): Unit = {

    try {
//      val a = 10 / 0
      val a = 10 / 1
    } catch {
      case e: ArithmeticException => println("发生了算数异常")
      case e: Exception => println("发生了异常")
    } finally {
      println("finally")
    }
  }

  def test1(): Nothing = {
    throw new ArithmeticException
  }

  @throws
  def test2(): Unit = {

  }
}

