package com.kis.rda.farm.domain;

public class Aduino {
	private float gAx;
	private float gAy;
	private float gAz;
	private float gGx;
	private float gGy;
	private float gGz;
	private float gMx;
	private float gMy;
	private float gMz;
	private float gTemper;
	private float gHumi;
	private int gActive;
	private String gDate;
	private String gFarm;
	private String gSensorId;
	public float getgAx() {
		return gAx;
	}
	public void setgAx(float gAx) {
		this.gAx = gAx;
	}
	public float getgAy() {
		return gAy;
	}
	public void setgAy(float gAy) {
		this.gAy = gAy;
	}
	public float getgAz() {
		return gAz;
	}
	public void setgAz(float gAz) {
		this.gAz = gAz;
	}
	public float getgGx() {
		return gGx;
	}
	public void setgGx(float gGx) {
		this.gGx = gGx;
	}
	public float getgGy() {
		return gGy;
	}
	public void setgGy(float gGy) {
		this.gGy = gGy;
	}
	public float getgGz() {
		return gGz;
	}
	public void setgGz(float gGz) {
		this.gGz = gGz;
	}
	public float getgMx() {
		return gMx;
	}
	public void setgMx(float gMx) {
		this.gMx = gMx;
	}
	public float getgMy() {
		return gMy;
	}
	public void setgMy(float gMy) {
		this.gMy = gMy;
	}
	public float getgMz() {
		return gMz;
	}
	public void setgMz(float gMz) {
		this.gMz = gMz;
	}
	public float getgTemper() {
		return gTemper;
	}
	public void setgTemper(float gTemper) {
		this.gTemper = gTemper;
	}
	public float getgHumi() {
		return gHumi;
	}
	public void setgHumi(float gHumi) {
		this.gHumi = gHumi;
	}
	public int getgActive() {
		return gActive;
	}
	public void setgActive(int gActive) {
		this.gActive = gActive;
	}
	public String getgDate() {
		return gDate;
	}
	public void setgDate(String gDate) {
		this.gDate = gDate;
	}
	public String getgFarm() {
		return gFarm;
	}
	public void setgFarm(String gFarm) {
		this.gFarm = gFarm;
	}
	public String getgSensorId() {
		return gSensorId;
	}
	public void setgSensorId(String gSensorId) {
		this.gSensorId = gSensorId;
	}
	@Override
	public String toString() {
		return "Aduino [gAx=" + gAx + ", gAy=" + gAy + ", gAz=" + gAz + ", gGx=" + gGx + ", gGy=" + gGy + ", gGz=" + gGz
				+ ", gMx=" + gMx + ", gMy=" + gMy + ", gMz=" + gMz + ", gTemper=" + gTemper + ", gHumi=" + gHumi
				+ ", gActive=" + gActive + ", gDate=" + gDate + ", gFarm=" + gFarm + ", gSensorId=" + gSensorId + "]";
	}
	
}
