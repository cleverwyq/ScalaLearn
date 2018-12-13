package progscala


/*
Can NOT use n & d directly in add method
must define them as class members then use.
 */
class Rat(n: Int, d: Int) {
  def num = n
  def deno = d
  def add(that: Rat) = {
    var ret = new Rat(that.num + n, that.deno + d)
    ret
  }

  override def toString: String = s"Rational($num, $deno)"
}
object use_class_member {
  def main(args:Array[String]) = {
    val r1 = new Rat(1,2)
    val r2 = new Rat(2,3)
    val ret = r1.add(r2)
    println(ret)
  }
}
