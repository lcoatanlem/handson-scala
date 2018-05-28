package demo



object Hello extends App {

  val check = (param : Any) => param match {
    case i: Int => s"Integer : $i"
    case s: String => s"String : $s"
    case _ => "Unknown"
  }

  println(check(42))
  println(check(34.5))
  println(check("Hello"))

}
