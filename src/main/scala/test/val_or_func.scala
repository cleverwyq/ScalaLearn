package test

object val_or_func {
  class Op {
    def print()= {println("hello OP")
    "OP"}
  }

  class Od {
    def print() = { println("hello OD")
    "OD"}
  }

  class Or(name:String)(age:Int) {
    override def toString: String = s"name:$name, age:$age"
  }
  def main(args:Array[String]) = {

      val seq = (c:(Op, Od)) => (c._1.print(), c._2.print())
      println(seq)
      val a:Op = new Op()
       val b:Od = new Od()
        var result = seq((a,b))
       println(s"Hello $result")

      val r = new Or("jack")(_)
      println(r)
      val or = r(20)
      println(or)
  }
}
