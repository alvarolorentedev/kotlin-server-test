(ns blindly-server.routes.root
    (:require [compojure.core :refer :all]
              [compojure.route :as route]
              [liberator.core :refer [resource defresource]])
    (:gen-class))


(defresource root [txt]
             :available-media-types ["text/plain"]
             :handle-ok (fn [_] (format "%s" txt))
             )

(defroutes app-routes
           (GET "/" [] (root "Hello World")))
