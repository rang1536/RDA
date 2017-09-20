package com.kis.rda.farm.domain;

import com.kis.rda.common.domain.Feces;

public class FecesImgList  extends  Feces {
	private String GENDER;
	private String DISEASE;
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getDISEASE() {
		return DISEASE;
	}
	public void setDISEASE(String dISEASE) {
		DISEASE = dISEASE;
	}

}
