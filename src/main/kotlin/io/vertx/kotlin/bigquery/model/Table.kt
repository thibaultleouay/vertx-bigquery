package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Table
import io.vertx.bigquery.model.ExternalDataConfiguration
import io.vertx.bigquery.model.Streamingbuffer
import io.vertx.bigquery.model.TableReference
import io.vertx.bigquery.model.TableSchema
import io.vertx.bigquery.model.TimePartitioning
import io.vertx.bigquery.model.ViewDefinition

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.Table] objects.
 *
 * Model definition for Table.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param creationTime  [Output-only] The time when this table was created, in milliseconds since the epoch.
 * @param description  [Optional] A user-friendly description of this table.
 * @param etag  [Output-only] A hash of this resource.
 * @param expirationTime  [Optional] The time when this table expires, in milliseconds since the epoch. If not present, the table will persist indefinitely. Expired tables will be deleted and their storage reclaimed.
 * @param externalDataConfiguration  [Optional] Describes the data format, location, and other properties of a table stored outside of BigQuery. By defining these properties, the data source can then be queried as if it were a standard BigQuery table.
 * @param friendlyName  [Optional] A descriptive name for this table.
 * @param id  [Output-only] An opaque ID uniquely identifying the table.
 * @param kind  [Output-only] The type of the resource.
 * @param labels  [Experimental] The labels associated with this table. You can use these to organize and group your tables. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list must have a different key.
 * @param location  [Output-only] The geographic location where the table resides. This value is inherited from the dataset.
 * @param numBytes  [Output-only] The size of this table in bytes, excluding any data in the streaming buffer.
 * @param numLongTermBytes  [Output-only] The number of bytes in the table that are considered "long-term storage".
 * @param schema  [Optional] Describes the schema of this table.
 * @param selfLink  [Output-only] A URL that can be used to access this resource again.
 * @param streamingBuffer  [Output-only] Contains information regarding this table's streaming buffer, if one is present. This field will be absent if the table is not being streamed to or if there is no data in the streaming buffer.
 * @param tableReference  [Required] Reference describing the ID of this table.
 * @param timePartitioning  [Experimental] If specified, configures time-based partitioning for this table.
 * @param type  [Output-only] Describes the table type. The following values are supported: TABLE: A normal BigQuery table. VIEW: A virtual table defined by a SQL query. EXTERNAL: A table that references data stored in an external storage system, such as Google Cloud Storage. The default value is TABLE.
 * @param view  [Optional] The view definition.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.Table original] using Vert.x codegen.
 */
fun Table(
  creationTime: Long? = null,
  description: String? = null,
  etag: String? = null,
  expirationTime: Long? = null,
  externalDataConfiguration: io.vertx.bigquery.model.ExternalDataConfiguration? = null,
  friendlyName: String? = null,
  id: String? = null,
  kind: String? = null,
  labels: Map<String, String>? = null,
  location: String? = null,
  numBytes: Long? = null,
  numLongTermBytes: Long? = null,
  schema: io.vertx.bigquery.model.TableSchema? = null,
  selfLink: String? = null,
  streamingBuffer: io.vertx.bigquery.model.Streamingbuffer? = null,
  tableReference: io.vertx.bigquery.model.TableReference? = null,
  timePartitioning: io.vertx.bigquery.model.TimePartitioning? = null,
  type: String? = null,
  view: io.vertx.bigquery.model.ViewDefinition? = null): Table = io.vertx.bigquery.model.Table(io.vertx.core.json.JsonObject()).apply {

  if (creationTime != null) {
    this.setCreationTime(creationTime)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (etag != null) {
    this.setEtag(etag)
  }
  if (expirationTime != null) {
    this.setExpirationTime(expirationTime)
  }
  if (externalDataConfiguration != null) {
    this.setExternalDataConfiguration(externalDataConfiguration)
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
  if (location != null) {
    this.setLocation(location)
  }
  if (numBytes != null) {
    this.setNumBytes(numBytes)
  }
  if (numLongTermBytes != null) {
    this.setNumLongTermBytes(numLongTermBytes)
  }
  if (schema != null) {
    this.setSchema(schema)
  }
  if (selfLink != null) {
    this.setSelfLink(selfLink)
  }
  if (streamingBuffer != null) {
    this.setStreamingBuffer(streamingBuffer)
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

