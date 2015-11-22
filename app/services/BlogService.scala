package services

import domain.{Posts, Post}

import scala.concurrent.Future

object BlogService {

  def fetchAllPosts: Future[Posts] = {
    Future.successful(
      Posts(
        Seq(
          Post(1, 1, "This is first sample post", "I am writing post of Play Controller"),
          Post(2, 2, "This is second sample post", "I am writing post of Play Controller")
        )
      )
    )
  }
}
