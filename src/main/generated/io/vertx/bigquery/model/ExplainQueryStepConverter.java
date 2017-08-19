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
 * Converter for {@link io.vertx.bigquery.model.ExplainQueryStep}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.ExplainQueryStep} original class using Vert.x codegen.
 */
public class ExplainQueryStepConverter {

  public static void fromJson(JsonObject json, ExplainQueryStep obj) {
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("substeps") instanceof JsonArray) {
      java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
      json.getJsonArray("substeps").forEach( item -> {
        if (item instanceof String)
          list.add((String)item);
      });
      obj.setSubsteps(list);
    }
  }

  public static void toJson(ExplainQueryStep obj, JsonObject json) {
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getSubsteps() != null) {
      JsonArray array = new JsonArray();
      obj.getSubsteps().forEach(item -> array.add(item));
      json.put("substeps", array);
    }
  }
}