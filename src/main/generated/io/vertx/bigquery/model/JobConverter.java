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

/**
 * Converter for {@link io.vertx.bigquery.model.Job}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Job} original class using Vert.x codegen.
 */
public class JobConverter {

  public static void fromJson(JsonObject json, Job obj) {
    if (json.getValue("configuration") instanceof JsonObject) {
      obj.setConfiguration(new io.vertx.bigquery.model.JobConfiguration((JsonObject)json.getValue("configuration")));
    }
    if (json.getValue("etag") instanceof String) {
      obj.setEtag((String)json.getValue("etag"));
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
    if (json.getValue("selfLink") instanceof String) {
      obj.setSelfLink((String)json.getValue("selfLink"));
    }
    if (json.getValue("statistics") instanceof JsonObject) {
      obj.setStatistics(new io.vertx.bigquery.model.JobStatistics((JsonObject)json.getValue("statistics")));
    }
    if (json.getValue("status") instanceof JsonObject) {
      obj.setStatus(new io.vertx.bigquery.model.JobStatus((JsonObject)json.getValue("status")));
    }
    if (json.getValue("user_email") instanceof String) {
      obj.setuser_email((String)json.getValue("user_email"));
    }
  }

  public static void toJson(Job obj, JsonObject json) {
    if (obj.getEtag() != null) {
      json.put("etag", obj.getEtag());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getSelfLink() != null) {
      json.put("selfLink", obj.getSelfLink());
    }
    if (obj.getUserEmail() != null) {
      json.put("user_email", obj.getUserEmail());
    }
    if (obj.getConfiguration() != null) {
      json.put("configuration", obj.getConfiguration().toJson());
    }
  }
}