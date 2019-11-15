(ns new-clj-proj.blah
  (:require [new-clj-proj.core :as c]))

(c/abc)

(defn def [] (+ 1 (c/abc)))







(int (Math/floor (/ 3 2)))
(int (Math/ceil (/ 3 2)))

(+ (+ 16 1/4) (+ 1 1/2) (+ 46 13/16))
;; => 1033/16

(defn frac-parts [x]
  (let [whole (int (Math/floor x))
        frac (- x whole)]
    {:input x
     :whole whole
     :fraction frac}))

(-> (/ (- 1033/16 24 3) 2) frac-parts)

;; => {:input 601/32, :whole 18, :fraction 25/32}
;; round down 1/32, so each cupboard is 18 3/4 wide
;; box is

(-> (- (+ 18 3/4) 1 1/8) frac-parts)
;; => {:input 141/8, :whole 17, :fraction 5/8}
;; => {:input 141/8, :whole 17, :fraction 5/8}

(frac-parts 1033/16)
