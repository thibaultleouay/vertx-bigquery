package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.UserDefinedFunctionResource

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.UserDefinedFunctionResource] objects.
 *
 * Model definition for UserDefinedFunctionResource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param inlineCode  [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
 * @param resourceUri  [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.UserDefinedFunctionResource original] using Vert.x codegen.
 */
fun UserDefinedFunctionResource(
  inlineCode: String? = null,
  resourceUri: String? = null): UserDefinedFunctionResource = io.vertx.bigquery.model.UserDefinedFunctionResource(io.vertx.core.json.JsonObject()).apply {

  if (inlineCode != null) {
    this.setInlineCode(inlineCode)
  }
  if (resourceUri != null) {
    this.setResourceUri(resourceUri)
  }
}

