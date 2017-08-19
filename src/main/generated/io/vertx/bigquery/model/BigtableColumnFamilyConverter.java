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
 * Converter for {@link io.vertx.bigquery.model.BigtableColumnFamily}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.BigtableColumnFamily} original class using Vert.x codegen.
 */
public class BigtableColumnFamilyConverter {

  public static void fromJson(JsonObject json, BigtableColumnFamily obj) {
    if (json.getValue("columns") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.BigtableColumn> list = new java.util.ArrayList<>();
      json.getJsonArray("columns").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.BigtableColumn((JsonObject)item));
      });
      obj.setColumns(list);
    }
    if (json.getValue("encoding") instanceof String) {
      obj.setEncoding((String)json.getValue("encoding"));
    }
    if (json.getValue("familyId") instanceof String) {
      obj.setFamilyId((String)json.getValue("familyId"));
    }
    if (json.getValue("onlyReadLatest") instanceof Boolean) {
      obj.setOnlyReadLatest((Boolean)json.getValue("onlyReadLatest"));
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
  }

  public static void toJson(BigtableColumnFamily obj, JsonObject json) {
    if (obj.getEncoding() != null) {
      json.put("encoding", obj.getEncoding());
    }
    if (obj.getFamilyId() != null) {
      json.put("familyId", obj.getFamilyId());
    }
    if (obj.getOnlyReadLatest() != null) {
      json.put("onlyReadLatest", obj.getOnlyReadLatest());
    }
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}