(ns town-maker.core)

(defn score-maker [a b c d]
	(reduce + (rest (sort < (vector a b c d)))))

(defn d6[] (+ 1 (rand-int 6)))

(defn dice-rolls [] (lazy-seq (cons (d6) (dice-rolls))))
