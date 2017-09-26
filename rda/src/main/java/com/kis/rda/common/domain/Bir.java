package com.kis.rda.common.domain;

public class Bir {
	private	String	ENTITY_ID	;
	private	String	CHECK_DATE	;
	private	String	TEMPER	;
	private	String	HEARTRATE	;
	private	String	BREATHRATE	;
	private	String	MEDICINE	;
	private	String	DIARRHEA	;
	private	String	FECES_STATE	;
	private	String	FECES_COLOR	;
	private	String	FECES_BLOOD	;
	private	String	DEHYDRATION	;
	private	String	INPUTDATE	;
	private	String	UPDATEDATE	;
	
	private	String SEQNO;
	
	
	private String	 totalDate;			
	private String	 ydate;			
	private String	 mdate;			
	private String	 ddate;			
	private String	 	tdate;		
					
	private String	 view_totalCkDate;					
	public String getView_totalCkDate() {	
		view_totalCkDate=	ydate+"년"+mdate+"월"+ddate+"일"+tdate+"시";	
		return view_totalCkDate;	
	}				
		public String getTotalDate() {			
		totalDate=	ydate+"/"+mdate+"/"+ddate+"/"+tdate;		
		return totalDate;			
	}	
		
		public void setCHECK_DATE(String cHECK_DATE) 		{

			String[] date = cHECK_DATE.split("/");
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
			
			CHECK_DATE = cHECK_DATE;
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
	public String getCHECK_DATE() {
		return CHECK_DATE;
	}
//	public void setCHECK_DATE(String cHECK_DATE) 
//		{
//		 
//		CHECK_DATE = cHECK_DATE;
//	}
	public String getTEMPER() {
		return TEMPER;
	}
	public void setTEMPER(String tEMPER) {
		TEMPER = tEMPER;
	}
	public String getHEARTRATE() {
		return HEARTRATE;
	}
	public void setHEARTRATE(String hEARTRATE) {
		HEARTRATE = hEARTRATE;
	}
	public String getBREATHRATE() {
		return BREATHRATE;
	}
	public void setBREATHRATE(String bREATHRATE) {
		BREATHRATE = bREATHRATE;
	}
	public String getMEDICINE() {
		return MEDICINE;
	}
	public void setMEDICINE(String mEDICINE) {
		MEDICINE = mEDICINE;
	}
	public String getDIARRHEA() {
		return DIARRHEA;
	}
	public void setDIARRHEA(String dIARRHEA) {
		DIARRHEA = dIARRHEA;
	}
	public String getFECES_STATE() {
		return FECES_STATE;
	}
	public void setFECES_STATE(String fECES_STATE) {
		FECES_STATE = fECES_STATE;
	}
	public String getFECES_COLOR() {
		return FECES_COLOR;
	}
	public void setFECES_COLOR(String fECES_COLOR) {
		FECES_COLOR = fECES_COLOR;
	}
	public String getFECES_BLOOD() {
		return FECES_BLOOD;
	}
	public void setFECES_BLOOD(String fECES_BLOOD) {
		FECES_BLOOD = fECES_BLOOD;
	}
	public String getDEHYDRATION() {
		return DEHYDRATION;
	}
	public void setDEHYDRATION(String dEHYDRATION) {
		DEHYDRATION = dEHYDRATION;
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
