(defproject subwave "0.1.0-SNAPSHOT"
  :description "A static blog generator using Clojure and ClojureScript."
  :url "https://github.com/akivaschoen/subwave"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2371"]]
  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :main ^:skip-aot subwave.core
  :source-paths ["src"]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}

  :cljsbuild {:builds [{:id "subwave"
                        :source-paths ["src/subwave_cljs"]
                        :compiler {:output-to "resources/public/scripts/subwave.js"
                                   :output-dir "resources/public/scripts"
                                   :optimizations :none
                                   :source-map true}}]})
