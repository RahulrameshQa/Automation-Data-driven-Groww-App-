package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class growwLoginRepository {
WebDriver driver1;
	


By growwloginbtn=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/div/span");

	By growwmail=By.xpath("//*[@id=\"login_email1\"]");
	By growwcontinuebtn=By.xpath("//*[@id=\"lils382InitialLoginScreen\"]/div[4]/div[3]/div/div/span");
	
	
	By growwpassword=By.xpath("//*[@id=\"login_password1\"]");
	By growwlogin=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div[4]/div/div");//Object Repository
	

	public growwLoginRepository (WebDriver driver1) {
		this.driver1 = driver1;//Constroctor:- Passing values to initial variables
	}
	
	
	
	public void loginoption() {
		driver1.findElement(growwloginbtn).click();
			
		}
	
	
	
	public void setvalueemail(String email ) {
		driver1.findElement(growwmail).sendKeys(email);
		
		
	}
	
	public void Continue() {
		driver1.findElement(growwcontinuebtn).click();
			  
		}
	
	
	public void setvaluepassword(String password ) {
		driver1.findElement(growwpassword).sendKeys(password);
		
	}
	
public void login() {
	driver1.findElement(growwlogin).click();
		
	}




	
	

}
