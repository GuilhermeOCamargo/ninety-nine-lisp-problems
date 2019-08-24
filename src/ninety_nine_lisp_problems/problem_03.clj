;;   Find the K'th element of a list.
;;   The first element in the list is number 1.
;;   Example:
;;    * (element-at '(a b c d e) 3)
;;    C

; (defn element-at [list index]
;     (nth list index)
;     )

(defn element-at [list index]
    (if (= index 1)
        (first list)
        (recur (rest list) (dec index))
    )
)