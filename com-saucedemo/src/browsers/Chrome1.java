package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome1 {
    public static void main(String[] args) {
        String url = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //get URL
        driver.get(url);
        //maximize
        driver.manage().window().maximize();
        //implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get title
        String t = driver.getTitle();
        System.out.println("Title = "+t);
        //get current URL
        String c = driver.getCurrentUrl();
        System.out.println("Current URL = "+c);
        //get page source
        String pg = driver.getPageSource();
        System.out.println("Page source = "+pg);
        //find email field element
        WebElement mail = driver.findElement(By.id("user-name"));
        mail.sendKeys("Harsh1212@beds.co.uk");
        //find password field element
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("65666@sjbjnj");

        //close driver
        driver.close();


    }
}
