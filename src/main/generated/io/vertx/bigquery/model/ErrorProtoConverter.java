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
 * Converter for {@link io.vertx.bigquery.model.ErrorProto}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.ErrorProto} original class using Vert.x codegen.
 */
public class ErrorProtoConverter {

  public static void fromJson(JsonObject json, ErrorProto obj) {
    if (json.getValue("debugInfo") instanceof String) {
      obj.setDebugInfo((String)json.getValue("debugInfo"));
    }
    if (json.getValue("location") instanceof String) {
      obj.setLocation((String)json.getValue("location"));
    }
    if (json.getValue("message") instanceof String) {
      obj.setMessage((String)json.getValue("message"));
    }
    if (json.getValue("reason") instanceof String) {
      obj.setReason((String)json.getValue("reason"));
    }
  }

  public static void toJson(ErrorProto obj, JsonObject json) {
    if (obj.getDebugInfo() != null) {
      json.put("debugInfo", obj.getDebugInfo());
    }
    if (obj.getLocation() != null) {
      json.put("location", obj.getLocation());
    }
    if (obj.getMessage() != null) {
      json.put("message", obj.getMessage());
    }
    if (obj.getReason() != null) {
      json.put("reason", obj.getReason());
    }
  }
}