package com.kis.rda.common.domain;

public class Feces {
	private String ENTITY_ID;
	private String FECES_OCCURDATE;
	private String FECES_GATHERDATE;
	private String ANTIBIOTICS;
	private String FEED;
	private String FECES_IMAGE;
	private String INPUTDATE;
	private String UPDATEDATE;
	private String SEQNO;

	private String	 totalDate;			
	private String	 ydate;			
	private String	 mdate;			
	private String	 ddate;			
	private String	 	tdate;		
					
					
		public String getTotalDate() {			
		totalDate=	ydate+"/"+mdate+"/"+ddate+"/"+tdate;		
		return totalDate;			
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

	public String getFECES_OCCURDATE() {
		return FECES_OCCURDATE;
	}

	public void setFECES_OCCURDATE(String fECES_OCCURDATE) {
		FECES_OCCURDATE = fECES_OCCURDATE;
	}

	public String getFECES_GATHERDATE() {
		return FECES_GATHERDATE;
	}

	public void setFECES_GATHERDATE(String fECES_GATHERDATE) {
		FECES_GATHERDATE = fECES_GATHERDATE;
	}

	public String getANTIBIOTICS() {
		return ANTIBIOTICS;
	}

	public void setANTIBIOTICS(String aNTIBIOTICS) {
		ANTIBIOTICS = aNTIBIOTICS;
	}

	public String getFEED() {
		return FEED;
	}

	public void setFEED(String fEED) {
		FEED = fEED;
	}

	public String getFECES_IMAGE() {
		return FECES_IMAGE;
	}

	public void setFECES_IMAGE(String fECES_IMAGE) {
		FECES_IMAGE = fECES_IMAGE;
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
