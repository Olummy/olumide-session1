package consulting.ikenna.beginningscala

object Fibonacci {


  def fibonacciNumbers(n:Int):Int = if(n < 2) n else fibonacciNumbers(n-1)+fibonacciNumbers(n-2)

}
