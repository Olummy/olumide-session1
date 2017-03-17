package consulting.ikenna.beginningscala
import scala.annotation.tailrec


object Factorial {
  def nonTailRecursiveFactorial(n: Int): Int =  if (n < 2) n else n * nonTailRecursiveFactorial(n-1)
  def tailRecursiveFactorial(n: Int): Int = {
    @tailrec
    def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  }
}
