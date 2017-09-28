package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public  final class Jobs {

	/**
	 * [Full-projection-only] Specifies the job configuration. The value may be
	 * {@code null}.
	 */
	
	private JobConfiguration configuration;

	/**
	 * A result object that will be present only if the job has failed. The value
	 * may be {@code null}.
	 */
	
	private ErrorProto errorResult;

	/**
	 * Unique opaque ID of the job. The value may be {@code null}.
	 */
	
	private String id;

	/**
	 * Job reference uniquely identifying the job. The value may be {@code null}.
	 */
	
	private JobReference jobReference;

	/**
	 * The resource type. The value may be {@code null}.
	 */
	
	private String kind;

	/**
	 * Running state of the job. When the state is DONE, errorResult can be checked
	 * to determine whether the job succeeded or failed. The value may be
	 * {@code null}.
	 */
	
	private String state;

	/**
	 * [Output-only] Information about the job, including starting time and ending
	 * time of the job. The value may be {@code null}.
	 */
	
	private JobStatistics statistics;

	/**
	 * [Full-projection-only] Describes the state of the job. The value may be
	 * {@code null}.
	 */
	private JobStatus status;

	/**
	 * [Full-projection-only] Email address of the user who ran the job. The value
	 * may be {@code null}.
	 */
	private String userEmail;

	/**
	 * [Full-projection-only] Specifies the job configuration.
	 * 
	 * @return value or {@code null} for none
	 */
	public JobConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * [Full-projection-only] Specifies the job configuration.
	 * 
	 * @param configuration
	 *            configuration or {@code null} for none
	 */
	public Jobs setConfiguration(JobConfiguration configuration) {
		this.configuration = configuration;
		return this;
	}

	/**
	 * A result object that will be present only if the job has failed.
	 * 
	 * @return value or {@code null} for none
	 */
	public ErrorProto getErrorResult() {
		return errorResult;
	}

	/**
	 * A result object that will be present only if the job has failed.
	 * 
	 * @param errorResult
	 *            errorResult or {@code null} for none
	 */
	public Jobs setErrorResult(ErrorProto errorResult) {
		this.errorResult = errorResult;
		return this;
	}

	/**
	 * Unique opaque ID of the job.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getId() {
		return id;
	}

	/**
	 * Unique opaque ID of the job.
	 * 
	 * @param id
	 *            id or {@code null} for none
	 */
	public Jobs setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Job reference uniquely identifying the job.
	 * 
	 * @return value or {@code null} for none
	 */
	public JobReference getJobReference() {
		return jobReference;
	}

	/**
	 * Job reference uniquely identifying the job.
	 * 
	 * @param jobReference
	 *            jobReference or {@code null} for none
	 */
	public Jobs setJobReference(JobReference jobReference) {
		this.jobReference = jobReference;
		return this;
	}

	/**
	 * The resource type.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * The resource type.
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public Jobs setKind(String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * Running state of the job. When the state is DONE, errorResult can be checked
	 * to determine whether the job succeeded or failed.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getState() {
		return state;
	}

	/**
	 * Running state of the job. When the state is DONE, errorResult can be checked
	 * to determine whether the job succeeded or failed.
	 * 
	 * @param state
	 *            state or {@code null} for none
	 */
	public Jobs setState(String state) {
		this.state = state;
		return this;
	}

	/**
	 * [Output-only] Information about the job, including starting time and ending
	 * time of the job.
	 * 
	 * @return value or {@code null} for none
	 */
	public JobStatistics getStatistics() {
		return statistics;
	}

	/**
	 * [Output-only] Information about the job, including starting time and ending
	 * time of the job.
	 * 
	 * @param statistics
	 *            statistics or {@code null} for none
	 */
	public Jobs setStatistics(JobStatistics statistics) {
		this.statistics = statistics;
		return this;
	}

	/**
	 * [Full-projection-only] Describes the state of the job.
	 * 
	 * @return value or {@code null} for none
	 */
	public JobStatus getStatus() {
		return status;
	}

	/**
	 * [Full-projection-only] Describes the state of the job.
	 * 
	 * @param status
	 *            status or {@code null} for none
	 */
	public Jobs setStatus(JobStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * [Full-projection-only] Email address of the user who ran the job.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * [Full-projection-only] Email address of the user who ran the job.
	 * 
	 * @param userEmail
	 *            userEmail or {@code null} for none
	 */
	public Jobs setUserEmail(String userEmail) {
		this.userEmail = userEmail;
		return this;
	}

	public Jobs(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}
}