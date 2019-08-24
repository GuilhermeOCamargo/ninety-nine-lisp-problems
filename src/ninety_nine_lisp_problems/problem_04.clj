;; Find the number of elements of a list
; (defn number-of-elements [list]
;     (count list)
;     )
(defn number-of-elements [list]
    (loop [item list, cont 0]
        (if (empty? item)
            cont
            (recur (rest item) (inc cont))
        )    
    )        
)