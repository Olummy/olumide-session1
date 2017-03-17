package consulting.ikenna.beginningscala

object CheckoutSystem {
  def getTotal(items: String): Int = {

    val fruitPrice =  Map("Apple" -> 300, "Orange" -> 150, "" -> 0)
    items.split("\\s+").map(x=>fruitPrice.getOrElse(x,throw new IllegalArgumentException("Invalid input: expected inputs are 'Apple' or 'Orange' "+x))).sum
  }
}
