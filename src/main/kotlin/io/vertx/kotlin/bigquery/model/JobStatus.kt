package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobStatus
import io.vertx.bigquery.model.ErrorProto

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobStatus] objects.
 *
 * Model definition for JobStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param errorResult  [Output-only] Final error result of the job. If present, indicates that the job has completed and was unsuccessful.
 * @param errors  [Output-only] The first errors encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
 * @param state  [Output-only] Running state of the job.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobStatus original] using Vert.x codegen.
 */
fun JobStatus(
  errorResult: io.vertx.bigquery.model.ErrorProto? = null,
  errors: Iterable<io.vertx.bigquery.model.ErrorProto>? = null,
  state: String? = null): JobStatus = io.vertx.bigquery.model.JobStatus(io.vertx.core.json.JsonObject()).apply {

  if (errorResult != null) {
    this.setErrorResult(errorResult)
  }
  if (errors != null) {
    this.setErrors(errors.toList())
  }
  if (state != null) {
    this.setState(state)
  }
}

