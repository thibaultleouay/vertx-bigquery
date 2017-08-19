package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TableSchema
import io.vertx.bigquery.model.TableFieldSchema

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TableSchema] objects.
 *
 * Model definition for TableSchema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param fields  Describes the fields in a table.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TableSchema original] using Vert.x codegen.
 */
fun TableSchema(
  fields: Iterable<io.vertx.bigquery.model.TableFieldSchema>? = null): TableSchema = io.vertx.bigquery.model.TableSchema(io.vertx.core.json.JsonObject()).apply {

  if (fields != null) {
    this.setFields(fields.toList())
  }
}

