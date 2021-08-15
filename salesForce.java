package Week2.day1;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesForce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByName("UserFirstName").sendKeys("Sandhya");
		driver.findElementByName("UserLastName").sendKeys("Natarajan");
		driver.findElementByName("UserEmail").sendKeys("sandhya971121@gmail.com");
		
		WebElement jobTitle = driver.findElementByName("UserTitle");
		Select drpDwn1 = new Select(jobTitle);
		drpDwn1.selectByIndex(5);
		
		driver.findElementByName("CompanyName").sendKeys("NTT");
		
		WebElement employees = driver.findElementByName("CompanyEmployees");
		Select drpDwn2 = new Select(employees);
		drpDwn2.selectByVisibleText("501 - 1500 employees");
		
		driver.findElementByName("UserPhone").sendKeys("80127388701");
		
		WebElement country = driver.findElementByName("CompanyCountry");
		Select drpDwn3 = new Select(country);
		drpDwn3.selectByValue("Chennai");
		
		//ChromeDriver check = driver;
	    //driver.findElement(By.id("I agree to the "));
	    driver.findElementByClassName("checkbox-ui").click();
	   
	    		
	    
		//driver.close();
		

	}
	

}
