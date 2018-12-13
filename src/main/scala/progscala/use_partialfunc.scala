package progscala

object use_partialfunc {

  case class A()
  class B() {
    def apply()= println("new B in class")
  }
  object B{
    def apply(): B = {
      println("new B in object")
      new B()
    }
  }

  trait ConvCheck {
    def apply(a:A):B
    def say() = println("bye")
  }

  object ConvCheck {
    implicit def fromPartial(pf:PartialFunction[A, B]) = new ConvCheck {
      override def apply(a: A): B = {
        println("apply used")
        pf(a)
      }

      override def say(): Unit = println("88")
    }
  }
  def main(args:Array[String]) = {
    val maxIt = ConvCheck.fromPartial {
      case a:A => B()
    }
    println(maxIt)

    def maxIt2() = ConvCheck.fromPartial {
      case a:A => println("in 2"); B()
    }
    println(maxIt2)
    val b = B()
    b()

    val pf2:PartialFunction[A, B] = {
      case a:A => B()
    }
    import ConvCheck.fromPartial
    pf2.say()

    ConvCheck.fromPartial(pf2)(A())
    println()
  }
}
