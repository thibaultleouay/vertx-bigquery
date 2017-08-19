package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.ExplainQueryStep

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.ExplainQueryStep] objects.
 *
 * Model definition for ExplainQueryStep.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param kind  Machine-readable operation type.
 * @param substeps  Human-readable stage descriptions.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.ExplainQueryStep original] using Vert.x codegen.
 */
fun ExplainQueryStep(
  kind: String? = null,
  substeps: Iterable<String>? = null): ExplainQueryStep = io.vertx.bigquery.model.ExplainQueryStep(io.vertx.core.json.JsonObject()).apply {

  if (kind != null) {
    this.setKind(kind)
  }
  if (substeps != null) {
    this.setSubsteps(substeps.toList())
  }
}

