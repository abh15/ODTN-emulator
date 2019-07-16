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
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import javax.validation.constraints.*;

/**
 * TapiConnectivityConnectionEndPointRef
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiConnectivityConnectionEndPointRef   {
  @JsonProperty("topology-uuid")
  private String topologyUuid = null;

  @JsonProperty("node-uuid")
  private String nodeUuid = null;

  @JsonProperty("node-edge-point-uuid")
  private String nodeEdgePointUuid = null;

  @JsonProperty("connection-end-point-uuid")
  private String connectionEndPointUuid = null;

  public TapiConnectivityConnectionEndPointRef topologyUuid(String topologyUuid) {
    this.topologyUuid = topologyUuid;
    return this;
  }

  /**
   * none
   * @return topologyUuid
   **/
  @JsonProperty("topology-uuid")
  @ApiModelProperty(value = "none")
  public String getTopologyUuid() {
    return topologyUuid;
  }

  public void setTopologyUuid(String topologyUuid) {
    this.topologyUuid = topologyUuid;
  }

  public TapiConnectivityConnectionEndPointRef nodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
    return this;
  }

  /**
   * none
   * @return nodeUuid
   **/
  @JsonProperty("node-uuid")
  @ApiModelProperty(value = "none")
  public String getNodeUuid() {
    return nodeUuid;
  }

  public void setNodeUuid(String nodeUuid) {
    this.nodeUuid = nodeUuid;
  }

  public TapiConnectivityConnectionEndPointRef nodeEdgePointUuid(String nodeEdgePointUuid) {
    this.nodeEdgePointUuid = nodeEdgePointUuid;
    return this;
  }

  /**
   * none
   * @return nodeEdgePointUuid
   **/
  @JsonProperty("node-edge-point-uuid")
  @ApiModelProperty(value = "none")
  public String getNodeEdgePointUuid() {
    return nodeEdgePointUuid;
  }

  public void setNodeEdgePointUuid(String nodeEdgePointUuid) {
    this.nodeEdgePointUuid = nodeEdgePointUuid;
  }

  public TapiConnectivityConnectionEndPointRef connectionEndPointUuid(String connectionEndPointUuid) {
    this.connectionEndPointUuid = connectionEndPointUuid;
    return this;
  }

  /**
   * none
   * @return connectionEndPointUuid
   **/
  @JsonProperty("connection-end-point-uuid")
  @ApiModelProperty(value = "none")
  public String getConnectionEndPointUuid() {
    return connectionEndPointUuid;
  }

  public void setConnectionEndPointUuid(String connectionEndPointUuid) {
    this.connectionEndPointUuid = connectionEndPointUuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnectionEndPointRef tapiConnectivityConnectionEndPointRef = (TapiConnectivityConnectionEndPointRef) o;
    return Objects.equals(this.topologyUuid, tapiConnectivityConnectionEndPointRef.topologyUuid) &&
        Objects.equals(this.nodeUuid, tapiConnectivityConnectionEndPointRef.nodeUuid) &&
        Objects.equals(this.nodeEdgePointUuid, tapiConnectivityConnectionEndPointRef.nodeEdgePointUuid) &&
        Objects.equals(this.connectionEndPointUuid, tapiConnectivityConnectionEndPointRef.connectionEndPointUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyUuid, nodeUuid, nodeEdgePointUuid, connectionEndPointUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectionEndPointRef {\n");
    
    sb.append("    topologyUuid: ").append(toIndentedString(topologyUuid)).append("\n");
    sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
    sb.append("    nodeEdgePointUuid: ").append(toIndentedString(nodeEdgePointUuid)).append("\n");
    sb.append("    connectionEndPointUuid: ").append(toIndentedString(connectionEndPointUuid)).append("\n");
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
