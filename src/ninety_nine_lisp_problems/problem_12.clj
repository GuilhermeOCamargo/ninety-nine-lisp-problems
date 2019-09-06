(ns ninety-nine-lisp-problems.problem_12)
; Decode a run-length encoded list.
; Given a run-length code list generated as specified in problem P11. Construct its uncompressed version.
(load "problem_01","problem_11")
(defn decode [param]
        (loop [ls param, result ()]
            (def x (atom 0))
            (if (empty? ls)
                (reverse result)
                (let [head (first ls)]
                    (recur (rest ls)
                        (if (coll? head)
                            (loop [item (my-last head), result-head result,  times (first head)]
                                (swap! x inc)
                                (if (<= @x times)
                                    (recur item (cons item result-head) times)
                                    result-head))
                            (cons head result)))))))