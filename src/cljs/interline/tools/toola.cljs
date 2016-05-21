(ns interline.tools.toola
  (:require [re-frame.core :as re-frame]))

(defn run [input-channel output-channel state]
  (println "TOOLA RUNNING")
  (println "input:" input-channel)
  (println "state:" state))