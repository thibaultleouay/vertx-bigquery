package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobReference

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobReference] objects.
 *
 * Model definition for JobReference.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param jobId  [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
 * @param projectId  [Required] The ID of the project containing this job.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobReference original] using Vert.x codegen.
 */
fun JobReference(
  jobId: String? = null,
  projectId: String? = null): JobReference = io.vertx.bigquery.model.JobReference(io.vertx.core.json.JsonObject()).apply {

  if (jobId != null) {
    this.setJobId(jobId)
  }
  if (projectId != null) {
    this.setProjectId(projectId)
  }
}

