;Rotate a list N places to the left.
;Examples:
;* (rotate '(a b c d e f g h) 3)
;(D E F G H A B C)
;
;* (rotate '(a b c d e f g h) -2)
;(G H A B C D E F)
;
(ns ninety-nine-lisp-problems.problem_19
  (:require [ninety-nine-lisp-problems.problem_17 :refer [my-split]]))
(defn rotate [param qtd]
  (if (> qtd 0)
    (let [splited-param (reverse (my-split param qtd))]
      (loop [ls splited-param, result ()]
        (if (empty? ls)
          (reverse result)
          (let [sub-ls (first ls)]
            (recur (if (= (count sub-ls) 1) (rest ls) (if (= (count ls) 1) (list (rest sub-ls)) (list (rest sub-ls) (last ls)))) (cons (first sub-ls) result))))))))