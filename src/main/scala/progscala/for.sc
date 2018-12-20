
val s:Seq[Option[Int]] = Vector(Some(20), None, Some(10), Some(5))
for (Some(i) <- s withFilter {
  case Some(i) if i > 8 => true
  case _ =>false
}
) yield (i * 2)

println("hi")
