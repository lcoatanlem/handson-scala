package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._

import services.Divide

@Singleton
class DivideController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def divide(a:Int, b:Int) = Action {
    Ok(
      Json.toJson(Divide.jsonDivide(a, b))
    )
  }

}
