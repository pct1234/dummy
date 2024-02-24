package crmtestfolder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import saleforce.crm.Sflogin;

public class BaseTest {
	
	
	public WebDriver driver;
	public Sflogin lg;
	
	public WebDriver initializeDriver() throws IOException
	
	
	
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("/home/user/eclipse-workspace/crm/src/main/java/saleforce/resource/Globaldata.properties");
		prop.load(fis);
	String bw=	prop.getProperty("browser");
		
		if(bw.equalsIgnoreCase("chrome"))
		{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		else if(bw.equalsIgnoreCase("firefox"))
		{
			
		 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			
		}
		return driver;
		
		
	}
	
//	@BeforeTest
//	public  Sflogin loginaction() throws IOException
//	{
//		driver=initializeDriver();
//		
//		lg=new Sflogin(driver);	
//		lg.gotosf();
//		return lg;
//			
//		
//	}
	
	

}
