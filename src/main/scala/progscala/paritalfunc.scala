package progscala

object paritalfunc {

    val part5:PartialFunction[Int, Float] = {
      case d if d != 0 => 1/d
    }

  def main(args:Array[String]) = {

      val part:PartialFunction[Int, String] = {
        case x if x % 2 == 0 => s"$x is even"
        case x =>  x + " not satisfy"
      }
      val sample = 1 to 10

      sample collect part foreach println

      println("...........")
      val part2 = new PartialFunction[Int, String] {
        override def isDefinedAt(x: Int): Boolean = {
          if (x % 2 == 0 &&  x > 5)
            return true
          else
            return false
        }

        override def apply(v1: Int): String = {
          var s = ""
          if (this.isDefinedAt(v1))
            s = "is satisfy"
          else
            s = "not satisfy"
          v1 + "," + s
        }
      }

      sample map part2 foreach println
     println()
    sample collect part2 foreach println

      println("part2.lift :")
      println(part2.lift(8))       //Some(8, is satisfy)
      println(part2.lift(3))        //None
    println(part2.lift(4))        //None
    println(part5(0))
  }
}
