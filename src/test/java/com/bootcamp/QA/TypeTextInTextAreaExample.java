	package com.bootcamp.QA;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TypeTextInTextAreaExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage
	        driver.get("https://www.example.com");

	        // Locate the text area element by its ID or other suitable selector
	        WebElement textArea = driver.findElement(By.id("yourTextAreaId"));

	        // Type text in a new line inside the text area
	        textArea.sendKeys("Line 1" + Keys.ENTER + "Line 2");

	        // Close the browser
	        driver.quit();
	    }
	}


