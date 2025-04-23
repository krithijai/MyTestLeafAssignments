package runner;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Pages.LoginPage;

public class RunLogOut extends ProjectSpecificMethod {

	@Test
	public void runloginData() throws InterruptedException
	{
		System.out.print(driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("learners@testleaf.com")
		.enterPassWord("Leaf@1234")
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
