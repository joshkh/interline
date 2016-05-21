(ns interline.schemas
  (:require [schema.core :as s :include-macros true]))


(def Node
  {:tool s/Any
   :subscribe-to s/Keyword
   :state [{}]})
