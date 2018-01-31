(ns blindly-server.main (:gen-class)
  (:use [compojure.core  :refer :all]
        [ring.adapter.jetty :refer :all]
        [blindly-server.routes.root :refer :all]
        [ring.middleware.defaults :refer :all]
        [ring.middleware.stacktrace :refer [wrap-stacktrace-log]])
  (:require [compojure.handler :as handler]))

(def app
  (-> (handler/site app-routes)
      (wrap-defaults api-defaults)
      wrap-stacktrace-log))

(run-jetty app {:port 3001})