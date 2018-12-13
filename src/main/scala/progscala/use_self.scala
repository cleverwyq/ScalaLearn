package progscala

/*
alias <===========
 */
trait Foo { self =>
  def message:String
  trait Bar {
    def message = self.message + " Bar"
  }

  def fullmessage:String = {
    object bar extends Bar
    bar.message
  }
}

object FooImpl extends Foo {
  override def message: String = "Hello from Foo and "
}


/*
Type constrain <==================
 */
trait Foo1 {
  def message:String = "message in Foo1 "
}

trait Bar1 {
  self: Foo1 => /* means Client code needs implement of Foo1*/
  def fullMessage:String = self.message + s" and bar and ${self}"
}

trait Foo2_1 {
  val message:String
}
trait Foo2_2 {
  val message:String
}
trait Bar2 {
  self: Foo2_1 with Foo2_2 =>
  def fullMessage: String = self.message + s" and bar2 and ${self}}"
}

trait myFoo2_1 extends Foo2_1 {
  override val message: String = "String in Foo2_1"
}

trait myFoo2_2 extends  Foo2_2 {
  /*
Error:(51, 8) overriding value message in trait myFoo2_1 of type String;
 value message in trait myFoo2_2 of type String cannot override a concrete member without a third member that's overridden by both (this rule is designed to prevent ``accidental overrides'')
object BarImpl2 extends Bar2 with myFoo2_1 with myFoo2_2
   */
   //error if uncomment below line
  //override val message: String = "String in Foo2_2"
}

object BarImpl2 extends Bar2 with myFoo2_1 with myFoo2_2
/*
Error:(28, 24) illegal inheritance;
 self-type progscala.BarImpl.type does not conform to progscala.Bar1's selftype progscala.Bar1 with progscala.Foo1
object BarImpl extends Bar1   -->if only this line!!!!
 */
object BarImpl extends Bar1 with myFoo1
object BarImpl1 extends Bar1 with Foo1
trait myFoo1 extends Foo1 {
  override def message: String = "Hello from Foo1 and"
}

object use_self {
  def main(args:Array[String]) = {
      println(FooImpl.fullmessage)

      /*
      Error:(15, 8) object creation impossible, since method message in trait Foo of type => String is not defined
       */
//      val f = new Foo{}
//      println(f.fullmessage)

     println(BarImpl.fullMessage)
     println(s"BarImpl1 : ${BarImpl1.fullMessage}")
     println(s"BarImpl2 : ${BarImpl2.fullMessage}")
  }
}

/*
Hello from Foo and  Bar
Hello from Foo1 and and bar and progscala.BarImpl$@1f36e637
BarImpl1 : message in Foo1  and bar and progscala.BarImpl1$@578486a3
BarImpl2 : String in Foo2_1 and bar2 and progscala.BarImpl2$@551aa95a}
 */