package progscala

object use_structural_type {
  def main(args:Array[String]) = {
    type T = {
      type X = Int
      val x:X
      type Y
      val y:Y
    }

    object Foo  {
      type X = Int
      val x:X = 5
      type Y = String
      val y:Y = "Hello"
    }
    def test(t:T):T#X = {
      println("test")
//      println(("t.Y ", T#X)
      println(t.y)
      t.x
    }
    def test2(t:T):t.X = {
      println("test2")
      t.x
    }

    def test3(t:T):t.Y = t.y
//    var t = new T()
//    println(test(t))
    println()
    println(test(Foo))
    println(test2(Foo))
    println(test3(Foo))
    println("exit")
  }
}
