package progscala

object implicit_use {
  case class Person(name:String)

  implicit class AnyName(name:String) {
    def StringToPerson():Person = {
      Person("Mr. " + name)
    }

    def Int2Person(age:Int):Person = Person(age.toString() + " years " + name)
  }


  implicit class AnyName2(age:Int) {

    def Int2Person():Person = Person(age.toString() + " years ")
  }

  def print_info(p: Person):Unit = println(p.name)

  implicit def print_info_in_class(p: Person) = this.print_info(p)

  implicit def Name2Person(name:String) = {
          println("use implicit func")
          Person("Ms. " + name)
  }
  implicit val impp = Person("imp")
  def main(args:Array[String]) = {
      val p:Person = "Hello"
      print_info_in_class(p)
      print_info("White".StringToPerson())
      print_info(2.Int2Person())
      print_info("White")
      println("")
      println(implicitly[Person])
      println(p)

      import scala.math.Ordering
      println(implicitly[Ordering[Int]])
  }
}

object use2 {

}
