package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverFactory;

public class LandingPage extends DriverFactory{
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Forms']")
	WebElement formsLink;
	
	@FindBy(xpath="//span[text()='Practice Form']")
	WebElement practiceFormLink;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	public void clickForms()
	{
		formsLink.click();
	}
	
	public void clickPracticeForm()
	{
		practiceFormLink.click();
	}
	
	public void enterFirstName()
	{
		firstName.sendKeys("test FirstName");
	}
	
	public void enterLastName()
	{
		lastName.sendKeys("test lastname");
	}
}
