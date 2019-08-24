;;Flatten a nested list structure.
;;Transform a list, possibly holding list as elements into a `flat' list by replacing each list with its elements (recursively).
;;Example:
;;* (my-flatten '(a (b (c d) e)))
;;(A B C D E)

; (defn my-flatten [param]
;     (flatten param)
;     )
(defn my-flatten [param]
    (loop [ls param, result ()]
        (if (empty? ls)
            result
            (let [head (first ls), tail (rest ls)]
                (recur tail (concat result 
                    (if (coll? head) 
                        (my-flatten head) 
                        (param head)
                    )
                ))
            )
        )
    )
)