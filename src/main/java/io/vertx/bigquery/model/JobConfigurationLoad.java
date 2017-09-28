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
 * Model definition for JobConfigurationLoad.
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
public final class JobConfigurationLoad {

	/**
	 * [Optional] Accept rows that are missing trailing optional columns. The
	 * missing values are treated as nulls. If false, records with missing trailing
	 * columns are treated as bad records, and if there are too many bad records, an
	 * invalid error is returned in the job result. The default value is false. Only
	 * applicable to CSV, ignored for other formats. The value may be {@code null}.
	 */
	
	private java.lang.Boolean allowJaggedRows;

	/**
	 * Indicates if BigQuery should allow quoted data sections that contain newline
	 * characters in a CSV file. The default value is false. The value may be
	 * {@code null}.
	 */
	
	private java.lang.Boolean allowQuotedNewlines;

	/**
	 * Indicates if we should automatically infer the options and schema for CSV and
	 * JSON sources. The value may be {@code null}.
	 */
	
	private java.lang.Boolean autodetect;

	/**
	 * [Optional] Specifies whether the job is allowed to create new tables. The
	 * following values are supported: CREATE_IF_NEEDED: If the table does not
	 * exist, BigQuery creates the table. CREATE_NEVER: The table must already
	 * exist. If it does not, a 'notFound' error is returned in the job result. The
	 * default value is CREATE_IF_NEEDED. Creation, truncation and append actions
	 * occur as one atomic update upon job completion. The value may be
	 * {@code null}.
	 */
	
	private String createDisposition;

	/**
	 * [Required] The destination table to load the data into. The value may be
	 * {@code null}.
	 */
	
	private TableReference destinationTable;

	/**
	 * [Optional] The character encoding of the data. The supported values are UTF-8
	 * or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after
	 * the raw, binary data has been split using the values of the quote and
	 * fieldDelimiter properties. The value may be {@code null}.
	 */
	
	private String encoding;

	/**
	 * [Optional] The separator for fields in a CSV file. The separator can be any
	 * ISO-8859-1 single- byte character. To use a character in the range 128-255,
	 * you must encode the character as UTF8. BigQuery converts the string to
	 * ISO-8859-1 encoding, and then uses the first byte of the encoded string to
	 * split the data in its raw, binary state. BigQuery also supports the escape
	 * sequence "\t" to specify a tab separator. The default value is a comma (',').
	 * The value may be {@code null}.
	 */
	
	private String fieldDelimiter;

	/**
	 * [Optional] Indicates if BigQuery should allow extra values that are not
	 * represented in the table schema. If true, the extra values are ignored. If
	 * false, records with extra columns are treated as bad records, and if there
	 * are too many bad records, an invalid error is returned in the job result. The
	 * default value is false. The sourceFormat property determines what BigQuery
	 * treats as an extra value: CSV: Trailing columns JSON: Named values that don't
	 * match any column names The value may be {@code null}.
	 */
	
	private java.lang.Boolean ignoreUnknownValues;

	/**
	 * [Optional] The maximum number of bad records that BigQuery can ignore when
	 * running the job. If the number of bad records exceeds this value, an invalid
	 * error is returned in the job result. The default value is 0, which requires
	 * that all records are valid. The value may be {@code null}.
	 */
	
	private java.lang.Integer maxBadRecords;

	/**
	 * [Optional] Specifies a string that represents a null value in a CSV file. For
	 * example, if you specify "\N", BigQuery interprets "\N" as a null value when
	 * loading a CSV file. The default value is the empty string. If you set this
	 * property to a custom value, BigQuery throws an error if an empty string is
	 * present for all data types except for STRING and BYTE. For STRING and BYTE
	 * columns, BigQuery interprets the empty string as an empty value. The value
	 * may be {@code null}.
	 */
	
	private String nullMarker;

