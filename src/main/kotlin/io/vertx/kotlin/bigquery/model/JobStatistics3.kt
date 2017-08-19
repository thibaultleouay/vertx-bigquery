package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobStatistics3

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobStatistics3] objects.
 *
 * Model definition for JobStatistics3.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param badRecords  [Output-only] The number of bad records encountered. Note that if the job has failed because of more bad records encountered than the maximum allowed in the load job configuration, then this number can be less than the total number of bad records present in the input data.
 * @param inputFileBytes  [Output-only] Number of bytes of source data in a load job.
 * @param inputFiles  [Output-only] Number of source files in a load job.
 * @param outputBytes  [Output-only] Size of the loaded data in bytes. Note that while a load job is in the running state, this value may change.
 * @param outputRows  [Output-only] Number of rows imported in a load job. Note that while an import job is in the running state, this value may change.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobStatistics3 original] using Vert.x codegen.
 */
fun JobStatistics3(
  badRecords: Long? = null,
  inputFileBytes: Long? = null,
  inputFiles: Long? = null,
  outputBytes: Long? = null,
  outputRows: Long? = null): JobStatistics3 = io.vertx.bigquery.model.JobStatistics3(io.vertx.core.json.JsonObject()).apply {

  if (badRecords != null) {
    this.setBadRecords(badRecords)
  }
  if (inputFileBytes != null) {
    this.setInputFileBytes(inputFileBytes)
  }
  if (inputFiles != null) {
    this.setInputFiles(inputFiles)
  }
  if (outputBytes != null) {
    this.setOutputBytes(outputBytes)
  }
  if (outputRows != null) {
    this.setOutputRows(outputRows)
  }
}

