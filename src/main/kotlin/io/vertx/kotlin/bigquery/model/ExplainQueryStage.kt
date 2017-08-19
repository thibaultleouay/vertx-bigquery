package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.ExplainQueryStage
import io.vertx.bigquery.model.ExplainQueryStep

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.ExplainQueryStage] objects.
 *
 * Model definition for ExplainQueryStage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @param computeMsAvg  Milliseconds the average shard spent on CPU-bound tasks.
 * @param computeMsMax  Milliseconds the slowest shard spent on CPU-bound tasks.
 * @param computeRatioAvg  Relative amount of time the average shard spent on CPU-bound tasks.
 * @param computeRatioMax  Relative amount of time the slowest shard spent on CPU-bound tasks.
 * @param id  Unique ID for stage within plan.
 * @param name  Human-readable name for stage.
 * @param readMsAvg  Milliseconds the average shard spent reading input.
 * @param readMsMax  Milliseconds the slowest shard spent reading input.
 * @param readRatioAvg  Relative amount of time the average shard spent reading input.
 * @param readRatioMax  Relative amount of time the slowest shard spent reading input.
 * @param recordsRead  Number of records read into the stage.
 * @param recordsWritten  Number of records written by the stage.
 * @param shuffleOutputBytes  Total number of bytes written to shuffle.
 * @param shuffleOutputBytesSpilled  Total number of bytes written to shuffle and spilled to disk.
 * @param status  Current status for the stage.
 * @param steps  List of operations within the stage in dependency order (approximately chronological).
 * @param waitMsAvg  Milliseconds the average shard spent waiting to be scheduled.
 * @param waitMsMax  Milliseconds the slowest shard spent waiting to be scheduled.
 * @param waitRatioAvg  Relative amount of time the average shard spent waiting to be scheduled.
 * @param waitRatioMax  Relative amount of time the slowest shard spent waiting to be scheduled.
 * @param writeMsAvg  Milliseconds the average shard spent on writing output.
 * @param writeMsMax  Milliseconds the slowest shard spent on writing output.
 * @param writeRatioAvg  Relative amount of time the average shard spent on writing output.
 * @param writeRatioMax  Relative amount of time the slowest shard spent on writing output.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.ExplainQueryStage original] using Vert.x codegen.
 */
fun ExplainQueryStage(
  computeMsAvg: Long? = null,
  computeMsMax: Long? = null,
  computeRatioAvg: Double? = null,
  computeRatioMax: Double? = null,
  id: Long? = null,
  name: String? = null,
  readMsAvg: Long? = null,
  readMsMax: Long? = null,
  readRatioAvg: Double? = null,
  readRatioMax: Double? = null,
  recordsRead: Long? = null,
  recordsWritten: Long? = null,
  shuffleOutputBytes: Long? = null,
  shuffleOutputBytesSpilled: Long? = null,
  status: String? = null,
  steps: Iterable<io.vertx.bigquery.model.ExplainQueryStep>? = null,
  waitMsAvg: Long? = null,
  waitMsMax: Long? = null,
  waitRatioAvg: Double? = null,
  waitRatioMax: Double? = null,
  writeMsAvg: Long? = null,
  writeMsMax: Long? = null,
  writeRatioAvg: Double? = null,
  writeRatioMax: Double? = null): ExplainQueryStage = io.vertx.bigquery.model.ExplainQueryStage(io.vertx.core.json.JsonObject()).apply {

  if (computeMsAvg != null) {
    this.setComputeMsAvg(computeMsAvg)
  }
  if (computeMsMax != null) {
    this.setComputeMsMax(computeMsMax)
  }
  if (computeRatioAvg != null) {
    this.setComputeRatioAvg(computeRatioAvg)
  }
  if (computeRatioMax != null) {
    this.setComputeRatioMax(computeRatioMax)
  }
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (readMsAvg != null) {
    this.setReadMsAvg(readMsAvg)
  }
  if (readMsMax != null) {
    this.setReadMsMax(readMsMax)
  }
  if (readRatioAvg != null) {
    this.setReadRatioAvg(readRatioAvg)
  }
  if (readRatioMax != null) {
    this.setReadRatioMax(readRatioMax)
  }
  if (recordsRead != null) {
    this.setRecordsRead(recordsRead)
  }
  if (recordsWritten != null) {
    this.setRecordsWritten(recordsWritten)
  }
  if (shuffleOutputBytes != null) {
    this.setShuffleOutputBytes(shuffleOutputBytes)
  }
  if (shuffleOutputBytesSpilled != null) {
    this.setShuffleOutputBytesSpilled(shuffleOutputBytesSpilled)
  }
  if (status != null) {
    this.setStatus(status)
  }
  if (steps != null) {
    this.setSteps(steps.toList())
  }
  if (waitMsAvg != null) {
    this.setWaitMsAvg(waitMsAvg)
  }
  if (waitMsMax != null) {
    this.setWaitMsMax(waitMsMax)
  }
  if (waitRatioAvg != null) {
    this.setWaitRatioAvg(waitRatioAvg)
  }
  if (waitRatioMax != null) {
    this.setWaitRatioMax(waitRatioMax)
  }
  if (writeMsAvg != null) {
    this.setWriteMsAvg(writeMsAvg)
  }
  if (writeMsMax != null) {
    this.setWriteMsMax(writeMsMax)
  }
  if (writeRatioAvg != null) {
    this.setWriteRatioAvg(writeRatioAvg)
  }
  if (writeRatioMax != null) {
    this.setWriteRatioMax(writeRatioMax)
  }
}

