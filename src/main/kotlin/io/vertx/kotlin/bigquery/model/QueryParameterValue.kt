package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.QueryParameterValue

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.QueryParameterValue] objects.
 *
 * Model definition for QueryParameterValue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param arrayValues  [Optional] The array values, if this is an array type.
 * @param structValues  [Optional] The struct field values, in order of the struct type's declaration.
 * @param value  [Optional] The value of this value, if a simple scalar type.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.QueryParameterValue original] using Vert.x codegen.
 */
fun QueryParameterValue(
  arrayValues: Iterable<io.vertx.bigquery.model.QueryParameterValue>? = null,
  structValues: Map<String, io.vertx.bigquery.model.QueryParameterValue>? = null,
  value: String? = null): QueryParameterValue = io.vertx.bigquery.model.QueryParameterValue(io.vertx.core.json.JsonObject()).apply {

  if (arrayValues != null) {
    this.setArrayValues(arrayValues.toList())
  }
  if (structValues != null) {
    this.setStructValues(structValues)
  }
  if (value != null) {
    this.setValue(value)
  }
}

