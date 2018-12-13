//trait Writable2 {
//  def write(i:Int) = println(i)
//}
//
//class AA extends  Writable2 {
//}
//class BB {
//
//}
//class MyWrite[A <% Writable2](var list:List[Int]) {
//  def add(i: Int) = {
//    val a = i
//    list = list :+ a
//  }
//
//  def show() = {
//    list foreach println
//  }
//}
//
//var myr = new MyWrite[AA](List())
//myr.add(2)
//myr.add(3)
//myr.show()


//error: No implicit view available from BB => Writable2.
//var myr2 = new MyWrite[BB](List())

