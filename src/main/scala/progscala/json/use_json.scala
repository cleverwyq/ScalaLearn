package progscala.json
import scala.concurrent.Future

object use_json {

  def func_2_args(name:String)(f: ()=>Unit) = f()
  def func_2_args2(name:String)(f:String =>Unit) = f(name)
  def func_2_args3(name:String)(f: =>Unit) = {
        println(s"first print name $name")
        println("then exec f")
        f
  }

  def input_func(n:String) = println(n)
  def input_func2() = println("no arg")
  def main(args:Array[String]) = {
    println(name)
    print_json()
    val p = parser("content")
    p.parse()

    func_2_args("hello")(input_func2)
    func_2_args2("world")(input_func)
    func_2_args3("world") {
      val n = "input name"
      println(n)
    }
  }
}
