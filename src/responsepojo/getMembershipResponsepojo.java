package com.GenesisAPI.responsepojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class getMembershipResponsepojo {

@SerializedName("getMembershipResponse")
@Expose
private GetMembershipResponse getMembershipResponse;

public GetMembershipResponse getGetMembershipResponse() {
return getMembershipResponse;
}

public void setGetMembershipResponse(GetMembershipResponse getMembershipResponse) {
this.getMembershipResponse = getMembershipResponse;
}

}