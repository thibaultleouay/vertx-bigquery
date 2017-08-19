package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TableDataList
import io.vertx.bigquery.model.TableRow

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TableDataList] objects.
 *
 * Model definition for TableDataList.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param etag  A hash of this page of results.
 * @param kind  The resource type of the response.
 * @param pageToken  A token used for paging results. Providing this token instead of the startIndex parameter can help you retrieve stable results when an underlying table is changing.
 * @param rows  Rows of results.
 * @param totalRows  The total number of rows in the complete table.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TableDataList original] using Vert.x codegen.
 */
fun TableDataList(
  etag: String? = null,
  kind: String? = null,
  pageToken: String? = null,
  rows: Iterable<io.vertx.bigquery.model.TableRow>? = null,
  totalRows: Long? = null): TableDataList = io.vertx.bigquery.model.TableDataList(io.vertx.core.json.JsonObject()).apply {

  if (etag != null) {
    this.setEtag(etag)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (pageToken != null) {
    this.setPageToken(pageToken)
  }
  if (rows != null) {
    this.setRows(rows.toList())
  }
  if (totalRows != null) {
    this.setTotalRows(totalRows)
  }
}

