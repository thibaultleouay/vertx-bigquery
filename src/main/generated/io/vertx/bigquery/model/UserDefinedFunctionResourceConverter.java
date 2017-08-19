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
 * Converter for {@link io.vertx.bigquery.model.UserDefinedFunctionResource}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.UserDefinedFunctionResource} original class using Vert.x codegen.
 */
public class UserDefinedFunctionResourceConverter {

  public static void fromJson(JsonObject json, UserDefinedFunctionResource obj) {
    if (json.getValue("inlineCode") instanceof String) {
      obj.setInlineCode((String)json.getValue("inlineCode"));
    }
    if (json.getValue("resourceUri") instanceof String) {
      obj.setResourceUri((String)json.getValue("resourceUri"));
    }
  }

  public static void toJson(UserDefinedFunctionResource obj, JsonObject json) {
    if (obj.getInlineCode() != null) {
      json.put("inlineCode", obj.getInlineCode());
    }
    if (obj.getResourceUri() != null) {
      json.put("resourceUri", obj.getResourceUri());
    }
  }
}