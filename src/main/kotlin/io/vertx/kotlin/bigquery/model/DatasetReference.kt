package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.DatasetReference

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.DatasetReference] objects.
 *
 * Model definition for DatasetReference.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param datasetId  [Required] A unique ID for this dataset, without the project name. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
 * @param projectId  [Optional] The ID of the project containing this dataset.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.DatasetReference original] using Vert.x codegen.
 */
fun DatasetReference(
  datasetId: String? = null,
  projectId: String? = null): DatasetReference = io.vertx.bigquery.model.DatasetReference(io.vertx.core.json.JsonObject()).apply {

  if (datasetId != null) {
    this.setDatasetId(datasetId)
  }
  if (projectId != null) {
    this.setProjectId(projectId)
  }
}

