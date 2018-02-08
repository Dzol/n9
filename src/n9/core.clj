(ns n9.core)

(defn inverse [x]
  ;; (reduce conj () x)
  (reduce (fn [x, y] (cons y x)) (empty x) x))

(defn fibonacci [n]
  (case n
    0 0
    1 1
    (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

(defn fibonacci-sequence [x]
  (map fibonacci (range 0 x)))

;; (defn cardinality [s]
;;   (if (empty? s)
;;     0
;;     (inc (cardinality (rest s)))))

(defn cardinality [s]
  (reduce (fn [c, _] (inc c)) 0 s))

(defn index [s i]
  (if (= i 0)
    (first s)
    ;; (index (rest s) (- i 1))))
    (index (rest s) (dec i))))
