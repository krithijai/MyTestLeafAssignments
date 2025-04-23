package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethod;

public class CreateAccount extends ProjectSpecificMethod {
	public CreateAccount(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public CreateAccount enterAccname(String accname)
	{
		driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accname);
		return this;
	}
	public CreateAccount enterOwnership(String own)
	{
		WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		driver.executeScript("arguments[0].click()",ownershipDD);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='"+own+"']")).click();
		return this;
	}
	public void ClickSave()
	{
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
}
/*String accountName = "Gokul";
driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountName);
WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
driver.executeScript("arguments[0].click()",ownershipDD);
driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']")).click();
driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();*/
