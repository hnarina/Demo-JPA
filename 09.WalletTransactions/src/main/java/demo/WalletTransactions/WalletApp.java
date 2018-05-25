package demo.WalletTransactions;

import demo.services.*;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

import demo.beans.Customer;
import demo.beans.Wallet;
import demo.repo.*;


public class WalletApp {
   
	public static void main(String[] args) {
	//	Map<String, Customer> data = new HashMap<String, Customer>();
	/*	WalletRepoImpl repo = new WalletRepoImpl();
		WalletServiceImpl service = new WalletServiceImpl(repo);
		*/
	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beanconfig.xml");
	WalletService service = ctx.getBean("service",demo.services.WalletService.class);
	Customer c = new Customer(1, "Hari", "7702508656");
	Wallet w =new Wallet(1, 5000);
	c.setWallet(w);
	service.createAccount(c);
	service.deposit(1, 4000);
	System.out.println(c);
			
	}

}
