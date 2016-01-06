(ns prime-factors.core)

(defn primes
  ([num] (primes num 2))
  ([num candidate]
   (cond
     (< num candidate) []
     (= 0 (rem num candidate)) (concat [candidate] (primes (/ num candidate)))
     :else (primes num (inc candidate)))))
