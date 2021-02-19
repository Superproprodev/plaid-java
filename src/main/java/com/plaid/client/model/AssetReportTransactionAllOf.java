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
 * AssetReportTransactionAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-19T19:17:33.926Z[GMT]")
public class AssetReportTransactionAllOf {
  public static final String SERIALIZED_NAME_DATE_TRANSACTED = "date_transacted";
  @SerializedName(SERIALIZED_NAME_DATE_TRANSACTED)
  private String dateTransacted;

  public static final String SERIALIZED_NAME_ORIGINAL_DESCRIPTION = "original_description";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DESCRIPTION)
  private String originalDescription;


  public AssetReportTransactionAllOf dateTransacted(String dateTransacted) {
    
    this.dateTransacted = dateTransacted;
    return this;
  }

   /**
   * The date on which the transaction took place, in IS0 8601 format.
   * @return dateTransacted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the transaction took place, in IS0 8601 format.")

  public String getDateTransacted() {
    return dateTransacted;
  }


  public void setDateTransacted(String dateTransacted) {
    this.dateTransacted = dateTransacted;
  }


  public AssetReportTransactionAllOf originalDescription(String originalDescription) {
    
    this.originalDescription = originalDescription;
    return this;
  }

   /**
   * The string returned by the financial institution to describe the transaction
   * @return originalDescription
  **/
  @ApiModelProperty(required = true, value = "The string returned by the financial institution to describe the transaction")

  public String getOriginalDescription() {
    return originalDescription;
  }


  public void setOriginalDescription(String originalDescription) {
    this.originalDescription = originalDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportTransactionAllOf assetReportTransactionAllOf = (AssetReportTransactionAllOf) o;
    return Objects.equals(this.dateTransacted, assetReportTransactionAllOf.dateTransacted) &&
        Objects.equals(this.originalDescription, assetReportTransactionAllOf.originalDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTransacted, originalDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportTransactionAllOf {\n");
    sb.append("    dateTransacted: ").append(toIndentedString(dateTransacted)).append("\n");
    sb.append("    originalDescription: ").append(toIndentedString(originalDescription)).append("\n");
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

