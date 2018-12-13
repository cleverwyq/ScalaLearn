
trait T1 {
  def print()
}

abstract  class C1 {
  def itself()
}

object use_train {
  def main(args:Array[String]): Unit = {
    println("hello")

    var t1 = new T1 {
      override def print() = println("one trait T1")
    }
    t1.print()

    var t2 = new T1 {
      override def print() = println("two trait T2")
    }
    t2.print()

    var c1 = new C1 with T1 {
      override def print() = println("in C1 trait T2")

      override def itself(): Unit = println("override itself")
    }
    c1.print()
    c1.itself()
  }
}
