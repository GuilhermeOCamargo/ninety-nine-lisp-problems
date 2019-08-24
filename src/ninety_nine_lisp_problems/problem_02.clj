;;    Find the last but one box of a list.
;;      Example:
;;          (my-but-last '(a b c d))
;;          (C D)

; (defn my-but-last [list]
;     (str (nth list (- (count list) 2)) "|" (last list))
;     )

(defn my-but-last [list]
    (if (<= (count list) 2)
        list
        (recur (rest list))
    )
)