package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public  final class Rows {

	/**
	 * [Optional] A unique ID for each row. BigQuery uses this property to detect
	 * duplicate insertion requests on a best-effort basis. The value may be
	 * {@code null}.
	 */
	
	private java.lang.String insertId;

	/**
	 * [Required] A JSON object that contains a row of data. The object's properties
	 * and values must match the destination table's schema. The value may be
	 * {@code null}.
	 */
	
	private java.util.Map<String, String> json;

	/**
	 * [Optional] A unique ID for each row. BigQuery uses this property to detect
	 * duplicate insertion requests on a best-effort basis.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getInsertId() {
		return insertId;
	}

	/**
	 * [Optional] A unique ID for each row. BigQuery uses this property to detect
	 * duplicate insertion requests on a best-effort basis.
	 * 
	 * @param insertId
	 *            insertId or {@code null} for none
	 */
	public Rows setInsertId(java.lang.String insertId) {
		this.insertId = insertId;
		return this;
	}

	/**
	 * [Required] A JSON object that contains a row of data. The object's properties
	 * and values must match the destination table's schema.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.Map<String, String> getJson() {
		return json;
	}

	/**
	 * [Required] A JSON object that contains a row of data. The object's properties
	 * and values must match the destination table's schema.
	 * 
	 * @param json
	 *            json or {@code null} for none
	 */
	public Rows setJson(java.util.Map<String, String> json) {
		this.json = json;
		return this;
	}

	public Rows(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}
}
