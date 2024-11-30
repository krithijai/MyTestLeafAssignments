package week2.hassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[contains(@id,'label')]/a")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create ")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("JK Software");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Krithika");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jai");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("krithi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Sofware testing using selenium automation");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("kri@gmail.com");
		WebElement dropDown1=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select opt1=new Select(dropDown1);
		opt1.selectByValue("NY");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Informations are confidential");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
			//createLeadForm_generalStateProvinceGeoId
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
