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

package com.google.api.services.people.v1.model;

/**
 * A request to update an existing contact's photo. All requests must have a valid photo format:
 * JPEG or PNG.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateContactPhotoRequest extends com.google.api.client.json.GenericJson {

  /**
   * **Optional.** Not specifying any fields will skip the post mutate read. A field mask to
   * restrict which fields on the person are returned. Multiple fields can be specified by
   * separating them with commas. Valid values are:
   *
   * * addresses * ageRanges * biographies * birthdays * braggingRights * coverPhotos *
   * emailAddresses * events * genders * imClients * interests * locales * memberships * metadata *
   * names * nicknames * occupations * organizations * phoneNumbers * photos * relations *
   * relationshipInterests * relationshipStatuses * residences * sipAddresses * skills * taglines *
   * urls * userDefined
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String personFields;

  /**
   * Raw photo bytes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photoBytes;

  /**
   * **Optional.** Not specifying any fields will skip the post mutate read. A field mask to
   * restrict which fields on the person are returned. Multiple fields can be specified by
   * separating them with commas. Valid values are:
   *
   * * addresses * ageRanges * biographies * birthdays * braggingRights * coverPhotos *
   * emailAddresses * events * genders * imClients * interests * locales * memberships * metadata *
   * names * nicknames * occupations * organizations * phoneNumbers * photos * relations *
   * relationshipInterests * relationshipStatuses * residences * sipAddresses * skills * taglines *
   * urls * userDefined
   * @return value or {@code null} for none
   */
  public String getPersonFields() {
    return personFields;
  }

  /**
   * **Optional.** Not specifying any fields will skip the post mutate read. A field mask to
   * restrict which fields on the person are returned. Multiple fields can be specified by
   * separating them with commas. Valid values are:
   *
   * * addresses * ageRanges * biographies * birthdays * braggingRights * coverPhotos *
   * emailAddresses * events * genders * imClients * interests * locales * memberships * metadata *
   * names * nicknames * occupations * organizations * phoneNumbers * photos * relations *
   * relationshipInterests * relationshipStatuses * residences * sipAddresses * skills * taglines *
   * urls * userDefined
   * @param personFields personFields or {@code null} for none
   */
  public UpdateContactPhotoRequest setPersonFields(String personFields) {
    this.personFields = personFields;
    return this;
  }

  /**
   * Raw photo bytes
   * @see #decodePhotoBytes()
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoBytes() {
    return photoBytes;
  }

  /**
   * Raw photo bytes
   * @see #getPhotoBytes()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePhotoBytes() {
    return com.google.api.client.util.Base64.decodeBase64(photoBytes);
  }

  /**
   * Raw photo bytes
   * @see #encodePhotoBytes()
   * @param photoBytes photoBytes or {@code null} for none
   */
  public UpdateContactPhotoRequest setPhotoBytes(java.lang.String photoBytes) {
    this.photoBytes = photoBytes;
    return this;
  }

  /**
   * Raw photo bytes
   * @see #setPhotoBytes()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public UpdateContactPhotoRequest encodePhotoBytes(byte[] photoBytes) {
    this.photoBytes = com.google.api.client.util.Base64.encodeBase64URLSafeString(photoBytes);
    return this;
  }

  @Override
  public UpdateContactPhotoRequest set(String fieldName, Object value) {
    return (UpdateContactPhotoRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateContactPhotoRequest clone() {
    return (UpdateContactPhotoRequest) super.clone();
  }

}
