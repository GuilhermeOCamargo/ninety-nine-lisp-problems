;;Eliminate consecutive duplicates of list elements.
;;If a list contains repeated elements they should be replaced with a single copy of the element. 
;;The order of the elements should not be changed.

;;Example:
;;* (compress '(a a a a b c c a a d e e e e))
;;(A B C A D E)
; (defn compress [list]
;     (distinct list)
;     )
(defn is-equal? [p1 p2](not= p1 p2)) 

(defn compress [param]
    
    (if (not= (coll? param))
        "It's not a collection"
        (distinct param)))
