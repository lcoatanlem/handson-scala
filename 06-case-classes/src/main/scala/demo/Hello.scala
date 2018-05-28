package demo

object Hello extends App {

  case class TinyToon(val name: String, val avatar: String){}

  val babs = TinyToon("Babs","Blonde")
  val buster = TinyToon("Buster","Rousse")
  val fakeBabs = TinyToon("Babs","Blonde")

  println(babs == fakeBabs) // compare by value true
  println(babs == buster) // false

}
