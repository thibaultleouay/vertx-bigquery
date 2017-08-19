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
 * Converter for {@link io.vertx.bigquery.model.BigtableColumn}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.BigtableColumn} original class using Vert.x codegen.
 */
public class BigtableColumnConverter {

  public static void fromJson(JsonObject json, BigtableColumn obj) {
    if (json.getValue("encoding") instanceof String) {
      obj.setEncoding((String)json.getValue("encoding"));
    }
    if (json.getValue("fieldName") instanceof String) {
      obj.setFieldName((String)json.getValue("fieldName"));
    }
    if (json.getValue("onlyReadLatest") instanceof Boolean) {
      obj.setOnlyReadLatest((Boolean)json.getValue("onlyReadLatest"));
    }
    if (json.getValue("qualifierEncoded") instanceof String) {
      obj.setQualifierEncoded((String)json.getValue("qualifierEncoded"));
    }
    if (json.getValue("qualifierString") instanceof String) {
      obj.setQualifierString((String)json.getValue("qualifierString"));
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
  }

  public static void toJson(BigtableColumn obj, JsonObject json) {
    if (obj.getEncoding() != null) {
      json.put("encoding", obj.getEncoding());
    }
    if (obj.getFieldName() != null) {
      json.put("fieldName", obj.getFieldName());
    }
    if (obj.getOnlyReadLatest() != null) {
      json.put("onlyReadLatest", obj.getOnlyReadLatest());
    }
    if (obj.getQualifierEncoded() != null) {
      json.put("qualifierEncoded", obj.getQualifierEncoded());
    }
    if (obj.getQualifierString() != null) {
      json.put("qualifierString", obj.getQualifierString());
    }
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}