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
 * Converter for {@link io.vertx.bigquery.model.Table}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Table} original class using Vert.x codegen.
 */
public class TableConverter {

  public static void fromJson(JsonObject json, Table obj) {
    if (json.getValue("creationTime") instanceof Number) {
      obj.setCreationTime(((Number)json.getValue("creationTime")).longValue());
    }
    if (json.getValue("description") instanceof String) {
      obj.setDescription((String)json.getValue("description"));
    }
    if (json.getValue("etag") instanceof String) {
      obj.setEtag((String)json.getValue("etag"));
    }
    if (json.getValue("expirationTime") instanceof Number) {
      obj.setExpirationTime(((Number)json.getValue("expirationTime")).longValue());
    }
    if (json.getValue("externalDataConfiguration") instanceof JsonObject) {
      obj.setExternalDataConfiguration(new io.vertx.bigquery.model.ExternalDataConfiguration((JsonObject)json.getValue("externalDataConfiguration")));
    }
    if (json.getValue("friendlyName") instanceof String) {
      obj.setFriendlyName((String)json.getValue("friendlyName"));
    }
    if (json.getValue("id") instanceof String) {
      obj.setId((String)json.getValue("id"));
    }
    if (json.getValue("kind") instanceof String) {
      obj.setKind((String)json.getValue("kind"));
    }
    if (json.getValue("labels") instanceof JsonObject) {
      java.util.Map<String, java.lang.String> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("labels").forEach(entry -> {
        if (entry.getValue() instanceof String)
          map.put(entry.getKey(), (String)entry.getValue());
      });
      obj.setLabels(map);
    }
    if (json.getValue("location") instanceof String) {
      obj.setLocation((String)json.getValue("location"));
    }
    if (json.getValue("numBytes") instanceof Number) {
      obj.setNumBytes(((Number)json.getValue("numBytes")).longValue());
    }
    if (json.getValue("numLongTermBytes") instanceof Number) {
      obj.setNumLongTermBytes(((Number)json.getValue("numLongTermBytes")).longValue());
    }
    if (json.getValue("schema") instanceof JsonObject) {
      obj.setSchema(new io.vertx.bigquery.model.TableSchema((JsonObject)json.getValue("schema")));
    }
    if (json.getValue("selfLink") instanceof String) {
      obj.setSelfLink((String)json.getValue("selfLink"));
    }
    if (json.getValue("streamingBuffer") instanceof JsonObject) {
      obj.setStreamingBuffer(new io.vertx.bigquery.model.Streamingbuffer((JsonObject)json.getValue("streamingBuffer")));
    }
    if (json.getValue("tableReference") instanceof JsonObject) {
      obj.setTableReference(new io.vertx.bigquery.model.TableReference((JsonObject)json.getValue("tableReference")));
    }
    if (json.getValue("timePartitioning") instanceof JsonObject) {
      obj.setTimePartitioning(new io.vertx.bigquery.model.TimePartitioning((JsonObject)json.getValue("timePartitioning")));
    }
    if (json.getValue("type") instanceof String) {
      obj.setType((String)json.getValue("type"));
    }
    if (json.getValue("view") instanceof JsonObject) {
      obj.setView(new io.vertx.bigquery.model.ViewDefinition((JsonObject)json.getValue("view")));
    }
  }

  public static void toJson(Table obj, JsonObject json) {
    if (obj.getCreationTime() != null) {
      json.put("creationTime", obj.getCreationTime());
    }
    if (obj.getDescription() != null) {
      json.put("description", obj.getDescription());
    }
    if (obj.getEtag() != null) {
      json.put("etag", obj.getEtag());
    }
    if (obj.getExpirationTime() != null) {
      json.put("expirationTime", obj.getExpirationTime());
    }
    if (obj.getFriendlyName() != null) {
      json.put("friendlyName", obj.getFriendlyName());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getKind() != null) {
      json.put("kind", obj.getKind());
    }
    if (obj.getLabels() != null) {
      JsonObject map = new JsonObject();
      obj.getLabels().forEach((key,value) -> map.put(key, value));
      json.put("labels", map);
    }
    if (obj.getLocation() != null) {
      json.put("location", obj.getLocation());
    }
    if (obj.getNumBytes() != null) {
      json.put("numBytes", obj.getNumBytes());
    }
    if (obj.getNumLongTermBytes() != null) {
      json.put("numLongTermBytes", obj.getNumLongTermBytes());
    }
    if (obj.getSelfLink() != null) {
      json.put("selfLink", obj.getSelfLink());
    }
    if (obj.getType() != null) {
      json.put("type", obj.getType());
    }
  }
}