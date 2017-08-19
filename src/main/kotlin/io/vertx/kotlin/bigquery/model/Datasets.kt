package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Datasets
import io.vertx.bigquery.model.DatasetReference

fun Datasets(
  datasetReference: io.vertx.bigquery.model.DatasetReference? = null,
  friendlyName: String? = null,
  id: String? = null,
  kind: String? = null,
  labels: Map<String, String>? = null): Datasets = io.vertx.bigquery.model.Datasets(io.vertx.core.json.JsonObject()).apply {

  if (datasetReference != null) {
    this.setDatasetReference(datasetReference)
  }
  if (friendlyName != null) {
    this.setFriendlyName(friendlyName)
  }
  if (id != null) {
    this.setId(id)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (labels != null) {
    this.setLabels(labels)
  }
}

