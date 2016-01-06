package com.crebma.primeFactors

import org.scalatest._

class PrimeFactorsSpec extends FlatSpec with Matchers {
  it should "give factors of 1 as []" in {
    PrimeFactors.factors(1) should equal (List())
  }

  it should "give factors of 2 as [2]" in {
    PrimeFactors.factors(2) should equal (List(2))
  }

  it should "give factors of 3 as [3]" in {
    PrimeFactors.factors(3) should equal (List(3))
  }

  it should "give factors of 4 as [2,2]" in {
    PrimeFactors.factors(4) should equal (List(2,2))
  }

  it should "give factors of 5 as [5]" in {
    PrimeFactors.factors(5) should equal (List(5))
  }

  it should "give factors of 6 as [2,3]" in {
    PrimeFactors.factors(6) should equal (List(2,3))
  }

  it should "give factors of 7 as [7]" in {
    PrimeFactors.factors(7) should equal (List(7))
  }

  it should "give factors of 8 as [2,2,2]" in {
    PrimeFactors.factors(8) should equal (List(2,2,2))
  }

  it should "give factors of 9 as [3,3]" in {
    PrimeFactors.factors(9) should equal (List(3,3))
  }
}
