package com.kis.rda.common.domain;

public class SenseActive {
	private int actionValue;
	private String dTime;
	public int getActionValue() {
		return actionValue;
	}
	public void setActionValue(int actionValue) {
		this.actionValue = actionValue;
	}
	public String getdTime() {
		return dTime;
	}
	public void setdTime(String dTime) {
		this.dTime = dTime;
	}
	
	@Override
	public String toString() {
		return "SenseActive [actionValue=" + actionValue + ", dTime=" + dTime + "]";
	}
	
	
}
