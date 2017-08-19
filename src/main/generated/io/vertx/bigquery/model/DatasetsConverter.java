/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.bigquery.model;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.bigquery.model.Datasets}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Datasets} original class using Vert.x codegen.
 */
public class DatasetsConverter {

  public static void fromJson(JsonObject json, Datasets obj) {
    if (json.getValue("datasetReference") instanceof JsonObject) {
      obj.setDatasetReference(new io.vertx.bigquery.model.DatasetReference((JsonObject)json.getValue("datasetReference")));
    }
    if (json.getValue("friendlyName") instanceof String) {
      obj.setFriendlyName((String)json.getValue("friendlyName"));
    }
    if (json.getValue("id") instanceof String) {
      obj.setId((String)json.getValue("id"));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("labels") instanceof JsonObject) {
      java.util.Map<String, java.lang.String> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("labels").forEach(entry -> {
        if (entry.getValue() instanceof String)
          map.put(entry.getKey(), (String)entry.getValue());
      });
      obj.setLabels(map);
    }
  }

  public static void toJson(Datasets obj, JsonObject json) {
    if (obj.getFriendlyName() != null) {
      json.put("friendlyName", obj.getFriendlyName());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getLabels() != null) {
      JsonObject map = new JsonObject();
      obj.getLabels().forEach((key,value) -> map.put(key, value));
      json.put("labels", map);
    }
  }
}