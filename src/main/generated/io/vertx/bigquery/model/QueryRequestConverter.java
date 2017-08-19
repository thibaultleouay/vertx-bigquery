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
 * Converter for {@link io.vertx.bigquery.model.QueryRequest}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.QueryRequest} original class using Vert.x codegen.
 */
public class QueryRequestConverter {

  public static void fromJson(JsonObject json, QueryRequest obj) {
    if (json.getValue("defaultDataset") instanceof JsonObject) {
      obj.setDefaultDataset(new io.vertx.bigquery.model.DatasetReference((JsonObject)json.getValue("defaultDataset")));
    }
    if (json.getValue("dryRun") instanceof Boolean) {
      obj.setDryRun((Boolean)json.getValue("dryRun"));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("maxResults") instanceof Number) {
      obj.setMaxResults(((Number)json.getValue("maxResults")).longValue());
    }
    if (json.getValue("parameterMode") instanceof String) {
      obj.setParameterMode((String)json.getValue("parameterMode"));
    }
    if (json.getValue("preserveNulls") instanceof Boolean) {
      obj.setPreserveNulls((Boolean)json.getValue("preserveNulls"));
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
    if (json.getValue("timeoutMs") instanceof Number) {
      obj.setTimeoutMs(((Number)json.getValue("timeoutMs")).longValue());
    }
    if (json.getValue("useLegacySql") instanceof Boolean) {
      obj.setUseLegacySql((Boolean)json.getValue("useLegacySql"));
    }
    if (json.getValue("useQueryCache") instanceof Boolean) {
      obj.setUseQueryCache((Boolean)json.getValue("useQueryCache"));
    }
  }

  public static void toJson(QueryRequest obj, JsonObject json) {
    if (obj.getDryRun() != null) {
      json.put("dryRun", obj.getDryRun());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getMaxResults() != null) {
      json.put("maxResults", obj.getMaxResults());
    }
    if (obj.getParameterMode() != null) {
      json.put("parameterMode", obj.getParameterMode());
    }
    if (obj.getPreserveNulls() != null) {
      json.put("preserveNulls", obj.getPreserveNulls());
    }
    if (obj.getQuery() != null) {
      json.put("query", obj.getQuery());
    }
    if (obj.getTimeoutMs() != null) {
      json.put("timeoutMs", obj.getTimeoutMs());
    }
    if (obj.isUseLegacySql() != null) {
      json.put("useLegacySql", obj.isUseLegacySql());
    }
    if (obj.isUseQueryCache() != null) {
      json.put("useQueryCache", obj.isUseQueryCache());
    }
  }
}