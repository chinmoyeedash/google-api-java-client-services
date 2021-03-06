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

package com.google.api.services.pubsub.model;

/**
 * Request for the Acknowledge method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AcknowledgeRequest extends com.google.api.client.json.GenericJson {

  /**
   * The acknowledgment ID for the message being acknowledged. This was returned by the Pub/Sub
   * system in the Pull response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ackId;

  /**
   * The subscription whose message is being acknowledged.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscription;

  /**
   * The acknowledgment ID for the message being acknowledged. This was returned by the Pub/Sub
   * system in the Pull response.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAckId() {
    return ackId;
  }

  /**
   * The acknowledgment ID for the message being acknowledged. This was returned by the Pub/Sub
   * system in the Pull response.
   * @param ackId ackId or {@code null} for none
   */
  public AcknowledgeRequest setAckId(java.util.List<java.lang.String> ackId) {
    this.ackId = ackId;
    return this;
  }

  /**
   * The subscription whose message is being acknowledged.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscription() {
    return subscription;
  }

  /**
   * The subscription whose message is being acknowledged.
   * @param subscription subscription or {@code null} for none
   */
  public AcknowledgeRequest setSubscription(java.lang.String subscription) {
    this.subscription = subscription;
    return this;
  }

  @Override
  public AcknowledgeRequest set(String fieldName, Object value) {
    return (AcknowledgeRequest) super.set(fieldName, value);
  }

  @Override
  public AcknowledgeRequest clone() {
    return (AcknowledgeRequest) super.clone();
  }

}
