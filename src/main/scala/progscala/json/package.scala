package progscala

package object json {
  var name:String = "package object json"
  def print_json() = println(name)
  case class parser(content:String) {
      def parse() = println("json content: " + content)
  }
}
