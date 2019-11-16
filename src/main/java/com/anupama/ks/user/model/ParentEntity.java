package com.anupama.ks.user.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Parent")
public class ParentEntity implements Serializable {

	private static final long serialVersionUID = 2628705404314017597L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "NAME", unique = false, nullable = false, length = 100)
	private String name;
	
	@Column(name = "EMAIL_ID", unique = true, nullable = false, length = 100)	
	private String emailID;
	
	@Column(name = "AGE", unique = false, nullable = true)
	private int age;

	@Column(name = "TYPE", unique = false, nullable = true, length = 100)
	private String type; 
	
	@Column(name = "CREATEDATE", unique = false, nullable = true)
	private Timestamp createDate;
	
	@Column(name = "NOTIFICATION", nullable = false)	
	private boolean notification;
	
	@OneToMany(mappedBy = "parent", cascade = CascadeType.MERGE)
	private Set<ChildEntity> childrens;
	
	
	
	public ParentEntity() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Set<ChildEntity> getChildrens() {
		return childrens;
	}

	public void setChildrens(Set<ChildEntity> childrens) {
		this.childrens = childrens;
	}

	@Override
	public String toString() {
		return "ParentEntity [id=" + id + ", name=" + name + ", emailID=" + emailID + ", age=" + age + ", type=" + type
				+ ", createDate=" + createDate + ", notification=" + notification + ", childrens=" + childrens + "]";
	}
	
}
