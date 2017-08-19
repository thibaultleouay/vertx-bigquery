package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.ExternalDataConfiguration
import io.vertx.bigquery.model.BigtableOptions
import io.vertx.bigquery.model.CsvOptions
import io.vertx.bigquery.model.GoogleSheetsOptions
import io.vertx.bigquery.model.TableSchema

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.ExternalDataConfiguration] objects.
 *
 * Model definition for ExternalDataConfiguration.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param autodetect  Try to detect schema and format options automatically. Any option specified explicitly will be honored.
 * @param bigtableOptions  [Optional] Additional options if sourceFormat is set to BIGTABLE.
 * @param compression  [Optional] The compression type of the data source. Possible values include GZIP and NONE. The default value is NONE. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
 * @param csvOptions  Additional properties to set if sourceFormat is set to CSV.
 * @param googleSheetsOptions  [Optional] Additional options if sourceFormat is set to GOOGLE_SHEETS.
 * @param ignoreUnknownValues  [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names Google Cloud Bigtable: This setting is ignored. Google Cloud Datastore backups: This setting is ignored. Avro: This setting is ignored.
 * @param maxBadRecords  [Optional] The maximum number of bad records that BigQuery can ignore when reading data. If the number of bad records exceeds this value, an invalid error is returned in the job result. The default value is 0, which requires that all records are valid. This setting is ignored for Google Cloud Bigtable, Google Cloud Datastore backups and Avro formats.
 * @param schema  [Optional] The schema for the data. Schema is required for CSV and JSON formats. Schema is disallowed for Google Cloud Bigtable, Cloud Datastore backups, and Avro formats.
 * @param sourceFormat  [Required] The data format. For CSV files, specify "CSV". For Google sheets, specify "GOOGLE_SHEETS". For newline-delimited JSON, specify "NEWLINE_DELIMITED_JSON". For Avro files, specify "AVRO". For Google Cloud Datastore backups, specify "DATASTORE_BACKUP". [Beta] For Google Cloud Bigtable, specify "BIGTABLE".
 * @param sourceUris  [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups, exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.ExternalDataConfiguration original] using Vert.x codegen.
 */
fun ExternalDataConfiguration(
  autodetect: Boolean? = null,
  bigtableOptions: io.vertx.bigquery.model.BigtableOptions? = null,
  compression: String? = null,
  csvOptions: io.vertx.bigquery.model.CsvOptions? = null,
  googleSheetsOptions: io.vertx.bigquery.model.GoogleSheetsOptions? = null,
  ignoreUnknownValues: Boolean? = null,
  maxBadRecords: Int? = null,
  schema: io.vertx.bigquery.model.TableSchema? = null,
  sourceFormat: String? = null,
  sourceUris: Iterable<String>? = null): ExternalDataConfiguration = io.vertx.bigquery.model.ExternalDataConfiguration(io.vertx.core.json.JsonObject()).apply {

  if (autodetect != null) {
    this.setAutodetect(autodetect)
  }
  if (bigtableOptions != null) {
    this.setBigtableOptions(bigtableOptions)
  }
  if (compression != null) {
    this.setCompression(compression)
  }
  if (csvOptions != null) {
    this.setCsvOptions(csvOptions)
  }
  if (googleSheetsOptions != null) {
    this.setGoogleSheetsOptions(googleSheetsOptions)
  }
  if (ignoreUnknownValues != null) {
    this.setIgnoreUnknownValues(ignoreUnknownValues)
  }
  if (maxBadRecords != null) {
    this.setMaxBadRecords(maxBadRecords)
  }
  if (schema != null) {
    this.setSchema(schema)
  }
  if (sourceFormat != null) {
    this.setSourceFormat(sourceFormat)
  }
  if (sourceUris != null) {
    this.setSourceUris(sourceUris.toList())
  }
}

