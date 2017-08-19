package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobStatistics2
import io.vertx.bigquery.model.ExplainQueryStage
import io.vertx.bigquery.model.QueryParameter
import io.vertx.bigquery.model.TableReference
import io.vertx.bigquery.model.TableSchema

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobStatistics2] objects.
 *
 * Model definition for JobStatistics2.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param billingTier  [Output-only] Billing tier for the job.
 * @param cacheHit  [Output-only] Whether the query result was fetched from the query cache.
 * @param numDmlAffectedRows  [Output-only] The number of rows affected by a DML statement. Present only for DML statements INSERT, UPDATE or DELETE.
 * @param queryPlan  [Output-only] Describes execution plan for the query.
 * @param referencedTables  [Output-only, Experimental] Referenced tables for the job. Queries that reference more than 50 tables will not have a complete list.
 * @param schema  [Output-only, Experimental] The schema of the results. Present only for successful dry run of non-legacy SQL queries.
 * @param statementType  [Output-only, Experimental] The type of query statement, if valid.
 * @param totalBytesBilled  [Output-only] Total bytes billed for the job.
 * @param totalBytesProcessed  [Output-only] Total bytes processed for the job.
 * @param undeclaredQueryParameters  [Output-only, Experimental] Standard SQL only: list of undeclared query parameters detected during a dry run validation.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobStatistics2 original] using Vert.x codegen.
 */
fun JobStatistics2(
  billingTier: Int? = null,
  cacheHit: Boolean? = null,
  numDmlAffectedRows: Long? = null,
  queryPlan: Iterable<io.vertx.bigquery.model.ExplainQueryStage>? = null,
  referencedTables: Iterable<io.vertx.bigquery.model.TableReference>? = null,
  schema: io.vertx.bigquery.model.TableSchema? = null,
  statementType: String? = null,
  totalBytesBilled: Long? = null,
  totalBytesProcessed: Long? = null,
  undeclaredQueryParameters: Iterable<io.vertx.bigquery.model.QueryParameter>? = null): JobStatistics2 = io.vertx.bigquery.model.JobStatistics2(io.vertx.core.json.JsonObject()).apply {

  if (billingTier != null) {
    this.setBillingTier(billingTier)
  }
  if (cacheHit != null) {
    this.setCacheHit(cacheHit)
  }
  if (numDmlAffectedRows != null) {
    this.setNumDmlAffectedRows(numDmlAffectedRows)
  }
  if (queryPlan != null) {
    this.setQueryPlan(queryPlan.toList())
  }
  if (referencedTables != null) {
    this.setReferencedTables(referencedTables.toList())
  }
  if (schema != null) {
    this.setSchema(schema)
  }
  if (statementType != null) {
    this.setStatementType(statementType)
  }
  if (totalBytesBilled != null) {
    this.setTotalBytesBilled(totalBytesBilled)
  }
  if (totalBytesProcessed != null) {
    this.setTotalBytesProcessed(totalBytesProcessed)
  }
  if (undeclaredQueryParameters != null) {
    this.setUndeclaredQueryParameters(undeclaredQueryParameters.toList())
  }
}

