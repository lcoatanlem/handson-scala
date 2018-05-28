package demo

import scala.io.Source._
import scala.util.{Try, Failure, Success}

object Hello extends App {

  def matcher(x : Any): Any = {
    x match {
      case Success(d) => d
      case Failure(d) => s"Exception occured => $d"
    }
  }

  println(matcher(Try(5.0/4.0)))
  println(matcher(Try(5/0))) 

}
