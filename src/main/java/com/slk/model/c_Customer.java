package com.slk.model;

public class c_Customer {
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
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
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String string) {
		this.branch = string;
	}
	public String getLoan_type() {
		return loan_type;
	}
	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}
	public long getAadhar_card() {
		return aadhar_card;
	}
	public void setAadhar_card(long aadhar_card) {
		this.aadhar_card = aadhar_card;
	}
	public String getPan_card() {
		return pan_card;
	}
	public void setPan_card(String pan_card) {
		this.pan_card = pan_card;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	private long accno;
	private String name;
	private String dob;
	
	private long contact;
	private String username;
	private String password;
	private float amount;
	private String branch;
	
	private String loan_type;
	private long aadhar_card;
	private String pan_card;
	private String acc_type;
	private String action;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	

}
