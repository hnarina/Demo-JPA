package com.cg.beans;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cg.repo.*;
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String mobileNumber;
	@OneToOne(cascade=CascadeType.ALL)
	private Wallet wallet;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return  name + " " + mobileNumber + " " + wallet.getBalance();
	}
 	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

}
