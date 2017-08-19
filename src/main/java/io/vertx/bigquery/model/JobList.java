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
 * Model definition for JobList.
 *
 * <p>
 * This is the Java data model class that specifies how to parse/serialize into
 * the JSON that is transmitted over HTTP when working with the BigQuery API.
 * For a detailed explanation see: <a href=
 * "http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@DataObject(generateConverter = true)
public final class JobList {

	/**
	 * A hash of this page of results. The value may be {@code null}.
	 */
	
	private java.lang.String etag;

	/**
	 * List of jobs that were requested. The value may be {@code null}.
	 */
	
	private java.util.List<Jobs> jobs;


	/**
	 * The resource type of the response. The value may be {@code null}.
	 */
	
	private java.lang.String kind;

	/**
	 * A token to request the next page of results. The value may be {@code null}.
	 */
	
	private java.lang.String nextPageToken;

	/**
	 * A hash of this page of results.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getEtag() {
		return etag;
	}

	/**
	 * A hash of this page of results.
	 * 
	 * @param etag
	 *            etag or {@code null} for none
	 */
	public JobList setEtag(java.lang.String etag) {
		this.etag = etag;
		return this;
	}

	/**
	 * List of jobs that were requested.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<Jobs> getJobs() {
		return jobs;
	}

	/**
	 * List of jobs that were requested.
	 * 
	 * @param jobs
	 *            jobs or {@code null} for none
	 */
	public JobList setJobs(java.util.List<Jobs> jobs) {
		this.jobs = jobs;
		return this;
	}

	/**
	 * The resource type of the response.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getKind() {
		return kind;
	}

	/**
	 * The resource type of the response.
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public JobList setKind(java.lang.String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * A token to request the next page of results.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getNextPageToken() {
		return nextPageToken;
	}

	/**
	 * A token to request the next page of results.
	 * 
	 * @param nextPageToken
	 *            nextPageToken or {@code null} for none
	 */
	public JobList setNextPageToken(java.lang.String nextPageToken) {
		this.nextPageToken = nextPageToken;
		return this;
	}

	/**
	 * Model definition for JobListJobs.
	 */


	public JobList(JsonObject jsonObject) {
		JobListConverter.fromJson(jsonObject, this);
		
	}
	
	public JsonObject toJson() {
		JsonObject jsonObject = new  JsonObject();
		JobListConverter.toJson(this, jsonObject);
		return jsonObject;
	}
}