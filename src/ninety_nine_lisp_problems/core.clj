(ns ninety-nine-lisp-problems.core)

(def values '("a" "b" "c" "d"))

(load "problem_01", "problem_02")

(defn -main [& args]
  (println "Problem 01: ")
  (my-last values)

  (println "Problem 02: ")
  (my-but-last values)
  )