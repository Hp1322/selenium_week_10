package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox1 {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Get URL
        driver.get(baseUrl);
        //implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title
        String title1 = driver.getTitle();
        System.out.println("Title = "+title1);
        //get current url
        String cur = driver.getCurrentUrl();
        System.out.println("Current URL = "+cur);
        //get page source
        String sor = driver.getPageSource();
        System.out.println("Page source = "+sor);
        //find email field
        WebElement em = driver.findElement(By.name("user-name"));
        em.sendKeys("ajnaj@yahoo.com");
        //find password field
        WebElement pas = driver.findElement(By.name("password"));
        pas.sendKeys("1213321");

        //close driver
        driver.close();


    }
}
