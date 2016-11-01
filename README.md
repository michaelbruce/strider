### A wordpress clone in clojure

To output cljs task files use this command:
`boot cljs -s -- target`
or
```
(deftask dev []
  (comp
    (cljs)
    (target :dir #{"target"})))
```
