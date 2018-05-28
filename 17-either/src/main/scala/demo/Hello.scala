package demo

import scala.io.Source._
import scala.util.{Either, Left, Right}

object Hello extends App {

  def divide(a: Double, b: Double): Either[String, Double] = {
    if (b != 0) Right(a / b) else Left("Division par 0 impossible")
  }

  def matcher(x : Any): Any = {
    x match {
      case Right(d) => d
      case Left(d) => d
    }
  }

  println(matcher(divide(5,4)))
  println(matcher(divide(5,0))) 

}
