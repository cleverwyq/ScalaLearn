package test


object use_reflect {
  trait T[A] {
    val vT:A
    def mT = vT
  }

  class C(foo:Int) extends T[String] {
    val vT = "T"
    val vC = "C"
    def mC = vC

    class C2
  }
  class CSub(foo:Int) extends C(foo) {

  }
  def main(args:Array[String]) = {
    val c = new C(3)
    println(s"c:$c")
    val clazz = classOf[C]
    println(s"clazz: $clazz")
    var assign = classOf[CSub].isAssignableFrom(classOf[C])
    println(s"assign1: $assign")
    assign = classOf[C].isAssignableFrom(classOf[CSub])
    println(s"assign2: $assign")

    val sub = new CSub(4)
    assign = classOf[C].isAssignableFrom(sub.getClass)
    println(s"assign3: $assign")
    assign = Class.forName("test.use_reflect$C").isAssignableFrom(
      Class.forName("test.use_reflect$CSub")
    )
    println(s"assign4: $assign")

    val clazz2 = c.getClass
    println(s"clazz2 : $clazz2")

    val name = clazz.getName
    println(s"name $name")

    val methods = clazz.getMethods
    println(s"methods $methods")
    println(methods)
//    methods foreach println
    println(c.isInstanceOf[C])
    println(c.isInstanceOf[T[String]])
  }
}
