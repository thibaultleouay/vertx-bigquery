package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.QueryResponse
import io.vertx.bigquery.model.ErrorProto
import io.vertx.bigquery.model.JobReference
import io.vertx.bigquery.model.TableRow
import io.vertx.bigquery.model.TableSchema

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.QueryResponse] objects.
 *
 * Model definition for QueryResponse.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param cacheHit  Whether the query result was fetched from the query cache.
 * @param errors  [Output-only] The first errors or warnings encountered during the running of the job. The final message includes the number of errors that caused the process to stop. Errors here do not necessarily mean that the job has completed or was unsuccessful.
 * @param jobComplete  Whether the query has completed or not. If rows or totalRows are present, this will always be true. If this is false, totalRows will not be available.
 * @param jobReference  Reference to the Job that was created to run the query. This field will be present even if the original request timed out, in which case GetQueryResults can be used to read the results once the query has completed. Since this API only returns the first page of results, subsequent pages can be fetched via the same mechanism (GetQueryResults).
 * @param kind  The resource type.
 * @param numDmlAffectedRows  [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
 * @param pageToken  A token used for paging results.
 * @param rows  An object with as many results as can be contained within the maximum permitted reply size. To get any additional rows, you can call GetQueryResults and specify the jobReference returned above.
 * @param schema  The schema of the results. Present only when the query completes successfully.
 * @param totalBytesProcessed  The total number of bytes processed for this query. If this query was a dry run, this is the number of bytes that would be processed if the query were run.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.QueryResponse original] using Vert.x codegen.
 */
fun QueryResponse(
  cacheHit: Boolean? = null,
  errors: Iterable<io.vertx.bigquery.model.ErrorProto>? = null,
  jobComplete: Boolean? = null,
  jobReference: io.vertx.bigquery.model.JobReference? = null,
  kind: String? = null,
  numDmlAffectedRows: Long? = null,
  pageToken: String? = null,
  rows: Iterable<io.vertx.bigquery.model.TableRow>? = null,
  schema: io.vertx.bigquery.model.TableSchema? = null,
  totalBytesProcessed: Long? = null): QueryResponse = io.vertx.bigquery.model.QueryResponse(io.vertx.core.json.JsonObject()).apply {

  if (cacheHit != null) {
    this.setCacheHit(cacheHit)
  }
  if (errors != null) {
    this.setErrors(errors.toList())
  }
  if (jobComplete != null) {
    this.setJobComplete(jobComplete)
  }
  if (jobReference != null) {
    this.setJobReference(jobReference)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (numDmlAffectedRows != null) {
    this.setNumDmlAffectedRows(numDmlAffectedRows)
  }
  if (pageToken != null) {
    this.setPageToken(pageToken)
  }
  if (rows != null) {
    this.setRows(rows.toList())
  }
  if (schema != null) {
    this.setSchema(schema)
  }
  if (totalBytesProcessed != null) {
    this.setTotalBytesProcessed(totalBytesProcessed)
  }
}

