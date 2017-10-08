(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "Voce perdeu!"))

(defn ganhou [] (print "Voce ganhou."))

(defn letras-faltantes [palavra acertos]
    (remove (fn [letra] (contains? acertos (str letra))) palavra))

(defn acertou-a-palavra-toda? [palavra acertos]
    (empty? (letras-faltantes palavra acertos))
)

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
      (perdeu)
      (if (acertou-a-palavra-toda? palavra acertos)
          (ganhou)
          (print "Chupa, amigo!")
      )
  )
)

(defn -main
  "Quero café...!."
  [& args]
  (println "Quero café...!!"))
