//import scala.math.Ordering
//
//case class MyList[A](list:List[A]) {
//  def sortBy2[B:Ordering](f: A=>B):List[A] = {
//    list.sortBy(f)(implicitly[Ordering[B]])
//  }
//
//  def sortBy1[B](f:A=>B)(implicit ord:Ordering[B]) = {
//    list.sortBy(f)(ord)
//  }
//}
//
//var mylist =  MyList(List(3,2,4))
//val func:Int=>Int = i => -i
//
//print(mylist sortBy1 func)
//print(mylist sortBy2 func)
//
//def use_imp(i: Int)(implicit ord: Int) = println(ord)
//use_imp(6)(5)
//implicit val ord_i = 9
//use_imp(7)
//
//def use_imp2(implicit ord: Int) = println(ord)
//use_imp2
//
