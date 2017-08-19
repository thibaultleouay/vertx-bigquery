package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * Model definition for TableDataInsertAllResponseInsertErrors.
 */
@DataObject(generateConverter = true)
public final class InsertErrors {

	/**
	 * Error information for the row indicated by the index property. The value may
	 * be {@code null}.
	 */
	
	private java.util.List<ErrorProto> errors;


	/**
	 * The index of the row that error applies to. The value may be {@code null}.
	 */
	
	private java.lang.Long index;

	/**
	 * Error information for the row indicated by the index property.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.List<ErrorProto> getErrors() {
		return errors;
	}

	/**
	 * Error information for the row indicated by the index property.
	 * 
	 * @param errors
	 *            errors or {@code null} for none
	 */
	public InsertErrors setErrors(java.util.List<ErrorProto> errors) {
		this.errors = errors;
		return this;
	}

	/**
	 * The index of the row that error applies to.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.Long getIndex() {
		return index;
	}

	/**
	 * The index of the row that error applies to.
	 * 
	 * @param index
	 *            index or {@code null} for none
	 */
	public InsertErrors setIndex(java.lang.Long index) {
		this.index = index;
		return this;
	}

	public InsertErrors(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}
}