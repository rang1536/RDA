package com.kis.rda.common.domain;

public class Biochemical {
	private	String	ENTITY_ID	;
	private	String	BIO_GATHERDATE	;
	private	String	TOTAL_PROTEIN	;
	private	String	ALBUMIN	;
	private	String	BUN	;
	private	String	GLUCOSE	;
	private	String	NA	;
	private	String	K	;
	private	String	CL	;
	private	String	EQUIPMENT	;
	private	String	INPUTDATE	;
	private	String	UPDATEDATE	;
	
	private	String SEQNO;
	
	
	
	
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
		
		public void setBIO_GATHERDATE(String bIO_GATHERDATE) {

			String[] date = bIO_GATHERDATE.split("/");
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
			
			
			BIO_GATHERDATE = bIO_GATHERDATE;
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
	public String getBIO_GATHERDATE() {
		return BIO_GATHERDATE;
	}
//	public void setBIO_GATHERDATE(String bIO_GATHERDATE) {
//		BIO_GATHERDATE = bIO_GATHERDATE;
//	}
	public String getTOTAL_PROTEIN() {
		return TOTAL_PROTEIN;
	}
	public void setTOTAL_PROTEIN(String tOTAL_PROTEIN) {
		TOTAL_PROTEIN = tOTAL_PROTEIN;
	}
	public String getALBUMIN() {
		return ALBUMIN;
	}
	public void setALBUMIN(String aLBUMIN) {
		ALBUMIN = aLBUMIN;
	}
	public String getBUN() {
		return BUN;
	}
	public void setBUN(String bUN) {
		BUN = bUN;
	}
	public String getGLUCOSE() {
		return GLUCOSE;
	}
	public void setGLUCOSE(String gLUCOSE) {
		GLUCOSE = gLUCOSE;
	}
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
