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
 * Model definition for TableFieldSchema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@DataObject(generateConverter = true)
public final class TableFieldSchema {

  /**
   * [Optional] The field description. The maximum length is 1,024 characters.
   * The value may be {@code null}.
   */
  
  private java.lang.String description;

  /**
   * [Optional] Describes the nested schema fields if the type property is set to RECORD.
   * The value may be {@code null}.
   */
  
  private java.util.List<TableFieldSchema> fields;

  /**
   * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * The value may be {@code null}.
   */
  
  private java.lang.String mode;

  /**
   * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
   * underscores (_), and must start with a letter or underscore. The maximum length is 128
   * characters.
   * The value may be {@code null}.
   */
  
  private java.lang.String name;

  /**
   * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as
   * INTEGER), FLOAT, FLOAT64 (same as FLOAT), BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE,
   * TIME, DATETIME, RECORD (where RECORD indicates that the field contains a nested schema) or
   * STRUCT (same as RECORD).
   * The value may be {@code null}.
   */
  
  private java.lang.String type;

  /**
   * [Optional] The field description. The maximum length is 1,024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * [Optional] The field description. The maximum length is 1,024 characters.
   * @param description description or {@code null} for none
   */
  public TableFieldSchema setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Optional] Describes the nested schema fields if the type property is set to RECORD.
   * @return value or {@code null} for none
   */
  public java.util.List<TableFieldSchema> getFields() {
    return fields;
  }

  /**
   * [Optional] Describes the nested schema fields if the type property is set to RECORD.
   * @param fields fields or {@code null} for none
   */
  public TableFieldSchema setFields(java.util.List<TableFieldSchema> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * @param mode mode or {@code null} for none
   */
  public TableFieldSchema setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
   * underscores (_), and must start with a letter or underscore. The maximum length is 128
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or
   * underscores (_), and must start with a letter or underscore. The maximum length is 128
   * characters.
   * @param name name or {@code null} for none
   */
  public TableFieldSchema setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as
   * INTEGER), FLOAT, FLOAT64 (same as FLOAT), BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE,
   * TIME, DATETIME, RECORD (where RECORD indicates that the field contains a nested schema) or
   * STRUCT (same as RECORD).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as
   * INTEGER), FLOAT, FLOAT64 (same as FLOAT), BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE,
   * TIME, DATETIME, RECORD (where RECORD indicates that the field contains a nested schema) or
   * STRUCT (same as RECORD).
   * @param type type or {@code null} for none
   */
  public TableFieldSchema setType(java.lang.String type) {
    this.type = type;
    return this;
  }
	public TableFieldSchema(JsonObject jsonObject) {
		TableFieldSchemaConverter.fromJson(jsonObject, this);
	}
	public TableFieldSchema() {
	}

	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		TableFieldSchemaConverter.toJson(this, jsonObject);
		return jsonObject;
	}
}
