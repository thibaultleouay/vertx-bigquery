package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TableDataInsertAllRequest
import io.vertx.bigquery.model.Rows

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TableDataInsertAllRequest] objects.
 *
 * Model definition for TableDataInsertAllRequest.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param ignoreUnknownValues  [Optional] Accept rows that contain values that do not match the schema. The unknown values are ignored. Default is false, which treats unknown values as errors.
 * @param kind  The resource type of the response.
 * @param rows  The rows to insert.
 * @param skipInvalidRows  [Optional] Insert all valid rows of a request, even if invalid rows exist. The default value is false, which causes the entire request to fail if any invalid rows exist.
 * @param templateSuffix  [Experimental] If specified, treats the destination table as a base template, and inserts the rows into an instance table named "{destination}{templateSuffix}". BigQuery will manage creation of the instance table, using the schema of the base template table. See https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables for considerations when working with templates tables.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TableDataInsertAllRequest original] using Vert.x codegen.
 */
fun TableDataInsertAllRequest(
  ignoreUnknownValues: Boolean? = null,
  kind: String? = null,
  rows: Iterable<io.vertx.bigquery.model.Rows>? = null,
  skipInvalidRows: Boolean? = null,
  templateSuffix: String? = null): TableDataInsertAllRequest = io.vertx.bigquery.model.TableDataInsertAllRequest(io.vertx.core.json.JsonObject()).apply {

  if (ignoreUnknownValues != null) {
    this.setIgnoreUnknownValues(ignoreUnknownValues)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (rows != null) {
    this.setRows(rows.toList())
  }
  if (skipInvalidRows != null) {
    this.setSkipInvalidRows(skipInvalidRows)
  }
  if (templateSuffix != null) {
    this.setTemplateSuffix(templateSuffix)
  }
}

