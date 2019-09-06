(ns ninety-nine-lisp-problems.problem_10)
; Run-length encoding of a list.
; Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as lists (N E) where N is the number of duplicates of the element E.

; Example:
; * (encode '(a a a a b c c a a d e e e e))
; ((4 A) (1 B) (2 C) (2 A) (1 D)(4 E))
(load "problem_04", "problem_09")
(defn encode [param]
    (let [packed (my-pack param)]
        (loop [ls packed, result()]
            (let [head (first ls)]
                (if (empty? head)
                    (reverse result)
                    (recur (rest ls) 
                            (cons (list (number-of-elements head) (first head)) result)))))))