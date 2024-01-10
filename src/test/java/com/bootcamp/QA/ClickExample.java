	package com.bootcamp.QA;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ClickExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage
	        driver.get("https://www.example.com");

	        // Locate a button element using its ID
	        WebElement button = driver.findElement(By.id("submitButton"));

	        // Perform a click operation on the button
	        button.click();

	        // Close the browser
	        driver.quit();
	    }
	}
