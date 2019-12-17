package com.slk.model;

public class c_Transaction {
	private int trans_id;
	public String getTrans_name() {
		return trans_name;
	}
	public void setTrans_name(String trans_name) {
		this.trans_name = trans_name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	private String trans_name;
	private float balance;
	private String time;
	private String branch_name;
	private String trans_date;
	private float trans_credit;
	private float trans_debit;
	private long trans_acc_no;
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public String getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}
	public float getTrans_credit() {
		return trans_credit;
	}
	public void setTrans_credit(float trans_credit) {
		this.trans_credit = trans_credit;
	}
	public float getTrans_debit() {
		return trans_debit;
	}
	public void setTrans_debit(float trans_debit) {
		this.trans_debit = trans_debit;
	}
	public long getTrans_acc_no() {
		return trans_acc_no;
	}
	public void setTrans_acc_no(long trans_acc_no) {
		this.trans_acc_no = trans_acc_no;
	}

}
