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
 * Model definition for QueryParameterValue.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@DataObject(generateConverter = true)
public final class QueryParameterValue  {

  /**
   * [Optional] The array values, if this is an array type.
   * The value may be {@code null}.
   */
  
  private java.util.List<QueryParameterValue> arrayValues;

  /**
   * [Optional] The struct field values, in order of the struct type's declaration.
   * The value may be {@code null}.
   */
  
  private java.util.Map<String, QueryParameterValue> structValues;

  /**
   * [Optional] The value of this value, if a simple scalar type.
   * The value may be {@code null}.
   */
  
  private java.lang.String value;

  /**
   * [Optional] The array values, if this is an array type.
   * @return value or {@code null} for none
   */
  public java.util.List<QueryParameterValue> getArrayValues() {
    return arrayValues;
  }

  /**
   * [Optional] The array values, if this is an array type.
   * @param arrayValues arrayValues or {@code null} for none
   */
  public QueryParameterValue setArrayValues(java.util.List<QueryParameterValue> arrayValues) {
    this.arrayValues = arrayValues;
    return this;
  }

  /**
   * [Optional] The struct field values, in order of the struct type's declaration.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, QueryParameterValue> getStructValues() {
    return structValues;
  }

  /**
   * [Optional] The struct field values, in order of the struct type's declaration.
   * @param structValues structValues or {@code null} for none
   */
  public QueryParameterValue setStructValues(java.util.Map<String, QueryParameterValue> structValues) {
    this.structValues = structValues;
    return this;
  }

  /**
   * [Optional] The value of this value, if a simple scalar type.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * [Optional] The value of this value, if a simple scalar type.
   * @param value value or {@code null} for none
   */
  public QueryParameterValue setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  public QueryParameterValue(JsonObject jsonObject) {
	// TODO Auto-generated constructor stub
}
}