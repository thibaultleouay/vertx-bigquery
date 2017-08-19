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
 * Model definition for JobStatistics4.
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
public final class JobStatistics4 {

	/**
	 * [Output-only] Number of files per destination URI or URI pattern specified in
	 * the extract configuration. These values will be in the same order as the URIs
	 * specified in the 'destinationUris' field. The value may be {@code null}.
	 */
	
	private java.util.List<java.lang.Long> destinationUriFileCounts;

	/**
	 * [Output-only] Number of files per destination URI or URI pattern specified in
	 * the extract configuration. These values will be in the same order as the URIs
	 * specified in the 'destinationUris' field.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<java.lang.Long> getDestinationUriFileCounts() {
		return destinationUriFileCounts;
	}

	/**
	 * [Output-only] Number of files per destination URI or URI pattern specified in
	 * the extract configuration. These values will be in the same order as the URIs
	 * specified in the 'destinationUris' field.
	 * 
	 * @param destinationUriFileCounts
	 *            destinationUriFileCounts or {@code null} for none
	 */
	public JobStatistics4 setDestinationUriFileCounts(java.util.List<java.lang.Long> destinationUriFileCounts) {
		this.destinationUriFileCounts = destinationUriFileCounts;
		return this;
	}

	public JobStatistics4(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}
}