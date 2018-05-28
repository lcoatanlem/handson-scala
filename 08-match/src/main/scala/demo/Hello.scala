package demo

// match

object Hello extends App {
  val multiplication = (a: Int, b: Int) => { a * b }: Int

  multiplication(5, 5) match {
    case 42 => println("42")
    case 21 => println("21")
    case value_sup if (value_sup > 21) => println("Higher than 21, but not 42 !")
    case _ => println("Less than 21, for sure !")
  }

}
