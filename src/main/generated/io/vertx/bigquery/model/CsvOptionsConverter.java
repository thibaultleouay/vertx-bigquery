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
 * Converter for {@link io.vertx.bigquery.model.CsvOptions}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.CsvOptions} original class using Vert.x codegen.
 */
public class CsvOptionsConverter {

  public static void fromJson(JsonObject json, CsvOptions obj) {
    if (json.getValue("allowJaggedRows") instanceof Boolean) {
      obj.setAllowJaggedRows((Boolean)json.getValue("allowJaggedRows"));
    }
    if (json.getValue("allowQuotedNewlines") instanceof Boolean) {
      obj.setAllowQuotedNewlines((Boolean)json.getValue("allowQuotedNewlines"));
    }
    if (json.getValue("encoding") instanceof String) {
      obj.setEncoding((String)json.getValue("encoding"));
    }
    if (json.getValue("fieldDelimiter") instanceof String) {
      obj.setFieldDelimiter((String)json.getValue("fieldDelimiter"));
    }
    if (json.getValue("quote") instanceof String) {
      obj.setQuote((String)json.getValue("quote"));
    }
    if (json.getValue("skipLeadingRows") instanceof Number) {
      obj.setSkipLeadingRows(((Number)json.getValue("skipLeadingRows")).longValue());
    }
  }

  public static void toJson(CsvOptions obj, JsonObject json) {
    if (obj.getAllowJaggedRows() != null) {
      json.put("allowJaggedRows", obj.getAllowJaggedRows());
    }
    if (obj.getAllowQuotedNewlines() != null) {
      json.put("allowQuotedNewlines", obj.getAllowQuotedNewlines());
    }
    if (obj.getEncoding() != null) {
      json.put("encoding", obj.getEncoding());
    }
    if (obj.getFieldDelimiter() != null) {
      json.put("fieldDelimiter", obj.getFieldDelimiter());
    }
    if (obj.getQuote() != null) {
      json.put("quote", obj.getQuote());
    }
    if (obj.getSkipLeadingRows() != null) {
      json.put("skipLeadingRows", obj.getSkipLeadingRows());
    }
  }
}