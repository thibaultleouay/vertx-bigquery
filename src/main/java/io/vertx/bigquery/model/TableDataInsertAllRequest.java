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
 * Model definition for TableDataInsertAllRequest.
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
public final class TableDataInsertAllRequest {

	/**
	 * [Optional] Accept rows that contain values that do not match the schema. The
	 * unknown values are ignored. Default is false, which treats unknown values as
	 * errors. The value may be {@code null}.
	 */
	
	private java.lang.Boolean ignoreUnknownValues;

	/**
	 * The resource type of the response. The value may be {@code null}.
	 */
	
	private java.lang.String kind;

	/**
	 * The rows to insert. The value may be {@code null}.
	 */
	
	private java.util.List<Rows> rows;

	/**
	 * [Optional] Insert all valid rows of a request, even if invalid rows exist.
	 * The default value is false, which causes the entire request to fail if any
	 * invalid rows exist. The value may be {@code null}.
	 */
	
	private java.lang.Boolean skipInvalidRows;

	/**
	 * [Experimental] If specified, treats the destination table as a base template,
	 * and inserts the rows into an instance table named
	 * "{destination}{templateSuffix}". BigQuery will manage creation of the
	 * instance table, using the schema of the base template table. See
	 * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables
	 * for considerations when working with templates tables. The value may be
	 * {@code null}.
	 */
	
	private java.lang.String templateSuffix;

	/**
	 * [Optional] Accept rows that contain values that do not match the schema. The
	 * unknown values are ignored. Default is false, which treats unknown values as
	 * errors.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Boolean getIgnoreUnknownValues() {
		return ignoreUnknownValues;
	}

	/**
	 * [Optional] Accept rows that contain values that do not match the schema. The
	 * unknown values are ignored. Default is false, which treats unknown values as
	 * errors.
	 * 
	 * @param ignoreUnknownValues
	 *            ignoreUnknownValues or {@code null} for none
	 */
	public TableDataInsertAllRequest setIgnoreUnknownValues(java.lang.Boolean ignoreUnknownValues) {
		this.ignoreUnknownValues = ignoreUnknownValues;
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
	public TableDataInsertAllRequest setKind(java.lang.String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * The rows to insert.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<Rows> getRows() {
		return rows;
	}

	/**
	 * The rows to insert.
	 * 
	 * @param rows
	 *            rows or {@code null} for none
	 */
	public TableDataInsertAllRequest setRows(java.util.List<Rows> rows) {
		this.rows = rows;
		return this;
	}

	/**
	 * [Optional] Insert all valid rows of a request, even if invalid rows exist.
	 * The default value is false, which causes the entire request to fail if any
	 * invalid rows exist.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Boolean getSkipInvalidRows() {
		return skipInvalidRows;
	}

	/**
	 * [Optional] Insert all valid rows of a request, even if invalid rows exist.
	 * The default value is false, which causes the entire request to fail if any
	 * invalid rows exist.
	 * 
	 * @param skipInvalidRows
	 *            skipInvalidRows or {@code null} for none
	 */
	public TableDataInsertAllRequest setSkipInvalidRows(java.lang.Boolean skipInvalidRows) {
		this.skipInvalidRows = skipInvalidRows;
		return this;
	}

	/**
	 * [Experimental] If specified, treats the destination table as a base template,
	 * and inserts the rows into an instance table named
	 * "{destination}{templateSuffix}". BigQuery will manage creation of the
	 * instance table, using the schema of the base template table. See
	 * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables
	 * for considerations when working with templates tables.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getTemplateSuffix() {
		return templateSuffix;
	}

	/**
	 * [Experimental] If specified, treats the destination table as a base template,
	 * and inserts the rows into an instance table named
	 * "{destination}{templateSuffix}". BigQuery will manage creation of the
	 * instance table, using the schema of the base template table. See
	 * https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables
	 * for considerations when working with templates tables.
	 * 
	 * @param templateSuffix
	 *            templateSuffix or {@code null} for none
	 */
	public TableDataInsertAllRequest setTemplateSuffix(java.lang.String templateSuffix) {
		this.templateSuffix = templateSuffix;
		return this;
	}

	public TableDataInsertAllRequest(JsonObject jsonObject) {
	}
}