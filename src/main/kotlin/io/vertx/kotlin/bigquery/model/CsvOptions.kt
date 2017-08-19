package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.CsvOptions

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.CsvOptions] objects.
 *
 * Model definition for CsvOptions.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param allowJaggedRows  [Optional] Indicates if BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as null values. If false, records with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.
 * @param allowQuotedNewlines  [Optional] Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false.
 * @param encoding  [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has been split using the values of the quote and fieldDelimiter properties.
 * @param fieldDelimiter  [Optional] The separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
 * @param quote  [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
 * @param skipLeadingRows  [Optional] The number of rows at the top of a CSV file that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows in the file that should be skipped.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.CsvOptions original] using Vert.x codegen.
 */
fun CsvOptions(
  allowJaggedRows: Boolean? = null,
  allowQuotedNewlines: Boolean? = null,
  encoding: String? = null,
  fieldDelimiter: String? = null,
  quote: String? = null,
  skipLeadingRows: Long? = null): CsvOptions = io.vertx.bigquery.model.CsvOptions(io.vertx.core.json.JsonObject()).apply {

  if (allowJaggedRows != null) {
    this.setAllowJaggedRows(allowJaggedRows)
  }
  if (allowQuotedNewlines != null) {
    this.setAllowQuotedNewlines(allowQuotedNewlines)
  }
  if (encoding != null) {
    this.setEncoding(encoding)
  }
  if (fieldDelimiter != null) {
    this.setFieldDelimiter(fieldDelimiter)
  }
  if (quote != null) {
    this.setQuote(quote)
  }
  if (skipLeadingRows != null) {
    this.setSkipLeadingRows(skipLeadingRows)
  }
}

