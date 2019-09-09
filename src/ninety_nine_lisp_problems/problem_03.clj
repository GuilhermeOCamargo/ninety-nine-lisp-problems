(ns ninety-nine-lisp-problems.problem_03)
;;   Find the K'th element of a list.
;;   The first element in the param is number 1.
;;   Example:
;;    * (element-at '(a b c d e) 3)
;;    C

; (defn element-at [param index]
;     (nth param index)
;     )

(defn element-at [param index]
    (if (= index 1)
        (first param)
        (recur (rest param) (dec index))))