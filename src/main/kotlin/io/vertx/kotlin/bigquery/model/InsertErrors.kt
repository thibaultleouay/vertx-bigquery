package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.InsertErrors
import io.vertx.bigquery.model.ErrorProto

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.InsertErrors] objects.
 *
 * Model definition for TableDataInsertAllResponseInsertErrors.
 *
 * @param errors  Error information for the row indicated by the index property.
 * @param index  The index of the row that error applies to.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.InsertErrors original] using Vert.x codegen.
 */
fun InsertErrors(
  errors: Iterable<io.vertx.bigquery.model.ErrorProto>? = null,
  index: Long? = null): InsertErrors = io.vertx.bigquery.model.InsertErrors(io.vertx.core.json.JsonObject()).apply {

  if (errors != null) {
    this.setErrors(errors.toList())
  }
  if (index != null) {
    this.setIndex(index)
  }
}

