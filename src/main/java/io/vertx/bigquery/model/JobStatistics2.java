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
 * Model definition for JobStatistics2.
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
public final class JobStatistics2 {

	/**
	 * [Output-only] Billing tier for the job. The value may be {@code null}.
	 */
	
	private java.lang.Integer billingTier;

	/**
	 * [Output-only] Whether the query result was fetched from the query cache. The
	 * value may be {@code null}.
	 */
	
	private java.lang.Boolean cacheHit;

	/**
	 * [Output-only] The number of rows affected by a DML statement. Present only
	 * for DML statements INSERT, UPDATE or DELETE. The value may be {@code null}.
	 */
	
	private java.lang.Long numDmlAffectedRows;

	/**
	 * [Output-only] Describes execution plan for the query. The value may be
	 * {@code null}.
	 */
	
	private java.util.List<ExplainQueryStage> queryPlan;


	/**
	 * [Output-only, Experimental] Referenced tables for the job. Queries that
	 * reference more than 50 tables will not have a complete list. The value may be
	 * {@code null}.
	 */
	
	private java.util.List<TableReference> referencedTables;

	/**
	 * [Output-only, Experimental] The schema of the results. Present only for
	 * successful dry run of non-legacy SQL queries. The value may be {@code null}.
	 */
	
	private TableSchema schema;

	/**
	 * [Output-only, Experimental] The type of query statement, if valid. The value
	 * may be {@code null}.
	 */
	
	private String statementType;

	/**
	 * [Output-only] Total bytes billed for the job. The value may be {@code null}.
	 */
	
	private java.lang.Long totalBytesBilled;

	/**
	 * [Output-only] Total bytes processed for the job. The value may be
	 * {@code null}.
	 */
	
	private java.lang.Long totalBytesProcessed;

	/**
	 * [Output-only, Experimental] Standard SQL only: list of undeclared query
	 * parameters detected during a dry run validation. The value may be
	 * {@code null}.
	 */
	
	private java.util.List<QueryParameter> undeclaredQueryParameters;

	/**
	 * [Output-only] Billing tier for the job.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Integer getBillingTier() {
		return billingTier;
	}

	/**
	 * [Output-only] Billing tier for the job.
	 * 
	 * @param billingTier
	 *            billingTier or {@code null} for none
	 */
	public JobStatistics2 setBillingTier(java.lang.Integer billingTier) {
		this.billingTier = billingTier;
		return this;
	}

	/**
	 * [Output-only] Whether the query result was fetched from the query cache.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Boolean getCacheHit() {
		return cacheHit;
	}

	/**
	 * [Output-only] Whether the query result was fetched from the query cache.
	 * 
	 * @param cacheHit
	 *            cacheHit or {@code null} for none
	 */
	public JobStatistics2 setCacheHit(java.lang.Boolean cacheHit) {
		this.cacheHit = cacheHit;
		return this;
	}

	/**
	 * [Output-only] The number of rows affected by a DML statement. Present only
	 * for DML statements INSERT, UPDATE or DELETE.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Long getNumDmlAffectedRows() {
		return numDmlAffectedRows;
	}

	/**
	 * [Output-only] The number of rows affected by a DML statement. Present only
	 * for DML statements INSERT, UPDATE or DELETE.
	 * 
	 * @param numDmlAffectedRows
	 *            numDmlAffectedRows or {@code null} for none
	 */
	public JobStatistics2 setNumDmlAffectedRows(java.lang.Long numDmlAffectedRows) {
		this.numDmlAffectedRows = numDmlAffectedRows;
		return this;
	}

	/**
	 * [Output-only] Describes execution plan for the query.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<ExplainQueryStage> getQueryPlan() {
		return queryPlan;
	}

	/**
	 * [Output-only] Describes execution plan for the query.
	 * 
	 * @param queryPlan
	 *            queryPlan or {@code null} for none
	 */
	public JobStatistics2 setQueryPlan(java.util.List<ExplainQueryStage> queryPlan) {
		this.queryPlan = queryPlan;
		return this;
	}

	/**
	 * [Output-only, Experimental] Referenced tables for the job. Queries that
	 * reference more than 50 tables will not have a complete list.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<TableReference> getReferencedTables() {
		return referencedTables;
	}

	/**
	 * [Output-only, Experimental] Referenced tables for the job. Queries that
	 * reference more than 50 tables will not have a complete list.
	 * 
	 * @param referencedTables
	 *            referencedTables or {@code null} for none
	 */
	public JobStatistics2 setReferencedTables(java.util.List<TableReference> referencedTables) {
		this.referencedTables = referencedTables;
		return this;
	}

	/**
	 * [Output-only, Experimental] The schema of the results. Present only for
	 * successful dry run of non-legacy SQL queries.
	 * 
	 * @return value or {@code null} for none
	 */
	public TableSchema getSchema() {
		return schema;
	}

	/**
	 * [Output-only, Experimental] The schema of the results. Present only for
	 * successful dry run of non-legacy SQL queries.
	 * 
	 * @param schema
	 *            schema or {@code null} for none
	 */
	public JobStatistics2 setSchema(TableSchema schema) {
		this.schema = schema;
		return this;
	}

	/**
	 * [Output-only, Experimental] The type of query statement, if valid.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getStatementType() {
		return statementType;
	}

	/**
	 * [Output-only, Experimental] The type of query statement, if valid.
	 * 
	 * @param statementType
	 *            statementType or {@code null} for none
	 */
	public JobStatistics2 setStatementType(String statementType) {
		this.statementType = statementType;
		return this;
	}

	/**
	 * [Output-only] Total bytes billed for the job.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Long getTotalBytesBilled() {
		return totalBytesBilled;
	}

	/**
	 * [Output-only] Total bytes billed for the job.
	 * 
	 * @param totalBytesBilled
	 *            totalBytesBilled or {@code null} for none
	 */
	public JobStatistics2 setTotalBytesBilled(java.lang.Long totalBytesBilled) {
		this.totalBytesBilled = totalBytesBilled;
		return this;
	}

	/**
	 * [Output-only] Total bytes processed for the job.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Long getTotalBytesProcessed() {
		return totalBytesProcessed;
	}

	/**
	 * [Output-only] Total bytes processed for the job.
	 * 
	 * @param totalBytesProcessed
	 *            totalBytesProcessed or {@code null} for none
	 */
	public JobStatistics2 setTotalBytesProcessed(java.lang.Long totalBytesProcessed) {
		this.totalBytesProcessed = totalBytesProcessed;
		return this;
	}

	/**
	 * [Output-only, Experimental] Standard SQL only: list of undeclared query
	 * parameters detected during a dry run validation.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<QueryParameter> getUndeclaredQueryParameters() {
		return undeclaredQueryParameters;
	}

	/**
	 * [Output-only, Experimental] Standard SQL only: list of undeclared query
	 * parameters detected during a dry run validation.
	 * 
	 * @param undeclaredQueryParameters
	 *            undeclaredQueryParameters or {@code null} for none
	 */
	public JobStatistics2 setUndeclaredQueryParameters(java.util.List<QueryParameter> undeclaredQueryParameters) {
		this.undeclaredQueryParameters = undeclaredQueryParameters;
		return this;
	}

	public JobStatistics2(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}
}
