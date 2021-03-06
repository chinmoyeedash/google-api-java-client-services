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

package com.google.api.services.youtube.model;

/**
 * Model definition for LiveStreamSnippet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LiveStreamSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The ID that YouTube uses to uniquely identify the channel that is transmitting the stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The stream's description. The value cannot be longer than 10000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefaultStream;

  /**
   * The date and time that the stream was created. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime publishedAt;

  /**
   * The stream's title. The value must be between 1 and 128 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The ID that YouTube uses to uniquely identify the channel that is transmitting the stream.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The ID that YouTube uses to uniquely identify the channel that is transmitting the stream.
   * @param channelId channelId or {@code null} for none
   */
  public LiveStreamSnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The stream's description. The value cannot be longer than 10000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The stream's description. The value cannot be longer than 10000 characters.
   * @param description description or {@code null} for none
   */
  public LiveStreamSnippet setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefaultStream() {
    return isDefaultStream;
  }

  /**
   * @param isDefaultStream isDefaultStream or {@code null} for none
   */
  public LiveStreamSnippet setIsDefaultStream(java.lang.Boolean isDefaultStream) {
    this.isDefaultStream = isDefaultStream;
    return this;
  }

  /**
   * The date and time that the stream was created. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublishedAt() {
    return publishedAt;
  }

  /**
   * The date and time that the stream was created. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public LiveStreamSnippet setPublishedAt(com.google.api.client.util.DateTime publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The stream's title. The value must be between 1 and 128 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The stream's title. The value must be between 1 and 128 characters long.
   * @param title title or {@code null} for none
   */
  public LiveStreamSnippet setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public LiveStreamSnippet set(String fieldName, Object value) {
    return (LiveStreamSnippet) super.set(fieldName, value);
  }

  @Override
  public LiveStreamSnippet clone() {
    return (LiveStreamSnippet) super.clone();
  }

}
