package Sdet12.Sdet12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyWebelement {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
	   //List<WebElement>	li=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
	   
	   //for(int i=1; i<li.size(); i++ )
	   //{
	    //   System.out.println(li.get(i).getText());
	   //}
	      List<WebElement> li=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
	      for(int i=0; i<li.size(); i++)
	      {
	    	  li.get(i).click();
	      }
		 

	}

}
