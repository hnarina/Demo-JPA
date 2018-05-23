package demo.beans;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import demo.repo.*;
@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private String mobileNumber;
	@OneToOne(cascade=CascadeType.ALL)
	private Wallet wallet;
	
	
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
