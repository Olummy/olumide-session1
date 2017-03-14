package consulting.ikenna.beginningscala

object TemperatureConverter {
  def centigradeToFahrenheit(n: Int): Double = (n * 9/5) + 32

  def fahrenheitToCentigrade(n: Int): Double = (n - 32) * 5/9

}
