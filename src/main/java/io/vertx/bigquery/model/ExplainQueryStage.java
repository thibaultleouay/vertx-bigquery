/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * Modify at your own risk.
 */

package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * Model definition for ExplainQueryStage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@DataObject(generateConverter = true)
public final class ExplainQueryStage {

  /**
   * Milliseconds the average shard spent on CPU-bound tasks.
   * The value may be {@code null}.
   */

  private java.lang.Long computeMsAvg;

  /**
   * Milliseconds the slowest shard spent on CPU-bound tasks.
   * The value may be {@code null}.
   */

  private java.lang.Long computeMsMax;

  /**
   * Relative amount of time the average shard spent on CPU-bound tasks.
   * The value may be {@code null}.
   */
  
  private java.lang.Double computeRatioAvg;

  /**
   * Relative amount of time the slowest shard spent on CPU-bound tasks.
   * The value may be {@code null}.
   */
  
  private java.lang.Double computeRatioMax;

  /**
   * Unique ID for stage within plan.
   * The value may be {@code null}.
   */

  private java.lang.Long id;

  /**
   * Human-readable name for stage.
   * The value may be {@code null}.
   */
  
  private String name;

  /**
   * Milliseconds the average shard spent reading input.
   * The value may be {@code null}.
   */

  private java.lang.Long readMsAvg;

  /**
   * Milliseconds the slowest shard spent reading input.
   * The value may be {@code null}.
   */

  private java.lang.Long readMsMax;

  /**
   * Relative amount of time the average shard spent reading input.
   * The value may be {@code null}.
   */
  
  private java.lang.Double readRatioAvg;

  /**
   * Relative amount of time the slowest shard spent reading input.
   * The value may be {@code null}.
   */
  
  private java.lang.Double readRatioMax;

  /**
   * Number of records read into the stage.
   * The value may be {@code null}.
   */

  private java.lang.Long recordsRead;

  /**
   * Number of records written by the stage.
   * The value may be {@code null}.
   */

  private java.lang.Long recordsWritten;

  /**
   * Total number of bytes written to shuffle.
   * The value may be {@code null}.
   */

  private java.lang.Long shuffleOutputBytes;

  /**
   * Total number of bytes written to shuffle and spilled to disk.
   * The value may be {@code null}.
   */

  private java.lang.Long shuffleOutputBytesSpilled;

  /**
   * Current status for the stage.
   * The value may be {@code null}.
   */
  
  private String status;

  /**
   * List of operations within the stage in dependency order (approximately chronological).
   * The value may be {@code null}.
   */
  
  private java.util.List<ExplainQueryStep> steps;

  /**
   * Milliseconds the average shard spent waiting to be scheduled.
   * The value may be {@code null}.
   */

  private java.lang.Long waitMsAvg;

  /**
   * Milliseconds the slowest shard spent waiting to be scheduled.
   * The value may be {@code null}.
   */

  private java.lang.Long waitMsMax;

  /**
   * Relative amount of time the average shard spent waiting to be scheduled.
   * The value may be {@code null}.
   */
  
  private java.lang.Double waitRatioAvg;

  /**
   * Relative amount of time the slowest shard spent waiting to be scheduled.
   * The value may be {@code null}.
   */
  
  private java.lang.Double waitRatioMax;

  /**
   * Milliseconds the average shard spent on writing output.
   * The value may be {@code null}.
   */

  private java.lang.Long writeMsAvg;

  /**
   * Milliseconds the slowest shard spent on writing output.
   * The value may be {@code null}.
   */

  private java.lang.Long writeMsMax;

  /**
   * Relative amount of time the average shard spent on writing output.
   * The value may be {@code null}.
   */
  
  private java.lang.Double writeRatioAvg;

  /**
   * Relative amount of time the slowest shard spent on writing output.
   * The value may be {@code null}.
   */
  
  private java.lang.Double writeRatioMax;

