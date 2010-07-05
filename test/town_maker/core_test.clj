(ns town-maker.core-test
  (:use [town-maker.core] :reload-all)
  (:use [lazytest.describe]))

(describe score-maker "generating scores"
	(it "drops the lowest score"
		(= 14 (score-maker 3 4 5 5)))
	(it "drops the lowest score even for values that are all equal"
		(= 9 (score-maker 3 3 3 3))))
