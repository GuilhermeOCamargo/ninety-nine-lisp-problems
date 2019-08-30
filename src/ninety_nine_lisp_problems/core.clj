(ns ninety-nine-lisp-problems.core)

(def values '(a b c d))

(load "problem_01", "problem_02", "problem_03", "problem_04", "problem_05", "problem_06", "problem_07", "problem_08",
  "problem_09", "problem_10", "problem_11", "problem_12", "problem_13")

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

  (println "Problem 13 (a a a a b c c a a d e e e e) :: " (encode-direct '(a a a a b c c a a d e e e e)))
  )