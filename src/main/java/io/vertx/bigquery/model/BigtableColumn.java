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
 * Model definition for BigtableColumn.
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
public final class BigtableColumn {

	/**
	 * [Optional] The encoding of the values when the type is not STRING. Acceptable
	 * encoding values are: TEXT - indicates values are alphanumeric text strings.
	 * BINARY - indicates values are encoded using HBase Bytes.toBytes family of
	 * functions. 'encoding' can also be set at the column family level. However,
	 * the setting at this level takes precedence if 'encoding' is set at both
	 * levels. The value may be {@code null}.
	 */
	
	private java.lang.String encoding;

	/**
	 * [Optional] If the qualifier is not a valid BigQuery field identifier i.e.
	 * does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as
	 * the column field name and is used as field name in queries. The value may be
	 * {@code null}.
	 */
	
	private java.lang.String fieldName;

	/**
	 * [Optional] If this is set, only the latest version of value in this column
	 * are exposed. 'onlyReadLatest' can also be set at the column family level.
	 * However, the setting at this level takes precedence if 'onlyReadLatest' is
	 * set at both levels. The value may be {@code null}.
	 */
	
	private java.lang.Boolean onlyReadLatest;

	/**
	 * [Required] Qualifier of the column. Columns in the parent column family that
	 * has this exact qualifier are exposed as . field. If the qualifier is valid
	 * UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a
	 * base-64 encoded value must be set to qualifier_encoded. The column field name
	 * is the same as the column qualifier. However, if the qualifier is not a valid
	 * BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid
	 * identifier must be provided as field_name. The value may be {@code null}.
	 */
	
	private java.lang.String qualifierEncoded;

	/**
	 * The value may be {@code null}.
	 */
	
	private java.lang.String qualifierString;

	/**
	 * [Optional] The type to convert the value in cells of this column. The values
	 * are expected to be encoded using HBase Bytes.toBytes function when using the
	 * BINARY encoding value. Following BigQuery types are allowed (case-sensitive)
	 * - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also
	 * be set at the column family level. However, the setting at this level takes
	 * precedence if 'type' is set at both levels. The value may be {@code null}.
	 */
	
	private java.lang.String type;

	/**
	 * [Optional] The encoding of the values when the type is not STRING. Acceptable
	 * encoding values are: TEXT - indicates values are alphanumeric text strings.
	 * BINARY - indicates values are encoded using HBase Bytes.toBytes family of
	 * functions. 'encoding' can also be set at the column family level. However,
	 * the setting at this level takes precedence if 'encoding' is set at both
	 * levels.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getEncoding() {
		return encoding;
	}

	/**
	 * [Optional] The encoding of the values when the type is not STRING. Acceptable
	 * encoding values are: TEXT - indicates values are alphanumeric text strings.
	 * BINARY - indicates values are encoded using HBase Bytes.toBytes family of
	 * functions. 'encoding' can also be set at the column family level. However,
	 * the setting at this level takes precedence if 'encoding' is set at both
	 * levels.
	 * 
	 * @param encoding
	 *            encoding or {@code null} for none
	 */
	public BigtableColumn setEncoding(java.lang.String encoding) {
		this.encoding = encoding;
		return this;
	}

	/**
	 * [Optional] If the qualifier is not a valid BigQuery field identifier i.e.
	 * does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as
	 * the column field name and is used as field name in queries.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getFieldName() {
		return fieldName;
	}

	/**
	 * [Optional] If the qualifier is not a valid BigQuery field identifier i.e.
	 * does not match [a-zA-Z][a-zA-Z0-9_]*, a valid identifier must be provided as
	 * the column field name and is used as field name in queries.
	 * 
	 * @param fieldName
	 *            fieldName or {@code null} for none
	 */
	public BigtableColumn setFieldName(java.lang.String fieldName) {
		this.fieldName = fieldName;
		return this;
	}

	/**
	 * [Optional] If this is set, only the latest version of value in this column
	 * are exposed. 'onlyReadLatest' can also be set at the column family level.
	 * However, the setting at this level takes precedence if 'onlyReadLatest' is
	 * set at both levels.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Boolean getOnlyReadLatest() {
		return onlyReadLatest;
	}

	/**
	 * [Optional] If this is set, only the latest version of value in this column
	 * are exposed. 'onlyReadLatest' can also be set at the column family level.
	 * However, the setting at this level takes precedence if 'onlyReadLatest' is
	 * set at both levels.
	 * 
	 * @param onlyReadLatest
	 *            onlyReadLatest or {@code null} for none
	 */
	public BigtableColumn setOnlyReadLatest(java.lang.Boolean onlyReadLatest) {
		this.onlyReadLatest = onlyReadLatest;
		return this;
	}

