package demo

import animals._

object Hello extends App {
    implicit class AugmentedAnimal(val animal: Animal) {
        def hey: String = s"Hey, I'm ${animal.name} !"
        def display: Unit = { println(animal.hey) }
    }

    new Dog("Skann").display
}