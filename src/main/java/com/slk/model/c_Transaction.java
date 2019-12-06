package com.slk.model;

public class c_Transaction {
	private int trans_id;
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
