package com.GenesisAPI.responsepojo;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coverage {

@SerializedName("groupNumber")
@Expose
private String groupNumber;
@SerializedName("groupName")
@Expose
private String groupName;
@SerializedName("eligibilitySystemTypeCode")
@Expose
private String eligibilitySystemTypeCode;
@SerializedName("claimSystemTypeCode")
@Expose
private String claimSystemTypeCode;
@SerializedName("bundleOptions")
@Expose
private List<BundleOption> bundleOptions = null;

public String getGroupNumber() {
return groupNumber;
}

public void setGroupNumber(String groupNumber) {
this.groupNumber = groupNumber;
}

public String getGroupName() {
return groupName;
}

public void setGroupName(String groupName) {
this.groupName = groupName;
}

public String getEligibilitySystemTypeCode() {
return eligibilitySystemTypeCode;
}

public void setEligibilitySystemTypeCode(String eligibilitySystemTypeCode) {
this.eligibilitySystemTypeCode = eligibilitySystemTypeCode;
}

public String getClaimSystemTypeCode() {
return claimSystemTypeCode;
}

public void setClaimSystemTypeCode(String claimSystemTypeCode) {
this.claimSystemTypeCode = claimSystemTypeCode;
}

public List<BundleOption> getBundleOptions() {
return bundleOptions;
}

public void setBundleOptions(List<BundleOption> bundleOptions) {
this.bundleOptions = bundleOptions;
}

}
