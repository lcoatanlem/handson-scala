package animals

class Dog(name: String) extends Animal(name) {
  def wouaf() = {
    println("Wouaf, I'm a dog.")
  }
}
