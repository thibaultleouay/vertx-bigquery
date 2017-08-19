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
 * Converter for {@link io.vertx.bigquery.model.ExplainQueryStage}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.ExplainQueryStage} original class using Vert.x codegen.
 */
public class ExplainQueryStageConverter {

  public static void fromJson(JsonObject json, ExplainQueryStage obj) {
    if (json.getValue("computeMsAvg") instanceof Number) {
      obj.setComputeMsAvg(((Number)json.getValue("computeMsAvg")).longValue());
    }
    if (json.getValue("computeMsMax") instanceof Number) {
      obj.setComputeMsMax(((Number)json.getValue("computeMsMax")).longValue());
    }
    if (json.getValue("computeRatioAvg") instanceof Number) {
      obj.setComputeRatioAvg(((Number)json.getValue("computeRatioAvg")).doubleValue());
    }
    if (json.getValue("computeRatioMax") instanceof Number) {
      obj.setComputeRatioMax(((Number)json.getValue("computeRatioMax")).doubleValue());
    }
    if (json.getValue("id") instanceof Number) {
      obj.setId(((Number)json.getValue("id")).longValue());
    }
    if (json.getValue("name") instanceof String) {
      obj.setName((String)json.getValue("name"));
    }
    if (json.getValue("readMsAvg") instanceof Number) {
      obj.setReadMsAvg(((Number)json.getValue("readMsAvg")).longValue());
    }
    if (json.getValue("readMsMax") instanceof Number) {
      obj.setReadMsMax(((Number)json.getValue("readMsMax")).longValue());
    }
    if (json.getValue("readRatioAvg") instanceof Number) {
      obj.setReadRatioAvg(((Number)json.getValue("readRatioAvg")).doubleValue());
    }
    if (json.getValue("readRatioMax") instanceof Number) {
      obj.setReadRatioMax(((Number)json.getValue("readRatioMax")).doubleValue());
    }
    if (json.getValue("recordsRead") instanceof Number) {
      obj.setRecordsRead(((Number)json.getValue("recordsRead")).longValue());
    }
    if (json.getValue("recordsWritten") instanceof Number) {
      obj.setRecordsWritten(((Number)json.getValue("recordsWritten")).longValue());
    }
    if (json.getValue("shuffleOutputBytes") instanceof Number) {
      obj.setShuffleOutputBytes(((Number)json.getValue("shuffleOutputBytes")).longValue());
    }
    if (json.getValue("shuffleOutputBytesSpilled") instanceof Number) {
      obj.setShuffleOutputBytesSpilled(((Number)json.getValue("shuffleOutputBytesSpilled")).longValue());
    }
    if (json.getValue("status") instanceof String) {
      obj.setStatus((String)json.getValue("status"));
    }
    if (json.getValue("steps") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.ExplainQueryStep> list = new java.util.ArrayList<>();
      json.getJsonArray("steps").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.ExplainQueryStep((JsonObject)item));
      });
      obj.setSteps(list);
    }
    if (json.getValue("waitMsAvg") instanceof Number) {
      obj.setWaitMsAvg(((Number)json.getValue("waitMsAvg")).longValue());
    }
    if (json.getValue("waitMsMax") instanceof Number) {
      obj.setWaitMsMax(((Number)json.getValue("waitMsMax")).longValue());
    }
    if (json.getValue("waitRatioAvg") instanceof Number) {
      obj.setWaitRatioAvg(((Number)json.getValue("waitRatioAvg")).doubleValue());
    }
    if (json.getValue("waitRatioMax") instanceof Number) {
      obj.setWaitRatioMax(((Number)json.getValue("waitRatioMax")).doubleValue());
    }
    if (json.getValue("writeMsAvg") instanceof Number) {
      obj.setWriteMsAvg(((Number)json.getValue("writeMsAvg")).longValue());
    }
    if (json.getValue("writeMsMax") instanceof Number) {
      obj.setWriteMsMax(((Number)json.getValue("writeMsMax")).longValue());
    }
    if (json.getValue("writeRatioAvg") instanceof Number) {
      obj.setWriteRatioAvg(((Number)json.getValue("writeRatioAvg")).doubleValue());
    }
    if (json.getValue("writeRatioMax") instanceof Number) {
      obj.setWriteRatioMax(((Number)json.getValue("writeRatioMax")).doubleValue());
    }
  }

  public static void toJson(ExplainQueryStage obj, JsonObject json) {
    if (obj.getComputeMsAvg() != null) {
      json.put("computeMsAvg", obj.getComputeMsAvg());
    }
    if (obj.getComputeMsMax() != null) {
      json.put("computeMsMax", obj.getComputeMsMax());
    }
    if (obj.getComputeRatioAvg() != null) {
      json.put("computeRatioAvg", obj.getComputeRatioAvg());
    }
    if (obj.getComputeRatioMax() != null) {
      json.put("computeRatioMax", obj.getComputeRatioMax());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getName() != null) {
      json.put("name", obj.getName());
    }
    if (obj.getReadMsAvg() != null) {
      json.put("readMsAvg", obj.getReadMsAvg());
    }
    if (obj.getReadMsMax() != null) {
      json.put("readMsMax", obj.getReadMsMax());
    }
    if (obj.getReadRatioAvg() != null) {
      json.put("readRatioAvg", obj.getReadRatioAvg());
    }
    if (obj.getReadRatioMax() != null) {
      json.put("readRatioMax", obj.getReadRatioMax());
    }
    if (obj.getRecordsRead() != null) {
      json.put("recordsRead", obj.getRecordsRead());
    }
    if (obj.getRecordsWritten() != null) {
      json.put("recordsWritten", obj.getRecordsWritten());
    }
    if (obj.getShuffleOutputBytes() != null) {
      json.put("shuffleOutputBytes", obj.getShuffleOutputBytes());
    }
    if (obj.getShuffleOutputBytesSpilled() != null) {
      json.put("shuffleOutputBytesSpilled", obj.getShuffleOutputBytesSpilled());
    }
    if (obj.getStatus() != null) {
      json.put("status", obj.getStatus());
    }
    if (obj.getWaitMsAvg() != null) {
      json.put("waitMsAvg", obj.getWaitMsAvg());
    }
    if (obj.getWaitMsMax() != null) {
      json.put("waitMsMax", obj.getWaitMsMax());
    }
    if (obj.getWaitRatioAvg() != null) {
      json.put("waitRatioAvg", obj.getWaitRatioAvg());
    }
    if (obj.getWaitRatioMax() != null) {
      json.put("waitRatioMax", obj.getWaitRatioMax());
    }
    if (obj.getWriteMsAvg() != null) {
      json.put("writeMsAvg", obj.getWriteMsAvg());
    }
    if (obj.getWriteMsMax() != null) {
      json.put("writeMsMax", obj.getWriteMsMax());
    }
    if (obj.getWriteRatioAvg() != null) {
      json.put("writeRatioAvg", obj.getWriteRatioAvg());
    }
    if (obj.getWriteRatioMax() != null) {
      json.put("writeRatioMax", obj.getWriteRatioMax());
    }
  }
}