(ns scoping-playground.problems)

;; Problem 1:

(comment (let [x 0]
           (while (< x 10)
             (println x)
             (def x (inc x)))))

;; Solutions

(dotimes [x 10]
  (println x))

(let [x (atom 0)]
  (while (< @x 10)
    (println @x)
    (swap! x inc)))

(loop [x 0]
  (when (< x 10)
    (println x)
    (recur (inc x))))




















;; Problem 2:

(defn double-values [map]
  (into {} (map (fn [[k v]]
                  [k (* 2 v)]) map)))

;; solutions

(defn double-values [mp]
  (into {} (map (fn [[k v]]
                  [k (* 2 v)]) mp)))

(defn double-values [map]
  (into {} (clojure.core/map (fn [[k v]]
                               [k (* 2 v)]) map)))












