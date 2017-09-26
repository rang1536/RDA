package com.kis.rda.common.domain;

public class Environment {
	private String rnum;
	private String FARM_ID;
	private String ENV_GATHERDATE;
	private String test_env_g;

	private String	 totalDate;			
	private String	 ydate;			
	private String	 mdate;			
	private String	 ddate;			
	private String	 	tdate;		
 
	
private String	 view_totalGathDate;					
public String getView_totalGathDate() {	
view_totalGathDate=	ydate+"년"+mdate+"월"+ddate+"일"+tdate+"시";	
return view_totalGathDate;	
}					
		public String getTotalDate() {			
		totalDate=	ydate+"/"+mdate+"/"+ddate+"/"+tdate;		
		return totalDate;			
	}			
		public void setENV_GATHERDATE(String eNV_GATHERDATE) {
			String[] date = eNV_GATHERDATE.split("/");
//			ydate=array[0];
//				mdate=array[1];
//				ddate=array[2];
//				tdate=array[3];
			 if(date.length==1) {
					setYdate(date[0]);
			 }else if (date.length==2) {
				 setYdate(date[0]);
					setMdate(date[1]);
			 }else if (date.length==3) {
				 setYdate(date[0]);
					setMdate(date[1]);
					setDdate(date[2]);
			 }else if (date.length==4) {
					setYdate(date[0]);
					setMdate(date[1]);
					setDdate(date[2]);
					setTdate(date[3]);
			 }
			ENV_GATHERDATE = eNV_GATHERDATE;
		}
		
	public void setTotalDate(String totalDate) {				
		this.totalDate = totalDate;			
	}				
	public String getYdate() {				
		return ydate;			
	}				
	public void setYdate(String ydate) {				
		this.ydate = ydate;			
	}				
	public String getMdate() {				
		return mdate;			
	}				
	public void setMdate(String mdate) {				
		this.mdate = mdate;			
	}				
	public String getDdate() {				
		return ddate;			
	}				
	public void setDdate(String ddate) {				
		this.ddate = ddate;			
	}				
	public String getTdate() {				
		return tdate;			
	}				
	public void setTdate(String tdate) {				
		this.tdate = tdate;			
		}			

	
	
	
	public String getTest_env_g() {
		return test_env_g;
	}

	public void setTest_env_g(String test_env_g) {
		this.test_env_g = test_env_g;
	}

	private String CLEAN;
	private String WTC;
	private String WSQ;
	private String FQ;
	private String INPUTDATE;
	private String UPDATEDATE;
	private String SEQNO;

	public String getSEQNO() {
		return SEQNO;
	}

	public void setSEQNO(String sEQNO) {
		SEQNO = sEQNO;
	}
	// private String farm_id ;
	// private String env_gatherdate ;
	// private String clean ;
	// private String wtc ;
	// private String wsq ;
	// private String fq ;
	// private String inputdate ;
	// private String updatedate ;

	// public String getFarm_id() {
	// return farm_id;
	// }
	// public void setFarm_id(String farm_id) {
	// this.farm_id = farm_id;
	// }
	// public String getEnv_gatherdate() {
	// return env_gatherdate;
	// }
	// public void setEnv_gatherdate(String env_gatherdate) {
	// this.env_gatherdate = env_gatherdate;
	// }
	// public String getClean() {
	// return clean;
	// }
	// public void setClean(String clean) {
	// this.clean = clean;
	// }
	// public String getWtc() {
	// return wtc;
	// }
	// public void setWtc(String wtc) {
	// this.wtc = wtc;
	// }
	// public String getWsq() {
	// return wsq;
	// }
	// public void setWsq(String wsq) {
	// this.wsq = wsq;
	// }
	// public String getFq() {
	// return fq;
	// }
	// public void setFq(String fq) {
	// this.fq = fq;
	// }
	// public String getInputdate() {
	// return inputdate;
	// }
	// public void setInputdate(String inputdate) {
	// this.inputdate = inputdate;
	// }
	// public String getUpdatedate() {
	// return updatedate;
	// }
	// public void setUpdatedate(String updatedate) {
	// this.updatedate = updatedate;
	// }
	public String getRnum() {
		return rnum;
	}

	public void setRnum(String rnum) {
		this.rnum = rnum;
	}

	public String getFARM_ID() {
		return FARM_ID;
	}

	public void setFARM_ID(String fARM_ID) {
		FARM_ID = fARM_ID;
	}

	public String getENV_GATHERDATE() {
		return ENV_GATHERDATE;
	}

	

	public String getCLEAN() {
		return CLEAN;
	}

	public void setCLEAN(String cLEAN) {
		CLEAN = cLEAN;
	}

	public String getWTC() {
		return WTC;
	}

	public void setWTC(String wTC) {
		WTC = wTC;
	}

	public String getWSQ() {
		return WSQ;
	}

	public void setWSQ(String wSQ) {
		WSQ = wSQ;
	}

	public String getFQ() {
		return FQ;
	}

	public void setFQ(String fQ) {
		FQ = fQ;
	}

	public String getINPUTDATE() {
		return INPUTDATE;
	}

	public void setINPUTDATE(String iNPUTDATE) {
		INPUTDATE = iNPUTDATE;
	}

	public String getUPDATEDATE() {
		return UPDATEDATE;
	}

	public void setUPDATEDATE(String uPDATEDATE) {
		UPDATEDATE = uPDATEDATE;
	}

}
