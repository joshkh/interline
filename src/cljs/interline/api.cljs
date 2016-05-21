(ns interline.api
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [re-frame.core :as re-frame]
            [interline.db :as db]
            [cljs.core.async :refer [put! chan <!]]))

(defn has-something [location data]
  (re-frame/dispatch [:has-something location data]))


