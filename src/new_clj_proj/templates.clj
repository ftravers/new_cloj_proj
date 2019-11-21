(ns new-clj-proj.templates
  (:require
   [me.raynes.fs :refer [copy mkdir]]
   [com.rpl.specter :refer [transform ALL select] :as spectr]
   [clostache.parser :as clo]))

(defn prepend-root
  [path-root files] 
  (transform [ALL :filename] #(str path-root %) files))

(def data
  {:template-root "templates/"
   :new-project-name "blah"
   :templates
   [{:filename "deps.edn"
     :target-location "."
     :replacements {:name "felix"}}
    {:filename "fe_dev.cljs.edn"
     :target-location "."
     :replacements {:project-name "bob"}}]})

(defn main [data]
  (let [dest-dir (:new-project-name data)
        ]
    (mkdir dest-dir)
    (->> data
         (transform :templates (partial prepend-root (:template-root data)))
         (transform :templates (partial ))
         :templates
         (map (fn [{:keys [filename replacements]}]
                ;; (str "filename: " filename)
                (spit filename (clo/render-resource filename replacements)))))))





