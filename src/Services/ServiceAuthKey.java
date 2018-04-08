package com.GenesisAPI.Services;

import org.json.JSONObject;
import org.testng.reporters.jq.Main;

import com.GenesisAPI.requestpojo.getMembershipRequestPojo;
import com.GenesisAPI.responsepojo.GetMembershipResponse;
import com.GenesisAPI.responsepojo.getMembershipResponsepojo;
import com.google.gson.Gson;
import com.GenesisAPI.requestpojo.getMembershipRequest;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class ServiceAuthKey {
	/**
	 * This API will get the AUTH key to pass to other service.
	 * @param identifier
	 * @param identifierType
	 * @param groupNumber
	 * @return
	 */
	
	// Create a method with required request parameters to pass in the JSON Request 
	public  Response getAuthKey()
	
	{
		// collect the application server address and pass the response to a variable 
		Response response;
		
			
			// assign the Rest assured object 
			RequestSpecification requestSpecification = RestAssured.given();
			
			// assign the headers required to pass in the request .
			requestSpecification.queryParam("client_id", "l7xxbb4caaf20289435ea7536d445d887119");
			requestSpecification.queryParam("client_secret", "552d17b1dec14df386fa720b18940a19");
			requestSpecification.queryParam("grant_type", "client_credentials");
			//requestSpecification.queryParam("Meida Type", "application/x-www-form-urlencoded");
			requestSpecification.headers("accept", "application/json");
			response = requestSpecification.post(URLBuilder.loginurl2);
			//System.out.println(response.asString());
			//System.out.println(response.asString());
			return response ;
		
	}
	
	
public static void main(String[] args) {
	ServiceAuthKey obj1= new ServiceAuthKey();
	//obj.getMembership("624408457","SRK","1068501");
	//obj1.getAuthKey();
	
}
}
	

