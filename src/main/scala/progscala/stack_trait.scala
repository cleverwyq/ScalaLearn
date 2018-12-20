package progscala
import scala.collection.mutable.ArrayBuffer

object stack_trait {
  abstract class InQue {
    val buf:ArrayBuffer[Int]
    def put(i:Int)
    def get():Int
  }

  trait BaseQue extends InQue {
    override val buf: ArrayBuffer[Int] = ArrayBuffer[Int]()
    override def put(i:Int) = {
      buf += i
    }

    override def get(): Int = {
      val ret = buf(0)
      buf.remove(0)
      ret
    }

    override def toString: String = {
      (for(i <- buf) yield i).mkString(",")
    }
  }

  trait DoubleQue extends BaseQue{
    override def put(i: Int): Unit = {
      buf += i * 2
    }
  }

  class Animal extends BaseQue
  class DoubleAnimal extends DoubleQue

  def main(args:Array[String]) = {
      val a = new Animal
      a.put(1)
      a.put(2)
      println(a)
      a.get()
      println(a)
      println("........")

      val b = new DoubleAnimal
      b.put(1)
      b.put(2)
      println(b)
  }
}
