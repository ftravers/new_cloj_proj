(ns new-clj-proj.templates
  (:require
   [clostache.parser :refer [render]]))


(render "Hello, {{name}}!" {:name "Felix"}) 

