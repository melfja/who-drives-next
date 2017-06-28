package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Carpool
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-28T07:57:39.790+02:00")

public class Carpool   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("capacity")
  private String capacity = null;

  @JsonProperty("image")
  private String image = null;

  public Carpool id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a carpool.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a carpool.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Carpool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the carpool.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the carpool.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Carpool displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of carpool.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of carpool.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Carpool capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Capacity of carpool. For example, 4 people.
   * @return capacity
  **/
  @ApiModelProperty(value = "Capacity of carpool. For example, 4 people.")
  public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public Carpool image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image URL representing the carpool.
   * @return image
  **/
  @ApiModelProperty(value = "Image URL representing the carpool.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carpool carpool = (Carpool) o;
    return Objects.equals(this.id, carpool.id) &&
        Objects.equals(this.name, carpool.name) &&
        Objects.equals(this.displayName, carpool.displayName) &&
        Objects.equals(this.capacity, carpool.capacity) &&
        Objects.equals(this.image, carpool.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, displayName, capacity, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carpool {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

