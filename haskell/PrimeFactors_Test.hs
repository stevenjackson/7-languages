module PrimeFactors_Test where

import PrimeFactors (primeFactors)
import Test.HUnit

test1 = TestCase $ assertEqual "factors of 1 are []" [] (primeFactors 1)
test2 = TestCase $ assertEqual "factors of 2 are [2]" [2] (primeFactors 2)
test3 = TestCase $ assertEqual "factors of 3 are [3]" [3] (primeFactors 3)
test4 = TestCase $ assertEqual "factors of 4 are [2,2]" [2,2] (primeFactors 4)
test5 = TestCase $ assertEqual "factors of 5 are [5]" [5] (primeFactors 5)
test6 = TestCase $ assertEqual "factors of 6 are [2,3]" [2,3] (primeFactors 6)
test7 = TestCase $ assertEqual "factors of 7 are [7]" [7] (primeFactors 7)
test8 = TestCase $ assertEqual "factors of 8 are [2,2,2]" [2,2,2] (primeFactors 8)
test9 = TestCase $ assertEqual "factors of 9 are [3,3]" [3,3] (primeFactors 9)
test25 = TestCase(assertEqual "factors of 25 are [5,5]" [5,5] (primeFactors 25))

main = runTestTT $ TestList [test1, test2, test3, test4, test5, test6, test7, test8, test9, test25]
