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
import java.math.BigDecimal;

/**
 * A transaction within an investment account.
 */
@ApiModel(description = "A transaction within an investment account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-19T19:17:33.926Z[GMT]")
public class InvestmentTransaction {
  public static final String SERIALIZED_NAME_INVESTMENT_TRANSACTION_ID = "investment_transaction_id";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_TRANSACTION_ID)
  private String investmentTransactionId;

  public static final String SERIALIZED_NAME_CANCEL_TRANSACTION_ID = "cancel_transaction_id";
  @SerializedName(SERIALIZED_NAME_CANCEL_TRANSACTION_ID)
  private String cancelTransactionId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SECURITY_ID = "security_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_ID)
  private String securityId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Double fees;

  /**
   * Value is one of the following: &#x60;buy&#x60;: Buying an investment &#x60;sell&#x60;: Selling an investment &#x60;cancel&#x60;: A cancellation of a pending transaction  &#x60;cash&#x60;: Activity that modifies a cash position &#x60;fee&#x60;: A fee on the account &#x60;transfer&#x60;: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BUY("buy"),
    
    SELL("sell"),
    
    CANCEL("cancel"),
    
    CASH("cash"),
    
    FEE("fee"),
    
    TRANSFER("transfer");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * For descriptions of possible transaction subtypes, see [Investment transaction subtypes schema](/docs/api/accounts/#investment-transaction-subtypes-schema).
   */
  @JsonAdapter(SubtypeEnum.Adapter.class)
  public enum SubtypeEnum {
    ACCOUNT_FEE("account fee"),
    
    ASSIGNMENT("assignment"),
    
    BUY("buy"),
    
    BUY_TO_COVER("buy to cover"),
    
    CONTRIBUTION("contribution"),
    
    DEPOSIT("deposit"),
    
    DISTRIBUTION("distribution"),
    
    DIVIDEND("dividend"),
    
    DIVIDEND_REINVESTMENT("dividend reinvestment"),
    
    EXERCISE("exercise"),
    
    EXPIRE("expire"),
    
    FUND_FEE("fund fee"),
    
    INTEREST("interest"),
    
    INTEREST_RECEIVABLE("interest receivable"),
    
    INTEREST_REINVESTMENT("interest reinvestment"),
    
    LEGAL_FEE("legal fee"),
    
    LOAN_PAYMENT("loan payment"),
    
    LONG_TERM_CAPITAL_GAIN("long-term capital gain"),
    
    LONG_TERM_CAPITAL_GAIN_REINVESTMENT("long-term capital gain reinvestment"),
    
    MANAGEMENT_FEE("management fee"),
    
    MARGIN_EXPENSE("margin expense"),
    
    MERGER("merger"),
    
    MISCELLANEOUS_FEE("miscellaneous fee"),
    
    NON_QUALIFIED_DIVIDEND("non-qualified dividend"),
    
    NON_RESIDENT_TAX("non-resident tax"),
    
    PENDING_CREDIT("pending credit"),
    
    PENDING_DEBIT("pending debit"),
    
    QUALIFIED_DIVIDEND("qualified dividend"),
    
    REBALANCE("rebalance"),
    
    RETURN_OF_PRINCIPAL("return of principal"),
    
    SELL("sell"),
    
    SELL_SHORT("sell short"),
    
    SHORT_TERM_CAPITAL_GAIN("short-term capital gain"),
    
    SHORT_TERM_CAPITAL_GAIN_REINVESTMENT("short-term capital gain reinvestment"),
    
    SPIN_OFF("spin off"),
    
    SPLIT("split"),
    
    STOCK_DISTRIBUTION("stock distribution"),
    
    TAX("tax"),
    
    TAX_WITHHELD("tax withheld"),
    
    TRANSFER("transfer"),
    
    TRANSFER_FEE("transfer fee"),
    
    TRUST_FEE("trust fee"),
    
    UNQUALIFIED_GAIN("unqualified gain"),
    
    WITHDRAWAL("withdrawal");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubtypeEnum fromValue(String value) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SubtypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubtypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubtypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SubtypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private SubtypeEnum subtype;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;


  public InvestmentTransaction investmentTransactionId(String investmentTransactionId) {
    
    this.investmentTransactionId = investmentTransactionId;
    return this;
  }

   /**
   * The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the &#x60;investment_transaction_id&#x60; is case sensitive.
   * @return investmentTransactionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the `investment_transaction_id` is case sensitive.")

  public String getInvestmentTransactionId() {
    return investmentTransactionId;
  }


  public void setInvestmentTransactionId(String investmentTransactionId) {
    this.investmentTransactionId = investmentTransactionId;
  }


  public InvestmentTransaction cancelTransactionId(String cancelTransactionId) {
    
    this.cancelTransactionId = cancelTransactionId;
    return this;
  }

   /**
   * Get cancelTransactionId
   * @return cancelTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCancelTransactionId() {
    return cancelTransactionId;
  }


  public void setCancelTransactionId(String cancelTransactionId) {
    this.cancelTransactionId = cancelTransactionId;
  }


  public InvestmentTransaction accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The &#x60;account_id&#x60; of the account against which this transaction posted.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The `account_id` of the account against which this transaction posted.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public InvestmentTransaction securityId(String securityId) {
    
    this.securityId = securityId;
    return this;
  }

   /**
   * The &#x60;security_id&#x60; to which this transaction is related.
   * @return securityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `security_id` to which this transaction is related.")

  public String getSecurityId() {
    return securityId;
  }


  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }


  public InvestmentTransaction date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * The ISO-8601 posting date for the transaction, or transacted date for pending transactions.
   * @return date
  **/
  @ApiModelProperty(required = true, value = "The ISO-8601 posting date for the transaction, or transacted date for pending transactions.")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public InvestmentTransaction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The institution’s description of the transaction.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The institution’s description of the transaction.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InvestmentTransaction quantity(Double quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units of the security involved in this transactions
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of units of the security involved in this transactions")

  public Double getQuantity() {
    return quantity;
  }


  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  public InvestmentTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public InvestmentTransaction price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the security at which this transaction occurred.
   * @return price
  **/
  @ApiModelProperty(required = true, value = "The price of the security at which this transaction occurred.")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public InvestmentTransaction fees(Double fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * The combined value of all fees applied to this transaction
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The combined value of all fees applied to this transaction")

  public Double getFees() {
    return fees;
  }


  public void setFees(Double fees) {
    this.fees = fees;
  }


  public InvestmentTransaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Value is one of the following: &#x60;buy&#x60;: Buying an investment &#x60;sell&#x60;: Selling an investment &#x60;cancel&#x60;: A cancellation of a pending transaction  &#x60;cash&#x60;: Activity that modifies a cash position &#x60;fee&#x60;: A fee on the account &#x60;transfer&#x60;: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Value is one of the following: `buy`: Buying an investment `sell`: Selling an investment `cancel`: A cancellation of a pending transaction  `cash`: Activity that modifies a cash position `fee`: A fee on the account `transfer`: Activity which modifies a position, but not through buy/sell activity e.g. options exercise, portfolio transfer")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InvestmentTransaction subtype(SubtypeEnum subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * For descriptions of possible transaction subtypes, see [Investment transaction subtypes schema](/docs/api/accounts/#investment-transaction-subtypes-schema).
   * @return subtype
  **/
  @ApiModelProperty(required = true, value = "For descriptions of possible transaction subtypes, see [Investment transaction subtypes schema](/docs/api/accounts/#investment-transaction-subtypes-schema).")

  public SubtypeEnum getSubtype() {
    return subtype;
  }


  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }


  public InvestmentTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-&#x60;null&#x60;.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-`null`.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public InvestmentTransaction unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the holding. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unofficial currency code associated with the holding. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentTransaction investmentTransaction = (InvestmentTransaction) o;
    return Objects.equals(this.investmentTransactionId, investmentTransaction.investmentTransactionId) &&
        Objects.equals(this.cancelTransactionId, investmentTransaction.cancelTransactionId) &&
        Objects.equals(this.accountId, investmentTransaction.accountId) &&
        Objects.equals(this.securityId, investmentTransaction.securityId) &&
        Objects.equals(this.date, investmentTransaction.date) &&
        Objects.equals(this.name, investmentTransaction.name) &&
        Objects.equals(this.quantity, investmentTransaction.quantity) &&
        Objects.equals(this.amount, investmentTransaction.amount) &&
        Objects.equals(this.price, investmentTransaction.price) &&
        Objects.equals(this.fees, investmentTransaction.fees) &&
        Objects.equals(this.type, investmentTransaction.type) &&
        Objects.equals(this.subtype, investmentTransaction.subtype) &&
        Objects.equals(this.isoCurrencyCode, investmentTransaction.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, investmentTransaction.unofficialCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentTransactionId, cancelTransactionId, accountId, securityId, date, name, quantity, amount, price, fees, type, subtype, isoCurrencyCode, unofficialCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentTransaction {\n");
    sb.append("    investmentTransactionId: ").append(toIndentedString(investmentTransactionId)).append("\n");
    sb.append("    cancelTransactionId: ").append(toIndentedString(cancelTransactionId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
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

