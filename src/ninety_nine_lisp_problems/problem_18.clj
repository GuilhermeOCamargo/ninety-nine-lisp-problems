;Extract a slice from a list.
;Given two indices, I and K, the slice is the list containing the elements between the I'th and K'th element
;of the original list (both limits included). Start counting the elements with 1.
;
;Example:
;* (slice '(a b c d e f g h i k) 3 7)
;(C D E F G)
(ns ninety-nine-lisp-problems.problem_18)
(defn my-slice [param fst lst]
  (if (or (< (count param) lst) (<= fst 0))
    "Invalid indexes"
    (loop [ls param, result (), index-first fst, index-last lst]
      (if (empty? ls)
        (reverse result)
        (if (and (= index-first 1) (>= index-last 1))
          (recur (rest ls) (cons (first ls) result) index-first (dec index-last))
          (recur (rest ls) result (dec index-first) (dec index-last)))))))