package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import io.swagger.model.Vacation;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * List of Off-Times
 */
@ApiModel(description = "List of Off-Times")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-28T07:57:39.790+02:00")

public class VacationList extends ArrayList<Vacation>  {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacationList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

