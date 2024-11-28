package org.msp.quaoar.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SanityDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-01T22:28:21.852321636-04:00[America/Toronto]")
public class SanityDto {

  private Long status;

  private String msg;

  public SanityDto status(Long status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public SanityDto msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
  */
  
  @Schema(name = "msg", example = "ça va bien", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanityDto sanityDto = (SanityDto) o;
    return Objects.equals(this.status, sanityDto.status) &&
        Objects.equals(this.msg, sanityDto.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanityDto {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

