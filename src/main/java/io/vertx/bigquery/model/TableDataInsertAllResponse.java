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
 * Model definition for TableDataInsertAllResponse.
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
public final class TableDataInsertAllResponse {

	/**
	 * An array of errors for rows that were not inserted. The value may be
	 * {@code null}.
	 */

	private java.util.List<InsertErrors> insertErrors;

	/**
	 * The resource type of the response. The value may be {@code null}.
	 */

	private String kind;

	/**
	 * An array of errors for rows that were not inserted.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<InsertErrors> getInsertErrors() {
		return insertErrors;
	}

	/**
	 * An array of errors for rows that were not inserted.
	 * 
	 * @param insertErrors
	 *            insertErrors or {@code null} for none
	 */
	public TableDataInsertAllResponse setInsertErrors(java.util.List<InsertErrors> insertErrors) {
		this.insertErrors = insertErrors;
		return this;
	}

	/**
	 * The resource type of the response.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * The resource type of the response.
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public TableDataInsertAllResponse setKind(String kind) {
		this.kind = kind;
		return this;
	}

	public TableDataInsertAllResponse(JsonObject jsonObject) {
		TableDataInsertAllResponseConverter.fromJson(jsonObject, this);

	}

	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		TableDataInsertAllResponseConverter.toJson(this, jsonObject);
		return jsonObject;
	}
}
