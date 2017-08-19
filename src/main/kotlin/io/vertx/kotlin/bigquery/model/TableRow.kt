package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.TableRow
import io.vertx.bigquery.model.TableCell

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.TableRow] objects.
 *
 * Model definition for TableRow.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param f  Represents a single row in the result set, consisting of one or more fields.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.TableRow original] using Vert.x codegen.
 */
fun TableRow(
  f: Iterable<io.vertx.bigquery.model.TableCell>? = null): TableRow = io.vertx.bigquery.model.TableRow(io.vertx.core.json.JsonObject()).apply {

  if (f != null) {
    this.setF(f.toList())
  }
}

