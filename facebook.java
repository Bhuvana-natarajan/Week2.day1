package Week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {
	public static void main(String[] args) {
		
		// Step 1: Download and set the path
		
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		
		ChromeDriver driver= new ChromeDriver();
		// Step 3: Load the URL
		
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// waits for 10 secs if the element is not in the DOM
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Create New Account").click();
		

		
		driver.findElement(By.linkText("firstname")).sendKeys("sandhya");
		driver.findElement(By.linkText("lastname")).sendKeys("Natarajan");
		driver.findElement(By.linkText("reg_email__")).sendKeys("sandhya971121@gmail.com");
		driver.findElement(By.linkText("reg_passwd__")).sendKeys("sandhya@97");
		
		WebElement date = driver.findElementByName("birthday_day");
		Select drpDwn1 = new Select(date);
		drpDwn1.selectByIndex(21);
		WebElement month = driver.findElementByName("birthday_day");
		Select drpDwn2 = new Select(month);
		drpDwn2.selectByValue("6");
		
		WebElement year = driver.findElementByName("birthday_year");
		Select drpDwn3 = new Select(year);
		drpDwn3.selectByVisibleText("1997");
		driver.findElementByName("sex").click();
		
		
		
		
		
		
	}

}
