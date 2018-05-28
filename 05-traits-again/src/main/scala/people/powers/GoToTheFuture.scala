package people.powers

trait GoToTheFuture {
  def name: String

  def fastForward() = {
    println(s"$name : going to the future !")
  }
}
