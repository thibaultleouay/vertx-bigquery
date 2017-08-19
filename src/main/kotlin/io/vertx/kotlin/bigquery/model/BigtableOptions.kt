package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.BigtableOptions
import io.vertx.bigquery.model.BigtableColumnFamily

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.BigtableOptions] objects.
 *
 * Model definition for BigtableOptions.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param columnFamilies  [Optional] List of column families to expose in the table schema along with their types. This list restricts the column families that can be referenced in queries and specifies their value types. You can use this list to do type conversions - see the 'type' field for more details. If you leave this list empty, all column families are present in the table schema and their values are read as BYTES. During a query only the column families referenced in that query are read from Bigtable.
 * @param ignoreUnspecifiedColumnFamilies  [Optional] If field is true, then the column families that are not specified in columnFamilies list are not exposed in the table schema. Otherwise, they are read with BYTES type values. The default value is false.
 * @param readRowkeyAsString  [Optional] If field is true, then the rowkey column families will be read and converted to string. Otherwise they are read with BYTES type values and users need to manually cast them with CAST if necessary. The default value is false.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.BigtableOptions original] using Vert.x codegen.
 */
fun BigtableOptions(
  columnFamilies: Iterable<io.vertx.bigquery.model.BigtableColumnFamily>? = null,
  ignoreUnspecifiedColumnFamilies: Boolean? = null,
  readRowkeyAsString: Boolean? = null): BigtableOptions = io.vertx.bigquery.model.BigtableOptions(io.vertx.core.json.JsonObject()).apply {

  if (columnFamilies != null) {
    this.setColumnFamilies(columnFamilies.toList())
  }
  if (ignoreUnspecifiedColumnFamilies != null) {
    this.setIgnoreUnspecifiedColumnFamilies(ignoreUnspecifiedColumnFamilies)
  }
  if (readRowkeyAsString != null) {
    this.setReadRowkeyAsString(readRowkeyAsString)
  }
}

