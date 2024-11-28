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
import org.msp.quaoar.api.model.AddressDto;
import org.msp.quaoar.api.model.PhoneDto;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MemberDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public class MemberDto {

  private Integer id;

  private String lastModifDate;

  private String firstName;

  private String lastName;

  private String birthDate;

  private String gender;

  @Valid private List<@Valid PhoneDto> phone;

  private AddressDto address;

  public MemberDto id(Integer id) {
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

  public MemberDto lastModifDate(String lastModifDate) {
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

  public MemberDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */

  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) { this.firstName = firstName; }

  public MemberDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   */

  @Schema(name = "lastName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) { this.lastName = lastName; }

  public MemberDto birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
   */
  @Pattern(regexp = "/([0-9]{2})-(?:[0-9]{2})-([0-9]{4})/")
  @Schema(name = "birthDate", example = "17-02-2010",
          requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("birthDate")
  public String
  getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

  public MemberDto gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */

  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) { this.gender = gender; }

  public MemberDto phone(List<@Valid PhoneDto> phone) {
    this.phone = phone;
    return this;
  }

  public MemberDto addPhoneItem(PhoneDto phoneItem) {
    if (this.phone == null) {
      this.phone = new ArrayList<>();
    }
    this.phone.add(phoneItem);
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @Valid
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public List<@Valid PhoneDto> getPhone() {
    return phone;
  }

  public void setPhone(List<@Valid PhoneDto> phone) { this.phone = phone; }

  public MemberDto address(AddressDto address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public AddressDto getAddress() {
    return address;
  }

  public void setAddress(AddressDto address) { this.address = address; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberDto memberDto = (MemberDto)o;
    return Objects.equals(this.id, memberDto.id) &&
        Objects.equals(this.lastModifDate, memberDto.lastModifDate) &&
        Objects.equals(this.firstName, memberDto.firstName) &&
        Objects.equals(this.lastName, memberDto.lastName) &&
        Objects.equals(this.birthDate, memberDto.birthDate) &&
        Objects.equals(this.gender, memberDto.gender) &&
        Objects.equals(this.phone, memberDto.phone) &&
        Objects.equals(this.address, memberDto.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastModifDate, firstName, lastName, birthDate,
                        gender, phone, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifDate: ")
        .append(toIndentedString(lastModifDate))
        .append("\n");
    sb.append("    firstName: ")
        .append(toIndentedString(firstName))
        .append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ")
        .append(toIndentedString(birthDate))
        .append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
