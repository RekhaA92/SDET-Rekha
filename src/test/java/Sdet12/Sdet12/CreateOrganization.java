package Sdet12.Sdet12;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateOrganization {

	public static void main(String[] args) {
		Random r = new Random();
		int num=r.nextInt(10000);
		String orgname="orgname"+num;
		
		
		CreateOrganization or=new CreateOrganization();
		WebDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		driver.findElement(By.id("phone")).sendKeys("7654321892");
		WebElement  industrylist=driver.findElement(By.name("industry")); 
		or.pickFromList(industrylist,"Banking");
		
		WebElement RatingList=driver.findElement(By.name("rating"));
		or.pickFromList(RatingList,"Active");
		
		WebElement accounttypeList=driver.findElement(By.name("accounttype"));
		or.pickFromList(accounttypeList,"Analyst");
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='search_text']"));
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(searchbox));
		 
		searchbox.sendKeys(orgname);
		
		Select orgnamedd=new Select(driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield'"));
		
		
		

	}
	public void pickFromList(WebElement listElements,String name)
	{
		Select s =new Select(listElements);
		s.selectByValue(name);
	}

}
