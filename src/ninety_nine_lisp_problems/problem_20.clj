;Remove the K'th element from a list.
;Example:
;* (remove-at '(a b c d) 2)
;(A C D)
(ns ninety-nine-lisp-problems.problem_20)

(defn remove-at [param pos]
  (loop [ls param, result (), current-pos pos]
    (if (empty? ls)
      (reverse result)
      (recur (rest ls)
             (if (= current-pos 1)
               result
               (cons (first ls) result))(dec current-pos)))))