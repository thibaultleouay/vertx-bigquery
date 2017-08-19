package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.QueryParameter
import io.vertx.bigquery.model.QueryParameterType
import io.vertx.bigquery.model.QueryParameterValue

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.QueryParameter] objects.
 *
 * Model definition for QueryParameter.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param name  [Optional] If unset, this is a positional parameter. Otherwise, should be unique within a query.
 * @param parameterType  [Required] The type of this parameter.
 * @param parameterValue  [Required] The value of this parameter.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.QueryParameter original] using Vert.x codegen.
 */
fun QueryParameter(
  name: String? = null,
  parameterType: io.vertx.bigquery.model.QueryParameterType? = null,
  parameterValue: io.vertx.bigquery.model.QueryParameterValue? = null): QueryParameter = io.vertx.bigquery.model.QueryParameter(io.vertx.core.json.JsonObject()).apply {

  if (name != null) {
    this.setName(name)
  }
  if (parameterType != null) {
    this.setParameterType(parameterType)
  }
  if (parameterValue != null) {
    this.setParameterValue(parameterValue)
  }
}

