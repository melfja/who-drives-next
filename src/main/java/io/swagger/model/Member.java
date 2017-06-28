package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Member
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-28T07:57:39.790+02:00")

public class Member   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("profileId")
  private String profileId = null;

  @JsonProperty("nickname")
  private String nickname = null;

  public Member id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a member.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a member.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Member profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }

   /**
   * Unique identifier of the profile of the member.
   * @return profileId
  **/
  @ApiModelProperty(value = "Unique identifier of the profile of the member.")
  public String getProfileId() {
    return profileId;
  }

  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }

  public Member nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Nickname of Name-Summary of the member.
   * @return nickname
  **/
  @ApiModelProperty(value = "Nickname of Name-Summary of the member.")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.id, member.id) &&
        Objects.equals(this.profileId, member.profileId) &&
        Objects.equals(this.nickname, member.nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, profileId, nickname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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

