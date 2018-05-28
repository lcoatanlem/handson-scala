package people

class Human(val name: String = "John Doe") extends Creature {

  def hello() = {
    println(s"Hello I'm $name.")
  }

  def say(message: String) = {
    hello()
  }

}
/**
 * Companion object
 */
object Human {

  def message() = {
    println("Hello there!")
  }

  def create(name: String) = {
    new Human(name)
  }

}