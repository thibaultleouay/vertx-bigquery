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
 * Converter for {@link io.vertx.bigquery.model.JobConfigurationTableCopy}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobConfigurationTableCopy} original class using Vert.x codegen.
 */
public class JobConfigurationTableCopyConverter {

  public static void fromJson(JsonObject json, JobConfigurationTableCopy obj) {
    if (json.getValue("createDisposition") instanceof String) {
      obj.setCreateDisposition((String)json.getValue("createDisposition"));
    }
    if (json.getValue("destinationTable") instanceof JsonObject) {
      obj.setDestinationTable(new io.vertx.bigquery.model.TableReference((JsonObject)json.getValue("destinationTable")));
    }
    if (json.getValue("sourceTable") instanceof JsonObject) {
      obj.setSourceTable(new io.vertx.bigquery.model.TableReference((JsonObject)json.getValue("sourceTable")));
    }
    if (json.getValue("sourceTables") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.TableReference> list = new java.util.ArrayList<>();
      json.getJsonArray("sourceTables").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.TableReference((JsonObject)item));
      });
      obj.setSourceTables(list);
    }
    if (json.getValue("writeDisposition") instanceof String) {
      obj.setWriteDisposition((String)json.getValue("writeDisposition"));
    }
  }

  public static void toJson(JobConfigurationTableCopy obj, JsonObject json) {
    if (obj.getCreateDisposition() != null) {
      json.put("createDisposition", obj.getCreateDisposition());
    }
    if (obj.getWriteDisposition() != null) {
      json.put("writeDisposition", obj.getWriteDisposition());
    }
  }
}