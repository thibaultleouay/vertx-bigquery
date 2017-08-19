package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Jobs
import io.vertx.bigquery.model.ErrorProto
import io.vertx.bigquery.model.JobConfiguration
import io.vertx.bigquery.model.JobReference
import io.vertx.bigquery.model.JobStatistics
import io.vertx.bigquery.model.JobStatus

fun Jobs(
  configuration: io.vertx.bigquery.model.JobConfiguration? = null,
  errorResult: io.vertx.bigquery.model.ErrorProto? = null,
  id: String? = null,
  jobReference: io.vertx.bigquery.model.JobReference? = null,
  kind: String? = null,
  state: String? = null,
  statistics: io.vertx.bigquery.model.JobStatistics? = null,
  status: io.vertx.bigquery.model.JobStatus? = null,
  userEmail: String? = null): Jobs = io.vertx.bigquery.model.Jobs(io.vertx.core.json.JsonObject()).apply {

  if (configuration != null) {
    this.setConfiguration(configuration)
  }
  if (errorResult != null) {
    this.setErrorResult(errorResult)
  }
  if (id != null) {
    this.setId(id)
  }
  if (jobReference != null) {
    this.setJobReference(jobReference)
  }
  if (kind != null) {
    this.setKind(kind)
  }
  if (state != null) {
    this.setState(state)
  }
  if (statistics != null) {
    this.setStatistics(statistics)
  }
  if (status != null) {
    this.setStatus(status)
  }
  if (userEmail != null) {
    this.setUserEmail(userEmail)
  }
}

