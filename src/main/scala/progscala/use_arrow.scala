package progscala

object use_arrow {
    def return_tuple() = (2,4,3)
    def test() = {
      val (_, v, g) = return_tuple()
      v -> g
    }
    def main(args:Array[String]) = {
       println(test())

    }
}
