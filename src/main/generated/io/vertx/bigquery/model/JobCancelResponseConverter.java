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
 * Converter for {@link io.vertx.bigquery.model.JobCancelResponse}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobCancelResponse} original class using Vert.x codegen.
 */
public class JobCancelResponseConverter {

  public static void fromJson(JsonObject json, JobCancelResponse obj) {
    if (json.getValue("job") instanceof JsonObject) {
      obj.setJob(new io.vertx.bigquery.model.Job((JsonObject)json.getValue("job")));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
  }

  public static void toJson(JobCancelResponse obj, JsonObject json) {
    if (obj.getJob() != null) {
      json.put("job", obj.getJob().toJson());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
  }
}