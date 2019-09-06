(ns ninety-nine-lisp-problems.problem_09)
;;Pack consecutive duplicates of list elements into sublists.
;;If a list contains repeated elements they should be placed in separate sublists.
;;Example:
;;* (pack '(a a a a b c c a a d e e e e))
;;((A A A A) (B) (C C) (A A) (D) (E E E E))
(defn my-pack 
    [lst]
    (loop [ls lst, result ()]
      (if (empty? ls)
        (reverse result)
        (let [head (first ls), result-head (first result)]
          (recur (rest ls)
                 (if (= (first result-head) head)
                   (cons (cons head result-head) (rest result))
                   (cons (list head) result)))))))