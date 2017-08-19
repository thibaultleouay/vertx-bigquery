package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.GoogleSheetsOptions

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.GoogleSheetsOptions] objects.
 *
 * Model definition for GoogleSheetsOptions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param skipLeadingRows  [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows that should be skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract column names for the detected schema.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.GoogleSheetsOptions original] using Vert.x codegen.
 */
fun GoogleSheetsOptions(
  skipLeadingRows: Long? = null): GoogleSheetsOptions = io.vertx.bigquery.model.GoogleSheetsOptions(io.vertx.core.json.JsonObject()).apply {

  if (skipLeadingRows != null) {
    this.setSkipLeadingRows(skipLeadingRows)
  }
}

