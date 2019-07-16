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
import javax.validation.constraints.*;

/**
 * TapiOduOduPoolPac
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiOduOduPoolPac   {
  @JsonProperty("client-capacity")
  private Integer clientCapacity = null;

  @JsonProperty("max-client-size")
  private Integer maxClientSize = null;

  @JsonProperty("max-client-instances")
  private Integer maxClientInstances = null;

  public TapiOduOduPoolPac clientCapacity(Integer clientCapacity) {
    this.clientCapacity = clientCapacity;
    return this;
  }

  /**
   * none
   * @return clientCapacity
   **/
  @JsonProperty("client-capacity")
  @ApiModelProperty(value = "none")
  public Integer getClientCapacity() {
    return clientCapacity;
  }

  public void setClientCapacity(Integer clientCapacity) {
    this.clientCapacity = clientCapacity;
  }

  public TapiOduOduPoolPac maxClientSize(Integer maxClientSize) {
    this.maxClientSize = maxClientSize;
    return this;
  }

  /**
   * none
   * @return maxClientSize
   **/
  @JsonProperty("max-client-size")
  @ApiModelProperty(value = "none")
  public Integer getMaxClientSize() {
    return maxClientSize;
  }

  public void setMaxClientSize(Integer maxClientSize) {
    this.maxClientSize = maxClientSize;
  }

  public TapiOduOduPoolPac maxClientInstances(Integer maxClientInstances) {
    this.maxClientInstances = maxClientInstances;
    return this;
  }

  /**
   * none
   * @return maxClientInstances
   **/
  @JsonProperty("max-client-instances")
  @ApiModelProperty(value = "none")
  public Integer getMaxClientInstances() {
    return maxClientInstances;
  }

  public void setMaxClientInstances(Integer maxClientInstances) {
    this.maxClientInstances = maxClientInstances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiOduOduPoolPac tapiOduOduPoolPac = (TapiOduOduPoolPac) o;
    return Objects.equals(this.clientCapacity, tapiOduOduPoolPac.clientCapacity) &&
        Objects.equals(this.maxClientSize, tapiOduOduPoolPac.maxClientSize) &&
        Objects.equals(this.maxClientInstances, tapiOduOduPoolPac.maxClientInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCapacity, maxClientSize, maxClientInstances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiOduOduPoolPac {\n");
    
    sb.append("    clientCapacity: ").append(toIndentedString(clientCapacity)).append("\n");
    sb.append("    maxClientSize: ").append(toIndentedString(maxClientSize)).append("\n");
    sb.append("    maxClientInstances: ").append(toIndentedString(maxClientInstances)).append("\n");
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
