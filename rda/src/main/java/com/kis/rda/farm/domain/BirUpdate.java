package com.kis.rda.farm.domain;

import com.kis.rda.common.domain.Bir;

public class BirUpdate extends Bir {
	private String	   farm_id	;
	private String	   rnum	;
	private String	   check1	;
	private String	   check2	;
	private String	   check3	;
	private String	   check4	;
	
	
	private	String	CHECK_DATE	;
	

	public String getCHECK_DATE() {
		return CHECK_DATE;
	}
	public void setCHECK_DATE(String cHECK_DATE) {
		String date[] = cHECK_DATE.split("/");
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
	private String	 totalDate;
	private String	 ydate;	
	private String	 mdate;
	private String	 ddate;
	private String	 tdate;
	
 
		public String getTotalDate() {
			setCHECK_DATE(ydate+"/"+mdate+"/"+ddate+"/"+tdate);
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
	
	
	public String getFarm_id() {
		return farm_id;
	}
	public void setFarm_id(String farm_id) {
		this.farm_id = farm_id;
	}
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	public String getCheck1() {
		return check1;
	}
	public void setCheck1(String check1) {
		this.check1 = check1;
	}
	public String getCheck2() {
		return check2;
	}
	public void setCheck2(String check2) {
		this.check2 = check2;
	}
	public String getCheck3() {
		return check3;
	}
	public void setCheck3(String check3) {
		this.check3 = check3;
	}
	public String getCheck4() {
		return check4;
	}
	public void setCheck4(String check4) {
		this.check4 = check4;
	}
	
 
}
