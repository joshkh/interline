(ns interline.tools.toolc
  (:require [re-frame.core :as re-frame]))

(defn run [input-channel output-channel state]
  (println "TOOLC RUNNING")
  (println "input:" input-channel)
  (println "state:" state))