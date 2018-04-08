package com.GenesisAPI.requestpojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class getMembershipRequest {

@SerializedName("identifier")
@Expose
private String identifier;
@SerializedName("identifierType")
@Expose
private String identifierType;
@SerializedName("groupNumber")
@Expose
private String groupNumber;

public String getIdentifier() {
return identifier;
}

public void setIdentifier(String identifier) {
this.identifier = identifier;
}

public String getIdentifierType() {
return identifierType;
}

public void setIdentifierType(String identifierType) {
this.identifierType = identifierType;
}

public String getGroupNumber() {
return groupNumber;
}

public void setGroupNumber(String groupNumber) {
this.groupNumber = groupNumber;
}

}