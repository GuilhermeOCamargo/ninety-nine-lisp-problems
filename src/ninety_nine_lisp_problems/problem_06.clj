;;Find out whether a list is a palindrome.
;;A palindrome can be read forward or backward; e.g. (x a m a x).
; (defn palindrome? [param]
;     (if (= param (reverse param)) true false)
;     )
(load "problem_05")
(defn palindrome? [param]
    (if (= param (reverse-list param))
        true
        false
    )    
)