  /**
   * Milliseconds the average shard spent on CPU-bound tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Long getComputeMsAvg() {
    return computeMsAvg;
  }

  /**
   * Milliseconds the average shard spent on CPU-bound tasks.
   * @param computeMsAvg computeMsAvg or {@code null} for none
   */
  public ExplainQueryStage setComputeMsAvg(java.lang.Long computeMsAvg) {
    this.computeMsAvg = computeMsAvg;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent on CPU-bound tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Long getComputeMsMax() {
    return computeMsMax;
  }

  /**
   * Milliseconds the slowest shard spent on CPU-bound tasks.
   * @param computeMsMax computeMsMax or {@code null} for none
   */
  public ExplainQueryStage setComputeMsMax(java.lang.Long computeMsMax) {
    this.computeMsMax = computeMsMax;
    return this;
  }

  /**
   * Relative amount of time the average shard spent on CPU-bound tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Double getComputeRatioAvg() {
    return computeRatioAvg;
  }

  /**
   * Relative amount of time the average shard spent on CPU-bound tasks.
   * @param computeRatioAvg computeRatioAvg or {@code null} for none
   */
  public ExplainQueryStage setComputeRatioAvg(java.lang.Double computeRatioAvg) {
    this.computeRatioAvg = computeRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent on CPU-bound tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Double getComputeRatioMax() {
    return computeRatioMax;
  }

  /**
   * Relative amount of time the slowest shard spent on CPU-bound tasks.
   * @param computeRatioMax computeRatioMax or {@code null} for none
   */
  public ExplainQueryStage setComputeRatioMax(java.lang.Double computeRatioMax) {
    this.computeRatioMax = computeRatioMax;
    return this;
  }

  /**
   * Unique ID for stage within plan.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Unique ID for stage within plan.
   * @param id id or {@code null} for none
   */
  public ExplainQueryStage setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Human-readable name for stage.
   * @return value or {@code null} for none
   */
  public String getName() {
    return name;
  }

  /**
   * Human-readable name for stage.
   * @param name name or {@code null} for none
   */
  public ExplainQueryStage setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * Milliseconds the average shard spent reading input.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReadMsAvg() {
    return readMsAvg;
  }

  /**
   * Milliseconds the average shard spent reading input.
   * @param readMsAvg readMsAvg or {@code null} for none
   */
  public ExplainQueryStage setReadMsAvg(java.lang.Long readMsAvg) {
    this.readMsAvg = readMsAvg;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent reading input.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReadMsMax() {
    return readMsMax;
  }

  /**
   * Milliseconds the slowest shard spent reading input.
   * @param readMsMax readMsMax or {@code null} for none
   */
  public ExplainQueryStage setReadMsMax(java.lang.Long readMsMax) {
    this.readMsMax = readMsMax;
    return this;
  }

  /**
   * Relative amount of time the average shard spent reading input.
   * @return value or {@code null} for none
   */
  public java.lang.Double getReadRatioAvg() {
    return readRatioAvg;
  }

  /**
   * Relative amount of time the average shard spent reading input.
   * @param readRatioAvg readRatioAvg or {@code null} for none
   */
  public ExplainQueryStage setReadRatioAvg(java.lang.Double readRatioAvg) {
    this.readRatioAvg = readRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent reading input.
   * @return value or {@code null} for none
   */
  public java.lang.Double getReadRatioMax() {
    return readRatioMax;
  }

  /**
   * Relative amount of time the slowest shard spent reading input.
   * @param readRatioMax readRatioMax or {@code null} for none
   */
  public ExplainQueryStage setReadRatioMax(java.lang.Double readRatioMax) {
    this.readRatioMax = readRatioMax;
    return this;
  }

  /**
   * Number of records read into the stage.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRecordsRead() {
    return recordsRead;
  }

  /**
   * Number of records read into the stage.
   * @param recordsRead recordsRead or {@code null} for none
   */
  public ExplainQueryStage setRecordsRead(java.lang.Long recordsRead) {
    this.recordsRead = recordsRead;
    return this;
  }

  /**
   * Number of records written by the stage.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRecordsWritten() {
    return recordsWritten;
  }

  /**
   * Number of records written by the stage.
   * @param recordsWritten recordsWritten or {@code null} for none
   */
  public ExplainQueryStage setRecordsWritten(java.lang.Long recordsWritten) {
    this.recordsWritten = recordsWritten;
    return this;
  }

  /**
   * Total number of bytes written to shuffle.
   * @return value or {@code null} for none
   */
  public java.lang.Long getShuffleOutputBytes() {
    return shuffleOutputBytes;
  }

  /**
   * Total number of bytes written to shuffle.
   * @param shuffleOutputBytes shuffleOutputBytes or {@code null} for none
   */
  public ExplainQueryStage setShuffleOutputBytes(java.lang.Long shuffleOutputBytes) {
    this.shuffleOutputBytes = shuffleOutputBytes;
    return this;
  }

  /**
   * Total number of bytes written to shuffle and spilled to disk.
   * @return value or {@code null} for none
   */
  public java.lang.Long getShuffleOutputBytesSpilled() {
    return shuffleOutputBytesSpilled;
  }

  /**
   * Total number of bytes written to shuffle and spilled to disk.
   * @param shuffleOutputBytesSpilled shuffleOutputBytesSpilled or {@code null} for none
   */
  public ExplainQueryStage setShuffleOutputBytesSpilled(java.lang.Long shuffleOutputBytesSpilled) {
    this.shuffleOutputBytesSpilled = shuffleOutputBytesSpilled;
    return this;
  }

  /**
   * Current status for the stage.
   * @return value or {@code null} for none
   */
  public String getStatus() {
    return status;
  }

  /**
   * Current status for the stage.
   * @param status status or {@code null} for none
   */
  public ExplainQueryStage setStatus(String status) {
    this.status = status;
    return this;
  }

  /**
   * List of operations within the stage in dependency order (approximately chronological).
   * @return value or {@code null} for none
   */
  public java.util.List<ExplainQueryStep> getSteps() {
    return steps;
  }

  /**
   * List of operations within the stage in dependency order (approximately chronological).
   * @param steps steps or {@code null} for none
   */
  public ExplainQueryStage setSteps(java.util.List<ExplainQueryStep> steps) {
    this.steps = steps;
    return this;
  }

  /**
   * Milliseconds the average shard spent waiting to be scheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWaitMsAvg() {
    return waitMsAvg;
  }

  /**
   * Milliseconds the average shard spent waiting to be scheduled.
   * @param waitMsAvg waitMsAvg or {@code null} for none
   */
  public ExplainQueryStage setWaitMsAvg(java.lang.Long waitMsAvg) {
    this.waitMsAvg = waitMsAvg;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent waiting to be scheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWaitMsMax() {
    return waitMsMax;
  }

  /**
   * Milliseconds the slowest shard spent waiting to be scheduled.
   * @param waitMsMax waitMsMax or {@code null} for none
   */
  public ExplainQueryStage setWaitMsMax(java.lang.Long waitMsMax) {
    this.waitMsMax = waitMsMax;
    return this;
  }

  /**
   * Relative amount of time the average shard spent waiting to be scheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWaitRatioAvg() {
    return waitRatioAvg;
  }

  /**
   * Relative amount of time the average shard spent waiting to be scheduled.
   * @param waitRatioAvg waitRatioAvg or {@code null} for none
   */
  public ExplainQueryStage setWaitRatioAvg(java.lang.Double waitRatioAvg) {
    this.waitRatioAvg = waitRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent waiting to be scheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWaitRatioMax() {
    return waitRatioMax;
  }

  /**
   * Relative amount of time the slowest shard spent waiting to be scheduled.
   * @param waitRatioMax waitRatioMax or {@code null} for none
   */
  public ExplainQueryStage setWaitRatioMax(java.lang.Double waitRatioMax) {
    this.waitRatioMax = waitRatioMax;
    return this;
  }

  /**
   * Milliseconds the average shard spent on writing output.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWriteMsAvg() {
    return writeMsAvg;
  }

  /**
   * Milliseconds the average shard spent on writing output.
   * @param writeMsAvg writeMsAvg or {@code null} for none
   */
  public ExplainQueryStage setWriteMsAvg(java.lang.Long writeMsAvg) {
    this.writeMsAvg = writeMsAvg;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent on writing output.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWriteMsMax() {
    return writeMsMax;
  }

  /**
   * Milliseconds the slowest shard spent on writing output.
   * @param writeMsMax writeMsMax or {@code null} for none
   */
  public ExplainQueryStage setWriteMsMax(java.lang.Long writeMsMax) {
    this.writeMsMax = writeMsMax;
    return this;
  }

  /**
   * Relative amount of time the average shard spent on writing output.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWriteRatioAvg() {
    return writeRatioAvg;
  }

  /**
   * Relative amount of time the average shard spent on writing output.
   * @param writeRatioAvg writeRatioAvg or {@code null} for none
   */
  public ExplainQueryStage setWriteRatioAvg(java.lang.Double writeRatioAvg) {
    this.writeRatioAvg = writeRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent on writing output.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWriteRatioMax() {
    return writeRatioMax;
  }

  /**
   * Relative amount of time the slowest shard spent on writing output.
   * @param writeRatioMax writeRatioMax or {@code null} for none
   */
  public ExplainQueryStage setWriteRatioMax(java.lang.Double writeRatioMax) {
    this.writeRatioMax = writeRatioMax;
    return this;
  }

  public ExplainQueryStage(JsonObject json) {
	// TODO Auto-generated constructor stub
}
}
