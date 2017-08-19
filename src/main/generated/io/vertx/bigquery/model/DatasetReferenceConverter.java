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
 * Converter for {@link io.vertx.bigquery.model.DatasetReference}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.DatasetReference} original class using Vert.x codegen.
 */
public class DatasetReferenceConverter {

  public static void fromJson(JsonObject json, DatasetReference obj) {
    if (json.getValue("datasetId") instanceof String) {
      obj.setDatasetId((String)json.getValue("datasetId"));
    }
    if (json.getValue("projectId") instanceof String) {
      obj.setProjectId((String)json.getValue("projectId"));
    }
  }

  public static void toJson(DatasetReference obj, JsonObject json) {
    if (obj.getDatasetId() != null) {
      json.put("datasetId", obj.getDatasetId());
    }
    if (obj.getProjectId() != null) {
      json.put("projectId", obj.getProjectId());
    }
  }
}