package Sdet12.Sdet12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createcontact {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		
		WebElement NameList=driver.findElement(By.name("salutationtype"));
		Select s=new Select(NameList);
		s.selectByValue("Ms.");
		
		driver.findElement(By.name("firstname")).sendKeys("AB");
		driver.findElement(By.name("lastname")).sendKeys("devilers");
		
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.className("txtBox")).sendKeys("ARV206");
		driver.findElement(By.name("search")).click();
		
	}

}
