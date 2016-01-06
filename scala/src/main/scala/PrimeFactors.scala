package com.crebma.primeFactors

object PrimeFactors {

  def factors(num: Int, candidate: Int = 2) : List[Int] = {
    if(num < candidate) {
      List[Int]()
    } else if (num % candidate == 0) {
      List[Int](candidate) ++ factors(num / candidate)
    } else {
      factors(num, candidate + 1)
    }
  }

}
