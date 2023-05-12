package steps;

import java.time.Duration;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;
import pages.LandingPage;

public class StepDefinitions extends DriverFactory{
	
	LandingPage landingPage=new LandingPage(driver);
	
	@Given("user launches demoqa site")
	public void user_launches_demoqa_site() {
	   driver.get("https://demoqa.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("user clicks on forms")
	public void user_clicks_on_forms() {
		landingPage.clickForms();
	}

	@When("user clicks on practice form")
	public void user_clicks_on_practice_form() {
		landingPage.clickPracticeForm();
	}

	@Then("user will be redirected to practice form page")
	public void user_will_be_redirected_to_practice_form_page() {

		landingPage.enterFirstName();
		System.out.println("redirected");
	}
	
}
