(ns new-clj-proj.templates
  (:require
   [clostache.parser :as clo]))

(def path "templates/deps.edn")
(def data {:name "Felix"})
(clo/render-resource path data)
;; => "{:paths [\"src\" \"resources\" \"target\"]\n\n Felix\n\n :deps\n {}\n\n :aliases\n {:dev {:extra-paths [\"test\"]\n        :extra-deps\n        {com.bhauman/figwheel-main {:mvn/version \"0.2.0\"}}}\n  :fig {:main-opts [\"-m\" \"figwheel.main\"]}}}\n"

'

