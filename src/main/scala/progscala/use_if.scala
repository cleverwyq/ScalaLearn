package progscala

object use_if {

  def duck[T <: {def close():Unit}](a:T) = {
    println("in duck func")
    a.close()
  }

  class closeable {
    def close():Unit = {
      println("I define close()!!!")
    }
  }

  class closeable2 {
    def close2():Unit = {
      println("I define close2()!!!")
    }
  }

  def main(args:Array[String]) = {
    val a = 20
    val path = {
      if (a > 40) {
        100
      }
      else {
        "abc"
      }
    }
    println(path)

    duck(new closeable())

  }
}
