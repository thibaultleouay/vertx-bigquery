package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TableReference

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TableReference] objects.
 *
 * Model definition for TableReference.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param datasetId  [Required] The ID of the dataset containing this table.
 * @param projectId  [Required] The ID of the project containing this table.
 * @param tableId  [Required] The ID of the table. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TableReference original] using Vert.x codegen.
 */
fun TableReference(
  datasetId: String? = null,
  projectId: String? = null,
  tableId: String? = null): TableReference = io.vertx.bigquery.model.TableReference(io.vertx.core.json.JsonObject()).apply {

  if (datasetId != null) {
    this.setDatasetId(datasetId)
  }
  if (projectId != null) {
    this.setProjectId(projectId)
  }
  if (tableId != null) {
    this.setTableId(tableId)
  }
}

