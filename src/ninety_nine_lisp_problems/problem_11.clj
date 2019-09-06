(ns ninety-nine-lisp-problems.problem_11
    (:require
        [ninety-nine-lisp-problems.problem_03 :refer [element-at]]
        [ninety-nine-lisp-problems.problem_10 :refer [encode]]))
; Modified run-length encoding.
; Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. 
; Only elements with duplicates are transferred as (N E) lists.
; Example:
; * (encode-modified '(a a a a b c c a a d e e e e))
; ((4 A) B (2 C) (2 A) D (4 E))
(defn encode-modified [param]
    (let [encoded (encode param)]
        (loop [ls encoded, result ()]
            (if (empty? ls)
                (reverse result)
                (let [head (first ls)]
                    (recur (rest ls) 
                        (if (= (element-at (first ls) 1)1)
                            (cons (element-at (first ls) 2) result)
                            (cons (first ls) result))))))))