(ns blindly-server.routes.root-test
  (:require [clojure.test :refer :all]
            [blindly-server.routes.root :refer :all]
            [ring.mock.request :as mock]))

(deftest root-returns-correct-values
  (is (= (app-routes (mock/request :get "/"))
         {:status  200
          :headers {"Content-Type" "text/html; charset=utf-8"}
          :body    "Hello World"})))
