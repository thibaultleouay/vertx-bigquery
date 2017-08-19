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
 * Converter for {@link io.vertx.bigquery.model.JobStatus}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobStatus} original class using Vert.x codegen.
 */
public class JobStatusConverter {

  public static void fromJson(JsonObject json, JobStatus obj) {
    if (json.getValue("errorResult") instanceof JsonObject) {
      obj.setErrorResult(new io.vertx.bigquery.model.ErrorProto((JsonObject)json.getValue("errorResult")));
    }
    if (json.getValue("errors") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.ErrorProto> list = new java.util.ArrayList<>();
      json.getJsonArray("errors").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.ErrorProto((JsonObject)item));
      });
      obj.setErrors(list);
    }
    if (json.getValue("state") instanceof String) {
      obj.setState((String)json.getValue("state"));
    }
  }

  public static void toJson(JobStatus obj, JsonObject json) {
    if (obj.getState() != null) {
      json.put("state", obj.getState());
    }
  }
}