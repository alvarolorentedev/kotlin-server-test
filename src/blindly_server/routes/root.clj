(ns blindly-server.routes.root
    (:require [compojure.core :refer :all]
              [compojure.route :as route])
    (:gen-class))

(defroutes app-routes
           (GET "/" [] "Hello World"))
