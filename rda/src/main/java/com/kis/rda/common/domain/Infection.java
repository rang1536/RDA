package com.kis.rda.common.domain;

public class Infection {
	private String ENTITY_ID;
	private String INFECTION_GATHERDATE;
	private String ECOLI;
	private String CORONAVIRUS;
	private String ROTAVIRUS;
	private String CRYPTOSPORIDIUM;
	private String GIARDIA;
	private String BVDAG;
	private String BVDAB;
	private String EIMERIA;
	private String ETC;
	private String THEILERIA;
	private String EQUIPMENT;
	private String INPUTDATE;
	private String UPDATEDATE;
	private String ROTA;
	private String CORONA;
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
		
		public void setINFECTION_GATHERDATE(String iNFECTION_GATHERDATE) {
			String[] date = iNFECTION_GATHERDATE.split("/");
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
			
			
			INFECTION_GATHERDATE = iNFECTION_GATHERDATE;
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

	public String getINFECTION_GATHERDATE() {
		return INFECTION_GATHERDATE;
	}

//	public void setINFECTION_GATHERDATE(String iNFECTION_GATHERDATE) {
//		INFECTION_GATHERDATE = iNFECTION_GATHERDATE;
//	}

	public String getECOLI() {
		return ECOLI;
	}

	public void setECOLI(String eCOLI) {
		ECOLI = eCOLI;
	}

	public String getCORONAVIRUS() {
		return CORONAVIRUS;
	}

	public void setCORONAVIRUS(String cORONAVIRUS) {
		CORONAVIRUS = cORONAVIRUS;
	}

	public String getROTAVIRUS() {
		return ROTAVIRUS;
	}

	public void setROTAVIRUS(String rOTAVIRUS) {
		ROTAVIRUS = rOTAVIRUS;
	}

	public String getCRYPTOSPORIDIUM() {
		return CRYPTOSPORIDIUM;
	}

	public void setCRYPTOSPORIDIUM(String cRYPTOSPORIDIUM) {
		CRYPTOSPORIDIUM = cRYPTOSPORIDIUM;
	}

	public String getGIARDIA() {
		return GIARDIA;
	}

	public void setGIARDIA(String gIARDIA) {
		GIARDIA = gIARDIA;
	}

	public String getBVDAG() {
		return BVDAG;
	}

	public void setBVDAG(String bVDAG) {
		BVDAG = bVDAG;
	}

	public String getBVDAB() {
		return BVDAB;
	}

	public void setBVDAB(String bVDAB) {
		BVDAB = bVDAB;
	}

	public String getEIMERIA() {
		return EIMERIA;
	}

	public void setEIMERIA(String eIMERIA) {
		EIMERIA = eIMERIA;
	}

	public String getETC() {
		return ETC;
	}

	public void setETC(String eTC) {
		ETC = eTC;
	}

	public String getTHEILERIA() {
		return THEILERIA;
	}

	public void setTHEILERIA(String tHEILERIA) {
		THEILERIA = tHEILERIA;
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

	public String getROTA() {
		return ROTA;
	}

	public void setROTA(String rOTA) {
		ROTA = rOTA;
	}

	public String getCORONA() {
		return CORONA;
	}

	public void setCORONA(String cORONA) {
		CORONA = cORONA;
	}

}
