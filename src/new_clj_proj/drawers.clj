(ns new-clj-proj.drawers)

(def project-data
  {:stock-size 23/32})

(defn frac-parts [x]
  (let [whole (int (Math/floor x))
        frac (- x whole)]
    {:input x
     :whole whole
     :fraction frac}))

;; overall space, 2 drawer stacks & diswasher
(-> (+ (+ 46 13/16) (+ 16 1/4) 3/2)
    frac-parts) ;; 64 9/16 

(-> (/ (- (+ 64 9/16) 24 3) 2)
    frac-parts)

(def widths
  [(+ 18 15/16)
   (+ 18 1/8)
   (+ 17 1/8)
   (+ 18 3/4)
   (+ 18 3/4)])

(defn sub-slides [x]
  (- x 1 1/4))
(defn sub-slides-p [x]
  (->
   (- x 1 1/4)
   frac-parts))

(map sub-slides-p widths)

(def width-minus-slides
  [(+ 17 11/16)
   (+ 16 7/8)
   (+ 15 7/8)
   (+ 17 1/2)
   (+ 17 1/2)])

(def panel-widths
  (-> (map #(- % 1/2) width-minus-slides)
      (map frac-parts))

  )

;; panel widths
;; w1 17 3/16
;; w2 16 3/8
;; s3 15 3/8
;; s1 17
;; s2 17

;; Currently have:
;; 17 5/8,S1b
;; 17 7/8 W1b,
;; 17 1/2 W1c


;; drawer widths with 1/4 removed
;; W1: 17 11/16
;; W2: 16 7/8
;; S3: 15 7/8
;; S2: 17 1/2
;; S1: 17 1/2

;; panels
;; widths
;; overall - 1/2"
(def w1 [17
         (+ 15 3/8)
         (+ 17 3/16)
         (+ 16 3/8)])

(def overall-w)




