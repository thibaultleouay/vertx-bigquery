package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public  final class StructTypes {

	/**
	 * [Optional] Human-oriented description of the field. The value may be
	 * {@code null}.
	 */
	
	private String description;

	/**
	 * [Optional] The name of this field. The value may be {@code null}.
	 */
	
	private String name;

	/**
	 * [Required] The type of this field. The value may be {@code null}.
	 */
	
	private QueryParameterType type;

	/**
	 * [Optional] Human-oriented description of the field.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * [Optional] Human-oriented description of the field.
	 * 
	 * @param description
	 *            description or {@code null} for none
	 */
	public StructTypes setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * [Optional] The name of this field.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getName() {
		return name;
	}

	/**
	 * [Optional] The name of this field.
	 * 
	 * @param name
	 *            name or {@code null} for none
	 */
	public StructTypes setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * [Required] The type of this field.
	 * 
	 * @return value or {@code null} for none
	 */
	public QueryParameterType getType() {
		return type;
	}

	/**
	 * [Required] The type of this field.
	 * 
	 * @param type
	 *            type or {@code null} for none
	 */
	public StructTypes setType(QueryParameterType type) {
		this.type = type;
		return this;
	}

	public StructTypes(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}

}