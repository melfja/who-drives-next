package de.whodrivesnext.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import de.whodrivesnext.model.Paging;
import de.whodrivesnext.model.Ride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Pageable List of rides
 */
@ApiModel(description = "Pageable List of rides")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-30T07:51:49.755+02:00")

public class RidePageableList   {
  @JsonProperty("paging")
  private Paging paging = null;

  @JsonProperty("rides")
  private List<Ride> rides = new ArrayList<Ride>();

  public RidePageableList paging(Paging paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @ApiModelProperty(value = "")
  public Paging getPaging() {
    return paging;
  }

  public void setPaging(Paging paging) {
    this.paging = paging;
  }

  public RidePageableList rides(List<Ride> rides) {
    this.rides = rides;
    return this;
  }

  public RidePageableList addRidesItem(Ride ridesItem) {
    this.rides.add(ridesItem);
    return this;
  }

   /**
   * List of rides
   * @return rides
  **/
  @ApiModelProperty(value = "List of rides")
  public List<Ride> getRides() {
    return rides;
  }

  public void setRides(List<Ride> rides) {
    this.rides = rides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RidePageableList ridePageableList = (RidePageableList) o;
    return Objects.equals(this.paging, ridePageableList.paging) &&
        Objects.equals(this.rides, ridePageableList.rides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, rides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RidePageableList {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    rides: ").append(toIndentedString(rides)).append("\n");
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

