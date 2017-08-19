package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.View

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.View] objects.
 *
 * Additional details for a view.
 *
 * @param useLegacySql  True if view is defined in legacy SQL dialect, false if in standard SQL.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.View original] using Vert.x codegen.
 */
fun View(
  useLegacySql: Boolean? = null): View = io.vertx.bigquery.model.View(io.vertx.core.json.JsonObject()).apply {

  if (useLegacySql != null) {
    this.setUseLegacySql(useLegacySql)
  }
}

