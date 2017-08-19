package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobStatistics4

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobStatistics4] objects.
 *
 * Model definition for JobStatistics4.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param destinationUriFileCounts  [Output-only] Number of files per destination URI or URI pattern specified in the extract configuration. These values will be in the same order as the URIs specified in the 'destinationUris' field.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobStatistics4 original] using Vert.x codegen.
 */
fun JobStatistics4(
  destinationUriFileCounts: Iterable<Long>? = null): JobStatistics4 = io.vertx.bigquery.model.JobStatistics4(io.vertx.core.json.JsonObject()).apply {

  if (destinationUriFileCounts != null) {
    this.setDestinationUriFileCounts(destinationUriFileCounts.toList())
  }
}

