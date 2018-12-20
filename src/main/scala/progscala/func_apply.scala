package progscala

class TimeSlot3{
    var sec:Int = 60
}
object func_apply {
  def main(args:Array[String]) = {
    val f = new Function1[String, Int] {
      override def apply(v1: String): Int = {
        println(s"v1 $v1")
        12
      }
    }

    def f2(v2:String) = {
      println(s"v2 $v2")
      12
    }

    val f3 = (v3:String) => {
      println(s"v3 $v3")
      12
    }
    println(f)   //<function1>
    println(f("hello"))
    println(f2 _) //<function1>
    println(f2("world"))
    println(f3)    //<function1>
    println(f3("young"))

    val f4 = f2 _
    println(f4)    //<function1>
    println(f4("what"))

    val t = new TimeSlot3
    println(t.sec)
//    println(t.hour)
  }
}
