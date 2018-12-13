package test

object use_lift {
    def times2(i: Int) = 2 *i

  def use_func(f:Int=>Int, i:Int) = f(i)

    def main(args:Array[String]) = {
        println(times2(4))
        val f = times2 _
        println(f(4))
        println(use_func(f, 4))
        println(times2 _)    // <function1>

        val pf:PartialFunction[Int, Boolean] = {case i if i % 2 == 0 => true}
        println(pf)
        println(pf.isDefinedAt(3))
        println(pf.lift)   // <function1>
        println(pf.lift(2))
        println(pf.lift(3))
        println(pf(3))
    }
}
