(defproject blindly-server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [ring/ring-mock "0.3.2"]
                 [liberator "0.15.1"]
                 [compojure "1.6.0"]
                 [mockery "0.1.2"]
                 [clojurewerkz/ogre "3.3.0.0"]]
  :main blindly-server.main)
