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
 * Converter for {@link io.vertx.bigquery.model.TableReference}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.TableReference} original class using Vert.x codegen.
 */
public class TableReferenceConverter {

  public static void fromJson(JsonObject json, TableReference obj) {
    if (json.getValue("datasetId") instanceof String) {
      obj.setDatasetId((String)json.getValue("datasetId"));
    }
    if (json.getValue("projectId") instanceof String) {
      obj.setProjectId((String)json.getValue("projectId"));
    }
    if (json.getValue("tableId") instanceof String) {
      obj.setTableId((String)json.getValue("tableId"));
    }
  }

  public static void toJson(TableReference obj, JsonObject json) {
    if (obj.getDatasetId() != null) {
      json.put("datasetId", obj.getDatasetId());
    }
    if (obj.getProjectId() != null) {
      json.put("projectId", obj.getProjectId());
    }
    if (obj.getTableId() != null) {
      json.put("tableId", obj.getTableId());
    }
  }
}