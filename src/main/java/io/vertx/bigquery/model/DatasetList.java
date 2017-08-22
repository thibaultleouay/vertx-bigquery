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
 * Model definition for DatasetList.
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
public final class DatasetList {

	/**
	 * An array of the dataset resources in the project. Each resource contains
	 * basic information. For full information about a particular dataset resource,
	 * use the Datasets: get method. This property is omitted when there are no
	 * datasets in the project. The value may be {@code null}.
	 */
	
	private java.util.List<Datasets> datasets;

	/**
	 * A hash value of the results page. You can use this property to determine if
	 * the page has changed since the last request. The value may be {@code null}.
	 */
	
	private java.lang.String etag;

	/**
	 * The list type. This property always returns the value "bigquery#datasetList".
	 * The value may be {@code null}.
	 */
	
	private java.lang.String kind;

	/**
	 * A token that can be used to request the next results page. This property is
	 * omitted on the final results page. The value may be {@code null}.
	 */
	
	private java.lang.String nextPageToken;

	/**
	 * An array of the dataset resources in the project. Each resource contains
	 * basic information. For full information about a particular dataset resource,
	 * use the Datasets: get method. This property is omitted when there are no
	 * datasets in the project.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<Datasets> getDatasets() {
		return datasets;
	}

	/**
	 * An array of the dataset resources in the project. Each resource contains
	 * basic information. For full information about a particular dataset resource,
	 * use the Datasets: get method. This property is omitted when there are no
	 * datasets in the project.
	 * 
	 * @param datasets
	 *            datasets or {@code null} for none
	 */
	public DatasetList setDatasets(java.util.List<Datasets> datasets) {
		this.datasets = datasets;
		return this;
	}

	/**
	 * A hash value of the results page. You can use this property to determine if
	 * the page has changed since the last request.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getEtag() {
		return etag;
	}

	/**
	 * A hash value of the results page. You can use this property to determine if
	 * the page has changed since the last request.
	 * 
	 * @param etag
	 *            etag or {@code null} for none
	 */
	public DatasetList setEtag(java.lang.String etag) {
		this.etag = etag;
		return this;
	}

	/**
	 * The list type. This property always returns the value "bigquery#datasetList".
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getKind() {
		return kind;
	}

	/**
	 * The list type. This property always returns the value "bigquery#datasetList".
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public DatasetList setKind(java.lang.String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * A token that can be used to request the next results page. This property is
	 * omitted on the final results page.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getNextPageToken() {
		return nextPageToken;
	}

	/**
	 * A token that can be used to request the next results page. This property is
	 * omitted on the final results page.
	 * 
	 * @param nextPageToken
	 *            nextPageToken or {@code null} for none
	 */
	public DatasetList setNextPageToken(java.lang.String nextPageToken) {
		this.nextPageToken = nextPageToken;
		return this;
	}

	public DatasetList(JsonObject json) {
		DatasetListConverter.fromJson(json, this);
	}

	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		DatasetListConverter.toJson(this, jsonObject);
		return jsonObject;
	}

	public DatasetList() {
	}
}
