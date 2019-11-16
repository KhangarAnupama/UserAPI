package com.anupama.ks.user.model;

import java.sql.Timestamp;

public class ChildTO {

	private int id;
	
	private int parentId;
	
	private String name;
	
	private int age;
	
	private String type;
	
	private Timestamp createDate;
	
	private ParentEntity parent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ParentEntity getParent() {
		return parent;
	}

	public void setParent(ParentEntity parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "ChildEntity [id=" + id + ", parentId=" + parentId + ", name=" + name + ", age=" + age + ", type=" + type
				+ ", createDate=" + createDate + ", parent=" + parent + "]";
	}
	
}
