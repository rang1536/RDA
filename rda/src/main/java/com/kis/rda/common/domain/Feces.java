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

	private String	 view_totalGathDate;	
	private String	 view_totalOccDate1;	
	private String	 totalDate;			
	private String	 ydate;			
	private String	 mdate;			
	private String	 ddate;			
	private String	 	tdate;		
					
	public String getView_totalGathDate() {	
		view_totalGathDate=	ydate+"년"+mdate+"월"+ddate+"일"+tdate+"시";	
		return view_totalGathDate;	
	}
	public String getView_totalOccDate1() {	
		view_totalOccDate1=	ydate1+"년"+mdate1+"월"+ddate1+"일"+tdate1+"시";	
		return view_totalOccDate1;	
	}
 
		public String getTotalDate() {			
		totalDate=	ydate+"/"+mdate+"/"+ddate+"/"+tdate;		
		return totalDate;			
	}		
		public void setFECES_OCCURDATE(String fECES_OCCURDATE) {

			String[] date = fECES_OCCURDATE.split("/");
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
			
			
			FECES_OCCURDATE = fECES_OCCURDATE;
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

	
	private String	 totalDate1;			
	private String	 ydate1;			
	private String	 mdate1;			
	private String	 ddate1;			
	private String	 tdate1;	
	
	
	
	public String getTotalDate1() {
		totalDate1=	ydate1+"/"+mdate1+"/"+ddate1+"/"+tdate1;		
		return totalDate1;
	}
	public void setFECES_GATHERDATE(String fECES_GATHERDATE) {

		String[] date1 = fECES_GATHERDATE.split("/");
//		ydate=array[0];
//			mdate=array[1];
//			ddate=array[2];
//			tdate=array[3];
		 if(date1.length==1) {
				setYdate1(date1[0]);
		 }else if (date1.length==2) {
			 setYdate1(date1[0]);
				setMdate1(date1[1]);
		 }else if (date1.length==3) {
			 setYdate1(date1[0]);
				setMdate1(date1[1]);
				setDdate1(date1[2]);
		 }else if (date1.length==4) {
				setYdate1(date1[0]);
				setMdate1(date1[1]);
				setDdate1(date1[2]);
				setTdate1(date1[3]);
		 }
		FECES_GATHERDATE = fECES_GATHERDATE;
	}
	
	public void setTotalDate1(String totalDate1) {
		this.totalDate1 = totalDate1;
	}
	public String getYdate1() {
		return ydate1;
	}
	public void setYdate1(String ydate1) {
		this.ydate1 = ydate1;
	}
	public String getMdate1() {
		return mdate1;
	}
	public void setMdate1(String mdate1) {
		this.mdate1 = mdate1;
	}
	public String getDdate1() {
		return ddate1;
	}
	public void setDdate1(String ddate1) {
		this.ddate1 = ddate1;
	}
	public String getTdate1() {
		return tdate1;
	}
	public void setTdate1(String tdate1) {
		this.tdate1 = tdate1;
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

//	public void setFECES_OCCURDATE(String fECES_OCCURDATE) {
//		FECES_OCCURDATE = fECES_OCCURDATE;
//	}

	public String getFECES_GATHERDATE() {
		return FECES_GATHERDATE;
	}

//	public void setFECES_GATHERDATE(String fECES_GATHERDATE) {
//		FECES_GATHERDATE = fECES_GATHERDATE;
//	}

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
