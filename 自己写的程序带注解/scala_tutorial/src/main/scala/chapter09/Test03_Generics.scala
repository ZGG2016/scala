package chapter09

/**
 * 泛型：
 *     协变：Son 是 Father 的子类，则 MyList[Son] 也作为 MyList[Father]的“子类”
 *     逆变：Son 是 Father 的子类，则 MyList[Son]作为 MyList[Father]的“父类”
 *     不变：Son 是 Father 的子类，则 MyList[Father]与 MyList[Son]“无父子关系”
 *
 *     Class PersonList[T <: Person]{} //泛型上限
 *     Class PersonList[T >: Person]{} //泛型下限
 *
 *     上下文限定：
 *        def f[A : B](a: A) = println(a) //等同于 def f[A](a:A)(implicit arg:B[A])=println(a)
 *        需要通过 implicitly[Ordering[A]] 获取隐式变量
 */
object Test03_Generics {
  def main(args: Array[String]): Unit = {

//    val mc1: MyCollection1[Child] = new MyCollection1[SubChild]  // error
    // 逆变
    val mc2: MyCollection2[SubChild] = new MyCollection2[Child]
    // 协变
    val mc3: MyCollection3[Parent] = new MyCollection3[Child]

    // 泛型上限
    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }
    test[Child](new SubChild)
    test[SubChild](new SubChild)

    // 上下文限定
    def f1[A: Ordering](a: A,b: A) = implicitly[Ordering[A]].compare(a,b)
    def f2[A](a: A, b: A)(implicit ord: Ordering[A]) = ord.compare(a, b)
  }
}

// 定义继承关系
class Parent {}
class Child extends Parent {}
class SubChild extends Child {}

// 定义带泛型的集合类型
class MyCollection1[E] {}
class MyCollection2[-E] {}
class MyCollection3[+E] {}