(comment "first variant, using recursion"
  (defn getMax [& args] 
    (if (== 1 (count args))
      (first args)
      (let [fMax (first args) rMax (apply getMax (rest args))] 
        (if (> fMax rMax) 
          fMax 
          rMax))))
)

(comment "code which fills the blank"
  (fn [& args] (reduce #(if (> %1 %2) %1 %2) args))
)

(defn maxValue [& args] (reduce #(if (> %1 %2) %1 %2) args))

(= (maxValue 1 8 3 4) 8)    ;;true

(= (maxValue 30 20) 30)     ;;true

(= (maxValue 45 67 11) 67)  ;;true
