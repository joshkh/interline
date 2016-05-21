(ns interline.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [interline.core-test]))

(doo-tests 'interline.core-test)
