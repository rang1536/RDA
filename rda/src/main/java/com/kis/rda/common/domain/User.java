package com.kis.rda.common.domain;

public class User {
	private int userNo;
	private String userName;
	private String userHp;
	private String userRank;
	private int userImgNo;
	private String userAddress;
	private String userPassword;
	
	private String imgPath;
	private String imgName;
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHp() {
		return userHp;
	}
	public void setUserHp(String userHp) {
		this.userHp = userHp;
	}
	public String getUserRank() {
		return userRank;
	}
	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}
	public int getUserImgNo() {
		return userImgNo;
	}
	public void setUserImgNo(int userImgNo) {
		this.userImgNo = userImgNo;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userName=" + userName + ", userHp=" + userHp + ", userRank=" + userRank
				+ ", userImgNo=" + userImgNo + ", userAddress=" + userAddress + ", userPassword=" + userPassword
				+ ", imgPath=" + imgPath + ", imgName=" + imgName + "]";
	}
	
	
}
