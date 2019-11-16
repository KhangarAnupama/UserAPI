package com.anupama.ks.user.model;

import java.sql.Timestamp;
import java.util.Set;

public class ParentTO {

	private int id;
	
	private String name;
	
	private String emailID;
	
	private int age;

	private String type; 
	
	private Timestamp createDate;
	
	private boolean notification;
	
	private Set<ChildTO> childrens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public boolean isNotification() {
		return notification;
	}

	public void setNotification(boolean notification) {
		this.notification = notification;
	}

	public Set<ChildTO> getChildrens() {
		return childrens;
	}

	public void setChildrens(Set<ChildTO> childrens) {
		this.childrens = childrens;
	}

	@Override
	public String toString() {
		return "ParentEntity [id=" + id + ", name=" + name + ", emailID=" + emailID + ", age=" + age + ", type=" + type
				+ ", createDate=" + createDate + ", notification=" + notification + ", childrens=" + childrens + "]";
	}
	


}
