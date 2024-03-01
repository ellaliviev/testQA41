package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFirstStartChrome {

    @Test
    public void test_start() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/");
        Thread.sleep(5000);
        driver.quit();

        //div[@class='card-body']/h5[contains(text(), 'Elements')]

        //tagName[@attributeName='attributeValue']
    }

}
