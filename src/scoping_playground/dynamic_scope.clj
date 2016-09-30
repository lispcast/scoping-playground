(ns scoping-playground.dynamic-scope)

(def ^:dynamic dynamic nil)
(def static nil)

(defn print-them []
  (println "Dynamic:" dynamic)
  (println "Static:" static))

(do
 (binding [dynamic "Hello"]
   (print-them))

 (print-them))

;;(def ^:dynamic *db* nil)

(defn lookup-user [db user-id]
  ;; ...
  )


(defn user-handler [{:keys [user-id db]}]
  (lookup-user db user-id))

(defn wrap-database [hndlr db-url]
  (fn [req]
    (hndlr (assoc req :db db-url))))

(def app
  (-> user-handler
    (wrap-database "jdbc:postgresl://localhost")))
