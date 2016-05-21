(ns interline.api
  (:require [re-frame.core :as re-frame]
            [interline.db :as db]))

(defn has-something [location data]
  (re-frame/dispatch [:has-something location data]))