package test

object use_iterator {
  def main(args:Array[String]) = {
      val ita = Iterator(3,5,7,8,9)
       println(ita.drop(2).toString())
      while (ita.hasNext)
        println(ita.next())

//      val itb = Iterator("hello", "shi")
      val itc = Iterator.iterate("he") { i =>
        println("process " + i )
        i + "."
      }

      while (itc.hasNext)
        println(itc.next())

      println(1->2)

      val l = List(1,3,"hello")
      val b = List("world", 2, 5)
       val r = l zip b
      println ('r', r)
      println(r.iterator)

      def pf:PartialFunction[(Any, Any), Iterator[String]] = {
        case (l, b) if l.isInstanceOf[Int] && b.isInstanceOf[String] => Iterator("Int , String")
        case (l, b) if l.isInstanceOf[String] && b.isInstanceOf[Int] => Iterator("String, Int")
        case _ =>Iterator("Opps")
      }
      println("....")
//      var map2 = r.iterator.flatMap( _=> "....")

//      println(map2.size)
      println(pf.isDefinedAt((2, "b")))
      var map2 = r.iterator.flatMap(pf)
          while (map2.hasNext)
            println(map2.next())

      println(".....")
    def pf3:PartialFunction[(Any, Any), String] = {
      case (l, b) if l.isInstanceOf[Int] && b.isInstanceOf[String] => "Int , String"
      case (l, b) if l.isInstanceOf[String] && b.isInstanceOf[Int] => "String, Int"
      case _ =>("Opps")
    }

    var r2 = l zip b
    var map3 = r2 map pf3
    map3 foreach println

    var map4 = r2 map pf
    map4 foreach println   //non-empty iterator

    List(2,4,5,6,7).takeRight(30) foreach println
  }
}
