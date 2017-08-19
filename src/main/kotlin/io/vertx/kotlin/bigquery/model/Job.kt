package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Job
import io.vertx.bigquery.model.JobConfiguration
import io.vertx.bigquery.model.JobReference
import io.vertx.bigquery.model.JobStatistics
import io.vertx.bigquery.model.JobStatus

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.Job] objects.
 *
 * Model definition for Job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param configuration  [Required] Describes the job configuration.
 * @param etag  [Output-only] A hash of this resource.
 * @param id  [Output-only] Opaque ID field of the job
 * @param jobReference  [Optional] Reference describing the unique-per-user name of the job.
 * @param kind  [Output-only] The type of the resource.
 * @param selfLink  [Output-only] A URL that can be used to access this resource again.
 * @param statistics  [Output-only] Information about the job, including starting time and ending time of the job.
 * @param status  [Output-only] The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
 * @param userEmail  [Output-only] Email address of the user who ran the job.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.Job original] using Vert.x codegen.
 */
fun Job(
  configuration: io.vertx.bigquery.model.JobConfiguration? = null,
  etag: String? = null,
  id: String? = null,
  jobReference: io.vertx.bigquery.model.JobReference? = null,
  kind: String? = null,
  selfLink: String? = null,
  statistics: io.vertx.bigquery.model.JobStatistics? = null,
  status: io.vertx.bigquery.model.JobStatus? = null,
  userEmail: String? = null): Job = io.vertx.bigquery.model.Job(io.vertx.core.json.JsonObject()).apply {

  if (configuration != null) {
    this.setConfiguration(configuration)
  }
  if (etag != null) {
    this.setEtag(etag)
  }
  if (id != null) {
    this.setId(id)
  }
  if (jobReference != null) {
    this.setJobReference(jobReference)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (selfLink != null) {
    this.setSelfLink(selfLink)
  }
  if (statistics != null) {
    this.setStatistics(statistics)
  }
  if (status != null) {
    this.setStatus(status)
  }
  if (userEmail != null) {
    this.setUserEmail(userEmail)
  }
}

