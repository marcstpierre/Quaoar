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
 * AccountResetDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public class AccountResetDto {

  private String url;

  public AccountResetDto url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */

  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) { this.url = url; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountResetDto accountResetDto = (AccountResetDto)o;
    return Objects.equals(this.url, accountResetDto.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResetDto {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
