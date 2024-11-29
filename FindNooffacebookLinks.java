package week3.Classassign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNooffacebookLinks {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		List<WebElement> totallink=driver.findElements(By.tagName("a"));
 		int size=totallink.size();
 		System.out.println("Number of a tag in facebook: " +size);
 		for(int j=0;j<totallink.size();j++)
 			System.out.println(totallink.get(j).getText());
 		}
	}

