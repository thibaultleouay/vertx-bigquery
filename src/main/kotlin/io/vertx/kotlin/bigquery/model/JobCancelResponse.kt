package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobCancelResponse
import io.vertx.bigquery.model.Job

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobCancelResponse] objects.
 *
 * Model definition for JobCancelResponse.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param job  The final state of the job.
 * @param kind  The resource type of the response.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobCancelResponse original] using Vert.x codegen.
 */
fun JobCancelResponse(
  job: io.vertx.bigquery.model.Job? = null,
  kind: String? = null): JobCancelResponse = io.vertx.bigquery.model.JobCancelResponse(io.vertx.core.json.JsonObject()).apply {

  if (job != null) {
    this.setJob(job)
  }
  if (kind != null) {
    this.setKind(kind)
  }
}

