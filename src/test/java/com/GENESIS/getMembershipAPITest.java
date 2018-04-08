package com.GENESIS;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.GenesisAPI.Services.Service;
import com.GenesisAPI.responsepojo.Benefit;
import com.GenesisAPI.responsepojo.Cob;
import com.GenesisAPI.responsepojo.Coverage;
import com.GenesisAPI.responsepojo.GetMembershipResponse;
import com.GenesisAPI.responsepojo.Identifier;
import com.GenesisAPI.responsepojo.Membership;
import com.GenesisAPI.responsepojo.getMembershipResponsepojo;
import com.google.gson.Gson;
import com.jayway.restassured.response.Response;

public class getMembershipAPITest {
	Service service;
	
	@Test
	public void getMembershipAPITest()	
	{
		service=new Service();
		Response responseData = service.getMembership("624408457","SRK","1068501");
		System.out.println(responseData.asString());
		Gson gson= new Gson();
		getMembershipResponsepojo data = gson.fromJson(responseData.asString(), getMembershipResponsepojo.class);
		GetMembershipResponse getMembershipResponse = data.getGetMembershipResponse();
		
		Membership getmembership = getMembershipResponse.getMembership();
		// Member ship level
		System.out.println("*********** SOURCE CODE IS ************");
		System.out.println(getmembership.getSourceSysCode());
		// Member ship level->Coverage level
		System.out.println("*********** COVERAGES ARE ************");
		List<Coverage> coverage = getmembership.getCoverages();
		System.out.println(coverage.get(0).getGroupName());
		System.out.println(coverage.get(0).getGroupNumber());
		Assert.assertEquals(coverage.get(0).getGroupName(), "ARIADNE DEMIRJIAN LLC");
		Assert.assertEquals(coverage.get(0).getGroupNumber(), "1068501");
		System.out.println("API VALUES ARE MATCHED");
		// Member ship level->COverage level -> inside coverage level ->Bundle options level ->Benefits level
		System.out.println("*********** BENEFITS ARE ************");
		System.out.println(coverage.get(0).getBundleOptions().get(0).getBenefits().get(0).getBenefitBundleOptionId());
		System.out.println(coverage.get(0).getBundleOptions().get(0).getBenefits().get(0).getBenefitBundleOptionDescription());
		
		// Member ship level->Identifiers level
		System.out.println("*********** IDENTIFIERS ARE ************");
		List<Identifier> identifiers = getmembership.getIdentifiers();
		System.out.println(identifiers.get(0).getId());
		System.out.println(identifiers.get(0).getType());
			}
	
 
}
