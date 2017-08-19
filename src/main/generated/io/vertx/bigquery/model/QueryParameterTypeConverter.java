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
 * Converter for {@link io.vertx.bigquery.model.QueryParameterType}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.QueryParameterType} original class using Vert.x codegen.
 */
public class QueryParameterTypeConverter {

  public static void fromJson(JsonObject json, QueryParameterType obj) {
    if (json.getValue("arrayType") instanceof JsonObject) {
      obj.setArrayType(new io.vertx.bigquery.model.QueryParameterType((JsonObject)json.getValue("arrayType")));
    }
    if (json.getValue("structTypes") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.StructTypes> list = new java.util.ArrayList<>();
      json.getJsonArray("structTypes").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.StructTypes((JsonObject)item));
      });
      obj.setStructTypes(list);
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
  }

  public static void toJson(QueryParameterType obj, JsonObject json) {
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}