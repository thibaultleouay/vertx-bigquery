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
 * Converter for {@link io.vertx.bigquery.model.JobConfigurationLoad}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobConfigurationLoad} original class using Vert.x codegen.
 */
public class JobConfigurationLoadConverter {

  public static void fromJson(JsonObject json, JobConfigurationLoad obj) {
    if (json.getValue("allowJaggedRows") instanceof Boolean) {
      obj.setAllowJaggedRows((Boolean)json.getValue("allowJaggedRows"));
    }
    if (json.getValue("allowQuotedNewlines") instanceof Boolean) {
      obj.setAllowQuotedNewlines((Boolean)json.getValue("allowQuotedNewlines"));
    }
    if (json.getValue("autodetect") instanceof Boolean) {
      obj.setAutodetect((Boolean)json.getValue("autodetect"));
    }
    if (json.getValue("createDisposition") instanceof String) {
      obj.setCreateDisposition((String)json.getValue("createDisposition"));
    }
    if (json.getValue("destinationTable") instanceof JsonObject) {
      obj.setDestinationTable(new io.vertx.bigquery.model.TableReference((JsonObject)json.getValue("destinationTable")));
    }
    if (json.getValue("encoding") instanceof String) {
      obj.setEncoding((String)json.getValue("encoding"));
    }
    if (json.getValue("fieldDelimiter") instanceof String) {
      obj.setFieldDelimiter((String)json.getValue("fieldDelimiter"));
    }
    if (json.getValue("ignoreUnknownValues") instanceof Boolean) {
      obj.setIgnoreUnknownValues((Boolean)json.getValue("ignoreUnknownValues"));
    }
    if (json.getValue("maxBadRecords") instanceof Number) {
      obj.setMaxBadRecords(((Number)json.getValue("maxBadRecords")).intValue());
    }
    if (json.getValue("nullMarker") instanceof String) {
      obj.setNullMarker((String)json.getValue("nullMarker"));
    }
    if (json.getValue("projectionFields") instanceof JsonArray) {
      java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
      json.getJsonArray("projectionFields").forEach( item -> {
        if (item instanceof String)
          list.add((String)item);
      });
      obj.setProjectionFields(list);
    }
    if (json.getValue("quote") instanceof String) {
      obj.setQuote((String)json.getValue("quote"));
    }
    if (json.getValue("schema") instanceof JsonObject) {
      obj.setSchema(new io.vertx.bigquery.model.TableSchema((JsonObject)json.getValue("schema")));
    }
    if (json.getValue("schemaInline") instanceof String) {
      obj.setSchemaInline((String)json.getValue("schemaInline"));
    }
    if (json.getValue("schemaInlineFormat") instanceof String) {
      obj.setSchemaInlineFormat((String)json.getValue("schemaInlineFormat"));
    }
    if (json.getValue("schemaUpdateOptions") instanceof JsonArray) {
      java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
      json.getJsonArray("schemaUpdateOptions").forEach( item -> {
        if (item instanceof String)
          list.add((String)item);
      });
      obj.setSchemaUpdateOptions(list);
    }
    if (json.getValue("skipLeadingRows") instanceof Number) {
      obj.setSkipLeadingRows(((Number)json.getValue("skipLeadingRows")).intValue());
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
    if (json.getValue("timePartitioning") instanceof JsonObject) {
      obj.setTimePartitioning(new io.vertx.bigquery.model.TimePartitioning((JsonObject)json.getValue("timePartitioning")));
    }
    if (json.getValue("writeDisposition") instanceof String) {
      obj.setWriteDisposition((String)json.getValue("writeDisposition"));
    }
  }

  public static void toJson(JobConfigurationLoad obj, JsonObject json) {
    if (obj.getAllowJaggedRows() != null) {
      json.put("allowJaggedRows", obj.getAllowJaggedRows());
    }
    if (obj.getAllowQuotedNewlines() != null) {
      json.put("allowQuotedNewlines", obj.getAllowQuotedNewlines());
    }
    if (obj.getAutodetect() != null) {
      json.put("autodetect", obj.getAutodetect());
    }
    if (obj.getCreateDisposition() != null) {
      json.put("createDisposition", obj.getCreateDisposition());
    }
    if (obj.getEncoding() != null) {
      json.put("encoding", obj.getEncoding());
    }
    if (obj.getFieldDelimiter() != null) {
      json.put("fieldDelimiter", obj.getFieldDelimiter());
    }
    if (obj.getIgnoreUnknownValues() != null) {
      json.put("ignoreUnknownValues", obj.getIgnoreUnknownValues());
    }
    if (obj.getMaxBadRecords() != null) {
      json.put("maxBadRecords", obj.getMaxBadRecords());
    }
    if (obj.getNullMarker() != null) {
      json.put("nullMarker", obj.getNullMarker());
    }
    if (obj.getProjectionFields() != null) {
      JsonArray array = new JsonArray();
      obj.getProjectionFields().forEach(item -> array.add(item));
      json.put("projectionFields", array);
    }
    if (obj.getQuote() != null) {
      json.put("quote", obj.getQuote());
    }
    if (obj.getDestinationTable() != null) {
      json.put("destinationTable", obj.getDestinationTable().toJson());
    }
    if (obj.getSchemaInline() != null) {
      json.put("schemaInline", obj.getSchemaInline());
    }
    if (obj.getSchemaInlineFormat() != null) {
      json.put("schemaInlineFormat", obj.getSchemaInlineFormat());
    }
    if (obj.getSchemaUpdateOptions() != null) {
      JsonArray array = new JsonArray();
      obj.getSchemaUpdateOptions().forEach(item -> array.add(item));
      json.put("schemaUpdateOptions", array);
    }
    if (obj.getSkipLeadingRows() != null) {
      json.put("skipLeadingRows", obj.getSkipLeadingRows());
    }
    if (obj.getSourceFormat() != null) {
      json.put("sourceFormat", obj.getSourceFormat());
    }
    if (obj.getSourceUris() != null) {
      JsonArray array = new JsonArray();
      obj.getSourceUris().forEach(item -> array.add(item));
      json.put("sourceUris", array);
    }
    if (obj.getWriteDisposition() != null) {
      json.put("writeDisposition", obj.getWriteDisposition());
    }
  }
}