package seleniumFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("AtifPall");
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("AtifPall");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		//driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		//driver.findElement(By.cssSelector("[id='Login']")).click();
		driver.close();
		
		
		
		
	}

}
