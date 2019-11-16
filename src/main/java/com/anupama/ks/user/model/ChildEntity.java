package com.anupama.ks.user.model;

import java.io.Serializable;
import java.sql.Timestamp;

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
//@Table(name="Child")
public class ChildEntity implements Serializable{

	private static final long serialVersionUID = 8650221588530407719L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "PARENT_ID", unique = false, nullable = false)
	private int parentId;
	
	@Column(name = "NAME", unique = false, nullable = false, length = 100)
	private String name;
	
	@Column(name = "AGE", unique = false, nullable = true)
	private int age;
	
	@Column(name = "TYPE", unique = false, nullable = true, length = 100)
	private String type;
	
	@Column(name = "CREATEDATE", unique = false, nullable = true)
	private Timestamp createDate;
	
//	@OneToMany(mappedBy="childrens")
	@ManyToOne
    @JoinColumn(name = "parent", referencedColumnName="id")
	private ParentEntity parent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
