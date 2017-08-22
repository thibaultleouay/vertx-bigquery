package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public  final class Datasets {

	/**
	 * The dataset reference. Use this property to access specific parts of the
	 * dataset's ID, such as project ID or dataset ID. The value may be
	 * {@code null}.
	 */
	
	private DatasetReference datasetReference;

	/**
	 * A descriptive name for the dataset, if one exists. The value may be
	 * {@code null}.
	 */
	
	private java.lang.String friendlyName;

	/**
	 * The fully-qualified, unique, opaque ID of the dataset. The value may be
	 * {@code null}.
	 */
	
	private java.lang.String id;

	/**
	 * The resource type. This property always returns the value "bigquery#dataset".
	 * The value may be {@code null}.
	 */
	
	private java.lang.String kind;

	/**
	 * The labels associated with this dataset. You can use these to organize and
	 * group your datasets. The value may be {@code null}.
	 */
	
	private java.util.Map<String, java.lang.String> labels;

	/**
	 * The dataset reference. Use this property to access specific parts of the
	 * dataset's ID, such as project ID or dataset ID.
	 * 
	 * @return value or {@code null} for none
	 */
	public DatasetReference getDatasetReference() {
		return datasetReference;
	}

	/**
	 * The dataset reference. Use this property to access specific parts of the
	 * dataset's ID, such as project ID or dataset ID.
	 * 
	 * @param datasetReference
	 *            datasetReference or {@code null} for none
	 */
	public Datasets setDatasetReference(DatasetReference datasetReference) {
		this.datasetReference = datasetReference;
		return this;
	}

	/**
	 * A descriptive name for the dataset, if one exists.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getFriendlyName() {
		return friendlyName;
	}

	/**
	 * A descriptive name for the dataset, if one exists.
	 * 
	 * @param friendlyName
	 *            friendlyName or {@code null} for none
	 */
	public Datasets setFriendlyName(java.lang.String friendlyName) {
		this.friendlyName = friendlyName;
		return this;
	}

	/**
	 * The fully-qualified, unique, opaque ID of the dataset.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * The fully-qualified, unique, opaque ID of the dataset.
	 * 
	 * @param id
	 *            id or {@code null} for none
	 */
	public Datasets setId(java.lang.String id) {
		this.id = id;
		return this;
	}

	/**
	 * The resource type. This property always returns the value "bigquery#dataset".
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getKind() {
		return kind;
	}

	/**
	 * The resource type. This property always returns the value "bigquery#dataset".
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public Datasets setKind(java.lang.String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * The labels associated with this dataset. You can use these to organize and
	 * group your datasets.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.Map<String, java.lang.String> getLabels() {
		return labels;
	}

	/**
	 * The labels associated with this dataset. You can use these to organize and
	 * group your datasets.
	 * 
	 * @param labels
	 *            labels or {@code null} for none
	 */
	public Datasets setLabels(java.util.Map<String, java.lang.String> labels) {
		this.labels = labels;
		return this;
	}

	public Datasets(JsonObject json) {
		DatasetsConverter.fromJson(json, this);
	}
	
	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		DatasetsConverter.toJson(this, jsonObject);
		return jsonObject;
	}
	
	public Datasets() {
	}

}
