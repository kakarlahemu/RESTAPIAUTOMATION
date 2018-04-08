package com.GenesisAPI.responsepojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Indicators {

@SerializedName("qmscoIndicator")
@Expose
private String qmscoIndicator;

public String getQmscoIndicator() {
return qmscoIndicator;
}

public void setQmscoIndicator(String qmscoIndicator) {
this.qmscoIndicator = qmscoIndicator;
}

}