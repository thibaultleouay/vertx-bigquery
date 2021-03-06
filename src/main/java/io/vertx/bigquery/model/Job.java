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
 * Model definition for Job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@DataObject(generateConverter = true)
public final class Job {

  /**
   * [Required] Describes the job configuration.
   * The value may be {@code null}.
   */
  
  private JobConfiguration configuration;

  /**
   * [Output-only] A hash of this resource.
   * The value may be {@code null}.
   */
  
  private String etag;

  /**
   * [Output-only] Opaque ID field of the job
   * The value may be {@code null}.
   */
  
  private String id;

  /**
   * [Optional] Reference describing the unique-per-user name of the job.
   * The value may be {@code null}.
   */
  
  private JobReference jobReference;

  /**
   * [Output-only] The type of the resource.
   * The value may be {@code null}.
   */
  
  private String kind;

  /**
   * [Output-only] A URL that can be used to access this resource again.
   * The value may be {@code null}.
   */
  
  private String selfLink;

  /**
   * [Output-only] Information about the job, including starting time and ending time of the job.
   * The value may be {@code null}.
   */
  
  private JobStatistics statistics;

  /**
   * [Output-only] The status of this job. Examine this value when polling an asynchronous job to
   * see if the job is complete.
   * The value may be {@code null}.
   */
  
  private JobStatus status;

  /**
   * [Output-only] Email address of the user who ran the job.
   * The value may be {@code null}.
   */
  private String userEmail;

  /**
   * [Required] Describes the job configuration.
   * @return value or {@code null} for none
   */
  public JobConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * [Required] Describes the job configuration.
   * @param configuration configuration or {@code null} for none
   */
  public Job setConfiguration(JobConfiguration configuration) {
    this.configuration = configuration;
    return this;
  }

  /**
   * [Output-only] A hash of this resource.
   * @return value or {@code null} for none
   */
  public String getEtag() {
    return etag;
  }

  /**
   * [Output-only] A hash of this resource.
   * @param etag etag or {@code null} for none
   */
  public Job setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * [Output-only] Opaque ID field of the job
   * @return value or {@code null} for none
   */
  public String getId() {
    return id;
  }

  /**
   * [Output-only] Opaque ID field of the job
   * @param id id or {@code null} for none
   */
  public Job setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * [Optional] Reference describing the unique-per-user name of the job.
   * @return value or {@code null} for none
   */
  public JobReference getJobReference() {
    return jobReference;
  }

  /**
   * [Optional] Reference describing the unique-per-user name of the job.
   * @param jobReference jobReference or {@code null} for none
   */
  public Job setJobReference(JobReference jobReference) {
    this.jobReference = jobReference;
    return this;
  }

  /**
   * [Output-only] The type of the resource.
   * @return value or {@code null} for none
   */
  public String getKind() {
    return kind;
  }

  /**
   * [Output-only] The type of the resource.
   * @param kind kind or {@code null} for none
   */
  public Job setKind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * [Output-only] A URL that can be used to access this resource again.
   * @return value or {@code null} for none
   */
  public String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output-only] A URL that can be used to access this resource again.
   * @param selfLink selfLink or {@code null} for none
   */
  public Job setSelfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output-only] Information about the job, including starting time and ending time of the job.
   * @return value or {@code null} for none
   */
  public JobStatistics getStatistics() {
    return statistics;
  }

  /**
   * [Output-only] Information about the job, including starting time and ending time of the job.
   * @param statistics statistics or {@code null} for none
   */
  public Job setStatistics(JobStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

  /**
   * [Output-only] The status of this job. Examine this value when polling an asynchronous job to
   * see if the job is complete.
   * @return value or {@code null} for none
   */
  public JobStatus getStatus() {
    return status;
  }

  /**
   * [Output-only] The status of this job. Examine this value when polling an asynchronous job to
   * see if the job is complete.
   * @param status status or {@code null} for none
   */
  public Job setStatus(JobStatus status) {
    this.status = status;
    return this;
  }

  /**
   * [Output-only] Email address of the user who ran the job.
   * @return value or {@code null} for none
   */
  public String getUserEmail() {
    return userEmail;
  }

  /**
   * [Output-only] Email address of the user who ran the job.
   * @param userEmail userEmail or {@code null} for none
   */
  public Job setUserEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }
  public Job(JsonObject json) {
	  JobConverter.fromJson(json, this);
  }
  
  public JsonObject toJson() {
	  JsonObject jsonObject = new JsonObject();
	  JobConverter.toJson(this, jsonObject);
	  return jsonObject;
  }
}