	/**
	 * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity
	 * properties to load into BigQuery from a Cloud Datastore backup. Property
	 * names are case sensitive and must be top-level properties. If no properties
	 * are specified, BigQuery loads all properties. If any named property isn't
	 * found in the Cloud Datastore backup, an invalid error is returned in the job
	 * result. The value may be {@code null}.
	 */
	
	private java.util.List<String> projectionFields;

	/**
	 * [Optional] The value that is used to quote data sections in a CSV file.
	 * BigQuery converts the string to ISO-8859-1 encoding, and then uses the first
	 * byte of the encoded string to split the data in its raw, binary state. The
	 * default value is a double-quote ('"'). If your data does not contain quoted
	 * sections, set the property value to an empty string. If your data contains
	 * quoted newline characters, you must also set the allowQuotedNewlines property
	 * to true. The value may be {@code null}.
	 */
	
	private String quote;

	/**
	 * [Optional] The schema for the destination table. The schema can be omitted if
	 * the destination table already exists, or if you're loading data from Google
	 * Cloud Datastore. The value may be {@code null}.
	 */
	
	private TableSchema schema;

	/**
	 * [Deprecated] The inline schema. For CSV schemas, specify as
	 * "Field1:Type1[,Field2:Type2]*". For example, "foo:STRING, bar:INTEGER,
	 * baz:FLOAT". The value may be {@code null}.
	 */
	
	private String schemaInline;

	/**
	 * [Deprecated] The format of the schemaInline property. The value may be
	 * {@code null}.
	 */
	
	private String schemaInlineFormat;

	/**
	 * [Experimental] Allows the schema of the desitination table to be updated as a
	 * side effect of the load job if a schema is autodetected or supplied in the
	 * job configuration. Schema update options are supported in two cases: when
	 * writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and
	 * the destination table is a partition of a table, specified by partition
	 * decorators. For normal tables, WRITE_TRUNCATE will always overwrite the
	 * schema. One or more of the following values are specified:
	 * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema.
	 * ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original
	 * schema to nullable. The value may be {@code null}.
	 */
	
	private java.util.List<String> schemaUpdateOptions;

	/**
	 * [Optional] The number of rows at the top of a CSV file that BigQuery will
	 * skip when loading the data. The default value is 0. This property is useful
	 * if you have header rows in the file that should be skipped. The value may be
	 * {@code null}.
	 */
	
	private java.lang.Integer skipLeadingRows;

	/**
	 * [Optional] The format of the data files. For CSV files, specify "CSV". For
	 * datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON,
	 * specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". The default value
	 * is CSV. The value may be {@code null}.
	 */
	
	private String sourceFormat;

	/**
	 * [Required] The fully-qualified URIs that point to your data in Google Cloud.
	 * For Google Cloud Storage URIs: Each URI can contain one '*' wildcard
	 * character and it must come after the 'bucket' name. Size limits related to
	 * load jobs apply to external data sources. For Google Cloud Bigtable URIs:
	 * Exactly one URI can be specified and it has be a fully specified and valid
	 * HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore
	 * backups: Exactly one URI can be specified. Also, the '*' wildcard character
	 * is not allowed. The value may be {@code null}.
	 */
	
	private java.util.List<String> sourceUris;

	/**
	 * [Experimental] If specified, configures time-based partitioning for the
	 * destination table. The value may be {@code null}.
	 */
	
	private TimePartitioning timePartitioning;

	/**
	 * [Optional] Specifies the action that occurs if the destination table already
	 * exists. The following values are supported: WRITE_TRUNCATE: If the table
	 * already exists, BigQuery overwrites the table data. WRITE_APPEND: If the
	 * table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If
	 * the table already exists and contains data, a 'duplicate' error is returned
	 * in the job result. The default value is WRITE_APPEND. Each action is atomic
	 * and only occurs if BigQuery is able to complete the job successfully.
	 * Creation, truncation and append actions occur as one atomic update upon job
	 * completion. The value may be {@code null}.
	 */
	
	private String writeDisposition;

