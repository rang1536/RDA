package com.kis.rda.common.domain;

public class Entity {
	private String ENTITY_ID;
	private String BREEDING;
	private String VARIETY;
	private String GENDER;
	private String BIRTH;
	private String BIRTH_WEIGHT;
	private String COLOSTRUM;
	private String VACCINE;
	private String BIRTHNUMBER;
	private String BIRTH_CASE;
	private String INPUTDATE;
	private String UPDATEDATE;
	private String CASENUM;
	private String SEQNO;

	
	private String	 totalDate;			
	private String	 ydate;			
	private String	 mdate;			
	private String	 ddate;			
	private String	 	tdate;		
 
	private String	 view_totalBirDate;					
	public String getView_totalBirDate() {	
		view_totalBirDate=	ydate+"년"+mdate+"월"+ddate+"일"+tdate+"시";	
		return view_totalBirDate;	
	}			
		public String getTotalDate() {			
		totalDate=	ydate+"/"+mdate+"/"+ddate+"/"+tdate;		
		return totalDate;			
	}			
		
		public void setBIRTH(String bIRTH) {
	
 
			String[] date = bIRTH.split("/");
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
				BIRTH = bIRTH;
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

	
	
	
	
	public String getSEQNO() {
		return SEQNO;
	}

	public void setSEQNO(String sEQNO) {
		SEQNO = sEQNO;
	}

	public String getENTITY_ID() {
		return ENTITY_ID;
	}

	public void setENTITY_ID(String eNTITY_ID) {
		ENTITY_ID = eNTITY_ID;
	}

	public String getBREEDING() {
		return BREEDING;
	}

	public void setBREEDING(String bREEDING) {
		BREEDING = bREEDING;
	}

	public String getVARIETY() {
		return VARIETY;
	}

	public void setVARIETY(String vARIETY) {
		VARIETY = vARIETY;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getBIRTH() {
		return BIRTH;
	}

//	public void setBIRTH(String bIRTH) {
//		BIRTH = bIRTH;
//	}

	public String getBIRTH_WEIGHT() {
		return BIRTH_WEIGHT;
	}

	public void setBIRTH_WEIGHT(String bIRTH_WEIGHT) {
		BIRTH_WEIGHT = bIRTH_WEIGHT;
	}

	public String getCOLOSTRUM() {
		return COLOSTRUM;
	}

	public void setCOLOSTRUM(String cOLOSTRUM) {
		COLOSTRUM = cOLOSTRUM;
	}

	public String getVACCINE() {
		return VACCINE;
	}

	public void setVACCINE(String vACCINE) {
		VACCINE = vACCINE;
	}

 

	public String getBIRTHNUMBER() {
		return BIRTHNUMBER;
	}
	public void setBIRTHNUMBER(String bIRTHNUMBER) {
		BIRTHNUMBER = bIRTHNUMBER;
	}
	public void setView_totalBirDate(String view_totalBirDate) {
		this.view_totalBirDate = view_totalBirDate;
	}
	public String getBIRTH_CASE() {
		return BIRTH_CASE;
	}

	public void setBIRTH_CASE(String bIRTH_CASE) {
		BIRTH_CASE = bIRTH_CASE;
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

	public String getCASENUM() {
		return CASENUM;
	}

	public void setCASENUM(String cASENUM) {
		CASENUM = cASENUM;
	}

}
