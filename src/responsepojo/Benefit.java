package com.GenesisAPI.responsepojo;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Benefit {

@SerializedName("benefitBundleOptionId")
@Expose
private String benefitBundleOptionId;
@SerializedName("benefitBundleOptionDescription")
@Expose
private String benefitBundleOptionDescription;
@SerializedName("benefitEffectiveDate")
@Expose
private String benefitEffectiveDate;
@SerializedName("benefitExpirationDate")
@Expose
private String benefitExpirationDate;
@SerializedName("benefitPlanId")
@Expose
private String benefitPlanId;
@SerializedName("benefitPlanName")
@Expose
private String benefitPlanName;
@SerializedName("benefitType")
@Expose
private String benefitType;
@SerializedName("coverageLevelCode")
@Expose
private String coverageLevelCode;
@SerializedName("relationshipCode")
@Expose
private String relationshipCode;
@SerializedName("relationshipDescription")
@Expose
private String relationshipDescription;
@SerializedName("memberIdCardSerialNumber")
@Expose
private String memberIdCardSerialNumber;
@SerializedName("subscriberIdCardSerialNumber")
@Expose
private String subscriberIdCardSerialNumber;
@SerializedName("eligibilityStatusCode")
@Expose
private String eligibilityStatusCode;
@SerializedName("cancelReasonTypeCode")
@Expose
private String cancelReasonTypeCode;
@SerializedName("planType")
@Expose
private String planType;
@SerializedName("indicators")
@Expose
private Indicators indicators;

public String getBenefitBundleOptionId() {
return benefitBundleOptionId;
}

public void setBenefitBundleOptionId(String benefitBundleOptionId) {
this.benefitBundleOptionId = benefitBundleOptionId;
}

public String getBenefitBundleOptionDescription() {
return benefitBundleOptionDescription;
}

public void setBenefitBundleOptionDescription(String benefitBundleOptionDescription) {
this.benefitBundleOptionDescription = benefitBundleOptionDescription;
}

public String getBenefitEffectiveDate() {
return benefitEffectiveDate;
}

public void setBenefitEffectiveDate(String benefitEffectiveDate) {
this.benefitEffectiveDate = benefitEffectiveDate;
}

public String getBenefitExpirationDate() {
return benefitExpirationDate;
}

public void setBenefitExpirationDate(String benefitExpirationDate) {
this.benefitExpirationDate = benefitExpirationDate;
}

public String getBenefitPlanId() {
return benefitPlanId;
}

public void setBenefitPlanId(String benefitPlanId) {
this.benefitPlanId = benefitPlanId;
}

public String getBenefitPlanName() {
return benefitPlanName;
}

public void setBenefitPlanName(String benefitPlanName) {
this.benefitPlanName = benefitPlanName;
}

public String getBenefitType() {
return benefitType;
}

public void setBenefitType(String benefitType) {
this.benefitType = benefitType;
}

public String getCoverageLevelCode() {
return coverageLevelCode;
}

public void setCoverageLevelCode(String coverageLevelCode) {
this.coverageLevelCode = coverageLevelCode;
}

public String getRelationshipCode() {
return relationshipCode;
}

public void setRelationshipCode(String relationshipCode) {
this.relationshipCode = relationshipCode;
}

public String getRelationshipDescription() {
return relationshipDescription;
}

public void setRelationshipDescription(String relationshipDescription) {
this.relationshipDescription = relationshipDescription;
}

public String getMemberIdCardSerialNumber() {
return memberIdCardSerialNumber;
}

public void setMemberIdCardSerialNumber(String memberIdCardSerialNumber) {
this.memberIdCardSerialNumber = memberIdCardSerialNumber;
}

public String getSubscriberIdCardSerialNumber() {
return subscriberIdCardSerialNumber;
}

public void setSubscriberIdCardSerialNumber(String subscriberIdCardSerialNumber) {
this.subscriberIdCardSerialNumber = subscriberIdCardSerialNumber;
}

public String getEligibilityStatusCode() {
return eligibilityStatusCode;
}

public void setEligibilityStatusCode(String eligibilityStatusCode) {
this.eligibilityStatusCode = eligibilityStatusCode;
}

public String getCancelReasonTypeCode() {
return cancelReasonTypeCode;
}

public void setCancelReasonTypeCode(String cancelReasonTypeCode) {
this.cancelReasonTypeCode = cancelReasonTypeCode;
}

public String getPlanType() {
return planType;
}

public void setPlanType(String planType) {
this.planType = planType;
}

public Indicators getIndicators() {
return indicators;
}

public void setIndicators(Indicators indicators) {
this.indicators = indicators;
}

}