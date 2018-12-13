package progscala

import progscala.json._

object use_json {
     def main(args:Array[String]) = {
       print_json()
       val a = new parser("<json>")
       a.parse()
     }
}
