package Sdet12.Sdet12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> li=driver.findElements(By.xpath("//table[@class='data-list']//tr/td[1]"));
		
		//for(WebElement w:li) {
			//String lang = w.getText();
			//System.out.println(lang);
			//if(lang.equalsIgnoreCase("pythone"))
			//{
				//WebElement lan = driver.findElement(By.xpath("//table[@class='data-list']//tr[3]//td[2]"));
				//System.out.println(lan);
			//}
	//}
		for(int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i).getText());
		}
		driver.close();
		
		
		
	

	}

}
