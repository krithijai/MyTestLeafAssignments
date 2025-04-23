package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;
public class MyAccount extends ProjectSpecificMethod {
	public MyAccount(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public CreateAccount clickOnNew()
	{
		 driver.findElement(By.xpath("//a[@title='New']")).click();
		 return new CreateAccount(driver);
	}
	
	
}
