(ns blindly-server.main (:gen-class)
  (:use [compojure.core  :refer :all]
        [ring.adapter.jetty :refer :all]
        [blindly-server.routes.root :refer :all])
  (:require [compojure.handler :as handler]))

(def app
  (handler/site app-routes))

(run-jetty app {:port 3001})