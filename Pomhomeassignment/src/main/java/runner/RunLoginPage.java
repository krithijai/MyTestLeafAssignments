package runner;

import org.testng.annotations.BeforeTest;


import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Pages.LoginPage;
import Pages.MyAccount;
import Pages.MyHomePage;

public class RunLoginPage extends ProjectSpecificMethod {
	
	
	@BeforeTest
	public void setValue()
	{
		fname="Loginnew";
	}
	@Test(dataProvider="getData")
	public void runLoginData(String username, String password) throws InterruptedException
	{
		System.out.println(driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(username)
		.enterPassWord(password)
		.clickOnLoginButton()
		.clickOnToggle()
		
		//MyHomePage mhp=new MyHomePage(driver);
		//mhp.clickOnToggle()
		.clickOnViewAll()
		.clickOnSales()
		.clickOnAccounts()
		//MyAccount ma=new MyAccount(driver);
		//ma.clickOnNew()
		.clickOnNew()
		.enterAccname("Jai")
		.enterOwnership("Public")
		.ClickSave();
		
		
	}
}
