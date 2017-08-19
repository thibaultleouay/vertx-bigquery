package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobConfiguration
import io.vertx.bigquery.model.JobConfigurationExtract
import io.vertx.bigquery.model.JobConfigurationLoad
import io.vertx.bigquery.model.JobConfigurationQuery
import io.vertx.bigquery.model.JobConfigurationTableCopy

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobConfiguration] objects.
 *
 * Model definition for JobConfiguration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param copy  [Pick one] Copies a table.
 * @param dryRun  [Optional] If set, don't actually run this job. A valid query will return a mostly empty response with some processing statistics, while an invalid query will return the same error it would if it wasn't a dry run. Behavior of non-query jobs is undefined.
 * @param extract  [Pick one] Configures an extract job.
 * @param labels  [Experimental] The labels associated with this job. You can use these to organize and group your jobs. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
 * @param load  [Pick one] Configures a load job.
 * @param query  [Pick one] Configures a query job.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobConfiguration original] using Vert.x codegen.
 */
fun JobConfiguration(
  copy: io.vertx.bigquery.model.JobConfigurationTableCopy? = null,
  dryRun: Boolean? = null,
  extract: io.vertx.bigquery.model.JobConfigurationExtract? = null,
  labels: Map<String, String>? = null,
  load: io.vertx.bigquery.model.JobConfigurationLoad? = null,
  query: io.vertx.bigquery.model.JobConfigurationQuery? = null): JobConfiguration = io.vertx.bigquery.model.JobConfiguration(io.vertx.core.json.JsonObject()).apply {

  if (copy != null) {
    this.setCopy(copy)
  }
  if (dryRun != null) {
    this.setDryRun(dryRun)
  }
  if (extract != null) {
    this.setExtract(extract)
  }
  if (labels != null) {
    this.setLabels(labels)
  }
  if (load != null) {
    this.setLoad(load)
  }
  if (query != null) {
    this.setQuery(query)
  }
}

