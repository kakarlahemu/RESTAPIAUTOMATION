package com.GenesisAPI.requestpojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class getMembershipRequestPojo {

@SerializedName("getMembershipRequest")
@Expose
private getMembershipRequest getMembershipRequest;

public getMembershipRequest getGetMembershipRequest() {
return getMembershipRequest;
}

public void setGetMembershipRequest(getMembershipRequest getMembershipRequest) {
this.getMembershipRequest = getMembershipRequest;
}

}