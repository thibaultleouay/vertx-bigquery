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
 * Converter for {@link io.vertx.bigquery.model.Rows}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Rows} original class using Vert.x codegen.
 */
public class RowsConverter {

  public static void fromJson(JsonObject json, Rows obj) {
    if (json.getValue("insertId") instanceof String) {
      obj.setInsertId((String)json.getValue("insertId"));
    }
    if (json.getValue("json") instanceof JsonObject) {
      java.util.Map<String, java.lang.String> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("json").forEach(entry -> {
        if (entry.getValue() instanceof String)
          map.put(entry.getKey(), (String)entry.getValue());
      });
      obj.setJson(map);
    }
  }

  public static void toJson(Rows obj, JsonObject json) {
    if (obj.getInsertId() != null) {
      json.put("insertId", obj.getInsertId());
    }
    if (obj.getJson() != null) {
      JsonObject map = new JsonObject();
      obj.getJson().forEach((key,value) -> map.put(key, value));
      json.put("json", map);
    }
  }
}