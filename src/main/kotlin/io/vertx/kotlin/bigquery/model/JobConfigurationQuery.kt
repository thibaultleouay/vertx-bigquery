package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobConfigurationQuery
import io.vertx.bigquery.model.DatasetReference
import io.vertx.bigquery.model.ExternalDataConfiguration
import io.vertx.bigquery.model.QueryParameter
import io.vertx.bigquery.model.TableReference
import io.vertx.bigquery.model.TimePartitioning
import io.vertx.bigquery.model.UserDefinedFunctionResource

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobConfigurationQuery] objects.
 *
 * Model definition for JobConfigurationQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param allowLargeResults  [Optional] If true and query uses legacy SQL dialect, allows the query to produce arbitrarily large result tables at a slight cost in performance. Requires destinationTable to be set. For standard SQL queries, this flag is ignored and large results are always allowed. However, you must still set destinationTable when result size exceeds the allowed maximum response size.
 * @param createDisposition  [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
 * @param defaultDataset  [Optional] Specifies the default dataset to use for unqualified table names in the query.
 * @param destinationTable  [Optional] Describes the table where the query results should be stored. If not present, a new table will be created to store the results. This property must be set for large results that exceed the maximum response size.
 * @param flattenResults  [Optional] If true and query uses legacy SQL dialect, flattens all nested and repeated fields in the query results. allowLargeResults must be true if this is set to false. For standard SQL queries, this flag is ignored and results are never flattened.
 * @param maximumBillingTier  [Optional] Limits the billing tier for this job. Queries that have resource usage beyond this tier will fail (without incurring a charge). If unspecified, this will be set to your project default.
 * @param maximumBytesBilled  [Optional] Limits the bytes billed for this job. Queries that will have bytes billed beyond this limit will fail (without incurring a charge). If unspecified, this will be set to your project default.
 * @param parameterMode  Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query.
 * @param preserveNulls  [Deprecated] This property is deprecated.
 * @param priority  [Optional] Specifies a priority for the query. Possible values include INTERACTIVE and BATCH. The default value is INTERACTIVE.
 * @param query  [Required] SQL query text to execute. The useLegacySql field can be used to indicate whether the query uses legacy SQL or standard SQL.
 * @param queryParameters  Query parameters for standard SQL queries.
 * @param schemaUpdateOptions  [Experimental] Allows the schema of the destination table to be updated as a side effect of the query job. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
 * @param tableDefinitions  [Optional] If querying an external data source outside of BigQuery, describes the data format, location and other properties of the data source. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
 * @param timePartitioning  [Experimental] If specified, configures time-based partitioning for the destination table.
 * @param useLegacySql  Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be run as if flattenResults is false.
 * @param useQueryCache  [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query are modified. Moreover, the query cache is only available when a query does not have a destination table specified. The default value is true.
 * @param userDefinedFunctionResources  Describes user-defined function resources used in the query.
 * @param writeDisposition  [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobConfigurationQuery original] using Vert.x codegen.
 */
fun JobConfigurationQuery(
  allowLargeResults: Boolean? = null,
  createDisposition: String? = null,
  defaultDataset: io.vertx.bigquery.model.DatasetReference? = null,
  destinationTable: io.vertx.bigquery.model.TableReference? = null,
  flattenResults: Boolean? = null,
  maximumBillingTier: Int? = null,
  maximumBytesBilled: Long? = null,
  parameterMode: String? = null,
  preserveNulls: Boolean? = null,
  priority: String? = null,
  query: String? = null,
  queryParameters: Iterable<io.vertx.bigquery.model.QueryParameter>? = null,
  schemaUpdateOptions: Iterable<String>? = null,
  tableDefinitions: Map<String, io.vertx.bigquery.model.ExternalDataConfiguration>? = null,
  timePartitioning: io.vertx.bigquery.model.TimePartitioning? = null,
  useLegacySql: Boolean? = null,
  useQueryCache: Boolean? = null,
  userDefinedFunctionResources: Iterable<io.vertx.bigquery.model.UserDefinedFunctionResource>? = null,
  writeDisposition: String? = null): JobConfigurationQuery = io.vertx.bigquery.model.JobConfigurationQuery(io.vertx.core.json.JsonObject()).apply {

  if (allowLargeResults != null) {
    this.setAllowLargeResults(allowLargeResults)
  }
  if (createDisposition != null) {
    this.setCreateDisposition(createDisposition)
  }
  if (defaultDataset != null) {
    this.setDefaultDataset(defaultDataset)
  }
  if (destinationTable != null) {
    this.setDestinationTable(destinationTable)
  }
  if (flattenResults != null) {
    this.setFlattenResults(flattenResults)
  }
  if (maximumBillingTier != null) {
    this.setMaximumBillingTier(maximumBillingTier)
  }
  if (maximumBytesBilled != null) {
    this.setMaximumBytesBilled(maximumBytesBilled)
  }
  if (parameterMode != null) {
    this.setParameterMode(parameterMode)
  }
  if (preserveNulls != null) {
    this.setPreserveNulls(preserveNulls)
  }
  if (priority != null) {
    this.setPriority(priority)
  }
  if (query != null) {
    this.setQuery(query)
  }
  if (queryParameters != null) {
    this.setQueryParameters(queryParameters.toList())
  }
  if (schemaUpdateOptions != null) {
    this.setSchemaUpdateOptions(schemaUpdateOptions.toList())
  }
  if (tableDefinitions != null) {
    this.setTableDefinitions(tableDefinitions)
  }
  if (timePartitioning != null) {
    this.setTimePartitioning(timePartitioning)
  }
  if (useLegacySql != null) {
    this.setUseLegacySql(useLegacySql)
  }
  if (useQueryCache != null) {
    this.setUseQueryCache(useQueryCache)
  }
  if (userDefinedFunctionResources != null) {
    this.setUserDefinedFunctionResources(userDefinedFunctionResources.toList())
  }
  if (writeDisposition != null) {
    this.setWriteDisposition(writeDisposition)
  }
}

