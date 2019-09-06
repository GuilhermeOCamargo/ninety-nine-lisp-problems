(ns ninety-nine-lisp-problems.problem_06
    (:require [ninety-nine-lisp-problems.problem_05 :refer [reverse-list]]))
;;Find out whether a list is a palindrome.
;;A palindrome can be read forward or backward; e.g. (x a m a x).
; (defn palindrome? [param]
;     (if (= param (reverse param)) true false)
;     )
(defn palindrome? [param]
    (if (= param (reverse-list param))
        true
        false
    )    
)