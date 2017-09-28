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
 * Converter for {@link io.vertx.bigquery.model.Tables}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Tables} original class using Vert.x codegen.
 */
public class TablesConverter {

  public static void fromJson(JsonObject json, Tables obj) {
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
      java.util.Map<String, String> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("labels").forEach(entry -> {
        if (entry.getValue() instanceof String)
          map.put(entry.getKey(), (String)entry.getValue());
      });
      obj.setLabels(map);
    }
    if (json.getValue("tableReference") instanceof JsonObject) {
      obj.setTableReference(new io.vertx.bigquery.model.TableReference((JsonObject)json.getValue("tableReference")));
    }
    if (json.getValue("timePartitioning") instanceof JsonObject) {
      obj.setTimePartitioning(new io.vertx.bigquery.model.TimePartitioning((JsonObject)json.getValue("timePartitioning")));
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
    if (json.getValue("view") instanceof JsonObject) {
      obj.setView(new io.vertx.bigquery.model.View((JsonObject)json.getValue("view")));
    }
  }

  public static void toJson(Tables obj, JsonObject json) {
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
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}