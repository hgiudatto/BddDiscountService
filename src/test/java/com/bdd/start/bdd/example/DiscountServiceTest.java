package com.bdd.start.bdd.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DiscountServiceTest {
	
	DiscountService service = null;
	String percentage = "";

	@Given("^Execute GetDiscountService Business$")
	public void execute_GetDiscountService_Business() throws Throwable {
		service = new DiscountService();
	}

	@When("^if I will enter (\\d+)$")
	public void if_I_will_enter(int arg1) throws Throwable {
		percentage = service.getDiscount(arg1);
	}

	@Then("^We should get ten percentage discount$")
	public void we_should_get_ten_percentage_discount() throws Throwable {
		Assert.assertEquals("10%", percentage);
	}

	@Then("^We should get fifteen percentage discount$")
	public void we_should_get_fifteen_percentage_discount() throws Throwable {
		Assert.assertEquals("15%", percentage);
	}
	
	@Then("^We shouldn't get any percentage$")
	public void we_shouldn_t_get_any_percentage() throws Throwable {
		Assert.assertEquals("NA", percentage);
	}
}
