;Duplicate the elements of a list.
;Example:
;* (dupli '(a b c c d))
;(A A B B C C C C D D)

(ns ninety-nine-lisp-problems.problem_14)

(defn dupli [param]
  (loop [ls param, result ()]
    (if (empty? ls)
      (reverse result)
      (let [head (first ls)]
        (recur (rest ls) (conj result head head))))))