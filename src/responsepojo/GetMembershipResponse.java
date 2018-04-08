package com.GenesisAPI.responsepojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetMembershipResponse {

@SerializedName("membership")
@Expose
private Membership membership;

public Membership getMembership() {
return membership;
}

public void setMembership(Membership membership) {
this.membership = membership;
}

}