package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * Model definition for TableListTables.
 */
@DataObject(generateConverter = true)
public final class Tables {

	/**
	 * The user-friendly name for this table. The value may be {@code null}.
	 */
	
	private java.lang.String friendlyName;

	/**
	 * An opaque ID of the table The value may be {@code null}.
	 */
	
	private java.lang.String id;

	/**
	 * The resource type. The value may be {@code null}.
	 */
	
	private java.lang.String kind;

	/**
	 * [Experimental] The labels associated with this table. You can use these to
	 * organize and group your tables. The value may be {@code null}.
	 */
	
	private java.util.Map<String, java.lang.String> labels;

	/**
	 * A reference uniquely identifying the table. The value may be {@code null}.
	 */
	
	private TableReference tableReference;

	/**
	 * [Experimental] The time-based partitioning for this table. The value may be
	 * {@code null}.
	 */
	
	private TimePartitioning timePartitioning;

	/**
	 * The type of table. Possible values are: TABLE, VIEW. The value may be
	 * {@code null}.
	 */
	
	private java.lang.String type;

	/**
	 * Additional details for a view. The value may be {@code null}.
	 */
	
	private View view;

	/**
	 * The user-friendly name for this table.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getFriendlyName() {
		return friendlyName;
	}

	/**
	 * The user-friendly name for this table.
	 * 
	 * @param friendlyName
	 *            friendlyName or {@code null} for none
	 */
	public Tables setFriendlyName(java.lang.String friendlyName) {
		this.friendlyName = friendlyName;
		return this;
	}

	/**
	 * An opaque ID of the table
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * An opaque ID of the table
	 * 
	 * @param id
	 *            id or {@code null} for none
	 */
	public Tables setId(java.lang.String id) {
		this.id = id;
		return this;
	}

	/**
	 * The resource type.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getKind() {
		return kind;
	}

	/**
	 * The resource type.
	 * 
	 * @param kind
	 *            kind or {@code null} for none
	 */
	public Tables setKind(java.lang.String kind) {
		this.kind = kind;
		return this;
	}

	/**
	 * [Experimental] The labels associated with this table. You can use these to
	 * organize and group your tables.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.util.Map<String, java.lang.String> getLabels() {
		return labels;
	}

	/**
	 * [Experimental] The labels associated with this table. You can use these to
	 * organize and group your tables.
	 * 
	 * @param labels
	 *            labels or {@code null} for none
	 */
	public Tables setLabels(java.util.Map<String, java.lang.String> labels) {
		this.labels = labels;
		return this;
	}

	/**
	 * A reference uniquely identifying the table.
	 * 
	 * @return value or {@code null} for none
	 */
	public TableReference getTableReference() {
		return tableReference;
	}

	/**
	 * A reference uniquely identifying the table.
	 * 
	 * @param tableReference
	 *            tableReference or {@code null} for none
	 */
	public Tables setTableReference(TableReference tableReference) {
		this.tableReference = tableReference;
		return this;
	}

	/**
	 * [Experimental] The time-based partitioning for this table.
	 * 
	 * @return value or {@code null} for none
	 */
	public TimePartitioning getTimePartitioning() {
		return timePartitioning;
	}

	/**
	 * [Experimental] The time-based partitioning for this table.
	 * 
	 * @param timePartitioning
	 *            timePartitioning or {@code null} for none
	 */
	public Tables setTimePartitioning(TimePartitioning timePartitioning) {
		this.timePartitioning = timePartitioning;
		return this;
	}

	/**
	 * The type of table. Possible values are: TABLE, VIEW.
	 * 
	 * @return value or {@code null} for none
	 */
	public java.lang.String getType() {
		return type;
	}

	/**
	 * The type of table. Possible values are: TABLE, VIEW.
	 * 
	 * @param type
	 *            type or {@code null} for none
	 */
	public Tables setType(java.lang.String type) {
		this.type = type;
		return this;
	}

	/**
	 * Additional details for a view.
	 * 
	 * @return value or {@code null} for none
	 */
	public View getView() {
		return view;
	}

	/**
	 * Additional details for a view.
	 * 
	 * @param view
	 *            view or {@code null} for none
	 */
	public Tables setView(View view) {
		this.view = view;
		return this;
	}

	public Tables(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}
}