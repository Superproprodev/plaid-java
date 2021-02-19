/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Specifies options for initializing Link for use with the Income Verification (beta) product. This field is required if &#x60;income_verification&#x60; is included in the &#x60;products&#x60; array.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Income Verification (beta) product. This field is required if `income_verification` is included in the `products` array.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-19T19:17:33.926Z[GMT]")
public class LinkTokenCreateRequestIncomeVerification {
  public static final String SERIALIZED_NAME_INCOME_VERIFICATION_ID = "income_verification_id";
  @SerializedName(SERIALIZED_NAME_INCOME_VERIFICATION_ID)
  private String incomeVerificationId;

  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;


  public LinkTokenCreateRequestIncomeVerification incomeVerificationId(String incomeVerificationId) {
    
    this.incomeVerificationId = incomeVerificationId;
    return this;
  }

   /**
   * The &#x60;income_verification_id&#x60; of the verification instance, as provided by &#x60;/income/verification/create&#x60;.
   * @return incomeVerificationId
  **/
  @ApiModelProperty(required = true, value = "The `income_verification_id` of the verification instance, as provided by `/income/verification/create`.")

  public String getIncomeVerificationId() {
    return incomeVerificationId;
  }


  public void setIncomeVerificationId(String incomeVerificationId) {
    this.incomeVerificationId = incomeVerificationId;
  }


  public LinkTokenCreateRequestIncomeVerification assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * The &#x60;asset_report_id&#x60; of an asset report associated with the user, as provided by &#x60;/asset_report/create&#x60;. Providing an &#x60;asset_report_id&#x60; is optional and can be used to verify the user through a streamlined flow. If provided, the bank linking flow will be skipped.
   * @return assetReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `asset_report_id` of an asset report associated with the user, as provided by `/asset_report/create`. Providing an `asset_report_id` is optional and can be used to verify the user through a streamlined flow. If provided, the bank linking flow will be skipped.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestIncomeVerification linkTokenCreateRequestIncomeVerification = (LinkTokenCreateRequestIncomeVerification) o;
    return Objects.equals(this.incomeVerificationId, linkTokenCreateRequestIncomeVerification.incomeVerificationId) &&
        Objects.equals(this.assetReportId, linkTokenCreateRequestIncomeVerification.assetReportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incomeVerificationId, assetReportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestIncomeVerification {\n");
    sb.append("    incomeVerificationId: ").append(toIndentedString(incomeVerificationId)).append("\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

