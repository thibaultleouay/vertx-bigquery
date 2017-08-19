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
 * Converter for {@link io.vertx.bigquery.model.TimePartitioning}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.TimePartitioning} original class using Vert.x codegen.
 */
public class TimePartitioningConverter {

  public static void fromJson(JsonObject json, TimePartitioning obj) {
    if (json.getValue("expirationMs") instanceof Number) {
      obj.setExpirationMs(((Number)json.getValue("expirationMs")).longValue());
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
  }

  public static void toJson(TimePartitioning obj, JsonObject json) {
    if (obj.getExpirationMs() != null) {
      json.put("expirationMs", obj.getExpirationMs());
    }
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}