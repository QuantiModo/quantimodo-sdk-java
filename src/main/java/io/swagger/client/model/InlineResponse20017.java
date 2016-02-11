package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Correlation;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-02-09T02:16:51.363Z")
public class InlineResponse20017   {
  
  private List<Correlation> data = new ArrayList<Correlation>();
  private Boolean success = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public List<Correlation> getData() {
    return data;
  }
  public void setData(List<Correlation> data) {
    this.data = data;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;

    return true && Objects.equals(data, inlineResponse20017.data) &&
        Objects.equals(success, inlineResponse20017.success)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
