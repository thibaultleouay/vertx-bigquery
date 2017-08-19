package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.BigtableColumn

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.BigtableColumn] objects.
 *
 * Model definition for BigtableColumn.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param encoding  [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. 'encoding' can also be set at the column family level. However, the setting at this level takes precedence if 'encoding' is set at both levels.
 * @param fieldName  [Optional] If the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as the column field name and is used as field name in queries.
 * @param onlyReadLatest  [Optional] If this is set, only the latest version of value in this column are exposed. 'onlyReadLatest' can also be set at the column family level. However, the setting at this level takes precedence if 'onlyReadLatest' is set at both levels.
 * @param qualifierEncoded  [Required] Qualifier of the column. Columns in the parent column family that has this exact qualifier are exposed as . field. If the qualifier is valid UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a base-64 encoded value must be set to qualifier_encoded. The column field name is the same as the column qualifier. However, if the qualifier is not a valid BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as field_name.
 * @param qualifierString 
 * @param type  [Optional] The type to convert the value in cells of this column. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also be set at the column family level. However, the setting at this level takes precedence if 'type' is set at both levels.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.BigtableColumn original] using Vert.x codegen.
 */
fun BigtableColumn(
  encoding: String? = null,
  fieldName: String? = null,
  onlyReadLatest: Boolean? = null,
  qualifierEncoded: String? = null,
  qualifierString: String? = null,
  type: String? = null): BigtableColumn = io.vertx.bigquery.model.BigtableColumn(io.vertx.core.json.JsonObject()).apply {

  if (encoding != null) {
    this.setEncoding(encoding)
  }
  if (fieldName != null) {
    this.setFieldName(fieldName)
  }
  if (onlyReadLatest != null) {
    this.setOnlyReadLatest(onlyReadLatest)
  }
  if (qualifierEncoded != null) {
    this.setQualifierEncoded(qualifierEncoded)
  }
  if (qualifierString != null) {
    this.setQualifierString(qualifierString)
  }
  if (type != null) {
    this.setType(type)
  }
}

