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
 * Converter for {@link io.vertx.bigquery.model.JobConfigurationQuery}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobConfigurationQuery} original class using Vert.x codegen.
 */
public class JobConfigurationQueryConverter {

  public static void fromJson(JsonObject json, JobConfigurationQuery obj) {
    if (json.getValue("allowLargeResults") instanceof Boolean) {
      obj.setAllowLargeResults((Boolean)json.getValue("allowLargeResults"));
    }
    if (json.getValue("createDisposition") instanceof String) {
      obj.setCreateDisposition((String)json.getValue("createDisposition"));
    }
    if (json.getValue("defaultDataset") instanceof JsonObject) {
      obj.setDefaultDataset(new io.vertx.bigquery.model.DatasetReference((JsonObject)json.getValue("defaultDataset")));
    }
    if (json.getValue("destinationTable") instanceof JsonObject) {
      obj.setDestinationTable(new io.vertx.bigquery.model.TableReference((JsonObject)json.getValue("destinationTable")));
    }
    if (json.getValue("flattenResults") instanceof Boolean) {
      obj.setFlattenResults((Boolean)json.getValue("flattenResults"));
    }
    if (json.getValue("maximumBillingTier") instanceof Number) {
      obj.setMaximumBillingTier(((Number)json.getValue("maximumBillingTier")).intValue());
    }
    if (json.getValue("maximumBytesBilled") instanceof Number) {
      obj.setMaximumBytesBilled(((Number)json.getValue("maximumBytesBilled")).longValue());
    }
    if (json.getValue("parameterMode") instanceof String) {
      obj.setParameterMode((String)json.getValue("parameterMode"));
    }
    if (json.getValue("preserveNulls") instanceof Boolean) {
      obj.setPreserveNulls((Boolean)json.getValue("preserveNulls"));
    }
    if (json.getValue("priority") instanceof String) {
      obj.setPriority((String)json.getValue("priority"));
    }
    if (json.getValue("query") instanceof String) {
      obj.setQuery((String)json.getValue("query"));
    }
    if (json.getValue("queryParameters") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.QueryParameter> list = new java.util.ArrayList<>();
      json.getJsonArray("queryParameters").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.QueryParameter((JsonObject)item));
      });
      obj.setQueryParameters(list);
    }
    if (json.getValue("schemaUpdateOptions") instanceof JsonArray) {
      java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
      json.getJsonArray("schemaUpdateOptions").forEach( item -> {
        if (item instanceof String)
          list.add((String)item);
      });
      obj.setSchemaUpdateOptions(list);
    }
    if (json.getValue("tableDefinitions") instanceof JsonObject) {
      java.util.Map<String, io.vertx.bigquery.model.ExternalDataConfiguration> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("tableDefinitions").forEach(entry -> {
        if (entry.getValue() instanceof JsonObject)
          map.put(entry.getKey(), new io.vertx.bigquery.model.ExternalDataConfiguration((JsonObject)entry.getValue()));
      });
      obj.setTableDefinitions(map);
    }
    if (json.getValue("timePartitioning") instanceof JsonObject) {
      obj.setTimePartitioning(new io.vertx.bigquery.model.TimePartitioning((JsonObject)json.getValue("timePartitioning")));
    }
    if (json.getValue("useLegacySql") instanceof Boolean) {
      obj.setUseLegacySql((Boolean)json.getValue("useLegacySql"));
    }
    if (json.getValue("useQueryCache") instanceof Boolean) {
      obj.setUseQueryCache((Boolean)json.getValue("useQueryCache"));
    }
    if (json.getValue("userDefinedFunctionResources") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.UserDefinedFunctionResource> list = new java.util.ArrayList<>();
      json.getJsonArray("userDefinedFunctionResources").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.UserDefinedFunctionResource((JsonObject)item));
      });
      obj.setUserDefinedFunctionResources(list);
    }
    if (json.getValue("writeDisposition") instanceof String) {
      obj.setWriteDisposition((String)json.getValue("writeDisposition"));
    }
  }

  public static void toJson(JobConfigurationQuery obj, JsonObject json) {
    if (obj.isAllowLargeResults() != null) {
      json.put("allowLargeResults", obj.isAllowLargeResults());
    }
    if (obj.getCreateDisposition() != null) {
      json.put("createDisposition", obj.getCreateDisposition());
    }
    if (obj.isFlattenResults() != null) {
      json.put("flattenResults", obj.isFlattenResults());
    }
    if (obj.getMaximumBillingTier() != null) {
      json.put("maximumBillingTier", obj.getMaximumBillingTier());
    }
    if (obj.getMaximumBytesBilled() != null) {
      json.put("maximumBytesBilled", obj.getMaximumBytesBilled());
    }
    if (obj.getParameterMode() != null) {
      json.put("parameterMode", obj.getParameterMode());
    }
    if (obj.getPreserveNulls() != null) {
      json.put("preserveNulls", obj.getPreserveNulls());
    }
    if (obj.getPriority() != null) {
      json.put("priority", obj.getPriority());
    }
    if (obj.getQuery() != null) {
      json.put("query", obj.getQuery());
    }
    if (obj.getSchemaUpdateOptions() != null) {
      JsonArray array = new JsonArray();
      obj.getSchemaUpdateOptions().forEach(item -> array.add(item));
      json.put("schemaUpdateOptions", array);
    }
    if (obj.getUseLegacySql() != null) {
      json.put("useLegacySql", obj.getUseLegacySql());
    }
    if (obj.isUseQueryCache() != null) {
      json.put("useQueryCache", obj.isUseQueryCache());
    }
    if (obj.getWriteDisposition() != null) {
      json.put("writeDisposition", obj.getWriteDisposition());
    }
  }
}