package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.ProjectList
import io.vertx.bigquery.model.Projects

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.ProjectList] objects.
 *
 * Model definition for ProjectList.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param etag  A hash of the page of results
 * @param kind  The type of list.
 * @param nextPageToken  A token to request the next page of results.
 * @param projects  Projects to which you have at least READ access.
 * @param totalItems  The total number of projects in the list.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.ProjectList original] using Vert.x codegen.
 */
fun ProjectList(
  etag: String? = null,
  kind: String? = null,
  nextPageToken: String? = null,
  projects: Iterable<io.vertx.bigquery.model.Projects>? = null,
  totalItems: Int? = null): ProjectList = io.vertx.bigquery.model.ProjectList(io.vertx.core.json.JsonObject()).apply {

  if (etag != null) {
    this.setEtag(etag)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (nextPageToken != null) {
    this.setNextPageToken(nextPageToken)
  }
  if (projects != null) {
    this.setProjects(projects.toList())
  }
  if (totalItems != null) {
    this.setTotalItems(totalItems)
  }
}

