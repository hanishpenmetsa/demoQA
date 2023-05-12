package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class Hooks {
	
	
	DriverFactory driverFactory=new DriverFactory();
	
	
	@Before
	public void BeforeClass()
	{
		driverFactory.initDriver();
	}
	
	@After
	public void AfterClass()
	{
		driverFactory.driver.close();
	}

}
