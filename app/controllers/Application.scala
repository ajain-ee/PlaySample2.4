package controllers

import play.api.libs.ws.{WS, WSResponse}
import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.Play.current

import scala.concurrent.Future

class Application extends Controller {

  def index = Action.async {
    val startTime = System.currentTimeMillis()
    val result: Future[WSResponse] = WS.url("https://www.google.com").get()
    val finalResult: Future[Result] = result.map(r => Ok(r.body).as("html"))
    print(System.currentTimeMillis() - startTime)
    finalResult
  }


}
