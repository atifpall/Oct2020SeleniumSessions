package seleniumFirstProject;

import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GreenKart 
{


	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/atifpall/Desktop/Softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] itemsNeeded = {"Cucumber","Brocolli","Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		
		
		GreenKart gk=new GreenKart();
		gk.addItems(driver, itemsNeeded);
	
		driver.findElement(By.xpath("//*[@alt='Cart']")).click();
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		driver.close();
		
	}
	
	public void addItems(WebDriver driver,String[] itemsNeeded) throws InterruptedException 
	{
		
      
      int j =0;
		
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));	
	    for(int i=0;i<products.size();i++) 
		{
			String[] name= products.get(i).getText().split("-");
			String formattedName= name[0].trim();
			
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
				
			if(itemsNeededList.contains(formattedName)) 
			{
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j=j+1;
				
				if(j==itemsNeeded.length) 
				{
					break;
				}
					
			}
			
		}


	}
	


}
