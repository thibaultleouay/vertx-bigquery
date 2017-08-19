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
 * Converter for {@link io.vertx.bigquery.model.JobStatistics2}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobStatistics2} original class using Vert.x codegen.
 */
public class JobStatistics2Converter {

  public static void fromJson(JsonObject json, JobStatistics2 obj) {
    if (json.getValue("billingTier") instanceof Number) {
      obj.setBillingTier(((Number)json.getValue("billingTier")).intValue());
    }
    if (json.getValue("cacheHit") instanceof Boolean) {
      obj.setCacheHit((Boolean)json.getValue("cacheHit"));
    }
    if (json.getValue("numDmlAffectedRows") instanceof Number) {
      obj.setNumDmlAffectedRows(((Number)json.getValue("numDmlAffectedRows")).longValue());
    }
    if (json.getValue("queryPlan") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.ExplainQueryStage> list = new java.util.ArrayList<>();
      json.getJsonArray("queryPlan").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.ExplainQueryStage((JsonObject)item));
      });
      obj.setQueryPlan(list);
    }
    if (json.getValue("referencedTables") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.TableReference> list = new java.util.ArrayList<>();
      json.getJsonArray("referencedTables").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.TableReference((JsonObject)item));
      });
      obj.setReferencedTables(list);
    }
    if (json.getValue("schema") instanceof JsonObject) {
      obj.setSchema(new io.vertx.bigquery.model.TableSchema((JsonObject)json.getValue("schema")));
    }
    if (json.getValue("statementType") instanceof String) {
      obj.setStatementType((String)json.getValue("statementType"));
    }
    if (json.getValue("totalBytesBilled") instanceof Number) {
      obj.setTotalBytesBilled(((Number)json.getValue("totalBytesBilled")).longValue());
    }
    if (json.getValue("totalBytesProcessed") instanceof Number) {
      obj.setTotalBytesProcessed(((Number)json.getValue("totalBytesProcessed")).longValue());
    }
    if (json.getValue("undeclaredQueryParameters") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.QueryParameter> list = new java.util.ArrayList<>();
      json.getJsonArray("undeclaredQueryParameters").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.QueryParameter((JsonObject)item));
      });
      obj.setUndeclaredQueryParameters(list);
    }
  }

  public static void toJson(JobStatistics2 obj, JsonObject json) {
    if (obj.getBillingTier() != null) {
      json.put("billingTier", obj.getBillingTier());
    }
    if (obj.getCacheHit() != null) {
      json.put("cacheHit", obj.getCacheHit());
    }
    if (obj.getNumDmlAffectedRows() != null) {
      json.put("numDmlAffectedRows", obj.getNumDmlAffectedRows());
    }
    if (obj.getStatementType() != null) {
      json.put("statementType", obj.getStatementType());
    }
    if (obj.getTotalBytesBilled() != null) {
      json.put("totalBytesBilled", obj.getTotalBytesBilled());
    }
    if (obj.getTotalBytesProcessed() != null) {
      json.put("totalBytesProcessed", obj.getTotalBytesProcessed());
    }
  }
}