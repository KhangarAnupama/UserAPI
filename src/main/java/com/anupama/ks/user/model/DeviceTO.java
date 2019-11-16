package com.anupama.ks.user.model;

public class DeviceTO {
	
	private int id;
	private String macID;
	private String userEmailD;
	private boolean activate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMacID() {
		return macID;
	}
	public void setMacID(String macID) {
		this.macID = macID;
	}
	public boolean isActivate() {
		return activate;
	}
	public void setActivate(boolean activate) {
		this.activate = activate;
	}
	
	public String getUserEmailD() {
		return userEmailD;
	}
	public void setUserEmailD(String userEmailD) {
		this.userEmailD = userEmailD;
	}
	@Override
	public String toString() {
		return "DeviceTO [id=" + id + ", macID=" + macID + ", userID=" + userEmailD + ", activate=" + activate + "]";
	}

}
