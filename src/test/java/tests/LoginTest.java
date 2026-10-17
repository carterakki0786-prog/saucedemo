package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void openSauceDemo() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        System.out.println("Page Title: " + driver.getTitle());

        driver.quit();
    }
}