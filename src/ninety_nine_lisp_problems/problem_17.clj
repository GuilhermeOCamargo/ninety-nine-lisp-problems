;Split a list into two parts; the length of the first part is given.
;Do not use any predefined predicates.
;
;Example:
;* (split '(a b c d e f g h i k) 3)
;( (A B C) (D E F G H I K))
(ns ninety-nine-lisp-problems.problem_17)

(defn my-split [param qtd]
  (loop [ls param, result (), current-qtd 1]
    (if (empty? ls)
      (list (reverse (last result)) (reverse (first result)))
      (let [head (first ls) result-head (first result)]
        (recur (rest ls) (if (<= current-qtd qtd)
                           (cons (cons head result-head) (rest result))
                           (if (= (count result) 1)
                             (cons (list head) result)
                             (cons (cons head result-head) (rest result))))(inc current-qtd))))))