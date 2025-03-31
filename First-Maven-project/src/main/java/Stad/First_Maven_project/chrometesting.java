package Stad.First_Maven_project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class chrometesting 
{
	public static void main(String args[]) throws InterruptedException
	{
		
	 WebDriverManager.chromedriver();setup();
     WebDriver driver= new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.manage().window().maximize();// to maximize the screen
     driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
     driver.navigate().back();
     driver.navigate().forward();
   //  driver.quit(); // to close the application automatically
     
     String actualTitle = driver.getTitle();
     String expectedTitle ="Rahul Shetty Academy - Login page";
     if(actualTitle.equalsIgnoreCase(expectedTitle))
     {
    	 System.out.println("as expected");
     }
     else
     {
    	 System.out.println(" title not match ");

     }
     
     WebElement forgotpwd = driver.findElement(By.linkText("Forgot your password?"));
		
		forgotpwd.click();
		
		WebElement name = driver.findElement(By.xpath("// input[@placeholder='Name']"));
	     
		Thread.sleep(2000);
		name.click();
		name.sendKeys("stad");
		
		
		
}

	private static void setup() {
		// TODO Auto-generated method stub
		
	}
	
	
}