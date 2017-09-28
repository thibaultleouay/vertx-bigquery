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
 * Model definition for TableList.
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
public final class TableList {

	/**
	 * A hash of this page of results. The value may be {@code null}.
	 */

	private String etag;

	/**
	 * The type of list. The value may be {@code null}.
	 */

	private String kind;

	/**
	 * A token to request the next page of results. The value may be {@code null}.
	 */

	private String nextPageToken;

	/**
	 * Tables in the requested dataset. The value may be {@code null}.
	 */

	private java.util.List<Tables> tables;

	/**
	 * The total number of tables in the dataset. The value may be {@code null}.
	 */

	private java.lang.Integer totalItems;

	/**
	 * A hash of this page of results.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getEtag() {
		return etag;
	}

	/**
	 * A hash of this page of results.
	 * 
	 * @param etag
	 *            etag or {@code null} for none
	 */
	public TableList setEtag(String etag) {
		this.etag = etag;
		return this;
	}

	/**
	 * The type of list.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * The type of list.
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public TableList setKind(String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * A token to request the next page of results.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}

	/**
	 * A token to request the next page of results.
	 * 
	 * @param nextPageToken
	 *            nextPageToken or {@code null} for none
	 */
	public TableList setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		return this;
	}

	/**
	 * Tables in the requested dataset.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<Tables> getTables() {
		return tables;
	}

	/**
	 * Tables in the requested dataset.
	 * 
	 * @param tables
	 *            tables or {@code null} for none
	 */
	public TableList setTables(java.util.List<Tables> tables) {
		this.tables = tables;
		return this;
	}

	/**
	 * The total number of tables in the dataset.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Integer getTotalItems() {
		return totalItems;
	}

	/**
	 * The total number of tables in the dataset.
	 * 
	 * @param totalItems
	 *            totalItems or {@code null} for none
	 */
	public TableList setTotalItems(java.lang.Integer totalItems) {
		this.totalItems = totalItems;
		return this;
	}

	public TableList(JsonObject jsonObject) {
		TableListConverter.fromJson(jsonObject, this);

	}

	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		TableListConverter.toJson(this, jsonObject);
		return jsonObject;
	}
	
	public TableList() {
	}
}
