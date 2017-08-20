package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Dataset
import io.vertx.bigquery.model.Access
import io.vertx.bigquery.model.DatasetReference

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.Dataset] objects.
 *
 * Model definition for Dataset.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param access  [Optional] An array of objects that define dataset access for one or more entities. You can set this property when inserting or updating a dataset in order to control who is allowed to access the data. If unspecified at dataset creation time, BigQuery adds default dataset access for the following entities: access.specialGroup: projectReaders; access.role: READER; access.specialGroup: projectWriters; access.role: WRITER; access.specialGroup: projectOwners; access.role: OWNER; access.userByEmail: [dataset creator email]; access.role: OWNER;
 * @param creationTime  [Output-only] The time when this dataset was created, in milliseconds since the epoch.
 * @param datasetReference  [Required] A reference that identifies the dataset.
 * @param defaultTableExpirationMs  [Optional] The default lifetime of all tables in the dataset, in milliseconds. The minimum value is 3600000 milliseconds (one hour). Once this property is set, all newly-created tables in the dataset will have an expirationTime property set to the creation time plus the value in this property, and changing the value will only affect new tables, not existing ones. When the expirationTime for a given table is reached, that table will be deleted automatically. If a table's expirationTime is modified or removed before the table expires, or if you provide an explicit expirationTime when creating a table, that value takes precedence over the default expiration time indicated by this property.
 * @param description  [Optional] A user-friendly description of the dataset.
 * @param etag  [Output-only] A hash of the resource.
 * @param friendlyName  [Optional] A descriptive name for the dataset.
 * @param id  [Output-only] The fully-qualified unique name of the dataset in the format projectId:datasetId. The dataset name without the project name is given in the datasetId field. When creating a new dataset, leave this field blank, and instead specify the datasetId field.
 * @param kind  [Output-only] The resource type.
 * @param labels  The labels associated with this dataset. You can use these to organize and group your datasets. You can set this property when inserting or updating a dataset. See Labeling Datasets for more information.
 * @param lastModifiedTime  [Output-only] The date when this dataset or any of its tables was last modified, in milliseconds since the epoch.
 * @param location  The geographic location where the dataset should reside. Possible values include EU and US. The default value is US.
 * @param selfLink  [Output-only] A URL that can be used to access the resource again. You can use this URL in Get or Update requests to the resource.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.Dataset original] using Vert.x codegen.
 */
fun Dataset(
  access: Iterable<io.vertx.bigquery.model.Access>? = null,
  creationTime: Long? = null,
  datasetReference: io.vertx.bigquery.model.DatasetReference? = null,
  defaultTableExpirationMs: Long? = null,
  description: String? = null,
  etag: String? = null,
  friendlyName: String? = null,
  id: String? = null,
  kind: String? = null,
  labels: Map<String, String>? = null,
  lastModifiedTime: Long? = null,
  location: String? = null,
  selfLink: String? = null): Dataset = io.vertx.bigquery.model.Dataset(io.vertx.core.json.JsonObject()).apply {

  if (access != null) {
    this.setAccess(access.toList())
  }
  if (creationTime != null) {
    this.setCreationTime(creationTime)
  }
  if (datasetReference != null) {
    this.setDatasetReference(datasetReference)
  }
  if (defaultTableExpirationMs != null) {
    this.setDefaultTableExpirationMs(defaultTableExpirationMs)
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (etag != null) {
    this.setEtag(etag)
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
  if (lastModifiedTime != null) {
    this.setLastModifiedTime(lastModifiedTime)
  }
  if (location != null) {
    this.setLocation(location)
  }
  if (selfLink != null) {
    this.setSelfLink(selfLink)
  }
}

