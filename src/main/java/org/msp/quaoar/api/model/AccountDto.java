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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.hibernate.validator.constraints.*;
import org.msp.quaoar.api.model.MemberDto;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AccountDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public class AccountDto {

  private Integer id;

  private String token;

  private String lastModifDate;

  private String email;

  private MemberDto owner;

  @Valid private List<@Valid MemberDto> comembers;

  public AccountDto id(Integer id) {
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

  public AccountDto token(String token) {
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

  public AccountDto lastModifDate(String lastModifDate) {
    this.lastModifDate = lastModifDate;
    return this;
  }

  /**
   * Get lastModifDate
   * @return lastModifDate
   */
  @Pattern(regexp = "/([0-9]{2})-(?:[0-9]{2})-([0-9]{4})/")
  @Schema(name = "lastModifDate", example = "17-02-2010",
          requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifDate")
  public String
  getLastModifDate() {
    return lastModifDate;
  }

  public void setLastModifDate(String lastModifDate) {
    this.lastModifDate = lastModifDate;
  }

  public AccountDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */

  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) { this.email = email; }

  public AccountDto owner(MemberDto owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public MemberDto getOwner() {
    return owner;
  }

  public void setOwner(MemberDto owner) { this.owner = owner; }

  public AccountDto comembers(List<@Valid MemberDto> comembers) {
    this.comembers = comembers;
    return this;
  }

  public AccountDto addComembersItem(MemberDto comembersItem) {
    if (this.comembers == null) {
      this.comembers = new ArrayList<>();
    }
    this.comembers.add(comembersItem);
    return this;
  }

  /**
   * Get comembers
   * @return comembers
   */
  @Valid
  @Schema(name = "comembers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("comembers")
  public List<@Valid MemberDto> getComembers() {
    return comembers;
  }

  public void setComembers(List<@Valid MemberDto> comembers) {
    this.comembers = comembers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDto accountDto = (AccountDto)o;
    return Objects.equals(this.id, accountDto.id) &&
        Objects.equals(this.token, accountDto.token) &&
        Objects.equals(this.lastModifDate, accountDto.lastModifDate) &&
        Objects.equals(this.email, accountDto.email) &&
        Objects.equals(this.owner, accountDto.owner) &&
        Objects.equals(this.comembers, accountDto.comembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, token, lastModifDate, email, owner, comembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    lastModifDate: ")
        .append(toIndentedString(lastModifDate))
        .append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    comembers: ")
        .append(toIndentedString(comembers))
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
