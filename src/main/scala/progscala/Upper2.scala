package progscala

object Upper2 {
  def main(args:Array[String]) = {
    println(args)
    val result = args.map(_.toUpperCase()).mkString("-")
    println(result)
    println("Hello...")
  }
}
