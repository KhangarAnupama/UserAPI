package com.anupama.ks.user.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Device")
public class DeviceEntity implements Serializable {

	private static final long serialVersionUID = 2628705404314017597L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "MAC_ID", unique = true, nullable = false, length = 50)	
	private String macID;
	
	@Column(name = "USER_EMAIL_ID", unique = true, nullable = false, length = 50)
	private String userEmailD;
	
	@Column(name = "ACTIVATE",  nullable = false)
	private boolean activate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMacID() {
		return macID;
	}

	public void setMacID(String macID) {
		this.macID = macID;
	}

	public String getUserEmailD() {
		return userEmailD;
	}

	public void setUserEmailD(String userEmailD) {
		this.userEmailD = userEmailD;
	}

	public boolean isActivate() {
		return activate;
	}

	public void setActivate(boolean activate) {
		this.activate = activate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "DeviceEntity [id=" + id + ", macID=" + macID + ", userEmailD=" + userEmailD + ", activate=" + activate
				+ "]";
	}

}
