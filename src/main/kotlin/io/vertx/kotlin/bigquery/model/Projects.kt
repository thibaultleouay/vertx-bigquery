package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Projects
import io.vertx.bigquery.model.ProjectReference

fun Projects(
  friendlyName: String? = null,
  id: String? = null,
  kind: String? = null,
  projectReference: io.vertx.bigquery.model.ProjectReference? = null): Projects = io.vertx.bigquery.model.Projects(io.vertx.core.json.JsonObject()).apply {

  if (friendlyName != null) {
    this.setFriendlyName(friendlyName)
  }
  if (id != null) {
    this.setId(id)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (projectReference != null) {
    this.setProjectReference(projectReference)
  }
}

