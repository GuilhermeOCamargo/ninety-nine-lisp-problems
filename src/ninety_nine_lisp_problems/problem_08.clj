;;Eliminate consecutive duplicates of list elements.
;;If a list contains repeated elements they should be replaced with a single copy of the element. 
;;The order of the elements should not be changed.

;;Example:
;;* (compress '(a a a a b c c a a d e e e e))
;;(A B C A D E)
; (defn compress [list]
;     (distinct list)
;     )

(defn compress [param]
    (if (not= (coll? param))
        "It's not a collection"
        (loop [ls param, result ()]
            (if (empty? ls)
                (reverse result)
                (let [head (first ls), result-head (first result)]
                    (recur (rest ls) (if (not= head result-head)
                    (cons head result)
                    result)))))))