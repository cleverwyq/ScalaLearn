package progscala

object func_no_arg_call {

  def f = println("func with no arg")
  def f2() = println("func with no arg but ()")

  def call(f: =>Unit) = f
  def call2(f: ()=>Unit) = f2

  def main(args:Array[String]) = {
    f
    f2()
    f2
    println("call")
    call(f)
    call(f2)

 //  error
//   Error:(18, 11) type mismatch; found   : Unit ;required: () => Unit
//    call2(f)
    call2(f2)
  }
}
