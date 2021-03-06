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
 * Converter for {@link io.vertx.bigquery.model.QueryParameterValue}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.QueryParameterValue} original class using Vert.x codegen.
 */
public class QueryParameterValueConverter {

  public static void fromJson(JsonObject json, QueryParameterValue obj) {
    if (json.getValue("arrayValues") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.QueryParameterValue> list = new java.util.ArrayList<>();
      json.getJsonArray("arrayValues").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.QueryParameterValue((JsonObject)item));
      });
      obj.setArrayValues(list);
    }
    if (json.getValue("structValues") instanceof JsonObject) {
      java.util.Map<String, io.vertx.bigquery.model.QueryParameterValue> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("structValues").forEach(entry -> {
        if (entry.getValue() instanceof JsonObject)
          map.put(entry.getKey(), new io.vertx.bigquery.model.QueryParameterValue((JsonObject)entry.getValue()));
      });
      obj.setStructValues(map);
    }
    if (json.getValue("value") instanceof String) {
      obj.setValue((String)json.getValue("value"));
    }
  }

  public static void toJson(QueryParameterValue obj, JsonObject json) {
    if (obj.getValue() != null) {
      json.put("value", obj.getValue());
    }
  }
}