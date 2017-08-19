package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobConfigurationLoad
import io.vertx.bigquery.model.TableReference
import io.vertx.bigquery.model.TableSchema
import io.vertx.bigquery.model.TimePartitioning

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobConfigurationLoad] objects.
 *
 * Model definition for JobConfigurationLoad.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param allowJaggedRows  [Optional] Accept rows that are missing trailing optional columns. The missing values are treated as nulls. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. Only applicable to CSV, ignored for other formats.
 * @param allowQuotedNewlines  Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
 * @param autodetect  Indicates if we should automatically infer the options and schema for CSV and JSON sources.
 * @param createDisposition  [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
 * @param destinationTable  [Required] The destination table to load the data into.
 * @param encoding  [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
 * @param fieldDelimiter  [Optional] The separator for fields in a CSV file. The separator can be any ISO-8859-1 single- byte character. To use a character in the range 128-255, you must encode the character as UTF8. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
 * @param ignoreUnknownValues  [Optional] Indicates if BigQuery should allow extra values that are not represented in the table schema. If true, the extra values are ignored. If false, records with extra columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false. The sourceFormat property determines what BigQuery treats as an extra value: CSV: Trailing columns JSON: Named values that don't match any column names
 * @param maxBadRecords  [Optional] The maximum number of bad records that BigQuery can ignore when running the job. If the number of bad records exceeds this value, an invalid error is returned in the job result. The default value is 0, which requires that all records are valid.
 * @param nullMarker  [Optional] Specifies a string that represents a null value in a CSV file. For example, if you specify "\N", BigQuery interprets "\N" as a null value when loading a CSV file. The default value is the empty string. If you set this property to a custom value, BigQuery throws an error if an empty string is present for all data types except for STRING and BYTE. For STRING and BYTE columns, BigQuery interprets the empty string as an empty value.
 * @param projectionFields  If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity properties to load into BigQuery from a Cloud Datastore backup. Property names are case sensitive and must be top-level properties. If no properties are specified, BigQuery loads all properties. If any named property isn't found in the Cloud Datastore backup, an invalid error is returned in the job result.
 * @param quote  [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
 * @param schema  [Optional] The schema for the destination table. The schema can be omitted if the destination table already exists, or if you're loading data from Google Cloud Datastore.
 * @param schemaInline  [Deprecated] The inline schema. For CSV schemas, specify as "Field1:Type1[,Field2:Type2]*". For example, "foo:STRING, bar:INTEGER, baz:FLOAT".
 * @param schemaInlineFormat  [Deprecated] The format of the schemaInline property.
 * @param schemaUpdateOptions  [Experimental] Allows the schema of the desitination table to be updated as a side effect of the load job if a schema is autodetected or supplied in the job configuration. Schema update options are supported in two cases: when writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and the destination table is a partition of a table, specified by partition decorators. For normal tables, WRITE_TRUNCATE will always overwrite the schema. One or more of the following values are specified: ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema. ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original schema to nullable.
 * @param skipLeadingRows  [Optional] The number of rows at the top of a CSV file that BigQuery will skip when loading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped.
 * @param sourceFormat  [Optional] The format of the data files. For CSV files, specify "CSV". For datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON, specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". The default value is CSV.
 * @param sourceUris  [Required] The fully-qualified URIs that point to your data in Google Cloud. For Google Cloud Storage URIs: Each URI can contain one '*' wildcard character and it must come after the 'bucket' name. Size limits related to load jobs apply to external data sources. For Google Cloud Bigtable URIs: Exactly one URI can be specified and it has be a fully specified and valid HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore backups: Exactly one URI can be specified. Also, the '*' wildcard character is not allowed.
 * @param timePartitioning  [Experimental] If specified, configures time-based partitioning for the destination table.
 * @param writeDisposition  [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_APPEND. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobConfigurationLoad original] using Vert.x codegen.
 */
fun JobConfigurationLoad(
  allowJaggedRows: Boolean? = null,
  allowQuotedNewlines: Boolean? = null,
  autodetect: Boolean? = null,
  createDisposition: String? = null,
  destinationTable: io.vertx.bigquery.model.TableReference? = null,
  encoding: String? = null,
  fieldDelimiter: String? = null,
  ignoreUnknownValues: Boolean? = null,
  maxBadRecords: Int? = null,
  nullMarker: String? = null,
  projectionFields: Iterable<String>? = null,
  quote: String? = null,
  schema: io.vertx.bigquery.model.TableSchema? = null,
  schemaInline: String? = null,
  schemaInlineFormat: String? = null,
  schemaUpdateOptions: Iterable<String>? = null,
  skipLeadingRows: Int? = null,
  sourceFormat: String? = null,
  sourceUris: Iterable<String>? = null,
  timePartitioning: io.vertx.bigquery.model.TimePartitioning? = null,
  writeDisposition: String? = null): JobConfigurationLoad = io.vertx.bigquery.model.JobConfigurationLoad(io.vertx.core.json.JsonObject()).apply {

  if (allowJaggedRows != null) {
    this.setAllowJaggedRows(allowJaggedRows)
  }
  if (allowQuotedNewlines != null) {
    this.setAllowQuotedNewlines(allowQuotedNewlines)
  }
  if (autodetect != null) {
    this.setAutodetect(autodetect)
  }
  if (createDisposition != null) {
    this.setCreateDisposition(createDisposition)
  }
  if (destinationTable != null) {
    this.setDestinationTable(destinationTable)
  }
  if (encoding != null) {
    this.setEncoding(encoding)
  }
  if (fieldDelimiter != null) {
    this.setFieldDelimiter(fieldDelimiter)
  }
  if (ignoreUnknownValues != null) {
    this.setIgnoreUnknownValues(ignoreUnknownValues)
  }
  if (maxBadRecords != null) {
    this.setMaxBadRecords(maxBadRecords)
  }
  if (nullMarker != null) {
    this.setNullMarker(nullMarker)
  }
  if (projectionFields != null) {
    this.setProjectionFields(projectionFields.toList())
  }
  if (quote != null) {
    this.setQuote(quote)
  }
  if (schema != null) {
    this.setSchema(schema)
  }
  if (schemaInline != null) {
    this.setSchemaInline(schemaInline)
  }
  if (schemaInlineFormat != null) {
    this.setSchemaInlineFormat(schemaInlineFormat)
  }
  if (schemaUpdateOptions != null) {
    this.setSchemaUpdateOptions(schemaUpdateOptions.toList())
  }
  if (skipLeadingRows != null) {
    this.setSkipLeadingRows(skipLeadingRows)
  }
  if (sourceFormat != null) {
    this.setSourceFormat(sourceFormat)
  }
  if (sourceUris != null) {
    this.setSourceUris(sourceUris.toList())
  }
  if (timePartitioning != null) {
    this.setTimePartitioning(timePartitioning)
  }
  if (writeDisposition != null) {
    this.setWriteDisposition(writeDisposition)
  }
}

