package com.kis.rda.common.domain;

public class Medicalhistory {
	private String ENTITY_ID;
	private String CURE_DATE;
	private String OCCUR_DATE;
	private String DISEASE;
	private String PRESCRIBE;
	private String RECOVERY_DATE;
	private String INPUTDATE;
	private String UPDATEDATE;
	private String SEQNO;

	private String	 view_totalOccDate;					
	public String getView_totalOccDate() {	
		view_totalOccDate=	ydate+"년"+mdate+"월"+ddate+"일"+tdate+"시";	
		return view_totalOccDate;	
	}	
	private String	 view_totalCurDate;					
	public String getView_totalCurDate() {	
		view_totalCurDate=	ydate+"년"+mdate+"월"+ddate+"일"+tdate+"시";	
		return view_totalCurDate;	
	}	
	private String	 view_totalRecDate;					
	public String getView_totalRecDate() {	
		view_totalRecDate=	ydate+"년"+mdate+"월"+ddate+"일"+tdate+"시";	
		return view_totalRecDate;	
	}	
	private String	 totalDate;			
	private String	 ydate;			
	private String	 mdate;			
	private String	 ddate;			
	private String	 	tdate;	
	
	public String getTotalDate() {			
	totalDate=	ydate+"/"+mdate+"/"+ddate+"/"+tdate;		
	return totalDate;			
}		
	public void setCURE_DATE(String cURE_DATE) {
		if(cURE_DATE!=null) {
		String[] date = cURE_DATE.split("/");
//		ydate=array[0];
//			mdate=array[1];
//			ddate=array[2];
//			tdate=array[3];
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
		}
		CURE_DATE = cURE_DATE;
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
public void setOCCUR_DATE(String oCCUR_DATE) {
	String[] date1 = oCCUR_DATE.split("/");
//	ydate=array[0];
//		mdate=array[1];
//		ddate=array[2];
//		tdate=array[3];
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
	
	OCCUR_DATE = oCCUR_DATE;
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

	

private String	 totalDate2;			
private String	 ydate2;			
private String	 mdate2;			
private String	 ddate2;			
private String	 	tdate2;		
 
	public String getTotalDate2() {
		totalDate2=	ydate2+"/"+mdate2+"/"+ddate2+"/"+tdate2;		
	return totalDate2;
}
	
	public void setRECOVERY_DATE(String rECOVERY_DATE) {

		String[] date2 = rECOVERY_DATE.split("/");
//		ydate=array[0];
//			mdate=array[1];
//			ddate=array[2];
//			tdate=array[3];
		 if(date2.length==1) {
				setYdate2(date2[0]);
		 }else if (date2.length==2) {
			 setYdate2(date2[0]);
				setMdate2(date2[1]);
		 }else if (date2.length==3) {
			 setYdate2(date2[0]);
				setMdate2(date2[1]);
				setDdate2(date2[2]);
		 }else if (date2.length==4) {
				setYdate2(date2[0]);
				setMdate2(date2[1]);
				setDdate2(date2[2]);
				setTdate2(date2[3]);
		 }
		RECOVERY_DATE = rECOVERY_DATE;
	}
	
	
public void setTotalDate2(String totalDate2) {
	this.totalDate2 = totalDate2;
}
public String getYdate2() {
	return ydate2;
}
public void setYdate2(String ydate2) {
	this.ydate2 = ydate2;
}
public String getMdate2() {
	return mdate2;
}
public void setMdate2(String mdate2) {
	this.mdate2 = mdate2;
}
public String getDdate2() {
	return ddate2;
}
public void setDdate2(String ddate2) {
	this.ddate2 = ddate2;
}
public String getTdate2() {
	return tdate2;
}
public void setTdate2(String tdate2) {
	this.tdate2 = tdate2;
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

	public String getCURE_DATE() {
		return CURE_DATE;
	}

//	public void setCURE_DATE(String cURE_DATE) {
//		CURE_DATE = cURE_DATE;
//	}

	public String getOCCUR_DATE() {
		return OCCUR_DATE;
	}

//	public void setOCCUR_DATE(String oCCUR_DATE) {
//		OCCUR_DATE = oCCUR_DATE;
//	}

	public String getDISEASE() {
		return DISEASE;
	}

	public void setDISEASE(String dISEASE) {
		DISEASE = dISEASE;
	}

	public String getPRESCRIBE() {
		return PRESCRIBE;
	}

	public void setPRESCRIBE(String pRESCRIBE) {
		PRESCRIBE = pRESCRIBE;
	}

	public String getRECOVERY_DATE() {
		return RECOVERY_DATE;
	}

//	public void setRECOVERY_DATE(String rECOVERY_DATE) {
//		RECOVERY_DATE = rECOVERY_DATE;
//	}

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
