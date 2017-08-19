package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.StructTypes
import io.vertx.bigquery.model.QueryParameterType

fun StructTypes(
  description: String? = null,
  name: String? = null,
  type: io.vertx.bigquery.model.QueryParameterType? = null): StructTypes = io.vertx.bigquery.model.StructTypes(io.vertx.core.json.JsonObject()).apply {

  if (description != null) {
    this.setDescription(description)
  }
  if (name != null) {
    this.setName(name)
  }
  if (type != null) {
    this.setType(type)
  }
}

