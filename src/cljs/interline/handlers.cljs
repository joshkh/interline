(ns interline.handlers
    (:require [re-frame.core :as re-frame :refer [trim-v]]
              [interline.db :as db]))

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/register-handler
 :set-active-panel
 (fn [db [_ active-panel]]
   (assoc db :active-panel active-panel)))

(re-frame/register-handler
  :run-pipline trim-v
  (fn [db [pipeline-id]]
    db))

(re-frame/register-handler
  :has-something trim-v
  (fn [db [location data]]
    (println "HAS SOMETHING CALLED" data)
    db))
