package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Tables
import io.vertx.bigquery.model.TableReference
import io.vertx.bigquery.model.TimePartitioning
import io.vertx.bigquery.model.View

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.Tables] objects.
 *
 * Model definition for TableListTables.
 *
 * @param friendlyName  The user-friendly name for this table.
 * @param id  An opaque ID of the table
 * @param kind  The resource type.
 * @param labels  [Experimental] The labels associated with this table. You can use these to organize and group your tables.
 * @param tableReference  A reference uniquely identifying the table.
 * @param timePartitioning  [Experimental] The time-based partitioning for this table.
 * @param type  The type of table. Possible values are: TABLE, VIEW.
 * @param view  Additional details for a view.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.Tables original] using Vert.x codegen.
 */
fun Tables(
  friendlyName: String? = null,
  id: String? = null,
  kind: String? = null,
  labels: Map<String, String>? = null,
  tableReference: io.vertx.bigquery.model.TableReference? = null,
  timePartitioning: io.vertx.bigquery.model.TimePartitioning? = null,
  type: String? = null,
  view: io.vertx.bigquery.model.View? = null): Tables = io.vertx.bigquery.model.Tables(io.vertx.core.json.JsonObject()).apply {

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
  if (tableReference != null) {
    this.setTableReference(tableReference)
  }
  if (timePartitioning != null) {
    this.setTimePartitioning(timePartitioning)
  }
  if (type != null) {
    this.setType(type)
  }
  if (view != null) {
    this.setView(view)
  }
}

