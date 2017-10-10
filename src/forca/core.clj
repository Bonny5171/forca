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

(defn le-letra! [] (read-line))

(defn acertou? [chute palavra] (.contains palavra chute))

(defn avalia-chute [chute vidas palavra acertos]
    (if (true)
        (jogo vidas palavra (conj acertos chute))
        (jogo (dec vidas) palavra acertos)
    )
)

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
      (perdeu)
      (if (acertou-a-palavra-toda? palavra acertos)
          (ganhou)
          (avalia-chute (le-letra!) vidas palavra acertos)
      )
  )
)

(defn -main
  "Quero café...!."
  [& args]
  (println "Quero café...!!"))
