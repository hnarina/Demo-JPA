package com.cg.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallet {
	@Id
	private int id;
	private float balance;
	

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wallet(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	

}
