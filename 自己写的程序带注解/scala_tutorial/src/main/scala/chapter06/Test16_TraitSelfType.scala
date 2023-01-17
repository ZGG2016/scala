package chapter06

/**
 * 特质自身类型
 */
object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val zhangsan = new RegisterUser("zhangsan", "18")
    zhangsan.insert()
  }
}

// 用户类
class User(val name: String, val password: String)

trait UserDao{

  _: User =>

  def insert(): Unit = {
    println(s"insert into db: ${this.name}")  // 这里直接调用了name属性
  }
}

// 定义注册用户类
class RegisterUser(name: String, password: String) extends User(name, password) with UserDao