//class A(var name:String)
//class B(var name:String)
//
//var a = new A(name = "ClassA")
//
//def tellme(a:A) = println(a.name)
//
//tellme(a)
//
//implicit def B2A(b:B):A = new A(name=b.name)
//
//tellme(new B(name="B name"))
//
//case class Rect(width:Int, height:Int)
//
//implicit class RectMaker(Width:Int) {
//  def by(Height:Int) = {
//      println("use implicit")
//      Rect(Width, Height)
//  }
//}
//
//var r = 3 by 4
//println(r)
//
//
//trait Love {
//  def tellit():Unit
//}
//def tellit(love:Love):Unit = {
//  love.tellit()
//}
//
//tellit(new Love {
//  override def tellit():Unit = {
//    println("deriv tellit")
//  }
//})
//
//
//
//
//
