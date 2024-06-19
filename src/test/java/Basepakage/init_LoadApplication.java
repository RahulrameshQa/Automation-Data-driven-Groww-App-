package Basepakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class init_LoadApplication {
	public WebDriver driver;
	String pagelink="https://groww.in/";
	
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		System.out.println("Opening Application");
        driver.get(pagelink);
		
		driver.manage().window().maximize();
	}

	

}
