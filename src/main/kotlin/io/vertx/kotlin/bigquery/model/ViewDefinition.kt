package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.ViewDefinition
import io.vertx.bigquery.model.UserDefinedFunctionResource

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.ViewDefinition] objects.
 *
 * Model definition for ViewDefinition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param query  [Required] A query that BigQuery executes when the view is referenced.
 * @param useLegacySql  Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql- reference/ Queries and views that reference this view must use the same flag value.
 * @param userDefinedFunctionResources  Describes user-defined function resources used in the query.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.ViewDefinition original] using Vert.x codegen.
 */
fun ViewDefinition(
  query: String? = null,
  useLegacySql: Boolean? = null,
  userDefinedFunctionResources: Iterable<io.vertx.bigquery.model.UserDefinedFunctionResource>? = null): ViewDefinition = io.vertx.bigquery.model.ViewDefinition(io.vertx.core.json.JsonObject()).apply {

  if (query != null) {
    this.setQuery(query)
  }
  if (useLegacySql != null) {
    this.setUseLegacySql(useLegacySql)
  }
  if (userDefinedFunctionResources != null) {
    this.setUserDefinedFunctionResources(userDefinedFunctionResources.toList())
  }
}