	/**
	 * [Optional] Accept rows that are missing trailing optional columns. The
	 * missing values are treated as nulls. If false, records with missing trailing
	 * columns are treated as bad records, and if there are too many bad records, an
	 * invalid error is returned in the job result. The default value is false. Only
	 * applicable to CSV, ignored for other formats.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Boolean getAllowJaggedRows() {
		return allowJaggedRows;
	}

	/**
	 * [Optional] Accept rows that are missing trailing optional columns. The
	 * missing values are treated as nulls. If false, records with missing trailing
	 * columns are treated as bad records, and if there are too many bad records, an
	 * invalid error is returned in the job result. The default value is false. Only
	 * applicable to CSV, ignored for other formats.
	 * 
	 * @param allowJaggedRows
	 *            allowJaggedRows or {@code null} for none
	 */
	public JobConfigurationLoad setAllowJaggedRows(java.lang.Boolean allowJaggedRows) {
		this.allowJaggedRows = allowJaggedRows;
		return this;
	}

	/**
	 * Indicates if BigQuery should allow quoted data sections that contain newline
	 * characters in a CSV file. The default value is false.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Boolean getAllowQuotedNewlines() {
		return allowQuotedNewlines;
	}

	/**
	 * Indicates if BigQuery should allow quoted data sections that contain newline
	 * characters in a CSV file. The default value is false.
	 * 
	 * @param allowQuotedNewlines
	 *            allowQuotedNewlines or {@code null} for none
	 */
	public JobConfigurationLoad setAllowQuotedNewlines(java.lang.Boolean allowQuotedNewlines) {
		this.allowQuotedNewlines = allowQuotedNewlines;
		return this;
	}

	/**
	 * Indicates if we should automatically infer the options and schema for CSV and
	 * JSON sources.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Boolean getAutodetect() {
		return autodetect;
	}

	/**
	 * Indicates if we should automatically infer the options and schema for CSV and
	 * JSON sources.
	 * 
	 * @param autodetect
	 *            autodetect or {@code null} for none
	 */
	public JobConfigurationLoad setAutodetect(java.lang.Boolean autodetect) {
		this.autodetect = autodetect;
		return this;
	}

	/**
	 * [Optional] Specifies whether the job is allowed to create new tables. The
	 * following values are supported: CREATE_IF_NEEDED: If the table does not
	 * exist, BigQuery creates the table. CREATE_NEVER: The table must already
	 * exist. If it does not, a 'notFound' error is returned in the job result. The
	 * default value is CREATE_IF_NEEDED. Creation, truncation and append actions
	 * occur as one atomic update upon job completion.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getCreateDisposition() {
		return createDisposition;
	}

	/**
	 * [Optional] Specifies whether the job is allowed to create new tables. The
	 * following values are supported: CREATE_IF_NEEDED: If the table does not
	 * exist, BigQuery creates the table. CREATE_NEVER: The table must already
	 * exist. If it does not, a 'notFound' error is returned in the job result. The
	 * default value is CREATE_IF_NEEDED. Creation, truncation and append actions
	 * occur as one atomic update upon job completion.
	 * 
	 * @param createDisposition
	 *            createDisposition or {@code null} for none
	 */
	public JobConfigurationLoad setCreateDisposition(String createDisposition) {
		this.createDisposition = createDisposition;
		return this;
	}

	/**
	 * [Required] The destination table to load the data into.
	 * 
	 * @return value or {@code null} for none
	 */
	public TableReference getDestinationTable() {
		return destinationTable;
	}

	/**
	 * [Required] The destination table to load the data into.
	 * 
	 * @param destinationTable
	 *            destinationTable or {@code null} for none
	 */
	public JobConfigurationLoad setDestinationTable(TableReference destinationTable) {
		this.destinationTable = destinationTable;
		return this;
	}

