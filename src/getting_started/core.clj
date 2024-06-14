(ns getting-started.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(+ 1 1)

(defn say-hi [name]
  (str "Hi, " name))

(say-hi "on the code again")


(+ 1 2 3)

;; (println (+ 1 2 3) "sdhfjd")

(max 1 2 3)

(filter odd? [1 3 4])

(if (< 1 2) "One is smaller" "Two is smaller")

;; (def first-name "Dave")
;; (str "Hi there " first-name)
