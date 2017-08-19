package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TimePartitioning

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TimePartitioning] objects.
 *
 * Model definition for TimePartitioning.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param expirationMs  [Optional] Number of milliseconds for which to keep the storage for a partition.
 * @param type  [Required] The only type supported is DAY, which will generate one partition per day based on data loading time.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TimePartitioning original] using Vert.x codegen.
 */
fun TimePartitioning(
  expirationMs: Long? = null,
  type: String? = null): TimePartitioning = io.vertx.bigquery.model.TimePartitioning(io.vertx.core.json.JsonObject()).apply {

  if (expirationMs != null) {
    this.setExpirationMs(expirationMs)
  }
  if (type != null) {
    this.setType(type)
  }
}

