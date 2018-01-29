(ns blindly-server.routes.root-test
  (:require [clojure.test :refer :all]
            [blindly-server.routes.root :refer :all]
            [ring.mock.request :as mock]))

(deftest root-returns-correct-values
  (is (= (app-routes (mock/request :get "/"))
         {:body    "Hello World"
          :headers {"Content-Type" "text/plain;charset=UTF-8"
                    "Vary"         "Accept"}
          :status  200})))
