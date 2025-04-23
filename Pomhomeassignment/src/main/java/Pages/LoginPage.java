package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	public LoginPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public LoginPage enterUserName(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	public LoginPage enterPassWord(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public MyHomePage clickOnLoginButton()
	{
		driver.findElement(By.id("Login")).click();
		return new MyHomePage(driver);
	}
}
