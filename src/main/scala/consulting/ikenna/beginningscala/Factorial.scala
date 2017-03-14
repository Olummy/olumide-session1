package consulting.ikenna.beginningscala



object Factorial {
  def nonTailRecursiveFactorial(n: Int): Int =  if (n == 0 | n ==1) 1 else n * nonTailRecursiveFactorial(n-1)
  def tailRecursiveFactorial(n: Int): Int =  {
    def innerRecursive(n: Int, prev: Int, acc: Int): Int = {
      if (n == 0) acc else innerRecursive(n-1, acc, acc + prev)
          }
       return innerRecursive(n, 1, 0)
      }
  }

