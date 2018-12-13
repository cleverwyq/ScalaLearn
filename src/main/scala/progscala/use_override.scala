package progscala

object use_override {
  class A {
    var nameVar = "A"
    val nameVal = "A"
  }

  class B extends A {
    override val nameVal: String = "B"
    nameVar = "B"

  }

  def main(args:Array[String]) = {
    var b = new B()
    println(b.nameVal)
    println(b.nameVar)
  }
}
