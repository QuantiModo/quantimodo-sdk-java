package io.swagger.client.model;

import io.swagger.client.model.ConversionStep;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-02T06:04:40.138Z")
public class Unit   {
  
  private String name = null;
  private String abbreviatedName = null;
  public enum CategoryEnum {
     Distance,  Duration,  Energy,  Frequency,  Miscellany,  Pressure,  Proportion,  Rating,  Temperature,  Volume,  Weight, 
  };
  private CategoryEnum category = null;
  private Double minimum = null;
  private Double maximum = null;
  private List<ConversionStep> conversionSteps = new ArrayList<ConversionStep>();

  
  /**
   * Unit name
   **/
  @ApiModelProperty(required = true, value = "Unit name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Unit abbreviation
   **/
  @ApiModelProperty(required = true, value = "Unit abbreviation")
  @JsonProperty("abbreviatedName")
  public String getAbbreviatedName() {
    return abbreviatedName;
  }
  public void setAbbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
  }

  
  /**
   * Unit category
   **/
  @ApiModelProperty(required = true, value = "Unit category")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  
  /**
   * Unit minimum value
   **/
  @ApiModelProperty(required = true, value = "Unit minimum value")
  @JsonProperty("minimum")
  public Double getMinimum() {
    return minimum;
  }
  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }

  
  /**
   * Unit maximum value
   **/
  @ApiModelProperty(required = true, value = "Unit maximum value")
  @JsonProperty("maximum")
  public Double getMaximum() {
    return maximum;
  }
  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }

  
  /**
   * Conversion steps list
   **/
  @ApiModelProperty(required = true, value = "Conversion steps list")
  @JsonProperty("conversionSteps")
  public List<ConversionStep> getConversionSteps() {
    return conversionSteps;
  }
  public void setConversionSteps(List<ConversionStep> conversionSteps) {
    this.conversionSteps = conversionSteps;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unit {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  abbreviatedName: ").append(abbreviatedName).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  minimum: ").append(minimum).append("\n");
    sb.append("  maximum: ").append(maximum).append("\n");
    sb.append("  conversionSteps: ").append(conversionSteps).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
