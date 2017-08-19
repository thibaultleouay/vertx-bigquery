package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TableFieldSchema

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TableFieldSchema] objects.
 *
 * Model definition for TableFieldSchema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param description  [Optional] The field description. The maximum length is 1,024 characters.
 * @param fields  [Optional] Describes the nested schema fields if the type property is set to RECORD.
 * @param mode  [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE.
 * @param name  [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 128 characters.
 * @param type  [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TableFieldSchema original] using Vert.x codegen.
 */
fun TableFieldSchema(
  description: String? = null,
  fields: Iterable<io.vertx.bigquery.model.TableFieldSchema>? = null,
  mode: String? = null,
  name: String? = null,
  type: String? = null): TableFieldSchema = io.vertx.bigquery.model.TableFieldSchema(io.vertx.core.json.JsonObject()).apply {

  if (description != null) {
    this.setDescription(description)
  }
  if (fields != null) {
    this.setFields(fields.toList())
  }
  if (mode != null) {
    this.setMode(mode)
  }
  if (name != null) {
    this.setName(name)
  }
  if (type != null) {
    this.setType(type)
  }
}

