		package com.bootcamp.QA;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class GetTypedTextExample {
		    public static void main(String[] args) {
		        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Initialize the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to a webpage
		        driver.get("https://www.example.com");

		        // Locate the text box element by its ID or other suitable selector
		        WebElement textBox = driver.findElement(By.id("yourTextBoxId"));

		        // Type some text into the text box
		        textBox.sendKeys("Typed Text Example");

		        // Get the typed text from the text box
		        String typedText = textBox.getAttribute("value");

		        // Print the typed text
		        System.out.println("Typed Text: " + typedText);

		        // Close the browser
		        driver.quit();
		    }
		}

