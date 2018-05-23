package demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallet {
	@Id
	private int id;
	private float balance;
	

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	

}
