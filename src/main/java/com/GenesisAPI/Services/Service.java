package com.GenesisAPI.Services;

import org.json.JSONObject;
import org.testng.reporters.jq.Main;

import com.GenesisAPI.requestpojo.getMembershipRequestPojo;
import com.GenesisAPI.requestpojo.getMembershipRequest;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class Service {
	/**
	 * This API will Validate the getMembership service.
	 * @param identifier
	 * @param identifierType
	 * @param groupNumber
	 * @return
	 */
	
	// Create a method with required request parameters to pass in the JSON Request 
	public Response getMembership(String identifier, String identifierType, String groupNumber )
	
	{
		// collect the application server address and pass the response to a variable 
		Response response;
		try {
			// Create Objects for Pojo and actual Classes
			getMembershipRequestPojo getMembershipPojo = new getMembershipRequestPojo();
			getMembershipRequest getMembership = new getMembershipRequest();
			
			// Set the Request parameters
			getMembership.setIdentifier(identifier);
			getMembership.setIdentifierType(identifierType);
			getMembership.setGroupNumber(groupNumber);
			
			// Set the actual class object to the pojo class.
			getMembershipPojo.setGetMembershipRequest(getMembership);
			
			// Create a JSON object to pass the string request body as JSON
			JSONObject jsonObj = new JSONObject(getMembershipPojo);
			// assign the Rest assured object 
			RequestSpecification requestSpecification = RestAssured.given();
			
			// assign the headers required to pass in the request .
			requestSpecification.headers("content-type", "application/json");
			requestSpecification.headers("scope", "read");
			requestSpecification.headers("actor", "ACET");
			requestSpecification.headers("timestamp", "12345");
			requestSpecification.headers("accept", "application/json");
			requestSpecification.headers("authorization", "Bearer d0c4497a-6eb5-4451-8395-5a32e73db26f");
			// convert the Json Request body to String 
			requestSpecification.body(jsonObj.toString());
			response = requestSpecification.post(URLBuilder.loginurl);
			System.out.println(response.asString());
			return response ;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
		
	}
public static void main(String[] args) {
	//Service obj= new Service();
	//obj.getMembership("624408457","SRK","1068501");
	
}
	
}
