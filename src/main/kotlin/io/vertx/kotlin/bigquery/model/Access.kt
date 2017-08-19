package io.vertx.kotlin.bigquery.model

import io.vertx.bigquery.model.Access
import io.vertx.bigquery.model.TableReference

/**
 * A function providing a DSL for building [io.vertx.bigquery.model.Access] objects.
 *
 * Model definition for DatasetAccess.
 *
 * @param domain  [Pick one] A domain to grant access to. Any users signed in with the domain specified will be granted the specified access. Example: "example.com".
 * @param groupByEmail  [Pick one] An email address of a Google Group to grant access to.
 * @param role  [Required] Describes the rights granted to the user specified by the other member of the access object. The following string values are supported: READER, WRITER, OWNER.
 * @param specialGroup  [Pick one] A special group to grant access to. Possible values include: projectOwners: Owners of the enclosing project. projectReaders: Readers of the enclosing project. projectWriters: Writers of the enclosing project. allAuthenticatedUsers: All authenticated BigQuery users.
 * @param userByEmail  [Pick one] An email address of a user to grant access to. For example: fred@example.com.
 * @param view  [Pick one] A view from a different dataset to grant access to. Queries executed against that view will have read access to tables in this dataset. The role field is not required when this field is set. If that view is updated by any user, access to the view needs to be granted again via an update operation.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.bigquery.model.Access original] using Vert.x codegen.
 */
fun Access(
  domain: String? = null,
  groupByEmail: String? = null,
  role: String? = null,
  specialGroup: String? = null,
  userByEmail: String? = null,
  view: io.vertx.bigquery.model.TableReference? = null): Access = io.vertx.bigquery.model.Access(io.vertx.core.json.JsonObject()).apply {

  if (domain != null) {
    this.setDomain(domain)
  }
  if (groupByEmail != null) {
    this.setGroupByEmail(groupByEmail)
  }
  if (role != null) {
    this.setRole(role)
  }
  if (specialGroup != null) {
    this.setSpecialGroup(specialGroup)
  }
  if (userByEmail != null) {
    this.setUserByEmail(userByEmail)
  }
  if (view != null) {
    this.setView(view)
  }
}

