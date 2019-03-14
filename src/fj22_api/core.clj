(ns fj22-api.core
  (:gen-class)
  (:require [ring.adapter.jetty :refer :all]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found "<h1>Page not found</h1>"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (run-jetty app {:port 3000}))
