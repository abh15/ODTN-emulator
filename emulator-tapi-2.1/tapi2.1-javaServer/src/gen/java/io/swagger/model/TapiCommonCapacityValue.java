/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiCommonCapacityUnit;
import javax.validation.constraints.*;

/**
 * TapiCommonCapacityValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiCommonCapacityValue   {
  @JsonProperty("value")
  private Integer value = null;

  @JsonProperty("unit")
  private TapiCommonCapacityUnit unit = null;

  public TapiCommonCapacityValue value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * none
   * @return value
   **/
  @JsonProperty("value")
  @ApiModelProperty(value = "none")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public TapiCommonCapacityValue unit(TapiCommonCapacityUnit unit) {
    this.unit = unit;
    return this;
  }

  /**
   * none
   * @return unit
   **/
  @JsonProperty("unit")
  @ApiModelProperty(value = "none")
  public TapiCommonCapacityUnit getUnit() {
    return unit;
  }

  public void setUnit(TapiCommonCapacityUnit unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonCapacityValue tapiCommonCapacityValue = (TapiCommonCapacityValue) o;
    return Objects.equals(this.value, tapiCommonCapacityValue.value) &&
        Objects.equals(this.unit, tapiCommonCapacityValue.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonCapacityValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

