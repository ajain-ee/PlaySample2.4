package controllers

import play.api.libs.json.Json
import play.api.mvc._
import services.BlogService
import scala.concurrent.ExecutionContext.Implicits.global

class BlogController extends Controller{

  def posts = Action.async {
    BlogService.fetchAllPosts.map(post => Ok(Json.toJson(post)))
  }
}
