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
import io.swagger.model.TapiEthStatisticalLmPerformanceParameters;
import javax.validation.constraints.*;

/**
 * TapiEthEthProActiveLmPerformanceData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthProActiveLmPerformanceData   {
  @JsonProperty("bidirectional-uas")
  private Integer bidirectionalUas = null;

  @JsonProperty("pro-active-far-end-lm-parameters")
  private TapiEthStatisticalLmPerformanceParameters proActiveFarEndLmParameters = null;

  @JsonProperty("pro-active-near-end-lm-parameters")
  private TapiEthStatisticalLmPerformanceParameters proActiveNearEndLmParameters = null;

  public TapiEthEthProActiveLmPerformanceData bidirectionalUas(Integer bidirectionalUas) {
    this.bidirectionalUas = bidirectionalUas;
    return this;
  }

  /**
   * This attribute contains the bidirectional UAS (unavailable seconds) detected in the monitoring interval.                      range of type : 0..900 for 15min interval or 0..86400 for 24 hr interval.
   * @return bidirectionalUas
   **/
  @JsonProperty("bidirectional-uas")
  @ApiModelProperty(value = "This attribute contains the bidirectional UAS (unavailable seconds) detected in the monitoring interval.                      range of type : 0..900 for 15min interval or 0..86400 for 24 hr interval.")
  public Integer getBidirectionalUas() {
    return bidirectionalUas;
  }

  public void setBidirectionalUas(Integer bidirectionalUas) {
    this.bidirectionalUas = bidirectionalUas;
  }

  public TapiEthEthProActiveLmPerformanceData proActiveFarEndLmParameters(TapiEthStatisticalLmPerformanceParameters proActiveFarEndLmParameters) {
    this.proActiveFarEndLmParameters = proActiveFarEndLmParameters;
    return this;
  }

  /**
   * This attribute contains the statistical far end performnace parameters.
   * @return proActiveFarEndLmParameters
   **/
  @JsonProperty("pro-active-far-end-lm-parameters")
  @ApiModelProperty(value = "This attribute contains the statistical far end performnace parameters.")
  public TapiEthStatisticalLmPerformanceParameters getProActiveFarEndLmParameters() {
    return proActiveFarEndLmParameters;
  }

  public void setProActiveFarEndLmParameters(TapiEthStatisticalLmPerformanceParameters proActiveFarEndLmParameters) {
    this.proActiveFarEndLmParameters = proActiveFarEndLmParameters;
  }

  public TapiEthEthProActiveLmPerformanceData proActiveNearEndLmParameters(TapiEthStatisticalLmPerformanceParameters proActiveNearEndLmParameters) {
    this.proActiveNearEndLmParameters = proActiveNearEndLmParameters;
    return this;
  }

  /**
   * This attribute contains the statistical near end performnace parameters.
   * @return proActiveNearEndLmParameters
   **/
  @JsonProperty("pro-active-near-end-lm-parameters")
  @ApiModelProperty(value = "This attribute contains the statistical near end performnace parameters.")
  public TapiEthStatisticalLmPerformanceParameters getProActiveNearEndLmParameters() {
    return proActiveNearEndLmParameters;
  }

  public void setProActiveNearEndLmParameters(TapiEthStatisticalLmPerformanceParameters proActiveNearEndLmParameters) {
    this.proActiveNearEndLmParameters = proActiveNearEndLmParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthProActiveLmPerformanceData tapiEthEthProActiveLmPerformanceData = (TapiEthEthProActiveLmPerformanceData) o;
    return Objects.equals(this.bidirectionalUas, tapiEthEthProActiveLmPerformanceData.bidirectionalUas) &&
        Objects.equals(this.proActiveFarEndLmParameters, tapiEthEthProActiveLmPerformanceData.proActiveFarEndLmParameters) &&
        Objects.equals(this.proActiveNearEndLmParameters, tapiEthEthProActiveLmPerformanceData.proActiveNearEndLmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidirectionalUas, proActiveFarEndLmParameters, proActiveNearEndLmParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthProActiveLmPerformanceData {\n");
    
    sb.append("    bidirectionalUas: ").append(toIndentedString(bidirectionalUas)).append("\n");
    sb.append("    proActiveFarEndLmParameters: ").append(toIndentedString(proActiveFarEndLmParameters)).append("\n");
    sb.append("    proActiveNearEndLmParameters: ").append(toIndentedString(proActiveNearEndLmParameters)).append("\n");
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
