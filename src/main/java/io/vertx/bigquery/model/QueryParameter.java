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
 * Model definition for QueryParameter.
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
public final class QueryParameter {

	/**
	 * [Optional] If unset, this is a positional parameter. Otherwise, should be
	 * unique within a query. The value may be {@code null}.
	 */
	
	private String name;

	/**
	 * [Required] The type of this parameter. The value may be {@code null}.
	 */
	
	private QueryParameterType parameterType;

	/**
	 * [Required] The value of this parameter. The value may be {@code null}.
	 */
	
	private QueryParameterValue parameterValue;

	/**
	 * [Optional] If unset, this is a positional parameter. Otherwise, should be
	 * unique within a query.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getName() {
		return name;
	}

	/**
	 * [Optional] If unset, this is a positional parameter. Otherwise, should be
	 * unique within a query.
	 * 
	 * @param name
	 *            name or {@code null} for none
	 */
	public QueryParameter setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * [Required] The type of this parameter.
	 * 
	 * @return value or {@code null} for none
	 */
	public QueryParameterType getParameterType() {
		return parameterType;
	}

	/**
	 * [Required] The type of this parameter.
	 * 
	 * @param parameterType
	 *            parameterType or {@code null} for none
	 */
	public QueryParameter setParameterType(QueryParameterType parameterType) {
		this.parameterType = parameterType;
		return this;
	}

	/**
	 * [Required] The value of this parameter.
	 * 
	 * @return value or {@code null} for none
	 */
	public QueryParameterValue getParameterValue() {
		return parameterValue;
	}

	/**
	 * [Required] The value of this parameter.
	 * 
	 * @param parameterValue
	 *            parameterValue or {@code null} for none
	 */
	public QueryParameter setParameterValue(QueryParameterValue parameterValue) {
		this.parameterValue = parameterValue;
		return this;
	}

	public QueryParameter(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}
}
