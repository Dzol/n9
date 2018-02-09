(ns n9.core)

(defn inverse [x]
  ;; (reduce conj () x)
  (defn inverse_ [x y]
    (cons y x))
  (reduce inverse_ (empty x) x))

(defn fibonacci [n]
  (case n
    0 0
    1 1
    (+ (fibonacci (- n 1))
       (fibonacci (- n 2)))))

(defn fibonacci-sequence [x]
  (map fibonacci (range x)))

;; (defn cardinality [s]
;;   (if (empty? s)
;;     0
;;     (inc (cardinality (rest s)))))

(defn cardinality [s]
  (defn cardinality_ [n _]
    (inc n))
  (reduce cardinality_ 0 s))

(defn index [s i]
  ;; (if (= i 0)
  (if (zero? i)
    (first s)
    ;; (index (rest s) (- i 1))))
    (index (rest s) (dec i))))
