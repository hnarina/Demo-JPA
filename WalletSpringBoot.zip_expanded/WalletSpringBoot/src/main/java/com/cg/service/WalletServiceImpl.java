package com.cg.service;
import com.cg.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.beans.*;
@Service(value="service")
public class WalletServiceImpl implements WalletService {
	@Autowired
	WalletRepo repo;
@Transactional
	public Customer createAccount(Customer c) {
		repo.save(c);
		return c;
	}

@Transactional
	public boolean withdrawl(int id, float amount) {
		Customer c = repo.findById(id);
		Wallet w = c.getWallet();
		if(w.getBalance()>amount)
		{
			w.setBalance(w.getBalance()-amount);
		}
		
		return true;
	}
@Transactional
	public boolean deposit(int id, float amount) {
	Customer c = repo.findById(id);
	Wallet w = c.getWallet();
	w.setBalance(w.getBalance()+amount);
  return true;
}

	

	public Customer showBalance(int id) {
		Customer c = repo.findById(id);
		return c;
	}
  
}
