package progscala

object func_var_sample {
  def main(args:Array[String]) = {
    class Publication(val title:String)
    class Book(override val title:String) extends Publication(title)

    val books:Set[Book] = Set(
      new Book("Programming"),
      new Book("Young")
    )

    def printBookList(info:Book=>AnyRef) = {
      for(book <- books) println(info(book))
    }

    def getTitle(p:Publication) = p.title
    def getTitle2(b:Book) = b.title

    printBookList(getTitle)
    printBookList(getTitle2)
  }
}
