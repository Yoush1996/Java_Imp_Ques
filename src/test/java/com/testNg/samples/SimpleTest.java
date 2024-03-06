package com.testNg.samples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SimpleTest {
	
	public  void main(String[] args) {
    
	WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement clickAlert = driver.findElement(By.xpath("//button[contains (text(), 'click the button')]"));
		
		clickAlert.click();
		
		 Alert alt = driver.switchTo().alert();
		
		 String text1 = alt.getText();
		 
		 System.out.println(text1);
		 
		 alt.accept();
		 
	
		
		
	}

}
