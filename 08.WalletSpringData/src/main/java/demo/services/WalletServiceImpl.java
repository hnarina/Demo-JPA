package demo.services;
import demo.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.beans.*;
@Service(value="service")
public class WalletServiceImpl implements WalletService {
	@Autowired
	WalletRepo repo;
  
	/*public WalletServiceImpl(WalletRepoImpl repo) {
		
		this.repo = repo;
	}
*/
	public Customer createAccount(String name, String mobile, float amount) {
	    
		Customer c1 = new Customer();
		Wallet w1 = new Wallet();
	    w1.setBalance(amount);
		c1.setName(name);
		c1.setMobileNumber(mobile);
	    c1.setWallet(w1);
		repo.save(c1);
		return c1;
	}

	public Customer showBalance(String) {
		
		return repo.findById(mobile);
		
	}

	public boolean withdrawl(String mobile, float amount) {
		Customer c = repo.findOne(mobile);
		
		
		Wallet w = c.getWallet();
		System.out.println(c);
		if(w.getBalance()>amount)
		{
			w.setBalance((w.getBalance()-amount));
			repo.update(c);
		}
		 
		 return true;
		
	}

	public boolean deposit(String mobile, float amount) {
		Customer c = repo.findOne(mobile);
		Wallet w = c.getWallet();
	     w.setBalance((w.getBalance()+amount));
	     repo.update(c);
	 	return true;
	}
	

}
