package org.msp.quaoar.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;

import java.util.Objects;

/**
 * PhoneDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-26T13:55:52.699800523-05:00[America/Toronto]")
public class PhoneNumberDto {

  private String number;
  private PhoneType phoneType;

  public PhoneNumberDto number(String number, PhoneType phoneType) {
    this.number = number;
    this.phoneType = phoneType;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  @Pattern(regexp = "/([0-9]{3})-(?:[0-9]{3})-([0-9]{4})/")
  @Schema(name = "number", example = "438-508-2271",
          requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public String
  getNumber() {
    return number;
  }

  public void setNumber(String number) { this.number = number; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberDto phoneDto = (PhoneNumberDto)o;
    return Objects.equals(this.number, phoneDto.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneDto {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
