package test

//object extends_app extends scala.App{
//  def test() = println("test function")
//  println("hello")
//  test
//}

//Deprecated
//trait myApp extends DelayedInit

trait myProperty {
  val name:String

  override def toString: String = s"Property name:$name"

}

object  extends_app extends App {
  val p = new myProperty {
    override val name: String = "son"
  }
  println(p)

  class X extends {val name = "son1"} with myProperty
  val x = new X()
  println(x)

  val z = new {val name="son2"; val age=20} with myProperty
  println(z)
}