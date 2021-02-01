package seleniumFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/* With path2usa.com----->
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("input.text.form-control")).click();
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")) 
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}		
	    List<WebElement> dates=driver.findElements(By.cssSelector(".day"));
	   int count=driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0; i<count; i++) {
			String text =driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
				} <----- */                                     
		
		//With makemytrip.com
		
			driver.get("https://makemytrip.com");
			driver.findElement(By.cssSelector("label[for='departure']")).click();
			while(!driver.findElement(By.cssSelector("div[class='DayPicker-Months'] [class='DayPicker-Month']")).getText().contains("May")) 
			{
				driver.findElement(By.cssSelector("div[class='DayPicker'] span[aria-label='Next Month']")).click();
			}	
			
			//List<WebElement> date=driver.findElements(By.cssSelector("div[class='DayPicker-Day']"));
			int counter=driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).size();
			for(int i=0; i<counter; i++) {
				String text =driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).get(i).getText();
				if(text.equalsIgnoreCase("5")) {
					driver.findElements(By.cssSelector("div[class='DayPicker-Day']")).get(i).click();
					break;
				}
			
		}
		Thread.sleep(3000);
		driver.close();
	}

}