	/**
	 * [Required] Qualifier of the column. Columns in the parent column family that
	 * has this exact qualifier are exposed as . field. If the qualifier is valid
	 * UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a
	 * base-64 encoded value must be set to qualifier_encoded. The column field name
	 * is the same as the column qualifier. However, if the qualifier is not a valid
	 * BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid
	 * identifier must be provided as field_name.
	 * 
	 * @see #decodeQualifierEncoded()
	 * @return value or {@code null} for none
	 */
	public java.lang.String getQualifierEncoded() {
		return qualifierEncoded;
	}

	/**
	 * [Required] Qualifier of the column. Columns in the parent column family that
	 * has this exact qualifier are exposed as . field. If the qualifier is valid
	 * UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a
	 * base-64 encoded value must be set to qualifier_encoded. The column field name
	 * is the same as the column qualifier. However, if the qualifier is not a valid
	 * BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid
	 * identifier must be provided as field_name.
	 * 
	 * @see #getQualifierEncoded()
	 * @return Base64 decoded value or {@code null} for none
	 *
	 * @since 1.14
	 */
	public byte[] decodeQualifierEncoded() {
		//FIXME decode me 
		return null;
	}

	/**
	 * [Required] Qualifier of the column. Columns in the parent column family that
	 * has this exact qualifier are exposed as . field. If the qualifier is valid
	 * UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a
	 * base-64 encoded value must be set to qualifier_encoded. The column field name
	 * is the same as the column qualifier. However, if the qualifier is not a valid
	 * BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid
	 * identifier must be provided as field_name.
	 * 
	 * @see #encodeQualifierEncoded()
	 * @param qualifierEncoded
	 *            qualifierEncoded or {@code null} for none
	 */
	public BigtableColumn setQualifierEncoded(java.lang.String qualifierEncoded) {
		this.qualifierEncoded = qualifierEncoded;
		return this;
	}

	/**
	 * [Required] Qualifier of the column. Columns in the parent column family that
	 * has this exact qualifier are exposed as . field. If the qualifier is valid
	 * UTF-8 string, it can be specified in the qualifier_string field. Otherwise, a
	 * base-64 encoded value must be set to qualifier_encoded. The column field name
	 * is the same as the column qualifier. However, if the qualifier is not a valid
	 * BigQuery field identifier i.e. does not match [a-zA-Z][a-zA-Z0-9_]*, a valid
	 * identifier must be provided as field_name.
	 * 
	 * @see #setQualifierEncoded()
	 *
	 *      <p>
	 *      The value is encoded Base64 or {@code null} for none.
	 *      </p>
	 *
	 * @since 1.14
	 */
	public BigtableColumn encodeQualifierEncoded(byte[] qualifierEncoded) {
		//FIXME decode me
		this.qualifierEncoded = null;
		return this;
	}

	/**
	 * @return value or {@code null} for none
	 */
	public java.lang.String getQualifierString() {
		return qualifierString;
	}

	/**
	 * @param qualifierString
	 *            qualifierString or {@code null} for none
	 */
	public BigtableColumn setQualifierString(java.lang.String qualifierString) {
		this.qualifierString = qualifierString;
		return this;
	}

	/**
	 * [Optional] The type to convert the value in cells of this column. The values
	 * are expected to be encoded using HBase Bytes.toBytes function when using the
	 * BINARY encoding value. Following BigQuery types are allowed (case-sensitive)
	 * - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also
	 * be set at the column family level. However, the setting at this level takes
	 * precedence if 'type' is set at both levels.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * [Optional] The type to convert the value in cells of this column. The values
	 * are expected to be encoded using HBase Bytes.toBytes function when using the
	 * BINARY encoding value. Following BigQuery types are allowed (case-sensitive)
	 * - BYTES STRING INTEGER FLOAT BOOLEAN Default type is BYTES. 'type' can also
	 * be set at the column family level. However, the setting at this level takes
	 * precedence if 'type' is set at both levels.
	 * 
	 * @param type
	 *            type or {@code null} for none
	 */
	public BigtableColumn setType(java.lang.String type) {
		this.type = type;
		return this;
	}

	public BigtableColumn(JsonObject json) {
		// TODO Auto-generated constructor stub
	}
}
