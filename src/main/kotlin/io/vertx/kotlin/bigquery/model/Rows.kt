package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Rows

fun Rows(
  insertId: String? = null,
  json: Map<String, String>? = null): Rows = io.vertx.bigquery.model.Rows(io.vertx.core.json.JsonObject()).apply {

  if (insertId != null) {
    this.setInsertId(insertId)
  }
  if (json != null) {
    this.setJson(json)
  }
}

