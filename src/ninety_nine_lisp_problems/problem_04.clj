;; Find the number of elements of a list
; (defn number-of-elements [param]
;     (count param)
;     )
(defn number-of-elements [param]
    (loop [item param, cont 0]
        (if (empty? item)
            cont
            (recur (rest item) (inc cont))
        )    
    )        
)