package com.GenesisAPI.responsepojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Membership {

@SerializedName("sourceSysCode")
@Expose
private String sourceSysCode;
@SerializedName("coverages")
@Expose
private List<Coverage> coverages = null;
@SerializedName("cob")
@Expose
private List<Cob> cob = null;
@SerializedName("providers")
@Expose
private List<Provider> providers = null;
@SerializedName("identifiers")
@Expose
private List<Identifier> identifiers = null;

public String getSourceSysCode() {
return sourceSysCode;
}

public void setSourceSysCode(String sourceSysCode) {
this.sourceSysCode = sourceSysCode;
}

public List<Coverage> getCoverages() {
return coverages;
}

public void setCoverages(List<Coverage> coverages) {
this.coverages = coverages;
}

public List<Cob> getCob() {
return cob;
}

public void setCob(List<Cob> cob) {
this.cob = cob;
}

public List<Provider> getProviders() {
return providers;
}

public void setProviders(List<Provider> providers) {
this.providers = providers;
}

public List<Identifier> getIdentifiers() {
return identifiers;
}

public void setIdentifiers(List<Identifier> identifiers) {
this.identifiers = identifiers;
}

}