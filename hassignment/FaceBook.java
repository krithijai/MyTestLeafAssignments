package week2.hassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Krithika");
		driver.findElement(By.name("lastname")).sendKeys("Jai");
		
		WebElement dropDown1=driver.findElement(By.id("day"));
		Select opt1=new Select(dropDown1);
		opt1.selectByIndex(28);
		
		//To use drop down we have to use webelement and select
		
		WebElement dropDown2=driver.findElement(By.id("month"));
		Select opt2=new Select(dropDown2);
		opt2.selectByIndex(4);
		
		
		WebElement dropDown3=driver.findElement(By.id("year"));
		Select opt3=new Select(dropDown3);
		opt3.selectByValue("1985");
		
		WebElement radio=driver.findElement(By.xpath("//label[text()='Female']"));
		radio.click();
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("krithiga.ganapathy1985@gmail.com");
		//driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Virtusa@57");
		driver.findElement(By.name("websubmit")).click();
		//driver.findElement(By.xpath("//div[contains(@class='uiStickyPlaceholderInput']//input)[2]")).sendKeys("98940");
		//
		
		//Thread.sleep(1000);
		
		//Thread.sleep(2000);
		
		
		//driver.close();

	}

}
