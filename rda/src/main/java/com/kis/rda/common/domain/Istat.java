package com.kis.rda.common.domain;

public class Istat {
	private String ENTITY_ID;
	private String ISTAT_GATHERDATE;
	private String NA;
	private String K;
	private String CL;
	private String TCO2;
	private String BUN;
	private String GLU;
	private String PH;
	private String PCO2;
	private String HCO3;
	private String BE;
	private String ANGAP;
	private String LACTATE;
	private String PO2;
	private String SO2;
	private String EQUIPMENT;
	private String INPUTDATE;
	private String UPDATEDATE;
	private String SEQNO;
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
		
		public void setISTAT_GATHERDATE(String iSTAT_GATHERDATE) {

			String[] date = iSTAT_GATHERDATE.split("/");
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
			
			ISTAT_GATHERDATE = iSTAT_GATHERDATE;
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

	public String getISTAT_GATHERDATE() {
		return ISTAT_GATHERDATE;
	}

//	public void setISTAT_GATHERDATE(String iSTAT_GATHERDATE) {
//		ISTAT_GATHERDATE = iSTAT_GATHERDATE;
//	}

	public String getNA() {
		return NA;
	}

	public void setNA(String nA) {
		NA = nA;
	}

	public String getK() {
		return K;
	}

	public void setK(String k) {
		K = k;
	}

	public String getCL() {
		return CL;
	}

	public void setCL(String cL) {
		CL = cL;
	}

	public String getTCO2() {
		return TCO2;
	}

	public void setTCO2(String tCO2) {
		TCO2 = tCO2;
	}

	public String getBUN() {
		return BUN;
	}

	public void setBUN(String bUN) {
		BUN = bUN;
	}

	public String getGLU() {
		return GLU;
	}

	public void setGLU(String gLU) {
		GLU = gLU;
	}

	public String getPH() {
		return PH;
	}

	public void setPH(String pH) {
		PH = pH;
	}

	public String getPCO2() {
		return PCO2;
	}

	public void setPCO2(String pCO2) {
		PCO2 = pCO2;
	}

	public String getHCO3() {
		return HCO3;
	}

	public void setHCO3(String hCO3) {
		HCO3 = hCO3;
	}

	public String getBE() {
		return BE;
	}

	public void setBE(String bE) {
		BE = bE;
	}

	public String getANGAP() {
		return ANGAP;
	}

	public void setANGAP(String aNGAP) {
		ANGAP = aNGAP;
	}

	public String getLACTATE() {
		return LACTATE;
	}

	public void setLACTATE(String lACTATE) {
		LACTATE = lACTATE;
	}

	public String getPO2() {
		return PO2;
	}

	public void setPO2(String pO2) {
		PO2 = pO2;
	}

	public String getSO2() {
		return SO2;
	}

	public void setSO2(String sO2) {
		SO2 = sO2;
	}

	public String getEQUIPMENT() {
		return EQUIPMENT;
	}

	public void setEQUIPMENT(String eQUIPMENT) {
		EQUIPMENT = eQUIPMENT;
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
