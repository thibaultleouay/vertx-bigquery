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
 * Converter for {@link io.vertx.bigquery.model.JobStatistics3}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobStatistics3} original class using Vert.x codegen.
 */
public class JobStatistics3Converter {

  public static void fromJson(JsonObject json, JobStatistics3 obj) {
    if (json.getValue("badRecords") instanceof Number) {
      obj.setBadRecords(((Number)json.getValue("badRecords")).longValue());
    }
    if (json.getValue("inputFileBytes") instanceof Number) {
      obj.setInputFileBytes(((Number)json.getValue("inputFileBytes")).longValue());
    }
    if (json.getValue("inputFiles") instanceof Number) {
      obj.setInputFiles(((Number)json.getValue("inputFiles")).longValue());
    }
    if (json.getValue("outputBytes") instanceof Number) {
      obj.setOutputBytes(((Number)json.getValue("outputBytes")).longValue());
    }
    if (json.getValue("outputRows") instanceof Number) {
      obj.setOutputRows(((Number)json.getValue("outputRows")).longValue());
    }
  }

  public static void toJson(JobStatistics3 obj, JsonObject json) {
    if (obj.getBadRecords() != null) {
      json.put("badRecords", obj.getBadRecords());
    }
    if (obj.getInputFileBytes() != null) {
      json.put("inputFileBytes", obj.getInputFileBytes());
    }
    if (obj.getInputFiles() != null) {
      json.put("inputFiles", obj.getInputFiles());
    }
    if (obj.getOutputBytes() != null) {
      json.put("outputBytes", obj.getOutputBytes());
    }
    if (obj.getOutputRows() != null) {
      json.put("outputRows", obj.getOutputRows());
    }
  }
}