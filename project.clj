(defproject liberator-service "0.1.0-SNAPSHOT"
  :description "tutorial from 'Web Development with Clojure'"
  :url "no url yet"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]
                 [ring-server "0.3.1"]]
  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler liberator-service.handler/app
         :init liberator-service.handler/init
         :destroy liberator-service.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"]
                   [ring/ring-devel "1.3.1"]
                   [liberator "0.11.0"]
                   [cheshire "5.3.1"]]}})
