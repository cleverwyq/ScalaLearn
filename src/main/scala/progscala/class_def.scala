package progscala

class TimeSlot {
  var hour = 12
  var min = 0
}

class TimeSlot2 {
  private[this] var h = 12
  private[this] var m = 0

  def hour:Int = h
  def hour_= (x:Int)= {
    println("set hour in st2")
    h = x
  }

  def min:Int = m
  def min_= (x:Int)= {
    require(x <= 12)
    println("set min in st2")
    m = x
  }
}

object class_def {

  def main(args:Array[String]) = {
    val ts = new TimeSlot
    println(ts.hour + ":" + ts.min)
    ts.hour = 9
    println(ts.hour + ":" + ts.min)

    val ts2 = new TimeSlot2
    println(ts2.hour + ":" + ts2.min)
    ts2.hour = 9
    ts2.min = 22
    println(ts2.hour + ":" + ts2.min)

    def abc(x:Int) = println(x)
    abc(44)
  }
}
