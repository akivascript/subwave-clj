(ns subwave.cljs.core)

(enable-console-print!)

(defn foo [a b]
  (+ a b))

(. js/console (log "Hello world!" (foo 1 2)))
