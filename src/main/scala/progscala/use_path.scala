package progscala

object use_path {


  def main(args:Array[String]) = {
      class Outer {
        trait Inner
        def y = new Inner {}
        def z = new Inner {}
        def foo(x : this.Inner) = println("foo")
        def bar(x: Outer#Inner) = println("bar")
      }

      trait can_instance
      val b = new can_instance {}
      println("b ", b)
      val x = new Outer
      val y = new Outer
      println()
      println("x ", x)
      println("y ", y)
      println(x.y)
      println("x.z", x.z)
      println(y.y)
      println("y.z", y.z)

      x.foo(x.y)

//    Error:(18, 15) type mismatch;
//    found   : y.Inner
//    required: x.Inner
//    x.foo(y.y)

      x.bar(y.y)
  }
}
