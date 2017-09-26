package com.kis.rda.common.domain;

public class Immune {
	private String ENTITY_ID;
	private String IMMUNE_GATHERDATE;
	private String SAA;
	private String HAPTOGLOBIN;
	private String CRP;
	private String IGG;
	private String IGA;
	private String EQUIPMENT;
	private String INPUTDATE;
	private String UPDATEDATE;
	private String FB;
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
		
		public void setIMMUNE_GATHERDATE(String iMMUNE_GATHERDATE) {
			String[] date = iMMUNE_GATHERDATE.split("/");
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
			
			
			
			IMMUNE_GATHERDATE = iMMUNE_GATHERDATE;
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

	public String getIMMUNE_GATHERDATE() {
		return IMMUNE_GATHERDATE;
	}

//	public void setIMMUNE_GATHERDATE(String iMMUNE_GATHERDATE) {
//		IMMUNE_GATHERDATE = iMMUNE_GATHERDATE;
//	}

	public String getSAA() {
		return SAA;
	}

	public void setSAA(String sAA) {
		SAA = sAA;
	}

	public String getHAPTOGLOBIN() {
		return HAPTOGLOBIN;
	}

	public void setHAPTOGLOBIN(String hAPTOGLOBIN) {
		HAPTOGLOBIN = hAPTOGLOBIN;
	}

	public String getCRP() {
		return CRP;
	}

	public void setCRP(String cRP) {
		CRP = cRP;
	}

	public String getIGG() {
		return IGG;
	}

	public void setIGG(String iGG) {
		IGG = iGG;
	}

	public String getIGA() {
		return IGA;
	}

	public void setIGA(String iGA) {
		IGA = iGA;
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

	public String getFB() {
		return FB;
	}

	public void setFB(String fB) {
		FB = fB;
	}

}
