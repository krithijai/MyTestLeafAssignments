package week2.hassignment;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafPrint {
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the button with the text click and confirm title
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']//span")).click();
		//verify that the title of the page is 'Dashboard'
		String pageTitle=driver.getTitle();
		if (pageTitle.equals("Dashboard"))
		{
			System.out.println("Title of the page is " +pageTitle);
		}
		Thread.sleep(1000);
		//Navigate back
		driver.navigate().back();
		//Thread.sleep(2000);
		//check the confirm if the button disabled is disabled
		boolean flag=driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		//System.out.println(flag);
		if(flag==false)
		{
			System.out.println("confirm if the button disabled is disabled");
		}
		//Get position of the print button
		Point pos=driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		System.out.println("The Position of the buttonn submit: " +pos);
		
		//Get background color of the save button
		String savbtn=driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("The background color of save button= "+savbtn);
		
		//Height and width of the text "find the height and width of the button"
		org.openqa.selenium.Dimension btnsize=driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println("The height and width of submit button= "+btnsize);
		
		Thread.sleep(2000);
		driver.close();
}
}