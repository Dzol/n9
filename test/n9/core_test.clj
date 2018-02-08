(ns n9.core-test
  (:require [clojure.test :refer :all]
            [n9.core :refer :all]))

(deftest inverse-test
  (testing "inverse"
    ;; (is (= (inverse #{1 2 3 4 5}) #{5 4 3 2 1}))
    (is (= (inverse '(1 2 3 4 5)) '(5 4 3 2 1)))
    (is (= (inverse [1 2 3 4 5]) [5 4 3 2 1]))))

(deftest fibonacci-sequence-test
  (testing "initial five"
    (is (= (fibonacci-sequence 5) '(0 1 1 2 3)))))

(deftest sequence-cardinality-test
  (testing "zero cardinality"
    (is (= (cardinality '()) 0))
    (is (= (cardinality []) 0))
    (is (= (cardinality #{}) 0)))
  (testing "more than zero cardinality"
    (is (= (cardinality '(:a :b :c)) 3))
    (is (= (cardinality [:a :b :c]) 3))
    (is (= (cardinality #{:a :b :c}) 3))))

(deftest sequence-index-test
  (testing "zero index"
    (is (= (index '(1 2 3) 0) 1))
    (is (= (index [1 2 3] 0) 1)))
  (testing "more than zero index"
    (is (= (index '(:a :b :c) 2) :c))
    (is (= (index [:a :b :c] 2 ) :c))))
