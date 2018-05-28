package demo

object Hello extends App {
  val firstname = "Lucas"
  val lastname = "Coatanlem"

  if (firstname == null || "".equals(firstname) || lastname == null || "".equals(lastname)) {
    println("Hello there !")
  } else {
    println(s"Hello $firstname $lastname.")
  }
  for (i <- 0 to 4) {
    println(s"This is the number ${i+1}.")
  }
}