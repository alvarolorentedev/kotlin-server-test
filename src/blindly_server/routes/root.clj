(ns blindly-server.routes.root (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})
