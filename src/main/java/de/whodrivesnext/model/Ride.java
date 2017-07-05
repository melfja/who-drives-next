package de.whodrivesnext.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import de.whodrivesnext.model.Driver;
import de.whodrivesnext.model.Passenger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import javax.validation.constraints.*;
/**
 * Ride
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-03T08:08:09.179+02:00")

public class Ride   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("carpoolId")
  private String carpoolId = null;

  @JsonProperty("date")
  private DateTime date = null;

  @JsonProperty("driver")
  private Driver driver = null;

  @JsonProperty("passengers")
  private List<Passenger> passengers = new ArrayList<Passenger>();

  public Ride id(String id) {
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

  public Ride carpoolId(String carpoolId) {
    this.carpoolId = carpoolId;
    return this;
  }

   /**
   * a ride must belong to a carpool
   * @return carpoolId
  **/
  @ApiModelProperty(value = "a ride must belong to a carpool")
  public String getCarpoolId() {
    return carpoolId;
  }

  public void setCarpoolId(String carpoolId) {
    this.carpoolId = carpoolId;
  }

  public Ride date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the ride.  If not only a date ist set, the time should represent the start time of the ride.
   * @return date
  **/
  @ApiModelProperty(value = "Date of the ride.  If not only a date ist set, the time should represent the start time of the ride.")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public Ride driver(Driver driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @ApiModelProperty(value = "")
  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public Ride passengers(List<Passenger> passengers) {
    this.passengers = passengers;
    return this;
  }

  public Ride addPassengersItem(Passenger passengersItem) {
    this.passengers.add(passengersItem);
    return this;
  }

   /**
   * Get passengers
   * @return passengers
  **/
  @ApiModelProperty(value = "")
  public List<Passenger> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Passenger> passengers) {
    this.passengers = passengers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ride ride = (Ride) o;
    return Objects.equals(this.id, ride.id) &&
        Objects.equals(this.carpoolId, ride.carpoolId) &&
        Objects.equals(this.date, ride.date) &&
        Objects.equals(this.driver, ride.driver) &&
        Objects.equals(this.passengers, ride.passengers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, carpoolId, date, driver, passengers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ride {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    carpoolId: ").append(toIndentedString(carpoolId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
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

