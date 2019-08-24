;;(*) Find the last box of a list.
;;Example:
;;* (my-last '(a b c d))
;;(D)

; (defn my-last [list] 
;     (last list))

(defn my-last 
    [list] 
    (if (<= (count list) 1)
        (first list)
        (recur (rest list))
    )
)