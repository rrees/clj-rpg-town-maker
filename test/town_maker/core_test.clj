(ns town-maker.core-test
  (:use [town-maker.core] :reload-all)
  (:use [lazytest.describe]))

(describe score-maker "generating scores"
	(it "drops the lowest score"
		(= 14 (score-maker 3 4 5 5)))
	(it "drops the lowest score even for values that are all equal"
		(= 9 (score-maker 3 3 3 3))))

(describe dice-rolls "rolling dice"
	(it "is never less than one"
		(= 0 (count (filter #(< % 1) (take 10000 (dice-rolls))))))
	(it "is never more than 6"
		(= 0 (count (filter #(> % 7) (take 10000 (dice-rolls)))))))
