package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	
	@Id
	private Long accno;
	private String name;
	private String password;
	private String confirm_password;
	private double amount;
	private String address;
	private Long mobileno;
	private int status;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bank(Long accno, String name, String password, String confirm_password, double amount, String address,
			Long mobileno, int status) {
		super();
		this.accno = accno;
		this.name = name;
		this.password = password;
		this.confirm_password = confirm_password;
		this.amount = amount;
		this.address = address;
		this.mobileno = mobileno;
		this.status = status;
	}
	
	
	public Long getAccno() {
		return accno;
	}
	public void setAccno(Long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + ", password=" + password + ", confirm_password="
				+ confirm_password + ", amount=" + amount + ", address=" + address + ", mobileno=" + mobileno
				+ ", status=" + status + "]";
	}
	
	
	
}
