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
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.jobs.v3.model;

/**
 * Job compensation details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompensationInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Annualized base compensation range. Computed as base compensation entry's
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompensationRange annualizedBaseCompensationRange;

  /**
   * Output only. Annualized total compensation range. Computed as all compensation entries'
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompensationRange annualizedTotalCompensationRange;

  /**
   * Optional.
   *
   * Job compensation information.
   *
   * At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as
   * ** base compensation entry ** for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CompensationEntry> entries;

  static {
    // hack to force ProGuard to consider CompensationEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CompensationEntry.class);
  }

  /**
   * Output only. Annualized base compensation range. Computed as base compensation entry's
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * @return value or {@code null} for none
   */
  public CompensationRange getAnnualizedBaseCompensationRange() {
    return annualizedBaseCompensationRange;
  }

  /**
   * Output only. Annualized base compensation range. Computed as base compensation entry's
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * @param annualizedBaseCompensationRange annualizedBaseCompensationRange or {@code null} for none
   */
  public CompensationInfo setAnnualizedBaseCompensationRange(CompensationRange annualizedBaseCompensationRange) {
    this.annualizedBaseCompensationRange = annualizedBaseCompensationRange;
    return this;
  }

  /**
   * Output only. Annualized total compensation range. Computed as all compensation entries'
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * @return value or {@code null} for none
   */
  public CompensationRange getAnnualizedTotalCompensationRange() {
    return annualizedTotalCompensationRange;
  }

  /**
   * Output only. Annualized total compensation range. Computed as all compensation entries'
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * @param annualizedTotalCompensationRange annualizedTotalCompensationRange or {@code null} for none
   */
  public CompensationInfo setAnnualizedTotalCompensationRange(CompensationRange annualizedTotalCompensationRange) {
    this.annualizedTotalCompensationRange = annualizedTotalCompensationRange;
    return this;
  }

  /**
   * Optional.
   *
   * Job compensation information.
   *
   * At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as
   * ** base compensation entry ** for the job.
   * @return value or {@code null} for none
   */
  public java.util.List<CompensationEntry> getEntries() {
    return entries;
  }

  /**
   * Optional.
   *
   * Job compensation information.
   *
   * At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as
   * ** base compensation entry ** for the job.
   * @param entries entries or {@code null} for none
   */
  public CompensationInfo setEntries(java.util.List<CompensationEntry> entries) {
    this.entries = entries;
    return this;
  }

  @Override
  public CompensationInfo set(String fieldName, Object value) {
    return (CompensationInfo) super.set(fieldName, value);
  }

  @Override
  public CompensationInfo clone() {
    return (CompensationInfo) super.clone();
  }

}
