object use_this {

  sealed  class person(val name:String) {
    val address:String = "Unknown"
    var salary:Int = 0
    var money:Int = 0
  }

  def new_person() = {
    new person("")
  }


  class student(val name2:String, override val address: String = "HK") extends person(name2){
    var age:Int = 0
    var test:String = name
    def this(name2:String, age:Int) = {
      this(name2, "CN")
      this.age = age
      println("reuse this()")
    }

    println("Can it be called?")
    def setName(sal:Int):this.type = {
      this.salary = sal
      println("this type " + use_this.student)
      this
    }

    def setMoney(money:Int) = {
      this.money = money
      this
    }

    def info()= println(this.name + " " + this.age + " " + this.address
                    + " " + this.money + " " + this.salary)
  }
  def main(args:Array[String]) = {
      var s:student = new student("jack", 28)
      s.info()
      var s1:student = new student("tom", address = "US")
    s1.setMoney(30).setName(40)
      s1.info()

      val check = (i:Int) =>new_person()
      println(check)
  }
}
