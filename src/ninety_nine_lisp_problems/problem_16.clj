;Drop every N'th element from a list.
;Example:
;* (drop '(a b c d e f g h i k) 3)
;(A B D E G H K)
(ns ninety-nine-lisp-problems.problem_16)

(defn my-drop [param pos]
  (loop [ls param, result (), current-pos pos]
    (if (empty? ls)
      (reverse result)
      (recur (rest ls) (if (= current-pos 1)
                         result
                         (cons (first ls) result)) (dec current-pos)))))