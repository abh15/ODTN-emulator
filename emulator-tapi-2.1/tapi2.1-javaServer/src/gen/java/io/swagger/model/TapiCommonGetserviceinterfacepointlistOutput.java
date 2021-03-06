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
import io.swagger.model.TapiCommonServiceInterfacePoint;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiCommonGetserviceinterfacepointlistOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiCommonGetserviceinterfacepointlistOutput   {
  @JsonProperty("sip")
  private List<TapiCommonServiceInterfacePoint> sip = null;

  public TapiCommonGetserviceinterfacepointlistOutput sip(List<TapiCommonServiceInterfacePoint> sip) {
    this.sip = sip;
    return this;
  }

  public TapiCommonGetserviceinterfacepointlistOutput addSipItem(TapiCommonServiceInterfacePoint sipItem) {
    if (this.sip == null) {
      this.sip = new ArrayList<TapiCommonServiceInterfacePoint>();
    }
    this.sip.add(sipItem);
    return this;
  }

  /**
   * none
   * @return sip
   **/
  @JsonProperty("sip")
  @ApiModelProperty(value = "none")
  public List<TapiCommonServiceInterfacePoint> getSip() {
    return sip;
  }

  public void setSip(List<TapiCommonServiceInterfacePoint> sip) {
    this.sip = sip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonGetserviceinterfacepointlistOutput tapiCommonGetserviceinterfacepointlistOutput = (TapiCommonGetserviceinterfacepointlistOutput) o;
    return Objects.equals(this.sip, tapiCommonGetserviceinterfacepointlistOutput.sip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonGetserviceinterfacepointlistOutput {\n");
    
    sb.append("    sip: ").append(toIndentedString(sip)).append("\n");
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

