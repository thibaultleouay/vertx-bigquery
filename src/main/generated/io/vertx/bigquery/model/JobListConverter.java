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
 * Converter for {@link io.vertx.bigquery.model.JobList}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.JobList} original class using Vert.x codegen.
 */
public class JobListConverter {

  public static void fromJson(JsonObject json, JobList obj) {
    if (json.getValue("etag") instanceof String) {
      obj.setEtag((String)json.getValue("etag"));
    }
    if (json.getValue("jobs") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.Jobs> list = new java.util.ArrayList<>();
      json.getJsonArray("jobs").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.Jobs((JsonObject)item));
      });
      obj.setJobs(list);
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("nextPageToken") instanceof String) {
      obj.setNextPageToken((String)json.getValue("nextPageToken"));
    }
  }

  public static void toJson(JobList obj, JsonObject json) {
    if (obj.getEtag() != null) {
      json.put("etag", obj.getEtag());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getNextPageToken() != null) {
      json.put("nextPageToken", obj.getNextPageToken());
    }
  }
}