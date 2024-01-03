package com.web.model;

public class BankTransactions {
	private double depositamount;
	private double withdrawamount;
	private double transferamount;
	private long accno2;
	private String confirmpsw;
	private int accountactivation;
	
	public BankTransactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BankTransactions(double depositamount, double withdrawamount, double transferamount, long accno2,
			String confirmpsw, int accountactivation) {
		super();
		this.depositamount = depositamount;
		this.withdrawamount = withdrawamount;
		this.transferamount = transferamount;
		this.accno2 = accno2;
		this.confirmpsw = confirmpsw;
		this.accountactivation = accountactivation;
	}
	public double getDepositamount() {
		return depositamount;
	}
	public void setDepositamount(double depositamount) {
		this.depositamount = depositamount;
	}
	public double getWithdrawamount() {
		return withdrawamount;
	}
	public void setWithdrawamount(double withdrawamount) {
		this.withdrawamount = withdrawamount;
	}
	public double getTransferamount() {
		return transferamount;
	}
	public void setTransferamount(double transferamount) {
		this.transferamount = transferamount;
	}
	public long getAccno2() {
		return accno2;
	}
	public void setAccno2(long accno2) {
		this.accno2 = accno2;
	}
	public String getConfirmpsw() {
		return confirmpsw;
	}
	public void setConfirmpsw(String confirmpsw) {
		this.confirmpsw = confirmpsw;
	}
	public int getAccountactivation() {
		return accountactivation;
	}
	public void setAccountactivation(int accountactivation) {
		this.accountactivation = accountactivation;
	}
	@Override
	public String toString() {
		return "BankTransactions [depositamount=" + depositamount + ", withdrawamount=" + withdrawamount
				+ ", transferamount=" + transferamount + ", accno2=" + accno2 + ", confirmpsw=" + confirmpsw
				+ ", accountactivation=" + accountactivation + "]";
	}
	

}
