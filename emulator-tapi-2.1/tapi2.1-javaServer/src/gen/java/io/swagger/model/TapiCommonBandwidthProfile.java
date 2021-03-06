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
import io.swagger.model.TapiCommonBandwidthProfileType;
import io.swagger.model.TapiCommonCapacityValue;
import javax.validation.constraints.*;

/**
 * TapiCommonBandwidthProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiCommonBandwidthProfile   {
  @JsonProperty("committed-information-rate")
  private TapiCommonCapacityValue committedInformationRate = null;

  @JsonProperty("coupling-flag")
  private Boolean couplingFlag = false;

  @JsonProperty("bw-profile-type")
  private TapiCommonBandwidthProfileType bwProfileType = null;

  @JsonProperty("peak-information-rate")
  private TapiCommonCapacityValue peakInformationRate = null;

  @JsonProperty("committed-burst-size")
  private TapiCommonCapacityValue committedBurstSize = null;

  @JsonProperty("peak-burst-size")
  private TapiCommonCapacityValue peakBurstSize = null;

  @JsonProperty("color-aware")
  private Boolean colorAware = false;

  public TapiCommonBandwidthProfile committedInformationRate(TapiCommonCapacityValue committedInformationRate) {
    this.committedInformationRate = committedInformationRate;
    return this;
  }

  /**
   * none
   * @return committedInformationRate
   **/
  @JsonProperty("committed-information-rate")
  @ApiModelProperty(value = "none")
  public TapiCommonCapacityValue getCommittedInformationRate() {
    return committedInformationRate;
  }

  public void setCommittedInformationRate(TapiCommonCapacityValue committedInformationRate) {
    this.committedInformationRate = committedInformationRate;
  }

  public TapiCommonBandwidthProfile couplingFlag(Boolean couplingFlag) {
    this.couplingFlag = couplingFlag;
    return this;
  }

  /**
   * none
   * @return couplingFlag
   **/
  @JsonProperty("coupling-flag")
  @ApiModelProperty(value = "none")
  public Boolean isCouplingFlag() {
    return couplingFlag;
  }

  public void setCouplingFlag(Boolean couplingFlag) {
    this.couplingFlag = couplingFlag;
  }

  public TapiCommonBandwidthProfile bwProfileType(TapiCommonBandwidthProfileType bwProfileType) {
    this.bwProfileType = bwProfileType;
    return this;
  }

  /**
   * none
   * @return bwProfileType
   **/
  @JsonProperty("bw-profile-type")
  @ApiModelProperty(value = "none")
  public TapiCommonBandwidthProfileType getBwProfileType() {
    return bwProfileType;
  }

  public void setBwProfileType(TapiCommonBandwidthProfileType bwProfileType) {
    this.bwProfileType = bwProfileType;
  }

  public TapiCommonBandwidthProfile peakInformationRate(TapiCommonCapacityValue peakInformationRate) {
    this.peakInformationRate = peakInformationRate;
    return this;
  }

  /**
   * none
   * @return peakInformationRate
   **/
  @JsonProperty("peak-information-rate")
  @ApiModelProperty(value = "none")
  public TapiCommonCapacityValue getPeakInformationRate() {
    return peakInformationRate;
  }

  public void setPeakInformationRate(TapiCommonCapacityValue peakInformationRate) {
    this.peakInformationRate = peakInformationRate;
  }

  public TapiCommonBandwidthProfile committedBurstSize(TapiCommonCapacityValue committedBurstSize) {
    this.committedBurstSize = committedBurstSize;
    return this;
  }

  /**
   * none
   * @return committedBurstSize
   **/
  @JsonProperty("committed-burst-size")
  @ApiModelProperty(value = "none")
  public TapiCommonCapacityValue getCommittedBurstSize() {
    return committedBurstSize;
  }

  public void setCommittedBurstSize(TapiCommonCapacityValue committedBurstSize) {
    this.committedBurstSize = committedBurstSize;
  }

  public TapiCommonBandwidthProfile peakBurstSize(TapiCommonCapacityValue peakBurstSize) {
    this.peakBurstSize = peakBurstSize;
    return this;
  }

  /**
   * none
   * @return peakBurstSize
   **/
  @JsonProperty("peak-burst-size")
  @ApiModelProperty(value = "none")
  public TapiCommonCapacityValue getPeakBurstSize() {
    return peakBurstSize;
  }

  public void setPeakBurstSize(TapiCommonCapacityValue peakBurstSize) {
    this.peakBurstSize = peakBurstSize;
  }

  public TapiCommonBandwidthProfile colorAware(Boolean colorAware) {
    this.colorAware = colorAware;
    return this;
  }

  /**
   * none
   * @return colorAware
   **/
  @JsonProperty("color-aware")
  @ApiModelProperty(value = "none")
  public Boolean isColorAware() {
    return colorAware;
  }

  public void setColorAware(Boolean colorAware) {
    this.colorAware = colorAware;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiCommonBandwidthProfile tapiCommonBandwidthProfile = (TapiCommonBandwidthProfile) o;
    return Objects.equals(this.committedInformationRate, tapiCommonBandwidthProfile.committedInformationRate) &&
        Objects.equals(this.couplingFlag, tapiCommonBandwidthProfile.couplingFlag) &&
        Objects.equals(this.bwProfileType, tapiCommonBandwidthProfile.bwProfileType) &&
        Objects.equals(this.peakInformationRate, tapiCommonBandwidthProfile.peakInformationRate) &&
        Objects.equals(this.committedBurstSize, tapiCommonBandwidthProfile.committedBurstSize) &&
        Objects.equals(this.peakBurstSize, tapiCommonBandwidthProfile.peakBurstSize) &&
        Objects.equals(this.colorAware, tapiCommonBandwidthProfile.colorAware);
  }

  @Override
  public int hashCode() {
    return Objects.hash(committedInformationRate, couplingFlag, bwProfileType, peakInformationRate, committedBurstSize, peakBurstSize, colorAware);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiCommonBandwidthProfile {\n");
    
    sb.append("    committedInformationRate: ").append(toIndentedString(committedInformationRate)).append("\n");
    sb.append("    couplingFlag: ").append(toIndentedString(couplingFlag)).append("\n");
    sb.append("    bwProfileType: ").append(toIndentedString(bwProfileType)).append("\n");
    sb.append("    peakInformationRate: ").append(toIndentedString(peakInformationRate)).append("\n");
    sb.append("    committedBurstSize: ").append(toIndentedString(committedBurstSize)).append("\n");
    sb.append("    peakBurstSize: ").append(toIndentedString(peakBurstSize)).append("\n");
    sb.append("    colorAware: ").append(toIndentedString(colorAware)).append("\n");
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

