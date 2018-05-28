package demo

object Hello extends App {

  val aliments = List(
      "pain"
    , "salade"
    , "tomate"
    , "viande"
    , "frites"
    , "oignons" 
  )

  // === filtrer, puis découper ===

  val ingredients = aliments
                      .filter(s => s != "frites")
                      .filter(s => s != "oignons")
                      .map(s => s" morceaux de $s")

  println(ingredients)

  // === assembler ==== 
  val kebab = ingredients.fold("Mon kebab :") { (tmp, ingredient) => tmp + ingredient }

  println(kebab) 

}
