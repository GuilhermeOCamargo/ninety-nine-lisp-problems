; Decode a run-length encoded list.
; Given a run-length code list generated as specified in problem P11. Construct its uncompressed version.
(load "problem_11")
(defn decode [param]
    (let [encoded (encode-modified param)]
        (loop [ls encoded, result ()]
            (def x (atom 1))
            (if (empty? ls)
                (reverse result)
                (let [head (first ls)]
                    (recur (rest ls)
                        (if (coll? head)
                            (while (<= @x (first head))
                                (do 
                                    (cons (second head) result)
                                    (swap! x inc)))
                            (cons head result))))))))