package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.MeasurementSource;
import java.util.*;
import io.swagger.client.model.Measurement;
import io.swagger.client.model.MeasurementRange;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class MeasurementsApi {
  String basePath = "https://localhost/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Get measurement sources
   * Returns a list of all the apps from which measurement data is obtained.
   * @return void
   */
  public void measurementSourcesGet () throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/measurementSources".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add a data source
   * Add a life-tracking app or device to the QuantiModo list of data sources.
   * @param name An array of names of data sources you want to add.
   * @return void
   */
  public void measurementSourcesPost (List<MeasurementSource> name) throws ApiException {
    Object postBody = name;
    
    // verify the required parameter 'name' is set
    if (name == null) {
       throw new ApiException(400, "Missing the required parameter 'name' when calling measurementSourcesPost");
    }
    

    // create path and map variables
    String path = "/measurementSources".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get measurements for this user
   * Measurements are any value that can be recorded like daily steps, a mood rating, or apples eaten.
   * @param variableName Name of the variable you want measurements for
   * @param unit The unit your want the measurements in
   * @param startTime The lower limit of measurements returned (Epoch)
   * @param endTime The upper limit of measurements returned (Epoch)
   * @param groupingWidth The time (in seconds) over which measurements are grouped together
   * @param groupingTimezone The time (in seconds) over which measurements are grouped together
   * @return void
   */
  public void measurementsGet (String variableName, String unit, String startTime, String endTime, Integer groupingWidth, String groupingTimezone) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'variableName' is set
    if (variableName == null) {
       throw new ApiException(400, "Missing the required parameter 'variableName' when calling measurementsGet");
    }
    

    // create path and map variables
    String path = "/measurements".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (variableName != null)
      queryParams.put("variableName", ApiInvoker.parameterToString(variableName));
    if (unit != null)
      queryParams.put("unit", ApiInvoker.parameterToString(unit));
    if (startTime != null)
      queryParams.put("startTime", ApiInvoker.parameterToString(startTime));
    if (endTime != null)
      queryParams.put("endTime", ApiInvoker.parameterToString(endTime));
    if (groupingWidth != null)
      queryParams.put("groupingWidth", ApiInvoker.parameterToString(groupingWidth));
    if (groupingTimezone != null)
      queryParams.put("groupingTimezone", ApiInvoker.parameterToString(groupingTimezone));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Post a new set of measurements to the database
   * You can submit multiple measurements in a \&quot;measurements\&quot; sub-array.  If the variable these measurements correspond to does not already exist in the database, it will be automatically added.  The request body should look something like [{\&quot;measurements\&quot;:[{\&quot;timestamp\&quot;:1406419860,\&quot;value\&quot;:\&quot;1\&quot;,\&quot;note\&quot;:\&quot;I am a note about back pain.\&quot;},{\&quot;timestamp\&quot;:1406519865,\&quot;value\&quot;:\&quot;3\&quot;,\&quot;note\&quot;:\&quot;I am another note about back pain.\&quot;}],\&quot;name\&quot;:\&quot;Back Pain\&quot;,\&quot;source\&quot;:\&quot;QuantiModo\&quot;,\&quot;category\&quot;:\&quot;Symptoms\&quot;,\&quot;combinationOperation\&quot;:\&quot;MEAN\&quot;,\&quot;unit\&quot;:\&quot;/5\&quot;}]
   * @param measurements An array of measurements you want to insert.
   * @return void
   */
  public void measurementsV2Post (List<Measurement> measurements) throws ApiException {
    Object postBody = measurements;
    
    // verify the required parameter 'measurements' is set
    if (measurements == null) {
       throw new ApiException(400, "Missing the required parameter 'measurements' when calling measurementsV2Post");
    }
    

    // create path and map variables
    String path = "/measurements/v2".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get measurements range for this user
   * Get Unix time-stamp (epoch time) of the user&#39;s first and last measurements taken.
   * @param sources Enter source name to limit to specific source (varchar)
   * @param user If not specified, uses currently logged in user (bigint)
   * @return void
   */
  public void measurementsRangeGet (String sources, Integer user) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/measurementsRange".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (sources != null)
      queryParams.put("sources", ApiInvoker.parameterToString(sources));
    if (user != null)
      queryParams.put("user", ApiInvoker.parameterToString(user));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}