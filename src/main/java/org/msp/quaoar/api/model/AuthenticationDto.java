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
 * AuthenticationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public class AuthenticationDto {

  private String token;

  private Integer id;

  public AuthenticationDto token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */

  @Schema(name = "token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) { this.token = token; }

  public AuthenticationDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */

  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) { this.id = id; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationDto authenticationDto = (AuthenticationDto)o;
    return Objects.equals(this.token, authenticationDto.token) &&
        Objects.equals(this.id, authenticationDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationDto {\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
