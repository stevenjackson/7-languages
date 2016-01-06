fn prime_factors(num: i64) -> Vec<i64> {
    prime_factors_rec(num, 2)
}

fn prime_factors_rec(num: i64, candidate: i64) -> Vec<i64> {
    if num < candidate {
        vec![]
    } else if num % candidate == 0 {
        let mut primes = vec![candidate];
        let mut more_primes = prime_factors_rec(num / candidate, candidate);
        primes.append(&mut more_primes);
        primes
    } else {
        prime_factors_rec(num, candidate + 1)
    }
}

#[test]
fn prime_factors_of_one() {
    assert_eq!(prime_factors(1), []);
}

#[test]
fn prime_factors_of_two() {
    assert_eq!(prime_factors(2), [2]);
}

#[test]
fn prime_factors_of_three() {
    assert_eq!(prime_factors(3), [3]);
}

#[test]
fn prime_factors_of_four() {
    assert_eq!(prime_factors(4), [2,2]);
}

#[test]
fn prime_factors_of_five() {
    assert_eq!(prime_factors(5), [5]);
}

#[test]
fn prime_factors_of_six() {
    assert_eq!(prime_factors(6), [2,3]);
}

#[test]
fn prime_factors_of_seven() {
    assert_eq!(prime_factors(7), [7]);
}

#[test]
fn prime_factors_of_eight() {
    assert_eq!(prime_factors(8), [2,2,2]);
}

#[test]
fn prime_factors_of_nine() {
    assert_eq!(prime_factors(9), [3,3]);
}
