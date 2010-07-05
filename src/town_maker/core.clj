(ns town-maker.core)

(defn score-maker [a b c d]
	(reduce + (rest (sort < (vector a b c d)))))
