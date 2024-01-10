	package com.bootcamp.QA;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AlertHandlingExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage with an alert
	        driver.get("https://www.example.com");

	        // Locate the button that triggers the alert
	        WebElement alertButton = driver.findElement(By.id("alertButton"));

	        // Click the button to trigger the alert
	        alertButton.click();

	        // Switch to the alert
	        Alert alert = driver.switchTo().alert();

	        // Get the text of the alert
	        String alertText = alert.getText();
	        System.out.println("Alert Text: " + alertText);

	        // Accept the alert (click "OK")
	        alert.accept();

	        // Close the browser
	        driver.quit();
	    }
	}

