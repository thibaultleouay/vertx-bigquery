package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.DatasetList
import io.vertx.bigquery.model.Datasets

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.DatasetList] objects.
 *
 * Model definition for DatasetList.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param datasets  An array of the dataset resources in the project. Each resource contains basic information. For full information about a particular dataset resource, use the Datasets: get method. This property is omitted when there are no datasets in the project.
 * @param etag  A hash value of the results page. You can use this property to determine if the page has changed since the last request.
 * @param kind  The list type. This property always returns the value "bigquery#datasetList".
 * @param nextPageToken  A token that can be used to request the next results page. This property is omitted on the final results page.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.DatasetList original] using Vert.x codegen.
 */
fun DatasetList(
  datasets: Iterable<io.vertx.bigquery.model.Datasets>? = null,
  etag: String? = null,
  kind: String? = null,
  nextPageToken: String? = null): DatasetList = io.vertx.bigquery.model.DatasetList(io.vertx.core.json.JsonObject()).apply {

  if (datasets != null) {
    this.setDatasets(datasets.toList())
  }
  if (etag != null) {
    this.setEtag(etag)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (nextPageToken != null) {
    this.setNextPageToken(nextPageToken)
  }
}

