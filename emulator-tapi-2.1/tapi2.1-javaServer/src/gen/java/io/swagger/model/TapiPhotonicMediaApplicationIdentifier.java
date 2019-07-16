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
import io.swagger.model.TapiPhotonicMediaApplicationIdentifierType;
import javax.validation.constraints.*;

/**
 * TapiPhotonicMediaApplicationIdentifier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiPhotonicMediaApplicationIdentifier   {
  @JsonProperty("application-identifier-type")
  private TapiPhotonicMediaApplicationIdentifierType applicationIdentifierType = null;

  @JsonProperty("application-code")
  private String applicationCode = null;

  public TapiPhotonicMediaApplicationIdentifier applicationIdentifierType(TapiPhotonicMediaApplicationIdentifierType applicationIdentifierType) {
    this.applicationIdentifierType = applicationIdentifierType;
    return this;
  }

  /**
   * The ITU-T recommendation which defines the application code format.
   * @return applicationIdentifierType
   **/
  @JsonProperty("application-identifier-type")
  @ApiModelProperty(value = "The ITU-T recommendation which defines the application code format.")
  public TapiPhotonicMediaApplicationIdentifierType getApplicationIdentifierType() {
    return applicationIdentifierType;
  }

  public void setApplicationIdentifierType(TapiPhotonicMediaApplicationIdentifierType applicationIdentifierType) {
    this.applicationIdentifierType = applicationIdentifierType;
  }

  public TapiPhotonicMediaApplicationIdentifier applicationCode(String applicationCode) {
    this.applicationCode = applicationCode;
    return this;
  }

  /**
   * none
   * @return applicationCode
   **/
  @JsonProperty("application-code")
  @ApiModelProperty(value = "none")
  public String getApplicationCode() {
    return applicationCode;
  }

  public void setApplicationCode(String applicationCode) {
    this.applicationCode = applicationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiPhotonicMediaApplicationIdentifier tapiPhotonicMediaApplicationIdentifier = (TapiPhotonicMediaApplicationIdentifier) o;
    return Objects.equals(this.applicationIdentifierType, tapiPhotonicMediaApplicationIdentifier.applicationIdentifierType) &&
        Objects.equals(this.applicationCode, tapiPhotonicMediaApplicationIdentifier.applicationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationIdentifierType, applicationCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiPhotonicMediaApplicationIdentifier {\n");
    
    sb.append("    applicationIdentifierType: ").append(toIndentedString(applicationIdentifierType)).append("\n");
    sb.append("    applicationCode: ").append(toIndentedString(applicationCode)).append("\n");
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
