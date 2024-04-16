package org.cts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelAuto {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement userEmail = driver.findElement(By.id("email"));
		WebElement userPass = driver.findElement(By.id("pass"));
		
		boolean dispEmail = userEmail.isDisplayed();
		boolean dispPass = userPass.isDisplayed();
		
		if (dispPass && dispEmail) {
			
			userEmail.sendKeys("Hello");
			userPass.sendKeys("1234");
		}
			
		}
//	}

	
}
