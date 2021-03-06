package util;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    public static WebDriver driver;

    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After()
    public void after(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
