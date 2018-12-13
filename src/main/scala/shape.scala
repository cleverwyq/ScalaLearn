class Point(x:Int, y:Int, name:String) {
//  var age = 3
  def show() = println("case show")
}

object Point {
  def apply(x:Int, y :Int, name:String): Point = {
    println("apply")
      new Point(x, y, name)
  }
}

case class Point2(x:Int, y:Int, name:String) {
  //  var age = 3
  def show() = println("case show")
}

object shape {

  def show(a:String) = println(a)

  def fshow(f: String=>Unit, a:String) = f(a)


  def main(args:Array[String]) = {
    fshow(show, "Hello in func")
      println("...")
    var p:Point = Point(3,4, "p name")
//    println(p.name)
//    println(p.age)
    println(p.show())
    println("again")
//      println(p.x)
//    p.age = 40
//    println(p.age)

    var p2:Point2 = Point2(3,4,"case class")
    println(p2.name)
  }
}
