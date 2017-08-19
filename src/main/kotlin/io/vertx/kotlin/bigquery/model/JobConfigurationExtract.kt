package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobConfigurationExtract
import io.vertx.bigquery.model.TableReference

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobConfigurationExtract] objects.
 *
 * Model definition for JobConfigurationExtract.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param compression  [Optional] The compression type to use for exported files. Possible values include GZIP and NONE. The default value is NONE.
 * @param destinationFormat  [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO. The default value is CSV. Tables with nested or repeated fields cannot be exported as CSV.
 * @param destinationUri  [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
 * @param destinationUris  [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
 * @param fieldDelimiter  [Optional] Delimiter to use between fields in the exported data. Default is ','
 * @param printHeader  [Optional] Whether to print out a header row in the results. Default is true.
 * @param sourceTable  [Required] A reference to the table being exported.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobConfigurationExtract original] using Vert.x codegen.
 */
fun JobConfigurationExtract(
  compression: String? = null,
  destinationFormat: String? = null,
  destinationUri: String? = null,
  destinationUris: Iterable<String>? = null,
  fieldDelimiter: String? = null,
  printHeader: Boolean? = null,
  sourceTable: io.vertx.bigquery.model.TableReference? = null): JobConfigurationExtract = io.vertx.bigquery.model.JobConfigurationExtract(io.vertx.core.json.JsonObject()).apply {

  if (compression != null) {
    this.setCompression(compression)
  }
  if (destinationFormat != null) {
    this.setDestinationFormat(destinationFormat)
  }
  if (destinationUri != null) {
    this.setDestinationUri(destinationUri)
  }
  if (destinationUris != null) {
    this.setDestinationUris(destinationUris.toList())
  }
  if (fieldDelimiter != null) {
    this.setFieldDelimiter(fieldDelimiter)
  }
  if (printHeader != null) {
    this.setPrintHeader(printHeader)
  }
  if (sourceTable != null) {
    this.setSourceTable(sourceTable)
  }
}

