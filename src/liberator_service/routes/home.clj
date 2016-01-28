(ns liberator-service.routes.home
  (:require [compojure.core :refer :all]
            [liberator.core
             :refer [defresource resource request-method-in]]))

(defresource home
  :service-available?
  (fn [context] (= 2 2))
  :handle-service-not-available
  "This service is currently unavailable..."

  :method-allowed? (request-method-in :get)
  :handle-method-not-allowed
  (fn [context]
    (str (get-in context [:request :request-method]) " is not allowed"))

  :handle-ok "Hello World!"
  :etag "fixed-etag" :available-media-types ["text/plain"])

(defroutes home-routes
  (ANY "/" request home))
