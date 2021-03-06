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

package com.google.api.services.vision.v1.model;

/**
 * Request for async image annotation for a list of images.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AsyncBatchAnnotateImagesRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The desired output location and metadata (e.g. format).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OutputConfig outputConfig;

  /**
   * Individual image annotation requests for this batch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AnnotateImageRequest> requests;

  static {
    // hack to force ProGuard to consider AnnotateImageRequest used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AnnotateImageRequest.class);
  }

  /**
   * Required. The desired output location and metadata (e.g. format).
   * @return value or {@code null} for none
   */
  public OutputConfig getOutputConfig() {
    return outputConfig;
  }

  /**
   * Required. The desired output location and metadata (e.g. format).
   * @param outputConfig outputConfig or {@code null} for none
   */
  public AsyncBatchAnnotateImagesRequest setOutputConfig(OutputConfig outputConfig) {
    this.outputConfig = outputConfig;
    return this;
  }

  /**
   * Individual image annotation requests for this batch.
   * @return value or {@code null} for none
   */
  public java.util.List<AnnotateImageRequest> getRequests() {
    return requests;
  }

  /**
   * Individual image annotation requests for this batch.
   * @param requests requests or {@code null} for none
   */
  public AsyncBatchAnnotateImagesRequest setRequests(java.util.List<AnnotateImageRequest> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public AsyncBatchAnnotateImagesRequest set(String fieldName, Object value) {
    return (AsyncBatchAnnotateImagesRequest) super.set(fieldName, value);
  }

  @Override
  public AsyncBatchAnnotateImagesRequest clone() {
    return (AsyncBatchAnnotateImagesRequest) super.clone();
  }

}
