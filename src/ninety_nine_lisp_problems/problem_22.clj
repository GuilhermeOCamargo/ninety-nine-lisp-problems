;Create a list containing all integers within a given range.
;If first argument is smaller than second, produce a list in decreasing order.
;Example:
;* (range 4 9)
;(4 5 6 7 8 9)
(ns ninety-nine-lisp-problems.problem_22)
(defn create-range [fst lst comparision inc-type]
  (loop [current fst, result ()]
    (if (comparision current lst)
      (reverse result)
      (recur (inc-type current) (cons current result)))))

(defn my-range [fst lst]
  (if (< fst lst)
    (create-range fst lst > inc)
    (create-range fst lst < dec)))

