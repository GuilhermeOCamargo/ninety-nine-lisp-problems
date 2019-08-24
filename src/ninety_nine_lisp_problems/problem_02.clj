;;    Find the last but one box of a list.
;;      Example:
;;          (my-but-last '(a b c d))
;;          (C D)

(defn my-but-last [list]
    (println (nth list (- (count list) 2)) (last list))
    )