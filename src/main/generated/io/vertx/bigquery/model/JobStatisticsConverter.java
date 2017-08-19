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
 * Converter for {@link io.vertx.bigquery.model.JobStatistics}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobStatistics} original class using Vert.x codegen.
 */
public class JobStatisticsConverter {

  public static void fromJson(JsonObject json, JobStatistics obj) {
    if (json.getValue("creationTime") instanceof Number) {
      obj.setCreationTime(((Number)json.getValue("creationTime")).longValue());
    }
    if (json.getValue("endTime") instanceof Number) {
      obj.setEndTime(((Number)json.getValue("endTime")).longValue());
    }
    if (json.getValue("extract") instanceof JsonObject) {
      obj.setExtract(new io.vertx.bigquery.model.JobStatistics4((JsonObject)json.getValue("extract")));
    }
    if (json.getValue("load") instanceof JsonObject) {
      obj.setLoad(new io.vertx.bigquery.model.JobStatistics3((JsonObject)json.getValue("load")));
    }
    if (json.getValue("query") instanceof JsonObject) {
      obj.setQuery(new io.vertx.bigquery.model.JobStatistics2((JsonObject)json.getValue("query")));
    }
    if (json.getValue("startTime") instanceof Number) {
      obj.setStartTime(((Number)json.getValue("startTime")).longValue());
    }
    if (json.getValue("totalBytesProcessed") instanceof Number) {
      obj.setTotalBytesProcessed(((Number)json.getValue("totalBytesProcessed")).longValue());
    }
  }

  public static void toJson(JobStatistics obj, JsonObject json) {
    if (obj.getCreationTime() != null) {
      json.put("creationTime", obj.getCreationTime());
    }
    if (obj.getEndTime() != null) {
      json.put("endTime", obj.getEndTime());
    }
    if (obj.getStartTime() != null) {
      json.put("startTime", obj.getStartTime());
    }
    if (obj.getTotalBytesProcessed() != null) {
      json.put("totalBytesProcessed", obj.getTotalBytesProcessed());
    }
  }
}