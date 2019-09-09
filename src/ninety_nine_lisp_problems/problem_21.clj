;Insert an element at a given position into a list.
;Example:
;* (insert-at 'alfa '(a b c d) 2)
;(A ALFA B C D)
(ns ninety-nine-lisp-problems.problem_21)
(defn insert-at [item param pos]
  (loop [ls param, result (), current-pos pos]
    (if (empty? ls)
      (reverse result)
      (let [head (first ls)]
        (recur (rest ls)
               (if (= current-pos 1)
                 (conj result item head)
                 (cons head result)) (dec current-pos))))))