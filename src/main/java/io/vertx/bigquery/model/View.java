package io.vertx.bigquery.model;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * Additional details for a view.
 */
@DataObject(generateConverter = true)
public  final class View  {

  /**
   * True if view is defined in legacy SQL dialect, false if in standard SQL.
   * The value may be {@code null}.
   */
  
  private java.lang.Boolean useLegacySql;

  /**
   * True if view is defined in legacy SQL dialect, false if in standard SQL.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseLegacySql() {
    return useLegacySql;
  }

  /**
   * True if view is defined in legacy SQL dialect, false if in standard SQL.
   * @param useLegacySql useLegacySql or {@code null} for none
   */
  public View setUseLegacySql(java.lang.Boolean useLegacySql) {
    this.useLegacySql = useLegacySql;
    return this;
  }
	public View(JsonObject jsonObject) {
		ViewConverter.fromJson(jsonObject, this);
	}

	public View() {}
	
	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		ViewConverter.toJson(this, jsonObject);
		return jsonObject;
	}
}