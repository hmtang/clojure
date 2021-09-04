(ns my-proj.core
  (:gen-class))
(def poemsList `("Iliad" "Odyssey" "Now We Are Six"))
(def poemsVector ["Iliad" "Odyssey" "Now We Are Six"])
(def newPoemsList (conj poemsList "New Item"))

(defn -main
  "I don't do a whole lot ... yet."
  []
  (println "Hello, World!")
  (println "List: " (conj poemsList "New Item"))
  (println "New List: " newPoemsList)
  (println "Vector: " (conj poemsVector "New Item"))
  (println (nth poemsList 2))
  (println (nth newPoemsList 3)))
