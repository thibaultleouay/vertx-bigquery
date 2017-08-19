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

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

/**
 * Model definition for GoogleSheetsOptions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@DataObject(generateConverter = true)
public final class GoogleSheetsOptions  {

  /**
   * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the
   * data. The default value is 0. This property is useful if you have header rows that should be
   * skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified -
   * Autodetect tries to detect headers in the first row. If they are not detected, the row is read
   * as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 -
   * Instructs autodetect that there are no headers and data should be read starting from the first
   * row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row
   * N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract
   * column names for the detected schema.
   * The value may be {@code null}.
   */

  private java.lang.Long skipLeadingRows;

  /**
   * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the
   * data. The default value is 0. This property is useful if you have header rows that should be
   * skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified -
   * Autodetect tries to detect headers in the first row. If they are not detected, the row is read
   * as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 -
   * Instructs autodetect that there are no headers and data should be read starting from the first
   * row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row
   * N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract
   * column names for the detected schema.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSkipLeadingRows() {
    return skipLeadingRows;
  }

  /**
   * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the
   * data. The default value is 0. This property is useful if you have header rows that should be
   * skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified -
   * Autodetect tries to detect headers in the first row. If they are not detected, the row is read
   * as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 -
   * Instructs autodetect that there are no headers and data should be read starting from the first
   * row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row
   * N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract
   * column names for the detected schema.
   * @param skipLeadingRows skipLeadingRows or {@code null} for none
   */
  public GoogleSheetsOptions setSkipLeadingRows(java.lang.Long skipLeadingRows) {
    this.skipLeadingRows = skipLeadingRows;
    return this;
  }

  public GoogleSheetsOptions(JsonObject json) {
	// TODO Auto-generated constructor stub
}
}