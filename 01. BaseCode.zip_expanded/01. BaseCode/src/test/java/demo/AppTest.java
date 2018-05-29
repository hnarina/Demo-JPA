package demo;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.HashMap;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.beans.Customer;
import demo.exception.InvalidInputException;
import demo.repo.WalletRepoImpl;
import demo.service.WalletService;
import demo.service.WalletServiceImpl;

public class AppTest {
	private WalletService service;
	private Customer result;
	private String errorMessage;
	@Given("^user accesses create account module$")
	public void user_accesses_create_account_module() throws Exception {
		service = new WalletServiceImpl(new WalletRepoImpl(new HashMap<String,Customer>()));

	}
	@When("^I give \"([^\"]*)\" as a name,\"([^\"]*)\" as a mobileNumber,(\\d+) as a amount$")
	public void i_give_as_a_name_as_a_mobileNumber_as_a_amount(String arg1, String arg2, int arg3) throws Exception {
		if(arg2.length() > 10) {
			try {
				service.createAccount(arg1, arg2, new BigDecimal(arg3));

			} 
			catch(InvalidInputException e)
			{
				errorMessage = e.getMessage();
			}
		}
		else {
			result= service.createAccount(arg1, arg2, new BigDecimal(arg3));
		}
	}

	@Then("^System should create Account with name as \"([^\"]*)\",mobileNumber as \"([^\"]*)\",amount as (\\d+)$")
	public void system_should_create_Account_with_name_as_mobileNumber_as_amount_as(String arg1, String arg2, int arg3) throws Exception {
		assertEquals(arg1,result.getName()); 
		assertEquals(arg2,result.getMobileNo()); 
		assertEquals(new BigDecimal(arg3),result.getWallet().getBalance()); 
	}

	@Given("^user wants to create an account$")
	public void user_wants_to_create_an_account() throws Exception {
		service = new WalletServiceImpl(new WalletRepoImpl(new HashMap<String,Customer>()));
	}

	@Then("^System should give error message as \"([^\"]*)\"$")
	public void system_should_give_error_message_as(String arg1) throws Exception {
		assertEquals(errorMessage,arg1); 
	}




}
