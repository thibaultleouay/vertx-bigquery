package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true)
public  final class Projects  {

  /**
   * A descriptive name for this project.
   * The value may be {@code null}.
   */
  
  private java.lang.String friendlyName;

  /**
   * An opaque ID of this project.
   * The value may be {@code null}.
   */
  
  private java.lang.String id;

  /**
   * The resource type.
   * The value may be {@code null}.
   */
  
  private java.lang.String kind;

  /**
   * The numeric ID of this project.
   * The value may be {@code null}.
   */

  private java.math.BigInteger numericId;

  /**
   * A unique reference to this project.
   * The value may be {@code null}.
   */
  
  private ProjectReference projectReference;

  /**
   * A descriptive name for this project.
   * @return value or {@code null} for none
   */
  public java.lang.String getFriendlyName() {
    return friendlyName;
  }

  /**
   * A descriptive name for this project.
   * @param friendlyName friendlyName or {@code null} for none
   */
  public Projects setFriendlyName(java.lang.String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * An opaque ID of this project.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * An opaque ID of this project.
   * @param id id or {@code null} for none
   */
  public Projects setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The resource type.
   * @param kind kind or {@code null} for none
   */
  public Projects setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The numeric ID of this project.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getNumericId() {
    return numericId;
  }

  /**
   * The numeric ID of this project.
   * @param numericId numericId or {@code null} for none
   */
  public Projects setNumericId(java.math.BigInteger numericId) {
    this.numericId = numericId;
    return this;
  }

  /**
   * A unique reference to this project.
   * @return value or {@code null} for none
   */
  public ProjectReference getProjectReference() {
    return projectReference;
  }

  /**
   * A unique reference to this project.
   * @param projectReference projectReference or {@code null} for none
   */
  public Projects setProjectReference(ProjectReference projectReference) {
    this.projectReference = projectReference;
    return this;
  }

  public Projects(JsonObject jsonObject) {
		// TODO Auto-generated constructor stub
	}
}
