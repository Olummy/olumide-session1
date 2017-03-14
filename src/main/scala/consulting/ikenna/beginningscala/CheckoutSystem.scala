package consulting.ikenna.beginningscala

object CheckoutSystem {
  def getTotal(items: String): Int = {

    //var itemsArray = items.toCharArray
    //var fruit =itemsArray.toList
    var apples : Int = 0;  var orange : Int = 0; var orangeTotal : Int = 0; var appleTotal : Int = 0
     //var items : String = List ()
    val fruit: List[String] = List(items)
     if (fruit.length == 0) 0
    else
    {
      apples = fruit.count(_ == "Apple")
      orange = fruit.count(_ == "Orange")
      orangeTotal = 150 * orange
      appleTotal = 300 * apples

       orangeTotal + appleTotal
    }
  }
}
