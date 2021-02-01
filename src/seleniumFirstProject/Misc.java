package seleniumFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		int count = driver.findElements(By.tagName("a")).size();
		
		for(int i=0;i<count;i++) 
		{
			if(driver.findElements(By.tagName("a")).get(i).getText().contains("Gmail")) 
			{
				driver.findElements(By.tagName("a")).get(i).click();
				break;
					
			}
			
		}
		driver.close();
	}

}
