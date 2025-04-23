package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	public MyHomePage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public MyHomePage clickOnToggle()
	{
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}
	public MyHomePage clickOnViewAll()
	{
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		return this;
	}
	public MyHomePage clickOnSales()
	{
		driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();
		return this;
	}
	public MyAccount clickOnAccounts()throws InterruptedException
	{
		//Select Accounts tab
        WebElement applaun=driver.findElement(By.xpath("(//span[@class='slds-truncate'])[7]"));
  		Actions action1=new Actions(driver);
  		action1.click(applaun).perform();
  		Thread.sleep(1000);
		return new MyAccount(driver);
	}
}
