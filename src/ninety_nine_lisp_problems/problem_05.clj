(ns ninety-nine-lisp-problems.problem_05)
;;Reverse a list.
; (defn reverse-param [param]
;     (reverse param)
;     )

(defn reverse-list [param]
    (loop [item param, result ()]
        (if (empty? item)
            result
            (recur (rest item) (cons (first item) result))
        )    
    )    
)