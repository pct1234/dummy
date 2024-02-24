package saleforce.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sflogin {
	
	public WebDriver driver;
	
	
	
	public Sflogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void gotosf()
	{
		driver.get("https://login.salesforce.com/?locale=in");
	}
	
	public void login(String uname, String upass)
	
	{
		
		email.sendKeys(uname);
		pass.sendKeys(upass);
		lgbutton.click();
	}
	
	@FindBy(id="username") WebElement email;
	@FindBy(id="password") WebElement pass;
	@FindBy(id="Login") WebElement lgbutton;

}
