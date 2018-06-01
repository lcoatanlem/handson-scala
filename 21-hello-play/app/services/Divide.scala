package services

import play.api.libs.json._

import scala.util.{Try, Failure, Success}

object Divide {
  def jsonDivide(a:Int, b:Int) = {
    Try(a/b) match {
      case Success(result) => 
        JsObject(Seq(
          "result" -> JsNumber(result)
      ))
      case Failure(error) => {
        println(s"Exception Occured => $error")
        JsObject(Seq(
          "error" -> JsString(error.getMessage)
        ))
      }
    }
  }
}
