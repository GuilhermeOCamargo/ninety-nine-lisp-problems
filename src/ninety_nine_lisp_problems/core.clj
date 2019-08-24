(ns ninety-nine-lisp-problems.core)

(def values '("a" "b" "c" "d"))

(load "problem-01")

(defn -main [& args]
    (println "Problem 01: ")
    (problem_01 values)
    )