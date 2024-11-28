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
 * ResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public class ResultDto {

  private String code;

  private String message;

  private String topic;

  private String url;

  public ResultDto code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */

  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) { this.code = code; }

  public ResultDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */

  @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) { this.message = message; }

  public ResultDto topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
   */

  @Schema(name = "topic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topic")
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) { this.topic = topic; }

  public ResultDto url(String url) {
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
    ResultDto resultDto = (ResultDto)o;
    return Objects.equals(this.code, resultDto.code) &&
        Objects.equals(this.message, resultDto.message) &&
        Objects.equals(this.topic, resultDto.topic) &&
        Objects.equals(this.url, resultDto.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, topic, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultDto {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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
