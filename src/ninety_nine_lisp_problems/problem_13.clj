(ns ninety-nine-lisp-problems.problem_13)
; Run-length encoding of a list (direct solution).
; Implement the so-called run-length encoding data compression method directly. I.e. 
; don't explicitly create the sublists containing the duplicates, as in problem P09, but only count them. 
; As in problem P11, simplify the result list by replacing the singleton lists (1 X) by X.

(defn encode-direct [param]
    (loop [ls param, result ()]
      (if (empty? ls)
        (reverse result)
        (let [head (first ls), result-head (first result)]
          (recur (rest ls)
                  (if (coll? result-head)
                    (if (= (second result-head) head)
                      (cons (cons (inc (first result-head)) (rest result-head)) (rest result))
                      (cons head result))
                    (if (= result-head head)
                      (cons (list 2 result-head) (rest result))
                      (cons head result))))))))