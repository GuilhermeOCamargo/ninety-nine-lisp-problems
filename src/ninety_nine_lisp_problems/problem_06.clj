;;Find out whether a list is a palindrome.
;;A palindrome can be read forward or backward; e.g. (x a m a x).
(defn palindrome? [list]
    (if (= list (reverse list)) true false)
    )