	/**
	 * [Optional] The character encoding of the data. The supported values are UTF-8
	 * or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after
	 * the raw, binary data has been split using the values of the quote and
	 * fieldDelimiter properties.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * [Optional] The character encoding of the data. The supported values are UTF-8
	 * or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after
	 * the raw, binary data has been split using the values of the quote and
	 * fieldDelimiter properties.
	 * 
	 * @param encoding
	 *            encoding or {@code null} for none
	 */
	public JobConfigurationLoad setEncoding(String encoding) {
		this.encoding = encoding;
		return this;
	}

	/**
	 * [Optional] The separator for fields in a CSV file. The separator can be any
	 * ISO-8859-1 single- byte character. To use a character in the range 128-255,
	 * you must encode the character as UTF8. BigQuery converts the string to
	 * ISO-8859-1 encoding, and then uses the first byte of the encoded string to
	 * split the data in its raw, binary state. BigQuery also supports the escape
	 * sequence "\t" to specify a tab separator. The default value is a comma (',').
	 * 
	 * @return value or {@code null} for none
	 */
	public String getFieldDelimiter() {
		return fieldDelimiter;
	}

	/**
	 * [Optional] The separator for fields in a CSV file. The separator can be any
	 * ISO-8859-1 single- byte character. To use a character in the range 128-255,
	 * you must encode the character as UTF8. BigQuery converts the string to
	 * ISO-8859-1 encoding, and then uses the first byte of the encoded string to
	 * split the data in its raw, binary state. BigQuery also supports the escape
	 * sequence "\t" to specify a tab separator. The default value is a comma (',').
	 * 
	 * @param fieldDelimiter
	 *            fieldDelimiter or {@code null} for none
	 */
	public JobConfigurationLoad setFieldDelimiter(String fieldDelimiter) {
		this.fieldDelimiter = fieldDelimiter;
		return this;
	}

	/**
	 * [Optional] Indicates if BigQuery should allow extra values that are not
	 * represented in the table schema. If true, the extra values are ignored. If
	 * false, records with extra columns are treated as bad records, and if there
	 * are too many bad records, an invalid error is returned in the job result. The
	 * default value is false. The sourceFormat property determines what BigQuery
	 * treats as an extra value: CSV: Trailing columns JSON: Named values that don't
	 * match any column names
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Boolean getIgnoreUnknownValues() {
		return ignoreUnknownValues;
	}

	/**
	 * [Optional] Indicates if BigQuery should allow extra values that are not
	 * represented in the table schema. If true, the extra values are ignored. If
	 * false, records with extra columns are treated as bad records, and if there
	 * are too many bad records, an invalid error is returned in the job result. The
	 * default value is false. The sourceFormat property determines what BigQuery
	 * treats as an extra value: CSV: Trailing columns JSON: Named values that don't
	 * match any column names
	 * 
	 * @param ignoreUnknownValues
	 *            ignoreUnknownValues or {@code null} for none
	 */
	public JobConfigurationLoad setIgnoreUnknownValues(java.lang.Boolean ignoreUnknownValues) {
		this.ignoreUnknownValues = ignoreUnknownValues;
		return this;
	}

	/**
	 * [Optional] The maximum number of bad records that BigQuery can ignore when
	 * running the job. If the number of bad records exceeds this value, an invalid
	 * error is returned in the job result. The default value is 0, which requires
	 * that all records are valid.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Integer getMaxBadRecords() {
		return maxBadRecords;
	}

	/**
	 * [Optional] The maximum number of bad records that BigQuery can ignore when
	 * running the job. If the number of bad records exceeds this value, an invalid
	 * error is returned in the job result. The default value is 0, which requires
	 * that all records are valid.
	 * 
	 * @param maxBadRecords
	 *            maxBadRecords or {@code null} for none
	 */
	public JobConfigurationLoad setMaxBadRecords(java.lang.Integer maxBadRecords) {
		this.maxBadRecords = maxBadRecords;
		return this;
	}

