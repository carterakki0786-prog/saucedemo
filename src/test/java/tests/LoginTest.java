package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginTest {

@Test
public void openSauceDemo() {

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");

    WebDriver driver = new ChromeDriver(options);

    try {
        driver.get("https://www.saucedemo.com/");

        System.out.println("SauceDemo Page Title: " + driver.getTitle());

    } finally {
        driver.quit();
    }
}


}
