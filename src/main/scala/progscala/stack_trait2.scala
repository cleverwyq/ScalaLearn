package progscala

import scala.collection.mutable.ArrayBuffer

object stack_trait2 {
  abstract class IntQueue {
    def get():Int
    def put(x:Int)
  }

  trait Doubling extends IntQueue {
     abstract override def put(x:Int) = {super.put(2 * x)}
  }

  trait Incrementing extends IntQueue {
    abstract override def put(x: Int): Unit = {super.put(x+1)}
  }

  trait Filtering extends IntQueue {
    abstract override def put(x:Int) = {
      if (x >= 0 ) super.put(x)
    }
  }
  class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]()
    def get() = buf.remove(0)
    def put(x:Int) = {buf +=x}

    override def toString: String = {(for(i <- buf) yield i).mkString(",")}
  }


  def main(args:Array[String]) = {
     val que = new BasicIntQueue with Doubling
     que.put(1)
     que.put(2)
     println(que.toString())
     println("-----")

    val q2 = new BasicIntQueue with Incrementing with Filtering
    q2.put(-1)
    q2.put(0)
    q2.put(2)
    println(q2)
  }
}
