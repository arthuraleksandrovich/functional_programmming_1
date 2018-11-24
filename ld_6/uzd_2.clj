(comment "code which fills the blank"
  (fn [args] 
    (nil? 
      (first 
        (filter #(not= (key %) (val %)) 
          ((fn [[a b]] (zipmap a (reverse b))) 
            (split-at (/ (count args) 2) args))
        )
      )
    )
  )
)

(defn isPolindrom [args] 
  (nil? 
    (first 
      (filter #(not= (key %) (val %)) 
        ((fn [[a b]] (zipmap a (reverse b))) 
          (split-at (/ (count args) 2) args))
      )
    )
  )
)

(false? (isPolindrom '(1 2 3 4 5)))
(true? (isPolindrom "racecar"))
(true? (isPolindrom [:foo :bar :foo]))
(true? (isPolindrom '(1 1 3 3 1 1)))
(false? (isPolindrom '(:a :b :c)))
