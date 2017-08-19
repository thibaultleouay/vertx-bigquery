package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TableDataInsertAllResponse
import io.vertx.bigquery.model.InsertErrors

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TableDataInsertAllResponse] objects.
 *
 * Model definition for TableDataInsertAllResponse.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param insertErrors  An array of errors for rows that were not inserted.
 * @param kind  The resource type of the response.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TableDataInsertAllResponse original] using Vert.x codegen.
 */
fun TableDataInsertAllResponse(
  insertErrors: Iterable<io.vertx.bigquery.model.InsertErrors>? = null,
  kind: String? = null): TableDataInsertAllResponse = io.vertx.bigquery.model.TableDataInsertAllResponse(io.vertx.core.json.JsonObject()).apply {

  if (insertErrors != null) {
    this.setInsertErrors(insertErrors.toList())
  }
  if (kind != null) {
    this.setKind(kind)
  }
}

