package org.msp.quaoar.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.hibernate.validator.constraints.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AddressDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public class AddressDto {

  private Integer number;

  private String street;

  private String secondLine;

  private String city;

  private String province;

  private String country;

  private String codePostal;

  public AddressDto number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */

  @Schema(name = "number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) { this.number = number; }

  public AddressDto street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
   */

  @Schema(name = "street", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) { this.street = street; }

  public AddressDto secondLine(String secondLine) {
    this.secondLine = secondLine;
    return this;
  }

  /**
   * Get secondLine
   * @return secondLine
   */

  @Schema(name = "secondLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondLine")
  public String getSecondLine() {
    return secondLine;
  }

  public void setSecondLine(String secondLine) { this.secondLine = secondLine; }

  public AddressDto city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */

  @Schema(name = "city", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) { this.city = city; }

  public AddressDto province(String province) {
    this.province = province;
    return this;
  }

  /**
   * Get province
   * @return province
   */

  @Schema(name = "province", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("province")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) { this.province = province; }

  public AddressDto country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */

  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) { this.country = country; }

  public AddressDto codePostal(String codePostal) {
    this.codePostal = codePostal;
    return this;
  }

  /**
   * Get codePostal
   * @return codePostal
   */

  @Schema(name = "codePostal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codePostal")
  public String getCodePostal() {
    return codePostal;
  }

  public void setCodePostal(String codePostal) { this.codePostal = codePostal; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDto addressDto = (AddressDto)o;
    return Objects.equals(this.number, addressDto.number) &&
        Objects.equals(this.street, addressDto.street) &&
        Objects.equals(this.secondLine, addressDto.secondLine) &&
        Objects.equals(this.city, addressDto.city) &&
        Objects.equals(this.province, addressDto.province) &&
        Objects.equals(this.country, addressDto.country) &&
        Objects.equals(this.codePostal, addressDto.codePostal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, street, secondLine, city, province, country,
                        codePostal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDto {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    secondLine: ")
        .append(toIndentedString(secondLine))
        .append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    codePostal: ")
        .append(toIndentedString(codePostal))
        .append("\n");
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
