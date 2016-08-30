package com.jag.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="STUDENT_INFORMATION")
public class Student_Info {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	
	//@Transient
	@Column(name="FULL_NAME", nullable=false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	private boolean existing;
	
	
	public boolean isExisting() {
		return existing;
	}
	public void setExisting(boolean existing) {
		this.existing = existing;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
