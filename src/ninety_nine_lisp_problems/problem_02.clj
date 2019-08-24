;;    Find the last but one box of a list.
;;      Example:
;;          (my-but-last '(a b c d))
;;          (C D)

; (defn my-but-last [param]
;     (str (nth param (- (count param) 2)) "|" (last param))
;     )

(defn my-but-last [param]
    (if (<= (count param) 2)
        param
        (recur (rest param))
    )
)