(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "Voce perdeu!"))

(defn jogo [vidas]
  (if (= vidas 0)
      (perdeu)
      (do
        (print vidas)
        (jogo (- vidas 1))
      )      
  )
)

(defn -main
  "Quero café...!."
  [& args]
  (println "Quero café...!!"))
