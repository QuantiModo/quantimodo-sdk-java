package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Pairs  {
  
  private String name = null;

  
  /**
   * Category name
   **/
  @ApiModelProperty(required = true, value = "Category name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pairs {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}