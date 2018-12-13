package test

object variance {
  class CSuper {
    def mcsuper() = println("CSuper")
  }

  class C extends CSuper {
    def m() = println("C")
  }

  class CSub extends  C {
    def mcsub() = println("CSub")
  }
  def main(args:Array[String]) = {
      var f:C=>C = (c:C) => new C()
          f = (c:CSuper) => new CSub()
//          f = (c:CSub) => new C()
      println(s"do you think $f")
  }
}
