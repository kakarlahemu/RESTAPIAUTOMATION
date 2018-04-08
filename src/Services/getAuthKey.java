package com.GenesisAPI.Services;

import org.testng.annotations.Test;

import com.GenesisAPI.responsepojo.getAUTH;
import com.google.gson.Gson;
import com.jayway.restassured.response.Response;

public class getAuthKey {
	ServiceAuthKey serviceAuth;


	public String getauthkey()	
	{
		serviceAuth  = new ServiceAuthKey();
		 Response responsedata1 = serviceAuth.getAuthKey();
		Gson gson= new Gson();
		getAUTH data = gson.fromJson(responsedata1.asString(), getAUTH.class);
		System.out.println(data.getAccessToken());
		return data.getAccessToken();
		 
	}
	public static void main(String[] args) {
		getAuthKey obj= new getAuthKey();
		obj.getauthkey();
		
	}
	
} 


