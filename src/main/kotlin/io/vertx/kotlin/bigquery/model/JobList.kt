package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobList
import io.vertx.bigquery.model.Jobs

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobList] objects.
 *
 * Model definition for JobList.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param etag  A hash of this page of results.
 * @param jobs  List of jobs that were requested.
 * @param kind  The resource type of the response.
 * @param nextPageToken  A token to request the next page of results.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobList original] using Vert.x codegen.
 */
fun JobList(
  etag: String? = null,
  jobs: Iterable<io.vertx.bigquery.model.Jobs>? = null,
  kind: String? = null,
  nextPageToken: String? = null): JobList = io.vertx.bigquery.model.JobList(io.vertx.core.json.JsonObject()).apply {

  if (etag != null) {
    this.setEtag(etag)
  }
  if (jobs != null) {
    this.setJobs(jobs.toList())
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (nextPageToken != null) {
    this.setNextPageToken(nextPageToken)
  }
}

