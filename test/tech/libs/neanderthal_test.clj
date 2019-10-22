(ns tech.libs.neanderthal-test
  (:require [uncomplicate.neanderthal.core :as n-core]
            [uncomplicate.neanderthal.native :as n-native]
            [tech.libs.neanderthal]
            [tech.v2.datatype :as dtype]
            [tech.v2.tensor :as dtt]
            [tech.v2.datatype.functional :as dfn]
            [clojure.test :refer :all]))


(deftest basic-neanderthal-test
  (let [a (n-native/dge 3 3 (range 9))]
    (is (dfn/equals (dtt/ensure-tensor a)
                    (-> (dtt/->tensor (partition 3 (range 9)))
                        (dtt/transpose [1 0]))))
    (let [second-row (second (n-core/rows a))]
      (is (dfn/equals (dtt/ensure-tensor second-row)
                      [1 4 7])))))


(deftest basic-neanderthal-test-row-major
  (let [b (n-native/dge 3 3 (range 9) {:layout :row})]
    (is (dfn/equals (dtt/ensure-tensor b)
                    (dtt/->tensor (partition 3 (range 9)))))
    (let [second-row (second (n-core/rows b))]
      (is (dfn/equals (dtt/ensure-tensor second-row)
                      [3 4 5])))))
