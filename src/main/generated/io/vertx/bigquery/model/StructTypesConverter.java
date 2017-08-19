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
 * Converter for {@link io.vertx.bigquery.model.StructTypes}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.StructTypes} original class using Vert.x codegen.
 */
public class StructTypesConverter {

  public static void fromJson(JsonObject json, StructTypes obj) {
    if (json.getValue("description") instanceof String) {
      obj.setDescription((String)json.getValue("description"));
    }
    if (json.getValue("name") instanceof String) {
      obj.setName((String)json.getValue("name"));
    }
    if (json.getValue("type") instanceof JsonObject) {
      obj.setType(new io.vertx.bigquery.model.QueryParameterType((JsonObject)json.getValue("type")));
    }
  }

  public static void toJson(StructTypes obj, JsonObject json) {
    if (obj.getDescription() != null) {
      json.put("description", obj.getDescription());
    }
    if (obj.getName() != null) {
      json.put("name", obj.getName());
    }
  }
}