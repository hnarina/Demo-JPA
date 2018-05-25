package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.*;
import com.cg.repo.WalletRepo;
import com.cg.service.WalletService;

@RestController
public class WalletController {
	@Autowired
	WalletRepo repo;
	@Autowired
	WalletService service;
	
	@RequestMapping(value="/c")
	public Customer createAccount() {
		Customer c = new Customer(1,"hari","7702508656");
		Wallet w = new Wallet(1,5000);
		c.setWallet(w);
		service.createAccount(c);
		return c;
	}


	
}
