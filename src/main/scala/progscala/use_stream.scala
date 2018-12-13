package progscala

object use_stream {
    def main(args:Array[String]) = {
      val stream = (1 to 1000).toStream
      println(stream.headOption)
      println(stream.lastOption)
    }
}
