package progscala

object use_val_in_primary_access {
  class Person(name:String, val age:Int, var sex:String)

  def main(args:Array[String]) = {
    val p = new Person("tom", 22, "MM")
//    Error:(8, 15) value name is not a member of progscala.use_val_in_primary_access.Person
//    println(p.name)

    println(p.age)
    println(p.sex)
  }
}
