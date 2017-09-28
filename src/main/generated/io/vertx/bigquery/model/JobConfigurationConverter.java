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
 * Converter for {@link io.vertx.bigquery.model.JobConfiguration}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobConfiguration} original class using Vert.x codegen.
 */
public class JobConfigurationConverter {

  public static void fromJson(JsonObject json, JobConfiguration obj) {
    if (json.getValue("copy") instanceof JsonObject) {
      obj.setCopy(new io.vertx.bigquery.model.JobConfigurationTableCopy((JsonObject)json.getValue("copy")));
    }
    if (json.getValue("dryRun") instanceof Boolean) {
      obj.setDryRun((Boolean)json.getValue("dryRun"));
    }
    if (json.getValue("extract") instanceof JsonObject) {
      obj.setExtract(new io.vertx.bigquery.model.JobConfigurationExtract((JsonObject)json.getValue("extract")));
    }
    if (json.getValue("labels") instanceof JsonObject) {
      java.util.Map<String, String> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("labels").forEach(entry -> {
        if (entry.getValue() instanceof String)
          map.put(entry.getKey(), (String)entry.getValue());
      });
      obj.setLabels(map);
    }
    if (json.getValue("load") instanceof JsonObject) {
      obj.setLoad(new io.vertx.bigquery.model.JobConfigurationLoad((JsonObject)json.getValue("load")));
    }
    if (json.getValue("query") instanceof JsonObject) {
      obj.setQuery(new io.vertx.bigquery.model.JobConfigurationQuery((JsonObject)json.getValue("query")));
    }
  }

  public static void toJson(JobConfiguration obj, JsonObject json) {
    if (obj.getDryRun() != null) {
      json.put("dryRun", obj.getDryRun());
    }
    if (obj.getLabels() != null) {
      JsonObject map = new JsonObject();
      obj.getLabels().forEach((key,value) -> map.put(key, value));
      json.put("labels", map);
    }
  }
}