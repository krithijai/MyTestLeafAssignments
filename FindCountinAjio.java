package week3.Classassign;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindCountinAjio {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.ajio.com/");
		Thread.sleep(1000);
		
		//search with the word bags in the search box and click search
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		//selecting the men checkbox
		WebElement chk=driver.findElement(By.xpath("//label[contains(text(),'Men')]"));
		Thread.sleep(1000);
		chk.click();
		chk.isSelected();
		Thread.sleep(1000);
		
		//Selecting the fashion bag check box
		WebElement chk1=driver.findElement(By.xpath("(//label[contains(text(),'Fashion')])"));
		Thread.sleep(1000);
		chk1.click();
		chk1.isSelected();
		Thread.sleep(1000);
		//WebElement str=driver.findElement(By.xpath("//div[contains(text(),' Items Found')]"));
		
		//Displaying the number of items found
		WebElement str=driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println(str.getText());
		Thread.sleep(1000);
		//Displaying the brandnames
		List<WebElement> totallink=driver.findElements(By.className("brand"));
 		int size=totallink.size();
 		System.out.println("Number of a Brands: " +size);
 		for(int j=0;j<totallink.size();j++)
 		{
 			System.out.println(totallink.get(j).getText());
 		}
 		Thread.sleep(1000);
 		//Displaying the bag names
		List<WebElement> bagname=driver.findElements(By.className("nameCls"));
 		int pr=bagname.size();
 		System.out.println("BagName list: " +pr);
 		for(int j=0;j<bagname.size();j++)
 		{
 			System.out.println(bagname.get(j).getText());
 		}
 		
 		/*----------------------------------*/
		/*List<WebElement> totallink=driver.findElements(By.tagName("a"));
 		int size=totallink.size();
 		System.out.println("Number of a tag in facebook: " +size);
 		for(int j=0;j<totallink.size();j++)
 		{
 			System.out.println(totallink.get(j).getText());
 		}*/
	}

}
