package de.whodrivesnext.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * State of each member of a ride
 */
@ApiModel(description = "State of each member of a ride")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-30T07:51:49.755+02:00")

public class MemberOfRide   {
  @JsonProperty("memberId")
  private String memberId = null;

  @JsonProperty("role")
  private String role = null;

  public MemberOfRide memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * id of the member
   * @return memberId
  **/
  @ApiModelProperty(value = "id of the member")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public MemberOfRide role(String role) {
    this.role = role;
    return this;
  }

   /**
   * role of the member in this ride.  possible values are:   * driver: member was the driver of this ride   * passenger: member joined and was passenger in the car of the driver   * allone: member did not join this ride, but drove allone   * not:  member did not join this ride 
   * @return role
  **/
  @ApiModelProperty(value = "role of the member in this ride.  possible values are:   * driver: member was the driver of this ride   * passenger: member joined and was passenger in the car of the driver   * allone: member did not join this ride, but drove allone   * not:  member did not join this ride ")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberOfRide memberOfRide = (MemberOfRide) o;
    return Objects.equals(this.memberId, memberOfRide.memberId) &&
        Objects.equals(this.role, memberOfRide.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberOfRide {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

