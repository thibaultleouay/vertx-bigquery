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
 * Converter for {@link io.vertx.bigquery.model.Access}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Access} original class using Vert.x codegen.
 */
public class AccessConverter {

  public static void fromJson(JsonObject json, Access obj) {
    if (json.getValue("domain") instanceof String) {
      obj.setDomain((String)json.getValue("domain"));
    }
    if (json.getValue("groupByEmail") instanceof String) {
      obj.setGroupByEmail((String)json.getValue("groupByEmail"));
    }
    if (json.getValue("role") instanceof String) {
      obj.setRole((String)json.getValue("role"));
    }
    if (json.getValue("specialGroup") instanceof String) {
      obj.setSpecialGroup((String)json.getValue("specialGroup"));
    }
    if (json.getValue("userByEmail") instanceof String) {
      obj.setUserByEmail((String)json.getValue("userByEmail"));
    }
    if (json.getValue("view") instanceof JsonObject) {
      obj.setView(new io.vertx.bigquery.model.TableReference((JsonObject)json.getValue("view")));
    }
  }

  public static void toJson(Access obj, JsonObject json) {
    if (obj.getDomain() != null) {
      json.put("domain", obj.getDomain());
    }
    if (obj.getGroupByEmail() != null) {
      json.put("groupByEmail", obj.getGroupByEmail());
    }
    if (obj.getRole() != null) {
      json.put("role", obj.getRole());
    }
    if (obj.getSpecialGroup() != null) {
      json.put("specialGroup", obj.getSpecialGroup());
    }
    if (obj.getUserByEmail() != null) {
      json.put("userByEmail", obj.getUserByEmail());
    }
  }
}