package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.ProjectReference

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.ProjectReference] objects.
 *
 * Model definition for ProjectReference.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param projectId  [Required] ID of the project. Can be either the numeric ID or the assigned ID of the project.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.ProjectReference original] using Vert.x codegen.
 */
fun ProjectReference(
  projectId: String? = null): ProjectReference = io.vertx.bigquery.model.ProjectReference(io.vertx.core.json.JsonObject()).apply {

  if (projectId != null) {
    this.setProjectId(projectId)
  }
}

