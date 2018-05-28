package demo

object Hello extends App {
  // definition inside the main
  def add(a: Int, b: Int): Int = { a + b }
  println(add(4,5))
  // definition outside the main
  println(divide(41,5))

  // lambda
  val multiplication = (a: Int, b: Int) => a * b 
  println(multiplication(4,5))
}

object divide extends ((Double, Double) => Double) {
  def apply(a: Double, b: Double) : Double = a/b
}
