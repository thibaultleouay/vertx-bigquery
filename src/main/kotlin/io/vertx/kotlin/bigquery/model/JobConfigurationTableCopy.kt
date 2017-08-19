package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.JobConfigurationTableCopy
import io.vertx.bigquery.model.TableReference

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.JobConfigurationTableCopy] objects.
 *
 * Model definition for JobConfigurationTableCopy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param createDisposition  [Optional] Specifies whether the job is allowed to create new tables. The following values are supported: CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table. CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result. The default value is CREATE_IF_NEEDED. Creation, truncation and append actions occur as one atomic update upon job completion.
 * @param destinationTable  [Required] The destination table
 * @param sourceTable  [Pick one] Source table to copy.
 * @param sourceTables  [Pick one] Source tables to copy.
 * @param writeDisposition  [Optional] Specifies the action that occurs if the destination table already exists. The following values are supported: WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data. WRITE_APPEND: If the table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result. The default value is WRITE_EMPTY. Each action is atomic and only occurs if BigQuery is able to complete the job successfully. Creation, truncation and append actions occur as one atomic update upon job completion.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.JobConfigurationTableCopy original] using Vert.x codegen.
 */
fun JobConfigurationTableCopy(
  createDisposition: String? = null,
  destinationTable: io.vertx.bigquery.model.TableReference? = null,
  sourceTable: io.vertx.bigquery.model.TableReference? = null,
  sourceTables: Iterable<io.vertx.bigquery.model.TableReference>? = null,
  writeDisposition: String? = null): JobConfigurationTableCopy = io.vertx.bigquery.model.JobConfigurationTableCopy(io.vertx.core.json.JsonObject()).apply {

  if (createDisposition != null) {
    this.setCreateDisposition(createDisposition)
  }
  if (destinationTable != null) {
    this.setDestinationTable(destinationTable)
  }
  if (sourceTable != null) {
    this.setSourceTable(sourceTable)
  }
  if (sourceTables != null) {
    this.setSourceTables(sourceTables.toList())
  }
  if (writeDisposition != null) {
    this.setWriteDisposition(writeDisposition)
  }
}

