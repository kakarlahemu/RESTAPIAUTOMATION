package com.GenesisAPI.responsepojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BundleOption {

@SerializedName("benefits")
@Expose
private List<Benefit> benefits = null;

public List<Benefit> getBenefits() {
return benefits;
}

public void setBenefits(List<Benefit> benefits) {
this.benefits = benefits;
}

}