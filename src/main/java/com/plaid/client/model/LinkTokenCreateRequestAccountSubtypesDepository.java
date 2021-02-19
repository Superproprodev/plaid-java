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
import com.plaid.client.model.AccountSubtype;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A filter to apply to &#x60;depository&#x60;-type accounts
 */
@ApiModel(description = "A filter to apply to `depository`-type accounts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-19T19:17:33.926Z[GMT]")
public class LinkTokenCreateRequestAccountSubtypesDepository {
  public static final String SERIALIZED_NAME_ACCOUNT_SUBTYPES = "account_subtypes";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUBTYPES)
  private List<AccountSubtype> accountSubtypes = null;


  public LinkTokenCreateRequestAccountSubtypesDepository accountSubtypes(List<AccountSubtype> accountSubtypes) {
    
    this.accountSubtypes = accountSubtypes;
    return this;
  }

  public LinkTokenCreateRequestAccountSubtypesDepository addAccountSubtypesItem(AccountSubtype accountSubtypesItem) {
    if (this.accountSubtypes == null) {
      this.accountSubtypes = new ArrayList<>();
    }
    this.accountSubtypes.add(accountSubtypesItem);
    return this;
  }

   /**
   * An array of account subtypes to display in Link. If not specified, all account subtypes will be shown. For a full list of valid types and subtypes, see the [Account schema](/docs/api/accounts#accounts-schema). 
   * @return accountSubtypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of account subtypes to display in Link. If not specified, all account subtypes will be shown. For a full list of valid types and subtypes, see the [Account schema](/docs/api/accounts#accounts-schema). ")

  public List<AccountSubtype> getAccountSubtypes() {
    return accountSubtypes;
  }


  public void setAccountSubtypes(List<AccountSubtype> accountSubtypes) {
    this.accountSubtypes = accountSubtypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestAccountSubtypesDepository linkTokenCreateRequestAccountSubtypesDepository = (LinkTokenCreateRequestAccountSubtypesDepository) o;
    return Objects.equals(this.accountSubtypes, linkTokenCreateRequestAccountSubtypesDepository.accountSubtypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSubtypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestAccountSubtypesDepository {\n");
    sb.append("    accountSubtypes: ").append(toIndentedString(accountSubtypes)).append("\n");
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

