;Replicate the elements of a list a given number of times.
;Example:
;* (repli '(a b c) 3)
;(A A A B B B C C C)
(ns ninety-nine-lisp-problems.problem_15)

(defn repli [param times]
  (loop [ls param result ()]
    (if (empty? ls)
      (reverse result)
      (let [head (first ls)]
        (recur (rest ls)
               (loop [item head, result-head result, current-time 0]
                       (if (< current-time times)
                         (recur item (cons item result-head) (inc current-time))
                         result-head)))))))