package animals

class Cat(name: String) extends Animal(name) {
    def meow() = {
        println(s"Meow, I'm a cat and my name is $name.")
    }
    def meow(message: String) = {
        println(s"$name : $message")
    }
}