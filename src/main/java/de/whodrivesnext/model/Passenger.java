package de.whodrivesnext.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
/**
 * Passenger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-30T07:51:49.755+02:00")

public class Passenger   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("date")
  private LocalDate date = null;

  public Passenger id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a ríde.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a ríde.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Passenger date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the ride.
   * @return date
  **/
  @ApiModelProperty(value = "Date of the ride.")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Passenger passenger = (Passenger) o;
    return Objects.equals(this.id, passenger.id) &&
        Objects.equals(this.date, passenger.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Passenger {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

