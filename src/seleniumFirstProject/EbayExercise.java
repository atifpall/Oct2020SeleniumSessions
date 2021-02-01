package seleniumFirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayExercise {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			//Count of links in the footer section of the page
			WebElement footerDriver=driver.findElement(By.xpath("//*[@id='glbfooter']"));
			System.out.println(footerDriver.findElements(By.tagName("a")).size());
			
			
			//Count of links in the header section of the page
			WebElement headerDriver=driver.findElement(By.xpath("//*[@id='gh']"));
			System.out.println(headerDriver.findElements(By.tagName("a")).size());
			
			
			//Count of links in the 2nd column of footer section
			WebElement footerColDriver=driver.findElement(By.xpath("//*[@id='glbfooter']//div[2]//td[2]/ul"));
			System.out.println(footerColDriver.findElements(By.tagName("a")).size());
			
			WebElement col=driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
			System.out.println(col.findElements(By.tagName("a")).size());
			
			WebElement col1=driver.findElement(By.xpath("//*[@id='gf-BIG']//td[2]//ul"));
			System.out.println(col1.findElements(By.tagName("a")).size());
			
			WebElement headRow=driver.findElement(By.xpath("//*[@id='gh-top']/ul[1]"));
			int elements=headRow.findElements(By.tagName("a")).size();
			System.out.println(elements);
			
			WebElement header=driver.findElement(By.xpath("//*[@class='gh-tbl']//tr "));
			int counter=header.findElements(By.tagName("a")).size();
			System.out.println(counter);
			
			String beforeClick=null;
			String afterClick;
			
			
		
			
			for(int i=0;i<elements;i++) 
			{
				
				if(headRow.findElements(By.tagName("a")).get(i).getText().contains("Daily")) 
				{
					beforeClick=driver.getTitle();
					headRow.findElements(By.tagName("a")).get(i).click();
					break;
				}
			}
			 afterClick=driver.getTitle();
			
			if(beforeClick!=afterClick) 
			{
				System.out.println("Title unmatched");
			}
			else 
			{
				System.out.println("Title matched");
			}
			
			
			
			
			
			
			
			
			
			driver.close();
			
			
	}

}
