(ns interline.handlers
    (:require [re-frame.core :as re-frame :refer [trim-v]]
              [interline.db :as db]
              [interline.tools.toola :as toola]))


(deftype Person [name] Object)

(re-frame/register-handler
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/register-handler
 :set-active-panel
 (fn [db [_ active-panel]]
   (assoc db :active-panel active-panel)))

(re-frame/register-handler
  :run-pipeline trim-v
  (fn [db []]
    (let [first-node (get-in db [:networks :network1 :nodes :node1])]
      (.log js/console "first node" (Person. "john") ))
    db))

(re-frame/register-handler
  :has-something trim-v
  (fn [db [location data]]
    (println "HAS SOMETHING CALLED" data)
    db))
