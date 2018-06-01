package demo

import io.vertx.core.json.JsonObject
import io.vertx.scala.core.Vertx
import io.vertx.scala.ext.web.Router
import io.vertx.scala.ext.web.handler.StaticHandler

import scala.util.{Try, Failure, Success}

object Hello extends App {
  val vertx = Vertx.vertx()
  val server = vertx.createHttpServer()
  val router = Router.router(vertx)

  val httpPort = sys.env.getOrElse("PORT", "8080").toInt

  def matcher(x : Any): Any = {
    x match {
      case Success(d) => d
      case Failure(d) => {
        println(s"Exception Occured => ${d.getMessage}")
        s"No way you can divide by zero..."
      }
    }
  }

  router.get("/hello").handler(context => 
    context
      .response()
      .putHeader("content-type", "text/html;charset=UTF-8")
      .end("<h1>Hello 🌍</h1>")
  )

  router.get("/hey").handler(context => 
    context
      .response()
      .putHeader("content-type", "application/json;charset=UTF-8")
      .end(new JsonObject().put("message", "👋 hey!").encodePrettily())                            
  )

  router.get("/divide/:a/:b").handler(context => {
    val result = matcher(Try(context.request.getParam("a").get.toInt
                     / context.request.getParam("b").get.toInt))
    context
      .response()
      .putHeader("content-type", "application/json;charset=UTF-8")
      .end(new JsonObject().put("result", result).encodePrettily()) 

  })

  router.route("/*").handler(StaticHandler.create())

  println(s"🌍 Listening on $httpPort  - Enjoy 😄")
  server.requestHandler(router.accept).listen(httpPort)


}
