package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * Model definition for DatasetAccess.
 */
@DataObject(generateConverter = true)
public final class Access {

	/**
//	 * [Pick one] A domain to grant access to. Any users signed in with the domain
	 * specified will be granted the specified access. Example: "example.com". The
	 * value may be {@code null}.
	 */
	
	private String domain;

	/**
	 * [Pick one] An email address of a Google Group to grant access to. The value
	 * may be {@code null}.
	 */
	
	private String groupByEmail;

	/**
	 * [Required] Describes the rights granted to the user specified by the other
	 * member of the access object. The following string values are supported:
	 * READER, WRITER, OWNER. The value may be {@code null}.
	 */
	
	private String role;

	/**
	 * [Pick one] A special group to grant access to. Possible values include:
	 * projectOwners: Owners of the enclosing project. projectReaders: Readers of
	 * the enclosing project. projectWriters: Writers of the enclosing project.
	 * allAuthenticatedUsers: All authenticated BigQuery users. The value may be
	 * {@code null}.
	 */
	
	private String specialGroup;

	/**
	 * [Pick one] An email address of a user to grant access to. For example:
	 * fred@example.com. The value may be {@code null}.
	 */
	
	private String userByEmail;

	/**
	 * [Pick one] A view from a different dataset to grant access to. Queries
	 * executed against that view will have read access to tables in this dataset.
	 * The role field is not required when this field is set. If that view is
	 * updated by any user, access to the view needs to be granted again via an
	 * update operation. The value may be {@code null}.
	 */
	
	private TableReference view;

	/**
	 * [Pick one] A domain to grant access to. Any users signed in with the domain
	 * specified will be granted the specified access. Example: "example.com".
	 * 
	 * @return value or {@code null} for none
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * [Pick one] A domain to grant access to. Any users signed in with the domain
	 * specified will be granted the specified access. Example: "example.com".
	 * 
	 * @param domain
	 *            domain or {@code null} for none
	 */
	public Access setDomain(String domain) {
		this.domain = domain;
		return this;
	}

	/**
	 * [Pick one] An email address of a Google Group to grant access to.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getGroupByEmail() {
		return groupByEmail;
	}

	/**
	 * [Pick one] An email address of a Google Group to grant access to.
	 * 
	 * @param groupByEmail
	 *            groupByEmail or {@code null} for none
	 */
	public Access setGroupByEmail(String groupByEmail) {
		this.groupByEmail = groupByEmail;
		return this;
	}

	/**
	 * [Required] Describes the rights granted to the user specified by the other
	 * member of the access object. The following string values are supported:
	 * READER, WRITER, OWNER.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getRole() {
		return role;
	}

	/**
	 * [Required] Describes the rights granted to the user specified by the other
	 * member of the access object. The following string values are supported:
	 * READER, WRITER, OWNER.
	 * 
	 * @param role
	 *            role or {@code null} for none
	 */
	public Access setRole(String role) {
		this.role = role;
		return this;
	}

	/**
	 * [Pick one] A special group to grant access to. Possible values include:
	 * projectOwners: Owners of the enclosing project. projectReaders: Readers of
	 * the enclosing project. projectWriters: Writers of the enclosing project.
	 * allAuthenticatedUsers: All authenticated BigQuery users.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getSpecialGroup() {
		return specialGroup;
	}

	/**
	 * [Pick one] A special group to grant access to. Possible values include:
	 * projectOwners: Owners of the enclosing project. projectReaders: Readers of
	 * the enclosing project. projectWriters: Writers of the enclosing project.
	 * allAuthenticatedUsers: All authenticated BigQuery users.
	 * 
	 * @param specialGroup
	 *            specialGroup or {@code null} for none
	 */
	public Access setSpecialGroup(String specialGroup) {
		this.specialGroup = specialGroup;
		return this;
	}

	/**
	 * [Pick one] An email address of a user to grant access to. For example:
	 * fred@example.com.
	 * 
	 * @return value or {@code null} for none
	 */
	public String getUserByEmail() {
		return userByEmail;
	}

	/**
	 * [Pick one] An email address of a user to grant access to. For example:
	 * fred@example.com.
	 * 
	 * @param userByEmail
	 *            userByEmail or {@code null} for none
	 */
	public Access setUserByEmail(String userByEmail) {
		this.userByEmail = userByEmail;
		return this;
	}

	/**
	 * [Pick one] A view from a different dataset to grant access to. Queries
	 * executed against that view will have read access to tables in this dataset.
	 * The role field is not required when this field is set. If that view is
	 * updated by any user, access to the view needs to be granted again via an
	 * update operation.
	 * 
	 * @return value or {@code null} for none
	 */
	public TableReference getView() {
		return view;
	}

	/**
	 * [Pick one] A view from a different dataset to grant access to. Queries
	 * executed against that view will have read access to tables in this dataset.
	 * The role field is not required when this field is set. If that view is
	 * updated by any user, access to the view needs to be granted again via an
	 * update operation.
	 * 
	 * @param view
	 *            view or {@code null} for none
	 */
	public Access setView(TableReference view) {
		this.view = view;
		return this;
	}

	public Access() {
	}
	
	public Access(JsonObject json) {
		AccessConverter.fromJson(json, this);
	}
	
	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		AccessConverter.toJson(this, jsonObject);
		return jsonObject;
	}
}