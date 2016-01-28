(ns liberator-service.routes.home
  (:require [compojure.core :refer :all]
            [liberator.core :refer [defresource resource request -mothod-in]]
            ))

(defresource home
  :handle-ok "Hello World!"
  :etag "fixed-etag"
  :available-media-types ["text/plain"])

(defroutes home-routes
  (ANY "/" request home))
 

