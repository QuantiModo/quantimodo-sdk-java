package io.swagger.client.model;

import io.swagger.client.model.VariableNew;
import java.util.ArrayList;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * New variables
 **/
@ApiModel(description = "New variables")
public class VariablesNew extends ArrayList<VariableNew> {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariablesNew {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}