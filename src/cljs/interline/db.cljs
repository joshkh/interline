(ns interline.db
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [cljs.core.async :refer [put! chan <!]]))

(def chana (chan))
(def chanb (chan))

(def default-db
  {:name "re-frame"
   :networks {:network1 {:nodes {:node1 {:_id :node1
                                         :tool-to-use "toola"
                                         :output chana
                                         :subscribe-to nil}
                                 :node2 {:_id :node1
                                         :tool-to-use "toola"
                                         :input chana
                                         :subscribe-to :node1}}}}})
