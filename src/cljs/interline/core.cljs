(ns interline.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [interline.handlers]
              [interline.subs]
              [interline.routes :as routes]
              [interline.views :as views]
              [interline.config :as config]
              [interline.tools.toola :as toola]
              [interline.tools.toolb :as toolb]
              [interline.tools.toolc :as toolc]))

(enable-console-print!)

(when config/debug?
  (println "dev mode"))

(defn mount-root []
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init [] 
  (routes/app-routes)
  (re-frame/dispatch-sync [:initialize-db])
  (re-frame/dispatch [:run-pipeline])
  (mount-root))
