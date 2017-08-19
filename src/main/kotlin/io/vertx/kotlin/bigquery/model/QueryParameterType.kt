package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.QueryParameterType
import io.vertx.bigquery.model.StructTypes

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.QueryParameterType] objects.
 *
 * Model definition for QueryParameterType.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param arrayType  [Optional] The type of the array's elements, if this is an array.
 * @param structTypes  [Optional] The types of the fields of this struct, in order, if this is a struct.
 * @param type  [Required] The top level type of this field.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.QueryParameterType original] using Vert.x codegen.
 */
fun QueryParameterType(
  arrayType: io.vertx.bigquery.model.QueryParameterType? = null,
  structTypes: Iterable<io.vertx.bigquery.model.StructTypes>? = null,
  type: String? = null): QueryParameterType = io.vertx.bigquery.model.QueryParameterType(io.vertx.core.json.JsonObject()).apply {

  if (arrayType != null) {
    this.setArrayType(arrayType)
  }
  if (structTypes != null) {
    this.setStructTypes(structTypes.toList())
  }
  if (type != null) {
    this.setType(type)
  }
}

