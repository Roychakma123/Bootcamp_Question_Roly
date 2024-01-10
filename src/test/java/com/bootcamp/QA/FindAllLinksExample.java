package com.bootcamp.QA;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.util.List;

		public class FindAllLinksExample {
			public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://example.com");

        // Find all hyperlinks using XPath
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

        // Print the text of each hyperlink
        for (WebElement link : allLinks) {
            System.out.println("Link Text: " + link.getText());
        }

        // Close the browser
        driver.quit();
    }
}

