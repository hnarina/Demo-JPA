package com.cg.service;
import com.cg.beans.*;

public interface WalletService {
public Customer createAccount(Customer c);
public Customer showBalance(int id);
public boolean withdrawl(int id, float amount);
public boolean deposit(int id, float amount);

}
