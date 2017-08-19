package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.QueryRequest
import io.vertx.bigquery.model.DatasetReference
import io.vertx.bigquery.model.QueryParameter

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.QueryRequest] objects.
 *
 * Model definition for QueryRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param defaultDataset  [Optional] Specifies the default datasetId and projectId to assume for any unqualified table names in the query. If not set, all table names in the query string must be qualified in the format 'datasetId.tableId'.
 * @param dryRun  [Optional] If set to true, BigQuery doesn't run the job. Instead, if the query is valid, BigQuery returns statistics about the job such as how many bytes would be processed. If the query is invalid, an error returns. The default value is false.
 * @param kind  The resource type of the request.
 * @param maxResults  [Optional] The maximum number of rows of data to return per page of results. Setting this flag to a small value such as 1000 and then paging through results might improve reliability when the query result set is large. In addition to this limit, responses are also limited to 10 MB. By default, there is no maximum row count, and only the byte limit applies.
 * @param parameterMode  Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
 * @param preserveNulls  [Deprecated] This property is deprecated.
 * @param query  [Required] A query string, following the BigQuery query syntax, of the query to execute. Example: "SELECT count(f1) FROM [myProjectId:myDatasetId.myTableId]".
 * @param queryParameters  Query parameters for Standard SQL queries.
 * @param timeoutMs  [Optional] How long to wait for the query to complete, in milliseconds, before the request times out and returns. Note that this is only a timeout for the request, not the query. If the query takes longer to run than the timeout value, the call returns without any results and with the 'jobComplete' flag set to false. You can call GetQueryResults() to wait for the query to complete and read the results. The default value is 10000 milliseconds (10 seconds).
 * @param useLegacySql  Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
 * @param useQueryCache  [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. The default value is true.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.QueryRequest original] using Vert.x codegen.
 */
fun QueryRequest(
  defaultDataset: io.vertx.bigquery.model.DatasetReference? = null,
  dryRun: Boolean? = null,
  kind: String? = null,
  maxResults: Long? = null,
  parameterMode: String? = null,
  preserveNulls: Boolean? = null,
  query: String? = null,
  queryParameters: Iterable<io.vertx.bigquery.model.QueryParameter>? = null,
  timeoutMs: Long? = null,
  useLegacySql: Boolean? = null,
  useQueryCache: Boolean? = null): QueryRequest = io.vertx.bigquery.model.QueryRequest(io.vertx.core.json.JsonObject()).apply {

  if (defaultDataset != null) {
    this.setDefaultDataset(defaultDataset)
  }
  if (dryRun != null) {
    this.setDryRun(dryRun)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (maxResults != null) {
    this.setMaxResults(maxResults)
  }
  if (parameterMode != null) {
    this.setParameterMode(parameterMode)
  }
  if (preserveNulls != null) {
    this.setPreserveNulls(preserveNulls)
  }
  if (query != null) {
    this.setQuery(query)
  }
  if (queryParameters != null) {
    this.setQueryParameters(queryParameters.toList())
  }
  if (timeoutMs != null) {
    this.setTimeoutMs(timeoutMs)
  }
  if (useLegacySql != null) {
    this.setUseLegacySql(useLegacySql)
  }
  if (useQueryCache != null) {
    this.setUseQueryCache(useQueryCache)
  }
}

