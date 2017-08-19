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
 * Converter for {@link io.vertx.bigquery.model.TableList}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.TableList} original class using Vert.x codegen.
 */
public class TableListConverter {

  public static void fromJson(JsonObject json, TableList obj) {
    if (json.getValue("etag") instanceof String) {
      obj.setEtag((String)json.getValue("etag"));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("nextPageToken") instanceof String) {
      obj.setNextPageToken((String)json.getValue("nextPageToken"));
    }
    if (json.getValue("tables") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.Tables> list = new java.util.ArrayList<>();
      json.getJsonArray("tables").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.Tables((JsonObject)item));
      });
      obj.setTables(list);
    }
    if (json.getValue("totalItems") instanceof Number) {
      obj.setTotalItems(((Number)json.getValue("totalItems")).intValue());
    }
  }

  public static void toJson(TableList obj, JsonObject json) {
    if (obj.getEtag() != null) {
      json.put("etag", obj.getEtag());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getNextPageToken() != null) {
      json.put("nextPageToken", obj.getNextPageToken());
    }
    if (obj.getTotalItems() != null) {
      json.put("totalItems", obj.getTotalItems());
    }
  }
}