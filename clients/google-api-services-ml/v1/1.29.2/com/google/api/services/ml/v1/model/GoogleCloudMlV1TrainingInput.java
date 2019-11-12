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

package com.google.api.services.ml.v1.model;

/**
 * Represents input parameters for a training job. When using the gcloud command to submit your
 * training job, you can specify the input parameters as command-line arguments and/or in a YAML
 * configuration file referenced from the --config command-line argument. For details, see the guide
 * to submitting a training job.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1TrainingInput extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Command line arguments to pass to the program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> args;

  /**
   * Optional. The set of Hyperparameters to tune.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1HyperparameterSpec hyperparameters;

  /**
   * Optional. A Google Cloud Storage path in which to store training outputs and other data needed
   * for training. This path is passed to your TensorFlow program as the '--job-dir' command-line
   * argument. The benefit of specifying this field is that Cloud ML validates the path for use in
   * training.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobDir;

  /**
   * Optional. The configuration for your master worker.
   *
   * You should only set `masterConfig.acceleratorConfig` if `masterType` is set to a Compute Engine
   * machine type. Learn about [restrictions on accelerator configurations for training.](/ml-
   * engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `masterConfig.imageUri` only if you build a custom image. Only one of
   * `masterConfig.imageUri` and `runtimeVersion` should be set. Learn more about [configuring
   * custom containers](/ml-engine/docs/distributed-training-containers).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1ReplicaConfig masterConfig;

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's master worker.
   * You must specify this field when `scaleTier` is set to `CUSTOM`.
   *
   * You can use certain Compute Engine machine types directly in this field. The following types
   * are supported:
   *
   * - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` -
   * `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` -
   * `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` -
   * `n1-highcpu-64` - `n1-highcpu-96`
   *
   * Learn more about [using Compute Engine machine types](/ml-engine/docs/machine-types#compute-
   * engine-machine-types).
   *
   * Alternatively, you can use the following legacy machine types:
   *
   * - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` -
   * `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` -
   * `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` -
   * `complex_model_l_v100`
   *
   * Learn more about [using legacy machine types](/ml-engine/docs/machine-types#legacy-machine-
   * types).
   *
   * Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more
   * about the [special configuration options for training with TPUs](/ml-engine/docs/tensorflow
   * /using-tpus#configuring_a_custom_tpu_machine).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String masterType;

  /**
   * Required. The Google Cloud Storage location of the packages with the training program and any
   * additional dependencies. The maximum number of package URIs is 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> packageUris;

  /**
   * Optional. The configuration for parameter servers.
   *
   * You should only set `parameterServerConfig.acceleratorConfig` if `parameterServerConfigType` is
   * set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations
   * for training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `parameterServerConfig.imageUri` only if you build a custom image for your parameter
   * server. If `parameterServerConfig.imageUri` has not been set, AI Platform uses the value of
   * `masterConfig.imageUri`. Learn more about [configuring custom containers](/ml-engine/docs
   * /distributed-training-containers).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1ReplicaConfig parameterServerConfig;

  /**
   * Optional. The number of parameter server replicas to use for the training job. Each replica in
   * the cluster will be of the type specified in `parameter_server_type`.
   *
   * This value can only be used when `scale_tier` is set to `CUSTOM`.If you set this value, you
   * must also set `parameter_server_type`.
   *
   * The default value is zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long parameterServerCount;

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's parameter
   * server.
   *
   * The supported values are the same as those described in the entry for `master_type`.
   *
   * This value must be consistent with the category of machine type that `masterType` uses. In
   * other words, both must be Compute Engine machine types or both must be legacy machine types.
   *
   * This value must be present when `scaleTier` is set to `CUSTOM` and `parameter_server_count` is
   * greater than zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parameterServerType;

  /**
   * Required. The Python module name to run after installing the packages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pythonModule;

  /**
   * Optional. The version of Python used in training. If not set, the default version is '2.7'.
   * Python '3.5' is available when `runtime_version` is set to '1.4' and above. Python '2.7' works
   * with all supported runtime versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pythonVersion;

  /**
   * Required. The Google Compute Engine region to run the training job in. See the available
   * regions for AI Platform services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Optional. The AI Platform runtime version to use for training. If not set, AI Platform uses the
   * default stable version, 1.0. For more information, see the runtime version list and how to
   * manage runtime versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtimeVersion;

  /**
   * Required. Specifies the machine types, the number of replicas for workers and parameter
   * servers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scaleTier;

  /**
   * Optional. Use 'chief' instead of 'master' in TF_CONFIG when Custom Container is used and
   * evaluator is not specified.
   *
   * Defaults to false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useChiefInTfConfig;

  /**
   * Optional. The configuration for workers.
   *
   * You should only set `workerConfig.acceleratorConfig` if `workerType` is set to a Compute Engine
   * machine type. [Learn about restrictions on accelerator configurations for training.](/ml-
   * engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `workerConfig.imageUri` only if you build a custom image for your worker. If
   * `workerConfig.imageUri` has not been set, AI Platform uses the value of
   * `masterConfig.imageUri`. Learn more about [configuring custom containers](/ml-engine/docs
   * /distributed-training-containers).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudMlV1ReplicaConfig workerConfig;

  /**
   * Optional. The number of worker replicas to use for the training job. Each replica in the
   * cluster will be of the type specified in `worker_type`.
   *
   * This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you
   * must also set `worker_type`.
   *
   * The default value is zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long workerCount;

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's worker nodes.
   *
   * The supported values are the same as those described in the entry for `masterType`.
   *
   * This value must be consistent with the category of machine type that `masterType` uses. In
   * other words, both must be Compute Engine machine types or both must be legacy machine types.
   *
   * If you use `cloud_tpu` for this value, see special instructions for [configuring a custom TPU
   * machine](/ml-engine/docs/tensorflow/using-tpus#configuring_a_custom_tpu_machine).
   *
   * This value must be present when `scaleTier` is set to `CUSTOM` and `workerCount` is greater
   * than zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerType;

  /**
   * Optional. Command line arguments to pass to the program.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArgs() {
    return args;
  }

  /**
   * Optional. Command line arguments to pass to the program.
   * @param args args or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setArgs(java.util.List<java.lang.String> args) {
    this.args = args;
    return this;
  }

  /**
   * Optional. The set of Hyperparameters to tune.
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1HyperparameterSpec getHyperparameters() {
    return hyperparameters;
  }

  /**
   * Optional. The set of Hyperparameters to tune.
   * @param hyperparameters hyperparameters or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setHyperparameters(GoogleCloudMlV1HyperparameterSpec hyperparameters) {
    this.hyperparameters = hyperparameters;
    return this;
  }

  /**
   * Optional. A Google Cloud Storage path in which to store training outputs and other data needed
   * for training. This path is passed to your TensorFlow program as the '--job-dir' command-line
   * argument. The benefit of specifying this field is that Cloud ML validates the path for use in
   * training.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobDir() {
    return jobDir;
  }

  /**
   * Optional. A Google Cloud Storage path in which to store training outputs and other data needed
   * for training. This path is passed to your TensorFlow program as the '--job-dir' command-line
   * argument. The benefit of specifying this field is that Cloud ML validates the path for use in
   * training.
   * @param jobDir jobDir or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setJobDir(java.lang.String jobDir) {
    this.jobDir = jobDir;
    return this;
  }

  /**
   * Optional. The configuration for your master worker.
   *
   * You should only set `masterConfig.acceleratorConfig` if `masterType` is set to a Compute Engine
   * machine type. Learn about [restrictions on accelerator configurations for training.](/ml-
   * engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `masterConfig.imageUri` only if you build a custom image. Only one of
   * `masterConfig.imageUri` and `runtimeVersion` should be set. Learn more about [configuring
   * custom containers](/ml-engine/docs/distributed-training-containers).
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1ReplicaConfig getMasterConfig() {
    return masterConfig;
  }

  /**
   * Optional. The configuration for your master worker.
   *
   * You should only set `masterConfig.acceleratorConfig` if `masterType` is set to a Compute Engine
   * machine type. Learn about [restrictions on accelerator configurations for training.](/ml-
   * engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `masterConfig.imageUri` only if you build a custom image. Only one of
   * `masterConfig.imageUri` and `runtimeVersion` should be set. Learn more about [configuring
   * custom containers](/ml-engine/docs/distributed-training-containers).
   * @param masterConfig masterConfig or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setMasterConfig(GoogleCloudMlV1ReplicaConfig masterConfig) {
    this.masterConfig = masterConfig;
    return this;
  }

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's master worker.
   * You must specify this field when `scaleTier` is set to `CUSTOM`.
   *
   * You can use certain Compute Engine machine types directly in this field. The following types
   * are supported:
   *
   * - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` -
   * `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` -
   * `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` -
   * `n1-highcpu-64` - `n1-highcpu-96`
   *
   * Learn more about [using Compute Engine machine types](/ml-engine/docs/machine-types#compute-
   * engine-machine-types).
   *
   * Alternatively, you can use the following legacy machine types:
   *
   * - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` -
   * `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` -
   * `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` -
   * `complex_model_l_v100`
   *
   * Learn more about [using legacy machine types](/ml-engine/docs/machine-types#legacy-machine-
   * types).
   *
   * Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more
   * about the [special configuration options for training with TPUs](/ml-engine/docs/tensorflow
   * /using-tpus#configuring_a_custom_tpu_machine).
   * @return value or {@code null} for none
   */
  public java.lang.String getMasterType() {
    return masterType;
  }

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's master worker.
   * You must specify this field when `scaleTier` is set to `CUSTOM`.
   *
   * You can use certain Compute Engine machine types directly in this field. The following types
   * are supported:
   *
   * - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` -
   * `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` -
   * `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` -
   * `n1-highcpu-64` - `n1-highcpu-96`
   *
   * Learn more about [using Compute Engine machine types](/ml-engine/docs/machine-types#compute-
   * engine-machine-types).
   *
   * Alternatively, you can use the following legacy machine types:
   *
   * - `standard` - `large_model` - `complex_model_s` - `complex_model_m` - `complex_model_l` -
   * `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` -
   * `complex_model_m_p100` - `standard_v100` - `large_model_v100` - `complex_model_m_v100` -
   * `complex_model_l_v100`
   *
   * Learn more about [using legacy machine types](/ml-engine/docs/machine-types#legacy-machine-
   * types).
   *
   * Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more
   * about the [special configuration options for training with TPUs](/ml-engine/docs/tensorflow
   * /using-tpus#configuring_a_custom_tpu_machine).
   * @param masterType masterType or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setMasterType(java.lang.String masterType) {
    this.masterType = masterType;
    return this;
  }

  /**
   * Required. The Google Cloud Storage location of the packages with the training program and any
   * additional dependencies. The maximum number of package URIs is 100.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPackageUris() {
    return packageUris;
  }

  /**
   * Required. The Google Cloud Storage location of the packages with the training program and any
   * additional dependencies. The maximum number of package URIs is 100.
   * @param packageUris packageUris or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setPackageUris(java.util.List<java.lang.String> packageUris) {
    this.packageUris = packageUris;
    return this;
  }

  /**
   * Optional. The configuration for parameter servers.
   *
   * You should only set `parameterServerConfig.acceleratorConfig` if `parameterServerConfigType` is
   * set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations
   * for training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `parameterServerConfig.imageUri` only if you build a custom image for your parameter
   * server. If `parameterServerConfig.imageUri` has not been set, AI Platform uses the value of
   * `masterConfig.imageUri`. Learn more about [configuring custom containers](/ml-engine/docs
   * /distributed-training-containers).
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1ReplicaConfig getParameterServerConfig() {
    return parameterServerConfig;
  }

  /**
   * Optional. The configuration for parameter servers.
   *
   * You should only set `parameterServerConfig.acceleratorConfig` if `parameterServerConfigType` is
   * set to a Compute Engine machine type. [Learn about restrictions on accelerator configurations
   * for training.](/ml-engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `parameterServerConfig.imageUri` only if you build a custom image for your parameter
   * server. If `parameterServerConfig.imageUri` has not been set, AI Platform uses the value of
   * `masterConfig.imageUri`. Learn more about [configuring custom containers](/ml-engine/docs
   * /distributed-training-containers).
   * @param parameterServerConfig parameterServerConfig or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setParameterServerConfig(GoogleCloudMlV1ReplicaConfig parameterServerConfig) {
    this.parameterServerConfig = parameterServerConfig;
    return this;
  }

  /**
   * Optional. The number of parameter server replicas to use for the training job. Each replica in
   * the cluster will be of the type specified in `parameter_server_type`.
   *
   * This value can only be used when `scale_tier` is set to `CUSTOM`.If you set this value, you
   * must also set `parameter_server_type`.
   *
   * The default value is zero.
   * @return value or {@code null} for none
   */
  public java.lang.Long getParameterServerCount() {
    return parameterServerCount;
  }

  /**
   * Optional. The number of parameter server replicas to use for the training job. Each replica in
   * the cluster will be of the type specified in `parameter_server_type`.
   *
   * This value can only be used when `scale_tier` is set to `CUSTOM`.If you set this value, you
   * must also set `parameter_server_type`.
   *
   * The default value is zero.
   * @param parameterServerCount parameterServerCount or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setParameterServerCount(java.lang.Long parameterServerCount) {
    this.parameterServerCount = parameterServerCount;
    return this;
  }

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's parameter
   * server.
   *
   * The supported values are the same as those described in the entry for `master_type`.
   *
   * This value must be consistent with the category of machine type that `masterType` uses. In
   * other words, both must be Compute Engine machine types or both must be legacy machine types.
   *
   * This value must be present when `scaleTier` is set to `CUSTOM` and `parameter_server_count` is
   * greater than zero.
   * @return value or {@code null} for none
   */
  public java.lang.String getParameterServerType() {
    return parameterServerType;
  }

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's parameter
   * server.
   *
   * The supported values are the same as those described in the entry for `master_type`.
   *
   * This value must be consistent with the category of machine type that `masterType` uses. In
   * other words, both must be Compute Engine machine types or both must be legacy machine types.
   *
   * This value must be present when `scaleTier` is set to `CUSTOM` and `parameter_server_count` is
   * greater than zero.
   * @param parameterServerType parameterServerType or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setParameterServerType(java.lang.String parameterServerType) {
    this.parameterServerType = parameterServerType;
    return this;
  }

  /**
   * Required. The Python module name to run after installing the packages.
   * @return value or {@code null} for none
   */
  public java.lang.String getPythonModule() {
    return pythonModule;
  }

  /**
   * Required. The Python module name to run after installing the packages.
   * @param pythonModule pythonModule or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setPythonModule(java.lang.String pythonModule) {
    this.pythonModule = pythonModule;
    return this;
  }

  /**
   * Optional. The version of Python used in training. If not set, the default version is '2.7'.
   * Python '3.5' is available when `runtime_version` is set to '1.4' and above. Python '2.7' works
   * with all supported runtime versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getPythonVersion() {
    return pythonVersion;
  }

  /**
   * Optional. The version of Python used in training. If not set, the default version is '2.7'.
   * Python '3.5' is available when `runtime_version` is set to '1.4' and above. Python '2.7' works
   * with all supported runtime versions.
   * @param pythonVersion pythonVersion or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setPythonVersion(java.lang.String pythonVersion) {
    this.pythonVersion = pythonVersion;
    return this;
  }

  /**
   * Required. The Google Compute Engine region to run the training job in. See the available
   * regions for AI Platform services.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Required. The Google Compute Engine region to run the training job in. See the available
   * regions for AI Platform services.
   * @param region region or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Optional. The AI Platform runtime version to use for training. If not set, AI Platform uses the
   * default stable version, 1.0. For more information, see the runtime version list and how to
   * manage runtime versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntimeVersion() {
    return runtimeVersion;
  }

  /**
   * Optional. The AI Platform runtime version to use for training. If not set, AI Platform uses the
   * default stable version, 1.0. For more information, see the runtime version list and how to
   * manage runtime versions.
   * @param runtimeVersion runtimeVersion or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setRuntimeVersion(java.lang.String runtimeVersion) {
    this.runtimeVersion = runtimeVersion;
    return this;
  }

  /**
   * Required. Specifies the machine types, the number of replicas for workers and parameter
   * servers.
   * @return value or {@code null} for none
   */
  public java.lang.String getScaleTier() {
    return scaleTier;
  }

  /**
   * Required. Specifies the machine types, the number of replicas for workers and parameter
   * servers.
   * @param scaleTier scaleTier or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setScaleTier(java.lang.String scaleTier) {
    this.scaleTier = scaleTier;
    return this;
  }

  /**
   * Optional. Use 'chief' instead of 'master' in TF_CONFIG when Custom Container is used and
   * evaluator is not specified.
   *
   * Defaults to false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseChiefInTfConfig() {
    return useChiefInTfConfig;
  }

  /**
   * Optional. Use 'chief' instead of 'master' in TF_CONFIG when Custom Container is used and
   * evaluator is not specified.
   *
   * Defaults to false.
   * @param useChiefInTfConfig useChiefInTfConfig or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setUseChiefInTfConfig(java.lang.Boolean useChiefInTfConfig) {
    this.useChiefInTfConfig = useChiefInTfConfig;
    return this;
  }

  /**
   * Optional. The configuration for workers.
   *
   * You should only set `workerConfig.acceleratorConfig` if `workerType` is set to a Compute Engine
   * machine type. [Learn about restrictions on accelerator configurations for training.](/ml-
   * engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `workerConfig.imageUri` only if you build a custom image for your worker. If
   * `workerConfig.imageUri` has not been set, AI Platform uses the value of
   * `masterConfig.imageUri`. Learn more about [configuring custom containers](/ml-engine/docs
   * /distributed-training-containers).
   * @return value or {@code null} for none
   */
  public GoogleCloudMlV1ReplicaConfig getWorkerConfig() {
    return workerConfig;
  }

  /**
   * Optional. The configuration for workers.
   *
   * You should only set `workerConfig.acceleratorConfig` if `workerType` is set to a Compute Engine
   * machine type. [Learn about restrictions on accelerator configurations for training.](/ml-
   * engine/docs/tensorflow/using-gpus#compute-engine-machine-types-with-gpu)
   *
   * Set `workerConfig.imageUri` only if you build a custom image for your worker. If
   * `workerConfig.imageUri` has not been set, AI Platform uses the value of
   * `masterConfig.imageUri`. Learn more about [configuring custom containers](/ml-engine/docs
   * /distributed-training-containers).
   * @param workerConfig workerConfig or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setWorkerConfig(GoogleCloudMlV1ReplicaConfig workerConfig) {
    this.workerConfig = workerConfig;
    return this;
  }

  /**
   * Optional. The number of worker replicas to use for the training job. Each replica in the
   * cluster will be of the type specified in `worker_type`.
   *
   * This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you
   * must also set `worker_type`.
   *
   * The default value is zero.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWorkerCount() {
    return workerCount;
  }

  /**
   * Optional. The number of worker replicas to use for the training job. Each replica in the
   * cluster will be of the type specified in `worker_type`.
   *
   * This value can only be used when `scale_tier` is set to `CUSTOM`. If you set this value, you
   * must also set `worker_type`.
   *
   * The default value is zero.
   * @param workerCount workerCount or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setWorkerCount(java.lang.Long workerCount) {
    this.workerCount = workerCount;
    return this;
  }

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's worker nodes.
   *
   * The supported values are the same as those described in the entry for `masterType`.
   *
   * This value must be consistent with the category of machine type that `masterType` uses. In
   * other words, both must be Compute Engine machine types or both must be legacy machine types.
   *
   * If you use `cloud_tpu` for this value, see special instructions for [configuring a custom TPU
   * machine](/ml-engine/docs/tensorflow/using-tpus#configuring_a_custom_tpu_machine).
   *
   * This value must be present when `scaleTier` is set to `CUSTOM` and `workerCount` is greater
   * than zero.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerType() {
    return workerType;
  }

  /**
   * Optional. Specifies the type of virtual machine to use for your training job's worker nodes.
   *
   * The supported values are the same as those described in the entry for `masterType`.
   *
   * This value must be consistent with the category of machine type that `masterType` uses. In
   * other words, both must be Compute Engine machine types or both must be legacy machine types.
   *
   * If you use `cloud_tpu` for this value, see special instructions for [configuring a custom TPU
   * machine](/ml-engine/docs/tensorflow/using-tpus#configuring_a_custom_tpu_machine).
   *
   * This value must be present when `scaleTier` is set to `CUSTOM` and `workerCount` is greater
   * than zero.
   * @param workerType workerType or {@code null} for none
   */
  public GoogleCloudMlV1TrainingInput setWorkerType(java.lang.String workerType) {
    this.workerType = workerType;
    return this;
  }

  @Override
  public GoogleCloudMlV1TrainingInput set(String fieldName, Object value) {
    return (GoogleCloudMlV1TrainingInput) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1TrainingInput clone() {
    return (GoogleCloudMlV1TrainingInput) super.clone();
  }

}
