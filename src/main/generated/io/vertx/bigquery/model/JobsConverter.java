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
 * Converter for {@link io.vertx.bigquery.model.Jobs}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Jobs} original class using Vert.x codegen.
 */
public class JobsConverter {

  public static void fromJson(JsonObject json, Jobs obj) {
    if (json.getValue("configuration") instanceof JsonObject) {
      obj.setConfiguration(new io.vertx.bigquery.model.JobConfiguration((JsonObject)json.getValue("configuration")));
    }
    if (json.getValue("errorResult") instanceof JsonObject) {
      obj.setErrorResult(new io.vertx.bigquery.model.ErrorProto((JsonObject)json.getValue("errorResult")));
    }
    if (json.getValue("id") instanceof String) {
      obj.setId((String)json.getValue("id"));
    }
    if (json.getValue("jobReference") instanceof JsonObject) {
      obj.setJobReference(new io.vertx.bigquery.model.JobReference((JsonObject)json.getValue("jobReference")));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("state") instanceof String) {
      obj.setState((String)json.getValue("state"));
    }
    if (json.getValue("statistics") instanceof JsonObject) {
      obj.setStatistics(new io.vertx.bigquery.model.JobStatistics((JsonObject)json.getValue("statistics")));
    }
    if (json.getValue("status") instanceof JsonObject) {
      obj.setStatus(new io.vertx.bigquery.model.JobStatus((JsonObject)json.getValue("status")));
    }
    if (json.getValue("userEmail") instanceof String) {
      obj.setUserEmail((String)json.getValue("userEmail"));
    }
  }

  public static void toJson(Jobs obj, JsonObject json) {
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getState() != null) {
      json.put("state", obj.getState());
    }
    if (obj.getUserEmail() != null) {
      json.put("userEmail", obj.getUserEmail());
    }
  }
}