(ns ninety-nine-lisp-problems.core
  (:require 
    [ninety-nine-lisp-problems.problem_01 :refer [my-last]]
    [ninety-nine-lisp-problems.problem_02 :refer [my-but-last]]
    [ninety-nine-lisp-problems.problem_03 :refer [element-at]]
    [ninety-nine-lisp-problems.problem_04 :refer [number-of-elements]]
    [ninety-nine-lisp-problems.problem_05 :refer [reverse-list]]
    [ninety-nine-lisp-problems.problem_06 :refer [palindrome?]]
    [ninety-nine-lisp-problems.problem_07 :refer [my-flatten]]
    [ninety-nine-lisp-problems.problem_08 :refer [compress]]
    [ninety-nine-lisp-problems.problem_09 :refer [my-pack]]
    [ninety-nine-lisp-problems.problem_10 :refer [encode]]
    [ninety-nine-lisp-problems.problem_11 :refer [encode-modified]]
    [ninety-nine-lisp-problems.problem_12 :refer [decode]]
    [ninety-nine-lisp-problems.problem_13 :refer [encode-direct]])
    (:gen-class))

(def values '(a b c d))
(defn -main [& args]
  (println "Given the following list: " values)

  (println "Problem 01(a b c d) :: " (my-last values))
  
  (println "Problem 02 (a b c d) :: " (my-but-last values))

  (println "Problem 03 ((a b c d) 2) :: " (element-at values 2))
  
  (println "Problem 04 (a b c d) :: " (number-of-elements values))
  
  (println "Problem 05 (a b c d) :: " (reverse-list values))
  
  (println "Problem 06 (a b c d) :: " (palindrome? values))

  (println "Problem 06 (x a m a x) :: " (palindrome? '(x a m a x)))

  (println "Problem 07 (a (b (c d) e))) :: " (my-flatten '(a (b (c d) e))))

  (println "Problem 08 (a a a a b c c a a d e e e e) :: " (compress  '(a a a a b c c a a d e e e e)))

  (println "Problem 09 (a a a a b c c a a d e e e e) :: " (my-pack '(a a a a b c c a a d e e e e)))

  (println "Problem 10 (a a a a b c c a a d e e e e) :: " (encode '(a a a a b c c a a d e e e e)))

  (println "Problem 11 (a a a a b c c a a d e e e e) :: " (encode-modified '(a a a a b c c a a d e e e e)))

  (println "Problem 12 ((4 a) b (2 c) (2 a) d (4 e)) :: " (decode '((4 a) b (2 c) (2 a) d (4 e))))

  ; (println "Problem 13 (a a a a b c c a a d e e e e) :: " (encode-direct '(a a a a b c c a a d e e e e)))
  )