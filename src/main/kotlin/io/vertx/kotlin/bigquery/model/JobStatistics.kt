package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobStatistics
import io.vertx.bigquery.model.JobStatistics2
import io.vertx.bigquery.model.JobStatistics3
import io.vertx.bigquery.model.JobStatistics4

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobStatistics] objects.
 *
 * Model definition for JobStatistics.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param creationTime  [Output-only] Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs.
 * @param endTime  [Output-only] End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state.
 * @param extract  [Output-only] Statistics for an extract job.
 * @param load  [Output-only] Statistics for a load job.
 * @param query  [Output-only] Statistics for a query job.
 * @param startTime  [Output-only] Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE.
 * @param totalBytesProcessed  [Output-only] [Deprecated] Use the bytes processed in the query statistics instead.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobStatistics original] using Vert.x codegen.
 */
fun JobStatistics(
  creationTime: Long? = null,
  endTime: Long? = null,
  extract: io.vertx.bigquery.model.JobStatistics4? = null,
  load: io.vertx.bigquery.model.JobStatistics3? = null,
  query: io.vertx.bigquery.model.JobStatistics2? = null,
  startTime: Long? = null,
  totalBytesProcessed: Long? = null): JobStatistics = io.vertx.bigquery.model.JobStatistics(io.vertx.core.json.JsonObject()).apply {

  if (creationTime != null) {
    this.setCreationTime(creationTime)
  }
  if (endTime != null) {
    this.setEndTime(endTime)
  }
  if (extract != null) {
    this.setExtract(extract)
  }
  if (load != null) {
    this.setLoad(load)
  }
  if (query != null) {
    this.setQuery(query)
  }
  if (startTime != null) {
    this.setStartTime(startTime)
  }
  if (totalBytesProcessed != null) {
    this.setTotalBytesProcessed(totalBytesProcessed)
  }
}

