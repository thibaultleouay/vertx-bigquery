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
 * Converter for {@link io.vertx.bigquery.model.TableFieldSchema}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.TableFieldSchema} original class using Vert.x codegen.
 */
public class TableFieldSchemaConverter {

  public static void fromJson(JsonObject json, TableFieldSchema obj) {
    if (json.getValue("description") instanceof String) {
      obj.setDescription((String)json.getValue("description"));
    }
    if (json.getValue("fields") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.TableFieldSchema> list = new java.util.ArrayList<>();
      json.getJsonArray("fields").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.TableFieldSchema((JsonObject)item));
      });
      obj.setFields(list);
    }
    if (json.getValue("mode") instanceof String) {
      obj.setMode((String)json.getValue("mode"));
    }
    if (json.getValue("name") instanceof String) {
      obj.setName((String)json.getValue("name"));
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
  }

  public static void toJson(TableFieldSchema obj, JsonObject json) {
    if (obj.getDescription() != null) {
      json.put("description", obj.getDescription());
    }
    if (obj.getMode() != null) {
      json.put("mode", obj.getMode());
    }
    if (obj.getName() != null) {
      json.put("name", obj.getName());
    }
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}