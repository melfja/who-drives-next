package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
/**
 * Vacation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-28T07:57:39.790+02:00")

public class Vacation   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("fromDate")
  private LocalDate fromDate = null;

  @JsonProperty("toDate")
  private LocalDate toDate = null;

  public Vacation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a vacation.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier representing a vacation.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Vacation fromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * First day of the Off-Time
   * @return fromDate
  **/
  @ApiModelProperty(value = "First day of the Off-Time")
  public LocalDate getFromDate() {
    return fromDate;
  }

  public void setFromDate(LocalDate fromDate) {
    this.fromDate = fromDate;
  }

  public Vacation toDate(LocalDate toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Last day of the Off-Time
   * @return toDate
  **/
  @ApiModelProperty(value = "Last day of the Off-Time")
  public LocalDate getToDate() {
    return toDate;
  }

  public void setToDate(LocalDate toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vacation vacation = (Vacation) o;
    return Objects.equals(this.id, vacation.id) &&
        Objects.equals(this.fromDate, vacation.fromDate) &&
        Objects.equals(this.toDate, vacation.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromDate, toDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vacation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

