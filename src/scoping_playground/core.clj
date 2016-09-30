(ns scoping-playground.core
  (:require [clojure.string :as str])
  (:use clojure.pprint))


;; Global Scope

(declare x)

(defn y []
  x)
(def x "my name is x")
(defn f [])
(defonce p "p")

(defn this-defs []
  (def some-var "hello!"))


;; Let scope

(let [x 1
      y 2
      z (+ x y)]
  x)

;; Function argument scope

(defn my-fn [a b c]
  (let [a 1]
    (+ a b c)))





