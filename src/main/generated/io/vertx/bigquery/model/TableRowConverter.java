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
 * Converter for {@link io.vertx.bigquery.model.TableRow}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.bigquery.model.TableRow} original class using Vert.x codegen.
 */
public class TableRowConverter {

  public static void fromJson(JsonObject json, TableRow obj) {
    if (json.getValue("f") instanceof JsonArray) {
      java.util.ArrayList<io.vertx.bigquery.model.TableCell> list = new java.util.ArrayList<>();
      json.getJsonArray("f").forEach( item -> {
        if (item instanceof JsonObject)
          list.add(new io.vertx.bigquery.model.TableCell((JsonObject)item));
      });
      obj.setF(list);
    }
  }

  public static void toJson(TableRow obj, JsonObject json) {
  }
}