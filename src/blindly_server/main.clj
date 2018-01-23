(ns blindly-server.main (:gen-class)
  (:use [ring.adapter.jetty :refer :all]
            [blindly-server.routes.root :refer :all]))

(run-jetty handler {:port 3000})