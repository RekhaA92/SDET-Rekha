package Sdet12.Sdet12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class organizesort {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		//befor sorting
		ArrayList<String> a1=new ArrayList<String>();

		List<WebElement> li=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
		
		for(int i=1; i<li.size();i++)
		{
			a1.add(li.get(i).getText());
		}
		Collections.sort(a1);
		
		//click on org name for String
		driver.findElement(By.xpath("//a[text()='Organization Name']")).click();
		
		
		//get element after sorting from app
		ArrayList<String> a2= new ArrayList<String>();
		List<WebElement> l1= driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
		
		for(int i=1; i<l1.size(); i++)
		{
			a2.add(l1.get(i).getText());
		}
		System.out.println(a1);
		System.out.println(a2);
		Assert.assertEquals(a1, a2);
		
		driver.close();
	
	} 
}
