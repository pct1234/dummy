package crmtest;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

import crmtestfolder.BaseTest;
import saleforce.crm.Sflogin;
public class Maintest extends BaseTest{

	@Test
	public void test() throws IOException
	{
	driver=initializeDriver();
	Sflogin lg=new Sflogin(driver);
	lg.gotosf();
	lg.login("edf","sfs");
	
	}

}
