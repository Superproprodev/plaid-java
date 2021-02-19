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
import com.plaid.client.model.NullableAddressData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data about the employee.
 */
@ApiModel(description = "Data about the employee.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-19T19:17:33.926Z[GMT]")
public class Employee {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private NullableAddressData address = null;

  public static final String SERIALIZED_NAME_SSN_MASKED = "ssn_masked";
  @SerializedName(SERIALIZED_NAME_SSN_MASKED)
  private String ssnMasked;


  public Employee name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the employee.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the employee.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Employee address(NullableAddressData address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NullableAddressData getAddress() {
    return address;
  }


  public void setAddress(NullableAddressData address) {
    this.address = address;
  }


  public Employee ssnMasked(String ssnMasked) {
    
    this.ssnMasked = ssnMasked;
    return this;
  }

   /**
   * The SSN of the employee, with all but the last 4 digits masked out. For example: \&quot;XXX-XX-1111\&quot;.
   * @return ssnMasked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The SSN of the employee, with all but the last 4 digits masked out. For example: \"XXX-XX-1111\".")

  public String getSsnMasked() {
    return ssnMasked;
  }


  public void setSsnMasked(String ssnMasked) {
    this.ssnMasked = ssnMasked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.name, employee.name) &&
        Objects.equals(this.address, employee.address) &&
        Objects.equals(this.ssnMasked, employee.ssnMasked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, address, ssnMasked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ssnMasked: ").append(toIndentedString(ssnMasked)).append("\n");
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

