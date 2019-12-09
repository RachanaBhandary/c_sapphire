package com.slk.model;

import org.springframework.stereotype.Repository;

@Repository
public class c_Employee {
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empcontact=" + empcontact + ", empdob=" + empdob
				+ ", address=" + address + ", username=" + username + ", password=" + password + ", empmail=" + empmail
				+ ", empbranch=" + empbranch + ", empbranch_id=" + empbranch_id + "]";
	}
	private String empid;
	private String empname;
	private long empcontact;
	private String empdob;
	private String address;
	private String username;
	private String password;
	private String empmail;
	private String empbranch;
	public String getEmpbranch() {
		return empbranch;
	}
	public void setEmpbranch(String string) {
		this.empbranch = string;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	private int empbranch_id;
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String l) {
		this.empid = l;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getEmpcontact() {
		return empcontact;
	}
	public void setEmpcontact(long empcontact) {
		this.empcontact = empcontact;
	}
	public String getEmpdob() {
		return empdob;
	}
	public void setEmpdob(String empdob) {
		this.empdob = empdob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmpbranch_id() {
		return empbranch_id;
	}
	public void setEmpbranch_id(int empbranch_id) {
		this.empbranch_id = empbranch_id;
	}
	
}
