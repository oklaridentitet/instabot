(defproject instabot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [instagram-api "0.1.8"]
                 [environ "1.0.0"]
                 [clj-time "0.8.0"]
                 [clj-http "1.0.1"]
                 [drift "1.5.2"]
                 [korma "0.3.0"]
                 [org.postgresql/postgresql "9.3-1100-jdbc4"]]
  :profiles {:dev {:plugins [[cider/cider-nrepl "0.8.2"]]}}
  :plugins [[drift "1.5.2"]])