	/**
	 * [Optional] Specifies a string that represents a null value in a CSV file. For
	 * example, if you specify "\N", BigQuery interprets "\N" as a null value when
	 * loading a CSV file. The default value is the empty string. If you set this
	 * property to a custom value, BigQuery throws an error if an empty string is
	 * present for all data types except for STRING and BYTE. For STRING and BYTE
	 * columns, BigQuery interprets the empty string as an empty value.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getNullMarker() {
		return nullMarker;
	}

	/**
	 * [Optional] Specifies a string that represents a null value in a CSV file. For
	 * example, if you specify "\N", BigQuery interprets "\N" as a null value when
	 * loading a CSV file. The default value is the empty string. If you set this
	 * property to a custom value, BigQuery throws an error if an empty string is
	 * present for all data types except for STRING and BYTE. For STRING and BYTE
	 * columns, BigQuery interprets the empty string as an empty value.
	 * 
	 * @param nullMarker
	 *            nullMarker or {@code null} for none
	 */
	public JobConfigurationLoad setNullMarker(String nullMarker) {
		this.nullMarker = nullMarker;
		return this;
	}

	/**
	 * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity
	 * properties to load into BigQuery from a Cloud Datastore backup. Property
	 * names are case sensitive and must be top-level properties. If no properties
	 * are specified, BigQuery loads all properties. If any named property isn't
	 * found in the Cloud Datastore backup, an invalid error is returned in the job
	 * result.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<String> getProjectionFields() {
		return projectionFields;
	}

	/**
	 * If sourceFormat is set to "DATASTORE_BACKUP", indicates which entity
	 * properties to load into BigQuery from a Cloud Datastore backup. Property
	 * names are case sensitive and must be top-level properties. If no properties
	 * are specified, BigQuery loads all properties. If any named property isn't
	 * found in the Cloud Datastore backup, an invalid error is returned in the job
	 * result.
	 * 
	 * @param projectionFields
	 *            projectionFields or {@code null} for none
	 */
	public JobConfigurationLoad setProjectionFields(java.util.List<String> projectionFields) {
		this.projectionFields = projectionFields;
		return this;
	}

	/**
	 * [Optional] The value that is used to quote data sections in a CSV file.
	 * BigQuery converts the string to ISO-8859-1 encoding, and then uses the first
	 * byte of the encoded string to split the data in its raw, binary state. The
	 * default value is a double-quote ('"'). If your data does not contain quoted
	 * sections, set the property value to an empty string. If your data contains
	 * quoted newline characters, you must also set the allowQuotedNewlines property
	 * to true.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getQuote() {
		return quote;
	}

	/**
	 * [Optional] The value that is used to quote data sections in a CSV file.
	 * BigQuery converts the string to ISO-8859-1 encoding, and then uses the first
	 * byte of the encoded string to split the data in its raw, binary state. The
	 * default value is a double-quote ('"'). If your data does not contain quoted
	 * sections, set the property value to an empty string. If your data contains
	 * quoted newline characters, you must also set the allowQuotedNewlines property
	 * to true.
	 * 
	 * @param quote
	 *            quote or {@code null} for none
	 */
	public JobConfigurationLoad setQuote(String quote) {
		this.quote = quote;
		return this;
	}

	/**
	 * [Optional] The schema for the destination table. The schema can be omitted if
	 * the destination table already exists, or if you're loading data from Google
	 * Cloud Datastore.
	 * 
	 * @return value or {@code null} for none
	 */
	public TableSchema getSchema() {
		return schema;
	}

	/**
	 * [Optional] The schema for the destination table. The schema can be omitted if
	 * the destination table already exists, or if you're loading data from Google
	 * Cloud Datastore.
	 * 
	 * @param schema
	 *            schema or {@code null} for none
	 */
	public JobConfigurationLoad setSchema(TableSchema schema) {
		this.schema = schema;
		return this;
	}

