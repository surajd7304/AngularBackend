package com.jbk.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Register", catalog = "Angular", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Register {
	
  private Integer userId;
  private String fname;
  private String lname;
  private String email;
  private String username;
  private String password;
  private String mobileNo;
  private String gender;
  private String address;
  private String city;
  private Date createdDate;
 
  public Register() {
	  
  }
  
public Register(Integer userId, String fname, String lname, String email, String username, String password,
		String mobileNo, String gender, String address, String city, Date createdDate) {
	this.userId = userId;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.username = username;
	this.password = password;
	this.mobileNo = mobileNo;
	this.gender = gender;
	this.address = address;
	this.city = city;
	this.createdDate = createdDate;
}

@Override
public String toString() {
	return "Register [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", username="
			+ username + ", password=" + password + ", mobileNo=" + mobileNo + ", gender=" + gender + ", address="
			+ address + ", city=" + city + ", createdDate=" + createdDate + "]";
}

@Id
@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name = "userId", unique = true, nullable = false)
public Integer getUserId() {
	return userId;
}

public void setUserId(Integer userId) {
	this.userId = userId;
}

@Column(name = "fname",  nullable = false, length = 20)
public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

@Column(name = "lname",  nullable = false, length = 20)
public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

@Column(name = "email", unique = true, nullable = false, length = 45)
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Column(name = "username",  nullable = false, length = 20)
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

@Column(name = "fname",  nullable = false, length = 20)
public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Column(name = "mobileNo",  nullable = false, length = 13)
public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

@Column(name = "gender",  nullable = false, length = 20)
public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

@Column(name = "address",  nullable = false, length = 20)
public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}

@Column(name = "city",  nullable = false, length = 20)
public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Column(name = "createdDate")
@Temporal(TemporalType.TIMESTAMP)
public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
  


  
  
  

}
