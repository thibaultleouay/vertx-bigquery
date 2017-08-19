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
 * Converter for {@link io.vertx.bigquery.model.ExternalDataConfiguration}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.ExternalDataConfiguration} original class using Vert.x codegen.
 */
public class ExternalDataConfigurationConverter {

  public static void fromJson(JsonObject json, ExternalDataConfiguration obj) {
    if (json.getValue("autodetect") instanceof Boolean) {
      obj.setAutodetect((Boolean)json.getValue("autodetect"));
    }
    if (json.getValue("bigtableOptions") instanceof JsonObject) {
      obj.setBigtableOptions(new io.vertx.bigquery.model.BigtableOptions((JsonObject)json.getValue("bigtableOptions")));
    }
    if (json.getValue("compression") instanceof String) {
      obj.setCompression((String)json.getValue("compression"));
    }
    if (json.getValue("csvOptions") instanceof JsonObject) {
      obj.setCsvOptions(new io.vertx.bigquery.model.CsvOptions((JsonObject)json.getValue("csvOptions")));
    }
    if (json.getValue("googleSheetsOptions") instanceof JsonObject) {
      obj.setGoogleSheetsOptions(new io.vertx.bigquery.model.GoogleSheetsOptions((JsonObject)json.getValue("googleSheetsOptions")));
    }
    if (json.getValue("ignoreUnknownValues") instanceof Boolean) {
      obj.setIgnoreUnknownValues((Boolean)json.getValue("ignoreUnknownValues"));
    }
    if (json.getValue("maxBadRecords") instanceof Number) {
      obj.setMaxBadRecords(((Number)json.getValue("maxBadRecords")).intValue());
    }
    if (json.getValue("schema") instanceof JsonObject) {
      obj.setSchema(new io.vertx.bigquery.model.TableSchema((JsonObject)json.getValue("schema")));
    }
    if (json.getValue("sourceFormat") instanceof String) {
      obj.setSourceFormat((String)json.getValue("sourceFormat"));
    }
    if (json.getValue("sourceUris") instanceof JsonArray) {
      java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
      json.getJsonArray("sourceUris").forEach( item -> {
        if (item instanceof String)
          list.add((String)item);
      });
      obj.setSourceUris(list);
    }
  }

  public static void toJson(ExternalDataConfiguration obj, JsonObject json) {
    if (obj.getAutodetect() != null) {
      json.put("autodetect", obj.getAutodetect());
    }
    if (obj.getCompression() != null) {
      json.put("compression", obj.getCompression());
    }
    if (obj.getIgnoreUnknownValues() != null) {
      json.put("ignoreUnknownValues", obj.getIgnoreUnknownValues());
    }
    if (obj.getMaxBadRecords() != null) {
      json.put("maxBadRecords", obj.getMaxBadRecords());
    }
    if (obj.getSourceFormat() != null) {
      json.put("sourceFormat", obj.getSourceFormat());
    }
    if (obj.getSourceUris() != null) {
      JsonArray array = new JsonArray();
      obj.getSourceUris().forEach(item -> array.add(item));
      json.put("sourceUris", array);
    }
  }
}