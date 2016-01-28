(ns liberator-service.routes.home
  (:require [compojure.core :refer :all]
            [liberator.core :refer [defresource resource request -mothod-in]]
            ))

(defroutes home-routes
  (ANY "/" request
       (resource
        :handle-ok "Hello World!"
        :etag "fixed-etag"
        :available-media-types ["text/plain"])))

