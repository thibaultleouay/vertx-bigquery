package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.BigtableColumnFamily
import io.vertx.bigquery.model.BigtableColumn

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.BigtableColumnFamily] objects.
 *
 * Model definition for BigtableColumnFamily.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param columns  [Optional] Lists of columns that should be exposed as individual fields as opposed to a list of (column name, value) pairs. All columns whose qualifier matches a qualifier in this list can be accessed as .. Other columns can be accessed as a list through .Column field.
 * @param encoding  [Optional] The encoding of the values when the type is not STRING. Acceptable encoding values are: TEXT - indicates values are alphanumeric text strings. BINARY - indicates values are encoded using HBase Bytes.toBytes family of functions. This can be overridden for a specific column by listing that column in 'columns' and specifying an encoding for it.
 * @param familyId  Identifier of the column family.
 * @param onlyReadLatest  [Optional] If this is set only the latest version of value are exposed for all columns in this column family. This can be overridden for a specific column by listing that column in 'columns' and specifying a different setting for that column.
 * @param type  [Optional] The type to convert the value in cells of this column family. The values are expected to be encoded using HBase Bytes.toBytes function when using the BINARY encoding value. Following BigQuery types are allowed (case-sensitive) - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. This can be overridden for a specific column by listing that column in 'columns' and specifying a type for it.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.BigtableColumnFamily original] using Vert.x codegen.
 */
fun BigtableColumnFamily(
  columns: Iterable<io.vertx.bigquery.model.BigtableColumn>? = null,
  encoding: String? = null,
  familyId: String? = null,
  onlyReadLatest: Boolean? = null,
  type: String? = null): BigtableColumnFamily = io.vertx.bigquery.model.BigtableColumnFamily(io.vertx.core.json.JsonObject()).apply {

  if (columns != null) {
    this.setColumns(columns.toList())
  }
  if (encoding != null) {
    this.setEncoding(encoding)
  }
  if (familyId != null) {
    this.setFamilyId(familyId)
  }
  if (onlyReadLatest != null) {
    this.setOnlyReadLatest(onlyReadLatest)
  }
  if (type != null) {
    this.setType(type)
  }
}

