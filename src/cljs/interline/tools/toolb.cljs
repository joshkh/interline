(ns interline.tools.toolb
  (:require [re-frame.core :as re-frame]))

(defn run [input-channel output-channel state]
  (println "TOOLB RUNNING")
  (println "input:" input-channel)
  (println "state:" state))