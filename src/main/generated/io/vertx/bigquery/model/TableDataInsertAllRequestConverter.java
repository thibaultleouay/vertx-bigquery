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
 * Converter for {@link io.vertx.bigquery.model.TableDataInsertAllRequest}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.TableDataInsertAllRequest} original class using Vert.x codegen.
 */
public class TableDataInsertAllRequestConverter {

  public static void fromJson(JsonObject json, TableDataInsertAllRequest obj) {
    if (json.getValue("ignoreUnknownValues") instanceof Boolean) {
      obj.setIgnoreUnknownValues((Boolean)json.getValue("ignoreUnknownValues"));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("rows") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.Rows> list = new java.util.ArrayList<>();
      json.getJsonArray("rows").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.Rows((JsonObject)item));
      });
      obj.setRows(list);
    }
    if (json.getValue("skipInvalidRows") instanceof Boolean) {
      obj.setSkipInvalidRows((Boolean)json.getValue("skipInvalidRows"));
    }
    if (json.getValue("templateSuffix") instanceof String) {
      obj.setTemplateSuffix((String)json.getValue("templateSuffix"));
    }
  }

  public static void toJson(TableDataInsertAllRequest obj, JsonObject json) {
    if (obj.getIgnoreUnknownValues() != null) {
      json.put("ignoreUnknownValues", obj.getIgnoreUnknownValues());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getSkipInvalidRows() != null) {
      json.put("skipInvalidRows", obj.getSkipInvalidRows());
    }
    if (obj.getTemplateSuffix() != null) {
      json.put("templateSuffix", obj.getTemplateSuffix());
    }
  }
}