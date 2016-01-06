package prime_factors

func Factors(num int) []int {
  return FactorsRec(num, 2)
}

func FactorsRec(num int, candidate int) []int {
  if num < candidate  {
    return []int{}
  }

  if num % candidate == 0 {
    return append([]int{candidate}, Factors(num / candidate)...)
  } else {
    return FactorsRec(num, candidate + 1)
  }
}
