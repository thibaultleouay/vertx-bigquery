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
 * Converter for {@link io.vertx.bigquery.model.Projects}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Projects} original class using Vert.x codegen.
 */
public class ProjectsConverter {

  public static void fromJson(JsonObject json, Projects obj) {
    if (json.getValue("friendlyName") instanceof String) {
      obj.setFriendlyName((String)json.getValue("friendlyName"));
    }
    if (json.getValue("id") instanceof String) {
      obj.setId((String)json.getValue("id"));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("projectReference") instanceof JsonObject) {
      obj.setProjectReference(new io.vertx.bigquery.model.ProjectReference((JsonObject)json.getValue("projectReference")));
    }
  }

  public static void toJson(Projects obj, JsonObject json) {
    if (obj.getFriendlyName() != null) {
      json.put("friendlyName", obj.getFriendlyName());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
  }
}