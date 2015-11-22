package domain

case class Post(id:Int, userId:Int, title:String, body:String)

case class Posts(posts:Seq[Post])
