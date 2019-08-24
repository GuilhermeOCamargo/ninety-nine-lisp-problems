;;(*) Find the last box of a list.
;;Example:
;;* (my-last '(a b c d))
;;(D)

; (defn my-last [param] 
;     (last param))

(defn my-last 
    [param] 
    (if (<= (count param) 1)
        (first param)
        (recur (rest param))
    )
)