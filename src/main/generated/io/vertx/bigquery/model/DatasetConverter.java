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
 * Converter for {@link io.vertx.bigquery.model.Dataset}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.Dataset} original class using Vert.x codegen.
 */
public class DatasetConverter {

  public static void fromJson(JsonObject json, Dataset obj) {
    if (json.getValue("access") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.Access> list = new java.util.ArrayList<>();
      json.getJsonArray("access").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.Access((JsonObject)item));
      });
      obj.setAccess(list);
    }
    if (json.getValue("creationTime") instanceof Number) {
      obj.setCreationTime(((Number)json.getValue("creationTime")).longValue());
    }
    if (json.getValue("datasetReference") instanceof JsonObject) {
      obj.setDatasetReference(new io.vertx.bigquery.model.DatasetReference((JsonObject)json.getValue("datasetReference")));
    }
    if (json.getValue("defaultTableExpirationMs") instanceof Number) {
      obj.setDefaultTableExpirationMs(((Number)json.getValue("defaultTableExpirationMs")).longValue());
    }
    if (json.getValue("description") instanceof String) {
      obj.setDescription((String)json.getValue("description"));
    }
    if (json.getValue("etag") instanceof String) {
      obj.setEtag((String)json.getValue("etag"));
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
      java.util.Map<String, String> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("labels").forEach(entry -> {
        if (entry.getValue() instanceof String)
          map.put(entry.getKey(), (String)entry.getValue());
      });
      obj.setLabels(map);
    }
    if (json.getValue("lastModifiedTime") instanceof Number) {
      obj.setLastModifiedTime(((Number)json.getValue("lastModifiedTime")).longValue());
    }
    if (json.getValue("location") instanceof String) {
      obj.setLocation((String)json.getValue("location"));
    }
    if (json.getValue("selfLink") instanceof String) {
      obj.setSelfLink((String)json.getValue("selfLink"));
    }
  }

  public static void toJson(Dataset obj, JsonObject json) {
    if (obj.getCreationTime() != null) {
      json.put("creationTime", obj.getCreationTime());
    }
    if (obj.getDefaultTableExpirationMs() != null) {
      json.put("defaultTableExpirationMs", obj.getDefaultTableExpirationMs());
    }
    if (obj.getDescription() != null) {
      json.put("description", obj.getDescription());
    }
    if (obj.getEtag() != null) {
      json.put("etag", obj.getEtag());
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
    if (obj.getLastModifiedTime() != null) {
      json.put("lastModifiedTime", obj.getLastModifiedTime());
    }
    if (obj.getLocation() != null) {
      json.put("location", obj.getLocation());
    }
    if (obj.getSelfLink() != null) {
      json.put("selfLink", obj.getSelfLink());
    }
  }
}