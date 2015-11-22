import play.api.libs.json.Json

package object domain {

   implicit val postFormat = Json.format[Post]
   implicit val postsFormat = Json.format[Posts]
}
