(set-env!
 :source-paths #{"src/cljs"}
 :resource-paths #{"html"}
 :dependencies '[[adzerk/boot-cljs "1.7.170-3"]
                 [adzerk/boot-reload "0.4.13"]
                 [pandeiro/boot-http "0.7.3"]])

(require '[adzerk.boot-reload :refer [reload]])
(require '[adzerk.boot-cljs :refer [cljs]])
(require '[pandeiro.boot-http :refer [serve]])

(deftask dev []
  (comp
    (serve)
    (reload)
    (cljs)))
