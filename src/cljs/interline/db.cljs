(ns interline.db)

(def default-db
  {:name "re-frame"
   :networks {:network1 {:nodes {:node1 {:_id :node1
                                         :tool "toola"
                                         :subscribe-to nil}
                                 :node2 {:_id :node1
                                         :tool "toola"
                                         :subscribe-to :node1}}}}})
