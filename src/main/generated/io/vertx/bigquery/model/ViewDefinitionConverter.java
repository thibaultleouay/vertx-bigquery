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
 * Converter for {@link io.vertx.bigquery.model.ViewDefinition}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.ViewDefinition} original class using Vert.x codegen.
 */
public class ViewDefinitionConverter {

  public static void fromJson(JsonObject json, ViewDefinition obj) {
    if (json.getValue("query") instanceof String) {
      obj.setQuery((String)json.getValue("query"));
    }
    if (json.getValue("useLegacySql") instanceof Boolean) {
      obj.setUseLegacySql((Boolean)json.getValue("useLegacySql"));
    }
    if (json.getValue("userDefinedFunctionResources") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.UserDefinedFunctionResource> list = new java.util.ArrayList<>();
      json.getJsonArray("userDefinedFunctionResources").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.UserDefinedFunctionResource((JsonObject)item));
      });
      obj.setUserDefinedFunctionResources(list);
    }
  }

  public static void toJson(ViewDefinition obj, JsonObject json) {
    if (obj.getQuery() != null) {
      json.put("query", obj.getQuery());
    }
    if (obj.getUseLegacySql() != null) {
      json.put("useLegacySql", obj.getUseLegacySql());
    }
  }
}