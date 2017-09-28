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
 * Model definition for ViewDefinition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@DataObject(generateConverter = true)
public final class ViewDefinition {

  /**
   * [Required] A query that BigQuery executes when the view is referenced.
   * The value may be {@code null}.
   */
  
  private String query;

  /**
   * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set
   * to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-
   * reference/ Queries and views that reference this view must use the same flag value.
   * The value may be {@code null}.
   */
  
  private java.lang.Boolean useLegacySql;

  /**
   * Describes user-defined function resources used in the query.
   * The value may be {@code null}.
   */
  
  private java.util.List<UserDefinedFunctionResource> userDefinedFunctionResources;



  /**
   * [Required] A query that BigQuery executes when the view is referenced.
   * @return value or {@code null} for none
   */
  public String getQuery() {
    return query;
  }

  /**
   * [Required] A query that BigQuery executes when the view is referenced.
   * @param query query or {@code null} for none
   */
  public ViewDefinition setQuery(String query) {
    this.query = query;
    return this;
  }

  /**
   * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set
   * to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-
   * reference/ Queries and views that reference this view must use the same flag value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseLegacySql() {
    return useLegacySql;
  }

  /**
   * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set
   * to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-
   * reference/ Queries and views that reference this view must use the same flag value.
   * @param useLegacySql useLegacySql or {@code null} for none
   */
  public ViewDefinition setUseLegacySql(java.lang.Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
    return this;
  }

  /**
   * Describes user-defined function resources used in the query.
   * @return value or {@code null} for none
   */
  public java.util.List<UserDefinedFunctionResource> getUserDefinedFunctionResources() {
    return userDefinedFunctionResources;
  }

  /**
   * Describes user-defined function resources used in the query.
   * @param userDefinedFunctionResources userDefinedFunctionResources or {@code null} for none
   */
  public ViewDefinition setUserDefinedFunctionResources(java.util.List<UserDefinedFunctionResource> userDefinedFunctionResources) {
    this.userDefinedFunctionResources = userDefinedFunctionResources;
    return this;
  }

  public ViewDefinition(JsonObject jsonObject) {
	// TODO Auto-generated constructor stub
}
}
