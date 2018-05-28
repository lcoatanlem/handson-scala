package demo

object Hello extends App {

  case class Cat(val name:String) extends CuteAnimal
  case class Dog(val name:String) extends CuteAnimal
  case class Bird(val name:String) extends CuteAnimal
  case class Tiger(val name:String) extends CuteAnimal

  def check(animal:CuteAnimal):Unit = {
    animal match {
      case c:Cat => println(s"${c.name} is a cat")
      case d:Dog => println(s"${d.name} is a dog")
      case b:Bird => println(s"${b.name} is a bird")
      case _ => println("This is not a cat nor a dog nor a bird...")
    }
}
  check(Cat("Cat"))
  check(Dog("Dog"))
  check(Bird("Bird"))
  check(Tiger("Tiger"))

}
