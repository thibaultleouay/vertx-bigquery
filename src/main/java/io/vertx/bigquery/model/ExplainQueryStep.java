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
 * Model definition for ExplainQueryStep.
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
public final class ExplainQueryStep {

	/**
	 * Machine-readable operation type. The value may be {@code null}.
	 */
	
	private java.lang.String kind;

	/**
	 * Human-readable stage descriptions. The value may be {@code null}.
	 */
	
	private java.util.List<java.lang.String> substeps;

	/**
	 * Machine-readable operation type.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getKind() {
		return kind;
	}

	/**
	 * Machine-readable operation type.
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public ExplainQueryStep setKind(java.lang.String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * Human-readable stage descriptions.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<java.lang.String> getSubsteps() {
		return substeps;
	}

	/**
	 * Human-readable stage descriptions.
	 * 
	 * @param substeps
	 *            substeps or {@code null} for none
	 */
	public ExplainQueryStep setSubsteps(java.util.List<java.lang.String> substeps) {
		this.substeps = substeps;
		return this;
	}

	public ExplainQueryStep(JsonObject json) {
		// TODO Auto-generated constructor stub
	}
}
