package demo

object Hello extends App {
  
  case class Toon(val name : String, val avatar : String){}

  def getToon(name: String): Option[Toon]  = { // always return an Option
    val toons = List(
      Toon("Po", "Panda"),
      Toon("Buster", "Rabbit"),
      Toon("Simba", "Lion")
      )
    toons.find(toon => toon.name.equals(name)) // find always returns an Option
  }

  getToon("Po") match {
    case Some(toon) => println(s"${toon.avatar}")
    case None => println(":p")
  }

}
