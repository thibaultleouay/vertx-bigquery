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
 * Converter for {@link io.vertx.bigquery.model.JobConfigurationExtract}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobConfigurationExtract} original class using Vert.x codegen.
 */
public class JobConfigurationExtractConverter {

  public static void fromJson(JsonObject json, JobConfigurationExtract obj) {
    if (json.getValue("compression") instanceof String) {
      obj.setCompression((String)json.getValue("compression"));
    }
    if (json.getValue("destinationFormat") instanceof String) {
      obj.setDestinationFormat((String)json.getValue("destinationFormat"));
    }
    if (json.getValue("destinationUri") instanceof String) {
      obj.setDestinationUri((String)json.getValue("destinationUri"));
    }
    if (json.getValue("destinationUris") instanceof JsonArray) {
      java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
      json.getJsonArray("destinationUris").forEach( item -> {
        if (item instanceof String)
          list.add((String)item);
      });
      obj.setDestinationUris(list);
    }
    if (json.getValue("fieldDelimiter") instanceof String) {
      obj.setFieldDelimiter((String)json.getValue("fieldDelimiter"));
    }
    if (json.getValue("printHeader") instanceof Boolean) {
      obj.setPrintHeader((Boolean)json.getValue("printHeader"));
    }
    if (json.getValue("sourceTable") instanceof JsonObject) {
      obj.setSourceTable(new io.vertx.bigquery.model.TableReference((JsonObject)json.getValue("sourceTable")));
    }
  }

  public static void toJson(JobConfigurationExtract obj, JsonObject json) {
    if (obj.getCompression() != null) {
      json.put("compression", obj.getCompression());
    }
    if (obj.getDestinationFormat() != null) {
      json.put("destinationFormat", obj.getDestinationFormat());
    }
    if (obj.getDestinationUri() != null) {
      json.put("destinationUri", obj.getDestinationUri());
    }
    if (obj.getDestinationUris() != null) {
      JsonArray array = new JsonArray();
      obj.getDestinationUris().forEach(item -> array.add(item));
      json.put("destinationUris", array);
    }
    if (obj.getFieldDelimiter() != null) {
      json.put("fieldDelimiter", obj.getFieldDelimiter());
    }
    if (obj.isPrintHeader() != null) {
      json.put("printHeader", obj.isPrintHeader());
    }
  }
}