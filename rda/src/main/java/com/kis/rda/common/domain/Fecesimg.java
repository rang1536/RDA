package com.kis.rda.common.domain;

public class Fecesimg {
	private String ENTITY_ID;
	private String GETIMGDATE;
	private String ORIGINIMG;
	private String ANALYIMG;
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
		public void setGETIMGDATE(String gETIMGDATE) {
			String[] date = gETIMGDATE.split("/");
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
			
			GETIMGDATE = gETIMGDATE;
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

	public String getGETIMGDATE() {
		return GETIMGDATE;
	}

//	public void setGETIMGDATE(String gETIMGDATE) {
//		GETIMGDATE = gETIMGDATE;
//	}

	public String getORIGINIMG() {
		return ORIGINIMG;
	}

	public void setORIGINIMG(String oRIGINIMG) {
		ORIGINIMG = oRIGINIMG;
	}

	public String getANALYIMG() {
		return ANALYIMG;
	}

	public void setANALYIMG(String aNALYIMG) {
		ANALYIMG = aNALYIMG;
	}

}