	/**
	 * [Deprecated] The inline schema. For CSV schemas, specify as
	 * "Field1:Type1[,Field2:Type2]*". For example, "foo:STRING, bar:INTEGER,
	 * baz:FLOAT".
	 * 
	 * @return value or {@code null} for none
	 */
	public String getSchemaInline() {
		return schemaInline;
	}

	/**
	 * [Deprecated] The inline schema. For CSV schemas, specify as
	 * "Field1:Type1[,Field2:Type2]*". For example, "foo:STRING, bar:INTEGER,
	 * baz:FLOAT".
	 * 
	 * @param schemaInline
	 *            schemaInline or {@code null} for none
	 */
	public JobConfigurationLoad setSchemaInline(String schemaInline) {
		this.schemaInline = schemaInline;
		return this;
	}

	/**
	 * [Deprecated] The format of the schemaInline property.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getSchemaInlineFormat() {
		return schemaInlineFormat;
	}

	/**
	 * [Deprecated] The format of the schemaInline property.
	 * 
	 * @param schemaInlineFormat
	 *            schemaInlineFormat or {@code null} for none
	 */
	public JobConfigurationLoad setSchemaInlineFormat(String schemaInlineFormat) {
		this.schemaInlineFormat = schemaInlineFormat;
		return this;
	}

	/**
	 * [Experimental] Allows the schema of the desitination table to be updated as a
	 * side effect of the load job if a schema is autodetected or supplied in the
	 * job configuration. Schema update options are supported in two cases: when
	 * writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and
	 * the destination table is a partition of a table, specified by partition
	 * decorators. For normal tables, WRITE_TRUNCATE will always overwrite the
	 * schema. One or more of the following values are specified:
	 * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema.
	 * ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original
	 * schema to nullable.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<String> getSchemaUpdateOptions() {
		return schemaUpdateOptions;
	}

	/**
	 * [Experimental] Allows the schema of the desitination table to be updated as a
	 * side effect of the load job if a schema is autodetected or supplied in the
	 * job configuration. Schema update options are supported in two cases: when
	 * writeDisposition is WRITE_APPEND; when writeDisposition is WRITE_TRUNCATE and
	 * the destination table is a partition of a table, specified by partition
	 * decorators. For normal tables, WRITE_TRUNCATE will always overwrite the
	 * schema. One or more of the following values are specified:
	 * ALLOW_FIELD_ADDITION: allow adding a nullable field to the schema.
	 * ALLOW_FIELD_RELAXATION: allow relaxing a required field in the original
	 * schema to nullable.
	 * 
	 * @param schemaUpdateOptions
	 *            schemaUpdateOptions or {@code null} for none
	 */
	public JobConfigurationLoad setSchemaUpdateOptions(java.util.List<String> schemaUpdateOptions) {
		this.schemaUpdateOptions = schemaUpdateOptions;
		return this;
	}

	/**
	 * [Optional] The number of rows at the top of a CSV file that BigQuery will
	 * skip when loading the data. The default value is 0. This property is useful
	 * if you have header rows in the file that should be skipped.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Integer getSkipLeadingRows() {
		return skipLeadingRows;
	}

	/**
	 * [Optional] The number of rows at the top of a CSV file that BigQuery will
	 * skip when loading the data. The default value is 0. This property is useful
	 * if you have header rows in the file that should be skipped.
	 * 
	 * @param skipLeadingRows
	 *            skipLeadingRows or {@code null} for none
	 */
	public JobConfigurationLoad setSkipLeadingRows(java.lang.Integer skipLeadingRows) {
		this.skipLeadingRows = skipLeadingRows;
		return this;
	}

	/**
	 * [Optional] The format of the data files. For CSV files, specify "CSV". For
	 * datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON,
	 * specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". The default value
	 * is CSV.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getSourceFormat() {
		return sourceFormat;
	}

	/**
	 * [Optional] The format of the data files. For CSV files, specify "CSV". For
	 * datastore backups, specify "DATASTORE_BACKUP". For newline-delimited JSON,
	 * specify "NEWLINE_DELIMITED_JSON". For Avro, specify "AVRO". The default value
	 * is CSV.
	 * 
	 * @param sourceFormat
	 *            sourceFormat or {@code null} for none
	 */
	public JobConfigurationLoad setSourceFormat(String sourceFormat) {
		this.sourceFormat = sourceFormat;
		return this;
	}

