;;Flatten a nested list structure.
;;Transform a list, possibly holding lists as elements into a `flat' list by replacing each list with its elements (recursively).
;;Example:
;;* (my-flatten '(a (b (c d) e)))
;;(A B C D E)

(defn my-flatten [list]
    (flatten list)
    )