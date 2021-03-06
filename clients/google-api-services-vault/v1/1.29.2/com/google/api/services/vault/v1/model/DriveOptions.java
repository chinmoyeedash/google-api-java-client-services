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

package com.google.api.services.vault.v1.model;

/**
 * Drive search advanced options
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DriveOptions extends com.google.api.client.json.GenericJson {

  /**
   * Set to true to include shared drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeSharedDrives;

  /**
   * Set to true to include Team Drive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeTeamDrives;

  /**
   * Search the versions of the Drive file as of the reference date. These timestamps are in GMT and
   * rounded down to the given date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String versionDate;

  /**
   * Set to true to include shared drive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeSharedDrives() {
    return includeSharedDrives;
  }

  /**
   * Set to true to include shared drive.
   * @param includeSharedDrives includeSharedDrives or {@code null} for none
   */
  public DriveOptions setIncludeSharedDrives(java.lang.Boolean includeSharedDrives) {
    this.includeSharedDrives = includeSharedDrives;
    return this;
  }

  /**
   * Set to true to include Team Drive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeTeamDrives() {
    return includeTeamDrives;
  }

  /**
   * Set to true to include Team Drive.
   * @param includeTeamDrives includeTeamDrives or {@code null} for none
   */
  public DriveOptions setIncludeTeamDrives(java.lang.Boolean includeTeamDrives) {
    this.includeTeamDrives = includeTeamDrives;
    return this;
  }

  /**
   * Search the versions of the Drive file as of the reference date. These timestamps are in GMT and
   * rounded down to the given date.
   * @return value or {@code null} for none
   */
  public String getVersionDate() {
    return versionDate;
  }

  /**
   * Search the versions of the Drive file as of the reference date. These timestamps are in GMT and
   * rounded down to the given date.
   * @param versionDate versionDate or {@code null} for none
   */
  public DriveOptions setVersionDate(String versionDate) {
    this.versionDate = versionDate;
    return this;
  }

  @Override
  public DriveOptions set(String fieldName, Object value) {
    return (DriveOptions) super.set(fieldName, value);
  }

  @Override
  public DriveOptions clone() {
    return (DriveOptions) super.clone();
  }

}
