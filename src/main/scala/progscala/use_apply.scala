package progscala

class B{
}
class Person(name:String, age:Int) {
  def getName() = name

  def apply(name: String, age: Int): B = new B()
}


//no override for apply !!! otherwise compile error
//override nothing!!!
object Person {
  def apply(name: String, age: Int): B = {
    println("Object's apply")
    new B()
  }
}
object use_apply {
  def main(args:Array[String]) {
    val p = new Person("Jack", 22)
    println(p.getName())
    println(p)
    println(p.apply("Jack", 22))
    println(Person("tome", 22))
  }
}
