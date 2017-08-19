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
 * Converter for {@link io.vertx.bigquery.model.QueryResponse}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.QueryResponse} original class using Vert.x codegen.
 */
public class QueryResponseConverter {

  public static void fromJson(JsonObject json, QueryResponse obj) {
    if (json.getValue("cacheHit") instanceof Boolean) {
      obj.setCacheHit((Boolean)json.getValue("cacheHit"));
    }
    if (json.getValue("errors") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.ErrorProto> list = new java.util.ArrayList<>();
      json.getJsonArray("errors").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.ErrorProto((JsonObject)item));
      });
      obj.setErrors(list);
    }
    if (json.getValue("jobComplete") instanceof Boolean) {
      obj.setJobComplete((Boolean)json.getValue("jobComplete"));
    }
    if (json.getValue("jobReference") instanceof JsonObject) {
      obj.setJobReference(new io.vertx.bigquery.model.JobReference((JsonObject)json.getValue("jobReference")));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("numDmlAffectedRows") instanceof Number) {
      obj.setNumDmlAffectedRows(((Number)json.getValue("numDmlAffectedRows")).longValue());
    }
    if (json.getValue("pageToken") instanceof String) {
      obj.setPageToken((String)json.getValue("pageToken"));
    }
    if (json.getValue("rows") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.TableRow> list = new java.util.ArrayList<>();
      json.getJsonArray("rows").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.TableRow((JsonObject)item));
      });
      obj.setRows(list);
    }
    if (json.getValue("schema") instanceof JsonObject) {
      obj.setSchema(new io.vertx.bigquery.model.TableSchema((JsonObject)json.getValue("schema")));
    }
    if (json.getValue("totalBytesProcessed") instanceof Number) {
      obj.setTotalBytesProcessed(((Number)json.getValue("totalBytesProcessed")).longValue());
    }
  }

  public static void toJson(QueryResponse obj, JsonObject json) {
    if (obj.getCacheHit() != null) {
      json.put("cacheHit", obj.getCacheHit());
    }
    if (obj.getJobComplete() != null) {
      json.put("jobComplete", obj.getJobComplete());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getNumDmlAffectedRows() != null) {
      json.put("numDmlAffectedRows", obj.getNumDmlAffectedRows());
    }
    if (obj.getPageToken() != null) {
      json.put("pageToken", obj.getPageToken());
    }
    if (obj.getTotalBytesProcessed() != null) {
      json.put("totalBytesProcessed", obj.getTotalBytesProcessed());
    }
  }
}