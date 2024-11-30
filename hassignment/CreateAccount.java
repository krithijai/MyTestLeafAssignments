package week2.hassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args)throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[contains(@id,'label')]/a")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("krithi");
		//driver.findElement(By.industryEnumId)
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.name("numberEmployees")).sendKeys("9");
		driver.findElement(By.className("smallSubmit")).click();
		//To use drop down we have to use webelement and select
		WebElement dropDown1=driver.findElement(By.name("industryEnumId"));
		Select opt1=new Select(dropDown1);
		opt1.selectByIndex(3);
		WebElement dropDown2=driver.findElement(By.name("ownershipEnumId"));
		Select opt2=new Select(dropDown2);
		opt2.selectByIndex(1);
		Thread.sleep(1000);
		if (title.contains("Leaftaps"))
		{
			System.out.println("Title is printed");
		}
		else
		{
			System.out.println("Title is not printed");
		}
		//Thread.sleep(2000);
		
		
		driver.close();

	}

}
