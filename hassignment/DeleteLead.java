package week2.hassignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Giving username and password through sendkeys
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Thread.sleep(1000);
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[contains(@id,'label')]/a")).click();
		//click the link
		driver.findElement(By.linkText("Leads")).click();
		//Click the find leads option				
		driver.findElement(By.partialLinkText("Find")).click();
		//select phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//giving phone number through sendkeys and filter
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		//Click find leads button
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(1000);
	//	WebElement Leadid=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		//selecting the record and click
		  String lid="";
	     WebElement Leadid=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']"));
	   
		lid=Leadid.getText();
		//Leadid.click();
		Thread.sleep(2000);
		System.out.println(lid);
		Leadid.click();
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		Thread.sleep(1000);
		//Delete lead
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(lid);
		driver.findElement(By.linkText("Find Leads")).click();
		
		//driver.findElement(By.id("ext-gen266")).sendKeys("1224413");
				//driver.findElement(By.id("ext-gen270")).sendKeys("1224413");
				//driver.findElement(By.className("x-btn-text")).click();
		
		//driver.findElement(By.xpath("//div[contains(@id,'ext-gen921')]/a")).click();
		//driver.findElement(By.linkText("10780")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'partyId']/a")).click();
		/*WebElement table = driver.findElement(By.xpath("//table[@id=’myTable’]"));
		WebElement row = table.findElement(By.xpath("//tr[contains(@class, ‘myRow’)]")); 
		WebElement element = row.findElement(By.xpath("//td[contains(text(),‘myValue’)]"));*/
		
		//driver.findElement(By.className("subMenuButtonDangerous")).click();
		/*String cellValue="";
		List<WebElement> rows = driver.findElements(By.cssSelector("table.table_results tr"));
		for (WebElement row: rows) {
		    List<WebElement> cells = row.findElements(By.cssSelector("td.data"));
		    for (WebElement cell: cells) {
		    	cellValue = cell.getText(); 
				System.out.println("Cell value: " + cellValue); 
		    }
		} */

		// retrieve the cell value 
		
		// Close the webdriver 
		//driver.quit();
		Thread.sleep(2000);
		driver.close();
	}

}
