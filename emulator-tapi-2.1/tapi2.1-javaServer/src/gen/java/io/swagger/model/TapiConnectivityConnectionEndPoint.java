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
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonLifecycleState;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiCommonOperationalState;
import io.swagger.model.TapiCommonOperationalStatePac;
import io.swagger.model.TapiCommonPortDirection;
import io.swagger.model.TapiCommonPortRole;
import io.swagger.model.TapiCommonTerminationDirection;
import io.swagger.model.TapiCommonTerminationPac;
import io.swagger.model.TapiCommonTerminationState;
import io.swagger.model.TapiConnectivityConnectionEndPointRef;
import io.swagger.model.TapiTopologyNodeEdgePointRef;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiConnectivityConnectionEndPoint
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiConnectivityConnectionEndPoint   {
  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("operational-state")
  private TapiCommonOperationalState operationalState = null;

  @JsonProperty("lifecycle-state")
  private TapiCommonLifecycleState lifecycleState = null;

  @JsonProperty("termination-direction")
  private TapiCommonTerminationDirection terminationDirection = null;

  @JsonProperty("termination-state")
  private TapiCommonTerminationState terminationState = null;

  @JsonProperty("client-node-edge-point")
  private List<TapiTopologyNodeEdgePointRef> clientNodeEdgePoint = null;

  @JsonProperty("connection-port-role")
  private TapiCommonPortRole connectionPortRole = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("layer-protocol-qualifier")
  private String layerProtocolQualifier = null;

  @JsonProperty("parent-node-edge-point")
  private TapiTopologyNodeEdgePointRef parentNodeEdgePoint = null;

  @JsonProperty("aggregated-connection-end-point")
  private List<TapiConnectivityConnectionEndPointRef> aggregatedConnectionEndPoint = null;

  @JsonProperty("connection-port-direction")
  private TapiCommonPortDirection connectionPortDirection = null;

  public TapiConnectivityConnectionEndPoint name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiConnectivityConnectionEndPoint addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiConnectivityConnectionEndPoint uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-&#39; + &#39;[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
   **/
  @JsonProperty("uuid")
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiConnectivityConnectionEndPoint operationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
    return this;
  }

  /**
   * none
   * @return operationalState
   **/
  @JsonProperty("operational-state")
  @ApiModelProperty(value = "none")
  public TapiCommonOperationalState getOperationalState() {
    return operationalState;
  }

  public void setOperationalState(TapiCommonOperationalState operationalState) {
    this.operationalState = operationalState;
  }

  public TapiConnectivityConnectionEndPoint lifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * none
   * @return lifecycleState
   **/
  @JsonProperty("lifecycle-state")
  @ApiModelProperty(value = "none")
  public TapiCommonLifecycleState getLifecycleState() {
    return lifecycleState;
  }

  public void setLifecycleState(TapiCommonLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
  }

  public TapiConnectivityConnectionEndPoint terminationDirection(TapiCommonTerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
    return this;
  }

  /**
   * The overall directionality of the LP.                       - A BIDIRECTIONAL LP will have some SINK and/or SOURCE flowss.                      - A SINK LP can only contain elements with SINK flows or CONTRA_DIRECTION_SOURCE flows                      - A SOURCE LP can only contain SOURCE flows or CONTRA_DIRECTION_SINK flows
   * @return terminationDirection
   **/
  @JsonProperty("termination-direction")
  @ApiModelProperty(value = "The overall directionality of the LP.                       - A BIDIRECTIONAL LP will have some SINK and/or SOURCE flowss.                      - A SINK LP can only contain elements with SINK flows or CONTRA_DIRECTION_SOURCE flows                      - A SOURCE LP can only contain SOURCE flows or CONTRA_DIRECTION_SINK flows")
  public TapiCommonTerminationDirection getTerminationDirection() {
    return terminationDirection;
  }

  public void setTerminationDirection(TapiCommonTerminationDirection terminationDirection) {
    this.terminationDirection = terminationDirection;
  }

  public TapiConnectivityConnectionEndPoint terminationState(TapiCommonTerminationState terminationState) {
    this.terminationState = terminationState;
    return this;
  }

  /**
   * Indicates whether the layer is terminated and if so how.
   * @return terminationState
   **/
  @JsonProperty("termination-state")
  @ApiModelProperty(value = "Indicates whether the layer is terminated and if so how.")
  public TapiCommonTerminationState getTerminationState() {
    return terminationState;
  }

  public void setTerminationState(TapiCommonTerminationState terminationState) {
    this.terminationState = terminationState;
  }

  public TapiConnectivityConnectionEndPoint clientNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> clientNodeEdgePoint) {
    this.clientNodeEdgePoint = clientNodeEdgePoint;
    return this;
  }

  public TapiConnectivityConnectionEndPoint addClientNodeEdgePointItem(TapiTopologyNodeEdgePointRef clientNodeEdgePointItem) {
    if (this.clientNodeEdgePoint == null) {
      this.clientNodeEdgePoint = new ArrayList<TapiTopologyNodeEdgePointRef>();
    }
    this.clientNodeEdgePoint.add(clientNodeEdgePointItem);
    return this;
  }

  /**
   * none
   * @return clientNodeEdgePoint
   **/
  @JsonProperty("client-node-edge-point")
  @ApiModelProperty(value = "none")
  public List<TapiTopologyNodeEdgePointRef> getClientNodeEdgePoint() {
    return clientNodeEdgePoint;
  }

  public void setClientNodeEdgePoint(List<TapiTopologyNodeEdgePointRef> clientNodeEdgePoint) {
    this.clientNodeEdgePoint = clientNodeEdgePoint;
  }

  public TapiConnectivityConnectionEndPoint connectionPortRole(TapiCommonPortRole connectionPortRole) {
    this.connectionPortRole = connectionPortRole;
    return this;
  }

  /**
   * Each EP of the FC has a role (e.g., working, protection, protected, symmetric, hub, spoke, leaf, root)  in the context of the FC with respect to the FC function. 
   * @return connectionPortRole
   **/
  @JsonProperty("connection-port-role")
  @ApiModelProperty(value = "Each EP of the FC has a role (e.g., working, protection, protected, symmetric, hub, spoke, leaf, root)  in the context of the FC with respect to the FC function. ")
  public TapiCommonPortRole getConnectionPortRole() {
    return connectionPortRole;
  }

  public void setConnectionPortRole(TapiCommonPortRole connectionPortRole) {
    this.connectionPortRole = connectionPortRole;
  }

  public TapiConnectivityConnectionEndPoint layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * none
   * @return layerProtocolName
   **/
  @JsonProperty("layer-protocol-name")
  @ApiModelProperty(value = "none")
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiConnectivityConnectionEndPoint layerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
    return this;
  }

  /**
   * none
   * @return layerProtocolQualifier
   **/
  @JsonProperty("layer-protocol-qualifier")
  @ApiModelProperty(value = "none")
  public String getLayerProtocolQualifier() {
    return layerProtocolQualifier;
  }

  public void setLayerProtocolQualifier(String layerProtocolQualifier) {
    this.layerProtocolQualifier = layerProtocolQualifier;
  }

  public TapiConnectivityConnectionEndPoint parentNodeEdgePoint(TapiTopologyNodeEdgePointRef parentNodeEdgePoint) {
    this.parentNodeEdgePoint = parentNodeEdgePoint;
    return this;
  }

  /**
   * none
   * @return parentNodeEdgePoint
   **/
  @JsonProperty("parent-node-edge-point")
  @ApiModelProperty(value = "none")
  public TapiTopologyNodeEdgePointRef getParentNodeEdgePoint() {
    return parentNodeEdgePoint;
  }

  public void setParentNodeEdgePoint(TapiTopologyNodeEdgePointRef parentNodeEdgePoint) {
    this.parentNodeEdgePoint = parentNodeEdgePoint;
  }

  public TapiConnectivityConnectionEndPoint aggregatedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> aggregatedConnectionEndPoint) {
    this.aggregatedConnectionEndPoint = aggregatedConnectionEndPoint;
    return this;
  }

  public TapiConnectivityConnectionEndPoint addAggregatedConnectionEndPointItem(TapiConnectivityConnectionEndPointRef aggregatedConnectionEndPointItem) {
    if (this.aggregatedConnectionEndPoint == null) {
      this.aggregatedConnectionEndPoint = new ArrayList<TapiConnectivityConnectionEndPointRef>();
    }
    this.aggregatedConnectionEndPoint.add(aggregatedConnectionEndPointItem);
    return this;
  }

  /**
   * none
   * @return aggregatedConnectionEndPoint
   **/
  @JsonProperty("aggregated-connection-end-point")
  @ApiModelProperty(value = "none")
  public List<TapiConnectivityConnectionEndPointRef> getAggregatedConnectionEndPoint() {
    return aggregatedConnectionEndPoint;
  }

  public void setAggregatedConnectionEndPoint(List<TapiConnectivityConnectionEndPointRef> aggregatedConnectionEndPoint) {
    this.aggregatedConnectionEndPoint = aggregatedConnectionEndPoint;
  }

  public TapiConnectivityConnectionEndPoint connectionPortDirection(TapiCommonPortDirection connectionPortDirection) {
    this.connectionPortDirection = connectionPortDirection;
    return this;
  }

  /**
   * The orientation of defined flow at the EndPoint.
   * @return connectionPortDirection
   **/
  @JsonProperty("connection-port-direction")
  @ApiModelProperty(value = "The orientation of defined flow at the EndPoint.")
  public TapiCommonPortDirection getConnectionPortDirection() {
    return connectionPortDirection;
  }

  public void setConnectionPortDirection(TapiCommonPortDirection connectionPortDirection) {
    this.connectionPortDirection = connectionPortDirection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiConnectivityConnectionEndPoint tapiConnectivityConnectionEndPoint = (TapiConnectivityConnectionEndPoint) o;
    return Objects.equals(this.name, tapiConnectivityConnectionEndPoint.name) &&
        Objects.equals(this.uuid, tapiConnectivityConnectionEndPoint.uuid) &&
        Objects.equals(this.operationalState, tapiConnectivityConnectionEndPoint.operationalState) &&
        Objects.equals(this.lifecycleState, tapiConnectivityConnectionEndPoint.lifecycleState) &&
        Objects.equals(this.terminationDirection, tapiConnectivityConnectionEndPoint.terminationDirection) &&
        Objects.equals(this.terminationState, tapiConnectivityConnectionEndPoint.terminationState) &&
        Objects.equals(this.clientNodeEdgePoint, tapiConnectivityConnectionEndPoint.clientNodeEdgePoint) &&
        Objects.equals(this.connectionPortRole, tapiConnectivityConnectionEndPoint.connectionPortRole) &&
        Objects.equals(this.layerProtocolName, tapiConnectivityConnectionEndPoint.layerProtocolName) &&
        Objects.equals(this.layerProtocolQualifier, tapiConnectivityConnectionEndPoint.layerProtocolQualifier) &&
        Objects.equals(this.parentNodeEdgePoint, tapiConnectivityConnectionEndPoint.parentNodeEdgePoint) &&
        Objects.equals(this.aggregatedConnectionEndPoint, tapiConnectivityConnectionEndPoint.aggregatedConnectionEndPoint) &&
        Objects.equals(this.connectionPortDirection, tapiConnectivityConnectionEndPoint.connectionPortDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, operationalState, lifecycleState, terminationDirection, terminationState, clientNodeEdgePoint, connectionPortRole, layerProtocolName, layerProtocolQualifier, parentNodeEdgePoint, aggregatedConnectionEndPoint, connectionPortDirection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiConnectivityConnectionEndPoint {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    operationalState: ").append(toIndentedString(operationalState)).append("\n");
    sb.append("    lifecycleState: ").append(toIndentedString(lifecycleState)).append("\n");
    sb.append("    terminationDirection: ").append(toIndentedString(terminationDirection)).append("\n");
    sb.append("    terminationState: ").append(toIndentedString(terminationState)).append("\n");
    sb.append("    clientNodeEdgePoint: ").append(toIndentedString(clientNodeEdgePoint)).append("\n");
    sb.append("    connectionPortRole: ").append(toIndentedString(connectionPortRole)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    layerProtocolQualifier: ").append(toIndentedString(layerProtocolQualifier)).append("\n");
    sb.append("    parentNodeEdgePoint: ").append(toIndentedString(parentNodeEdgePoint)).append("\n");
    sb.append("    aggregatedConnectionEndPoint: ").append(toIndentedString(aggregatedConnectionEndPoint)).append("\n");
    sb.append("    connectionPortDirection: ").append(toIndentedString(connectionPortDirection)).append("\n");
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
