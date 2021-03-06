(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false))

(defn abs [x]
  (if (neg? x) (* -1 x) x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (and (>= age 13) (<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (and (coll? x) (empty? x)) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true
    ))

(defn leap-year? [year]
  (or
    (divides? 400 year)
    (and
      (divides? 4 year)
      (not (divides? 100 year)))
      ))

; '_______'