	/**
	 * [Required] The fully-qualified URIs that point to your data in Google Cloud.
	 * For Google Cloud Storage URIs: Each URI can contain one '*' wildcard
	 * character and it must come after the 'bucket' name. Size limits related to
	 * load jobs apply to external data sources. For Google Cloud Bigtable URIs:
	 * Exactly one URI can be specified and it has be a fully specified and valid
	 * HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore
	 * backups: Exactly one URI can be specified. Also, the '*' wildcard character
	 * is not allowed.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<String> getSourceUris() {
		return sourceUris;
	}

	/**
	 * [Required] The fully-qualified URIs that point to your data in Google Cloud.
	 * For Google Cloud Storage URIs: Each URI can contain one '*' wildcard
	 * character and it must come after the 'bucket' name. Size limits related to
	 * load jobs apply to external data sources. For Google Cloud Bigtable URIs:
	 * Exactly one URI can be specified and it has be a fully specified and valid
	 * HTTPS URL for a Google Cloud Bigtable table. For Google Cloud Datastore
	 * backups: Exactly one URI can be specified. Also, the '*' wildcard character
	 * is not allowed.
	 * 
	 * @param sourceUris
	 *            sourceUris or {@code null} for none
	 */
	public JobConfigurationLoad setSourceUris(java.util.List<String> sourceUris) {
		this.sourceUris = sourceUris;
		return this;
	}

	/**
	 * [Experimental] If specified, configures time-based partitioning for the
	 * destination table.
	 * 
	 * @return value or {@code null} for none
	 */
	public TimePartitioning getTimePartitioning() {
		return timePartitioning;
	}

	/**
	 * [Experimental] If specified, configures time-based partitioning for the
	 * destination table.
	 * 
	 * @param timePartitioning
	 *            timePartitioning or {@code null} for none
	 */
	public JobConfigurationLoad setTimePartitioning(TimePartitioning timePartitioning) {
		this.timePartitioning = timePartitioning;
		return this;
	}

	/**
	 * [Optional] Specifies the action that occurs if the destination table already
	 * exists. The following values are supported: WRITE_TRUNCATE: If the table
	 * already exists, BigQuery overwrites the table data. WRITE_APPEND: If the
	 * table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If
	 * the table already exists and contains data, a 'duplicate' error is returned
	 * in the job result. The default value is WRITE_APPEND. Each action is atomic
	 * and only occurs if BigQuery is able to complete the job successfully.
	 * Creation, truncation and append actions occur as one atomic update upon job
	 * completion.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getWriteDisposition() {
		return writeDisposition;
	}

	/**
	 * [Optional] Specifies the action that occurs if the destination table already
	 * exists. The following values are supported: WRITE_TRUNCATE: If the table
	 * already exists, BigQuery overwrites the table data. WRITE_APPEND: If the
	 * table already exists, BigQuery appends the data to the table. WRITE_EMPTY: If
	 * the table already exists and contains data, a 'duplicate' error is returned
	 * in the job result. The default value is WRITE_APPEND. Each action is atomic
	 * and only occurs if BigQuery is able to complete the job successfully.
	 * Creation, truncation and append actions occur as one atomic update upon job
	 * completion.
	 * 
	 * @param writeDisposition
	 *            writeDisposition or {@code null} for none
	 */
	public JobConfigurationLoad setWriteDisposition(String writeDisposition) {
		this.writeDisposition = writeDisposition;
		return this;
	}

	public JobConfigurationLoad(JsonObject json) {
		// TODO Auto-generated constructor stub
	}
}
