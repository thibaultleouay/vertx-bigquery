package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public final class Projects {

	/**
	 * A descriptive name for this project. The value may be {@code null}.
	 */

	private String friendlyName;

	/**
	 * An opaque ID of this project. The value may be {@code null}.
	 */

	private String id;

	/**
	 * The resource type. The value may be {@code null}.
	 */

	private String kind;

	/**
	 * The numeric ID of this project. The value may be {@code null}.
	 */

	private java.math.BigInteger numericId;

	/**
	 * A unique reference to this project. The value may be {@code null}.
	 */

	private ProjectReference projectReference;

	/**
	 * A descriptive name for this project.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getFriendlyName() {
		return friendlyName;
	}

	/**
	 * A descriptive name for this project.
	 * 
	 * @param friendlyName
	 *            friendlyName or {@code null} for none
	 */
	public Projects setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
		return this;
	}

	/**
	 * An opaque ID of this project.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getId() {
		return id;
	}

	/**
	 * An opaque ID of this project.
	 * 
	 * @param id
	 *            id or {@code null} for none
	 */
	public Projects setId(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The resource type.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * The resource type.
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public Projects setKind(String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * The numeric ID of this project.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.math.BigInteger getNumericId() {
		return numericId;
	}

	/**
	 * The numeric ID of this project.
	 * 
	 * @param numericId
	 *            numericId or {@code null} for none
	 */
	public Projects setNumericId(java.math.BigInteger numericId) {
		this.numericId = numericId;
		return this;
	}

	/**
	 * A unique reference to this project.
	 * 
	 * @return value or {@code null} for none
	 */
	public ProjectReference getProjectReference() {
		return projectReference;
	}

	/**
	 * A unique reference to this project.
	 * 
	 * @param projectReference
	 *            projectReference or {@code null} for none
	 */
	public Projects setProjectReference(ProjectReference projectReference) {
		this.projectReference = projectReference;
		return this;
	}

	public Projects(JsonObject jsonObject) {
		ProjectsConverter.fromJson(jsonObject, this);
	}

	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		ProjectsConverter.toJson(this, jsonObject);
		return jsonObject;
	}

	public Projects() {
	}
}
