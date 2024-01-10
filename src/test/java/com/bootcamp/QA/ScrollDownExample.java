	package com.bootcamp.QA;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ScrollDownExample {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage (optional)
	        driver.get("https://www.example.com");

	        // Create a JavascriptExecutor object
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 500 pixels
	        js.executeScript("window.scrollBy(0,500)");

	        // Close the browser
	        driver.quit();
	    }
	}
