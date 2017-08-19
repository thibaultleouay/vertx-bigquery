package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.ErrorProto

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.ErrorProto] objects.
 *
 * Model definition for ErrorProto.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param debugInfo  Debugging information. This property is internal to Google and should not be used.
 * @param location  Specifies where the error occurred, if present.
 * @param message  A human-readable description of the error.
 * @param reason  A short error code that summarizes the error.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.ErrorProto original] using Vert.x codegen.
 */
fun ErrorProto(
  debugInfo: String? = null,
  location: String? = null,
  message: String? = null,
  reason: String? = null): ErrorProto = io.vertx.bigquery.model.ErrorProto(io.vertx.core.json.JsonObject()).apply {

  if (debugInfo != null) {
    this.setDebugInfo(debugInfo)
  }
  if (location != null) {
    this.setLocation(location)
  }
  if (message != null) {
    this.setMessage(message)
  }
  if (reason != null) {
    this.setReason(reason)
  }
}

