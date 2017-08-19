package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TableList
import io.vertx.bigquery.model.Tables

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TableList] objects.
 *
 * Model definition for TableList.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param etag  A hash of this page of results.
 * @param kind  The type of list.
 * @param nextPageToken  A token to request the next page of results.
 * @param tables  Tables in the requested dataset.
 * @param totalItems  The total number of tables in the dataset.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TableList original] using Vert.x codegen.
 */
fun TableList(
  etag: String? = null,
  kind: String? = null,
  nextPageToken: String? = null,
  tables: Iterable<io.vertx.bigquery.model.Tables>? = null,
  totalItems: Int? = null): TableList = io.vertx.bigquery.model.TableList(io.vertx.core.json.JsonObject()).apply {

  if (etag != null) {
    this.setEtag(etag)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (nextPageToken != null) {
    this.setNextPageToken(nextPageToken)
  }
  if (tables != null) {
    this.setTables(tables.toList())
  }
  if (totalItems != null) {
    this.setTotalItems(totalItems)
  }
}

