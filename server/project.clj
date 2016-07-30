(defproject server "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.1.18"]
                 [com.stuartsierra/component "0.3.1"]
                 [org.clojure/tools.namespace "0.2.9"]
                 [com.datomic/datomic-free "0.9.5385"]]
  :profiles {:dev {:source-paths ["dev"]}})
