/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * Modify at your own risk.
 */

package io.vertx.bigquery.model;

import com.google.gson.JsonSerializationContext;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * Model definition for TimePartitioning.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@DataObject(generateConverter = true)
public final class TimePartitioning {

  /**
   * [Optional] Number of milliseconds for which to keep the storage for a partition.
   * The value may be {@code null}.
   */

  private java.lang.Long expirationMs;

  /**
   * [Required] The only type supported is DAY, which will generate one partition per day based on
   * data loading time.
   * The value may be {@code null}.
   */
  
  private java.lang.String type;

  /**
   * [Optional] Number of milliseconds for which to keep the storage for a partition.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpirationMs() {
    return expirationMs;
  }

  /**
   * [Optional] Number of milliseconds for which to keep the storage for a partition.
   * @param expirationMs expirationMs or {@code null} for none
   */
  public TimePartitioning setExpirationMs(java.lang.Long expirationMs) {
    this.expirationMs = expirationMs;
    return this;
  }

  /**
   * [Required] The only type supported is DAY, which will generate one partition per day based on
   * data loading time.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * [Required] The only type supported is DAY, which will generate one partition per day based on
   * data loading time.
   * @param type type or {@code null} for none
   */
  public TimePartitioning setType(java.lang.String type) {
    this.type = type;
    return this;
  }
	public TimePartitioning(JsonObject jsonObject) {
		TimePartitioningConverter.fromJson(jsonObject, this);
	}
	public TimePartitioning() {}
	
	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		TimePartitioningConverter.toJson(this, jsonObject);
		return jsonObject;
	}
}
