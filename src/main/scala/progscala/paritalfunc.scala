package progscala

object paritalfunc {

    val part5:PartialFunction[Int, Float] = {
      case d if d != 0 => 1/d
    }

  def main(args:Array[String]) = {

      val part:PartialFunction[Int, String] = {
        case x if x % 2 == 0 => s"$x is even"
//        case x =>  x + " not satisfy"
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
          v1 + "," + "is satisfy"
        }
      }

      sample map part2 foreach println

      println(part5(0))
  }
}
