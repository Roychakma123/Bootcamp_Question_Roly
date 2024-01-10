		
	package com.bootcamp.QA;
	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DropdownExample1 {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to a webpage with a dropdown
	        driver.get("https://example.com");

	        // Locate the dropdown element by its ID
	        WebElement dropdownElement = driver.findElement(By.id("yourDropdownId"));

	        // Create a Select object using the dropdown element
	        Select dropdown = new Select(dropdownElement);

	        // Select an option by index
	        dropdown.selectByIndex(2);

	        // Select an option by value
	        dropdown.selectByValue("optionValue");

	        // Select an option by visible text
	        dropdown.selectByVisibleText("Option Text");

	        // Print all selected options
	        List<WebElement> selectedOptions = dropdown.getAllSelectedOptions();
	        for (WebElement option : selectedOptions) {
	            System.out.println("Selected Option: " + option.getText());
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


